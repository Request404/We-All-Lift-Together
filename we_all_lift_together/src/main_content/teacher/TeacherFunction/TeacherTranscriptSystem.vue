<template>
  <div id="teacher_transcript_warp">
    <div @click="returnSystemHome">
      <return-system-home />
    </div>
    <div id="teacher_transcript_container">
      <divider class="font">主修课程评分</divider>
      <Row type="flex" justify="center" align="middle">
        <Col span="24">
          <Table max-height="400" border :columns="columns" :data="courseTranscript">
            <template slot-scope="{ row, index }" slot="courseScore">
              <p v-if="CourseType[index].type === false">{{courseTranscript[index].courseScore}}</p>
              <InputNumber :max="100" :min="1" v-model="courseTranscript[index].courseScore" v-if="CourseType[index].type === true"></InputNumber>
            </template>
            <template slot-scope="{ row, index }" slot="action">
              <Button @click="CourseType[index].type = true" type="primary" size="small" style="margin-right: 5px" v-if="CourseType[index].type == false" >修改</Button>
              <Button @click="commitTranscriptChange(index,courseTranscript[index])" type="success" size="small" style="margin-right: 5px" v-if="CourseType[index].type == true" >提交</Button>
            </template>
          </Table>
        </Col>
      </Row>
      <divider class="font">选修课程评分</divider>
      <Row type="flex" justify="center" align="middle">
        <Col span="24">
          <Table max-height="400" border :columns="changeColumns" :data="electiveTranscript">
            <template slot-scope="{ row, index }" slot="electiveScore">
              <p v-if="ElectiveType[index].type === false">{{electiveTranscript[index].electiveScore}}</p>
              <InputNumber :max="100" :min="1" v-model="electiveTranscript[index].electiveScore" v-if="ElectiveType[index].type === true"></InputNumber>
            </template>
            <template slot-scope="{ row, index }" slot="action">
              <Button @click="ElectiveType[index].type = true" type="primary" size="small" style="margin-right: 5px" v-if="ElectiveType[index].type == false" >修改</Button>
              <Button @click="commitElectiveChange(index,electiveTranscript[index])" type="success" size="small" style="margin-right: 5px" v-if="ElectiveType[index].type == true" >提交</Button>
            </template>
          </Table>
        </Col>
      </Row>
    </div>
  </div>
</template>

<script>
  import ReturnSystemHome from "@/components/commons/ReturnSystemHome";
  import {asyn} from "../../../network/asyn";

  export default {
    name: "TeacherTranscriptSystem",
    components:{
      ReturnSystemHome
    },
    data(){
      return{
        value1:'',
        value2:'',
        value3:'',
        CourseType:[
          {
            type:false
          }
        ],
        ElectiveType:[
          {
            type:false
          }
        ],
        columns:[
          {
            title:'学生Id',
            key:'studentId'
          },
          {
            title:'学生名',
            key:'studentName'
          },
          {
            title:'班级',
            key:'studentClass'
          },
          {
            title:'课程名',
            key:'courseName'
          },
          {
            title:'总成绩',
            slot: 'courseScore',
            width: 200,
            align: 'center'
          },
          {
            title:'提交',
            slot:'action',
            width:200,
            align:'center'
          }
        ],
        changeColumns:[
          {
            title:'学生Id',
            key:'studentId'
          },
          {
            title:'学生名',
            key:'studentName'
          },
          {
            title:'课程编号',
            key:'electiveId'
          },
          {
            title:'课程名',
            key:'electiveName'
          },
          {
            title:'总成绩',
            slot:'electiveScore',
            width: 200,
            align: 'center'
          },
          {
            title:'提交',
            slot:'action',
            width:200,
            align:'center'
          }
        ],
        courseTranscript: [],
        electiveTranscript: []
      }
    },
    methods:{
      returnSystemHome(){
        this.$store.commit('needLoading',true)
        setTimeout(()=>{
          this.$router.push('/EducationSystem/teacher-system')
          this.$store.commit('needLoading',false)
        },750)
      },
      changeCourseList(){
        for (let course of this.courseTranscript){
          let data={
            type:false
          }
          this.CourseType.push(data)
        }
      },
      changeElectiveList(){
        for (let elective of this.electiveTranscript){
          let data={
            type:false
          }
          this.ElectiveType.push(data)
        }
      },
      commitTranscriptChange(index,transcript){
        this.$store.commit('needLoading',true)
        setTimeout(()=>{
          console.log(transcript);
          if (transcript.courseScore>=60){
            transcript.courseGrade = "合格"
          }else {
            transcript.courseGrade = "不合格"
          }
          asyn({
            method: 'post',
            url: '/course/updateTranscript',
            data: {
              studentId: transcript.studentId,
              studentName:　transcript.studentName,
              studentClass: transcript.studentClass,
              teacherId: transcript.teacherId,
              teacherName: transcript.teacherName,
              courseId: transcript.courseId,
              courseName: transcript.courseName,
              courseGrade: transcript.courseGrade,
              courseScore: transcript.courseScore,
              courseCredit: transcript.courseCredit
            }
          }).then(rs=>{
            if(rs.data){
              window.alert('录入成功')
            }else {
              window.alert('失败')
            }
          })
          this.CourseType[index].type = false
          this.$store.commit('needLoading')
        },750)
      },
      commitElectiveChange(index,elective){
        console.log(elective);
        this.ElectiveType[index].type = false
      }
    },
    created () {

    },
    beforeCreate() {
      asyn({
        method: 'get',
        url: '/course/queryTranscriptByTeacherId',
        params: {
          teacherId: 100102
        }
      }).then(rs=>{
        this.courseTranscript = rs.data
        this.changeCourseList()
      }).catch(err=>{
        console.log(err);
      })
      asyn({
        method: 'get',
        url: '/elective/queryElectiveByTeacherId',
        params: {
          teacherId: 100102
        }
      }).then(rs=>{
        if (rs.data.length){

          for (let elective of rs.data){
            asyn({
              method: 'get',
              url: '/elective/queryStudentElectiveByElectiveId',
              params:{
                electiveId: elective.electiveId
              }
            }).then(rs=>{
              for (let studentElective of rs.data){
                studentElective.electiveName = elective.electiveName
                this.electiveTranscript.push(studentElective)
              }
              this.changeElectiveList()
            }).catch(err=>[
              console.log(err)
            ])
          }
        }
      }).catch(err=>{
        console.log(err);
      })
    }
  }
</script>

<style scoped>
  #teacher_transcript_warp{
    width: 85%;
    height: auto;
  }
  #teacher_transcript_container{
    width: 100%;
    height: auto;
    background-color: rgba(22,22,22,.5);
  }
  .font{
    padding: 20px;
    color: rgba(255,255,255,0.5);
    font-size: 18px;
  }
  /deep/.ivu-table{
    background-color: rgba(255,255,255,0.4) !important;
  }
  /deep/.ivu-table td,/deep/.ivu-table th{
    background-color:rgba(255,255,255,0.4) !important;
  }
  /deep/.ivu-table-row-hover td{
    background-color:rgba(255,255,255,0.6) !important;
  }
  /deep/ .ivu-input{
    background-color: rgba(255,255,255,0.4)!important;
  }
  /deep/ .ivu-input-number-input{
    background-color: rgba(255,255,255,0.3)!important;
  }
  /deep/ .ivu-input-number{
    background-color: rgba(255,255,255,0.4)!important;
  }

</style>
