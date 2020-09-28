<template>
  <div id="student_elective_warp">
    <div @click="returnSystemHome">
      <return-system-home />
    </div>
    <div id="student_elective_container">
      <Divider class="title" orientation="left">选课列表</Divider>
      <Row type="flex" justify="center" align="middle">
        <Col span="24">
          <Table border  max-height="300" :columns="columns" :data="electiveData">
            <template slot-scope="{ row, index }" slot="action">
              <Button @click="selectElective(electiveData[index].electiveId)" type="success" size="small" style="margin-right: 5px" >选择</Button>
            </template>
          </Table>
        </Col>
      </Row>
      <Divider class="font">已选课程</Divider>
      <Row type="flex" justify="center" align="middle">
        <Col span="24">
          <Table max-height="150" border :columns="selected_columns" :data="selected_data">
            <template  slot-scope="{ row }" slot="name">
              <strong >{{ row.name }}</strong>
            </template>
            <template slot-scope="{ row, index }" slot="action">
              <Button type="error" size="small" style="margin-right: 5px"  @click="removeStudentElective">退选</Button>
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
    name: "StudentElective",
    components: {
      ReturnSystemHome
    },
    data(){
      return{
        columns:[
          {
            title:'课程编号',
            key:'electiveId'
          },
          {
            title:'课程名',
            key:'electiveName'
          },
          {
            title:'任课老师',
            key:'teacherName'
          },
          {
            title:'开始周',
            key:'electiveStartTime'
          },
          {
            title:'结束周',
            key:'electiveEndTime'
          },
          {
            title:'每周时间',
            key:'electiveDate'
          },
          {
            title:'上课节',
            key:'electiveSessions'
          },
          {
            title:'学分',
            key:'electiveCredit'
          },
          {
            title:'选择',
            slot:'action',
            width:100,
            align:'center'
          }
        ],
        electiveData: this.$store.state._studentRepository_.electiveData,
        selected_columns:[
          {
            title:'课程编号',
            key:'electiveId'
          },
          {
            title:'课程名',
            key:'electiveName'
          },
          {
            title:'任课老师',
            key:'teacherName'
          },
          {
            title:'学分',
            key:'electiveCredit'
          },
          {
            title:'退选',
            slot:'action',
            width:200,
            align:'center'
          }
        ],
        selected_data:[
          {
            electiveId: this.$store.state._studentRepository_.studentElectiveData.electiveId,
            electiveName: this.$store.state._studentRepository_.studentElectiveData.electiveName,
            teacherName: this.$store.state._studentRepository_.studentElectiveData.teacherName,
            electiveCredit: this.$store.state._studentRepository_.studentElectiveData.electiveCredit
          }
        ],
      }
    },
    methods:{
      returnSystemHome(){
        this.$store.commit('needLoading',true)
        setTimeout(()=>{
          this.$router.push('/EducationSystem/student-system')
          this.$store.commit('needLoading',false)
        },750)
      },
      selectElective(electiveId){
        this.$store.commit('needLoading',true)
        asyn({
          method: 'get',
          url: '/elective/queryStudentElectiveByStudentId',
          params: {
            studentId: this.$store.state._UserId_
          }
        }).then(rs=>{
          if (rs.data.length<1){
            asyn({
              method: 'post',
              url: '/elective/createStudentElective',
              data: {
                studentId: this.$store.state._UserId_,
                studentName: this.$store.state._UserName_,
                studentClass: this.$store.state._studentRepository_.studentInfo.studentClass,
                electiveId: electiveId
              }
            }).then(rs=>{
              if (rs.data===1){
                window.alert("选课成功")
                this.$store.dispatch('requestStudentElective')
                this.$store.commit('needLoading',false)
              }else {
                window.alert("选课失败")
                this.$store.commit('needLoading',false)
              }
            }).catch(err=>{
              console.log(err);
            })
          }else {
            this.$store.commit('needLoading',false)
            window.alert('选课不能多于一门')
          }
        }).catch(err=>{
          console.log(err);
        })
      },
      removeStudentElective(){
        this.$store.commit('needLoading',true)
        asyn({
          method: 'post',
          url: '/elective/removeStudentElective',
          data: {
            studentId: Number(this.$store.state._UserId_),
            electiveId: this.$store.state._studentRepository_.studentElectiveData.electiveId
          }
        }).then(rs=>{
          if (rs.data===1){
            this.$store.dispatch('requestStudentElective')
            this.$store.commit('needLoading',false)
          }else {
            this.$store.commit('needLoading',false)
          }
        }).catch(err=>{
          console.log(err);
        })
      }
    }
  }
</script>

<style scoped>
  #student_elective_warp{
    width: 85%;
    height: auto;
  }
  #student_elective_container{
    width: 100%;
    height: auto;
    background-color: rgba(22,22,22,.5);
  }
  .title{
    color: rgba(255,255,255,0.4);
    font-size: 20px;
    padding-top: 18px;
  }
  .font{
    font-size: 22px;
    color: rgba(255,255,255,0.5);

  }
  /deep/.ivu-table{
    background-color: rgba(255,255,255,0.4) !important;
  }

  /*/deep/.ivu-table-body::-webkit-scrollbar {*/
  /*  width: 18px !important;*/
  /*  height: 1px !important;*/
  /*}*/
  /*!*滚动条滑块*!*/
  /*/deep/.ivu-table-body::-webkit-scrollbar-thumb {*/
  /*  border-radius: 18px !important;*/
  /*  -webkit-box-shadow: inset 0 0 5px rgba(0,0,0,0.2) !important;*/
  /*  background-color: rgba(22,22,22,.4) !important;*/
  /*}*/
  /*!*滚动条轨道*!*/
  /*/deep/.ivu-table-body::-webkit-scrollbar-track {*/
  /*  -webkit-box-shadow: inset 0 0 1px rgba(0,0,0,0) !important;*/
  /*  border-radius: 18px !important;*/
  /*  background-color: rgba(122,122,122,.5) !important;*/
  /*}*/

  /deep/.ivu-table td,/deep/.ivu-table th{
    background-color:rgba(255,255,255,0.4) !important;
  }
  /deep/.ivu-table-row-hover td{
    background-color:rgba(255,255,255,0.6) !important;
  }
</style>
