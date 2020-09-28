<template>
  <div id="teacher_class_warp">
    <div @click="returnSystemHome">
      <return-system-home />
    </div>
    <div id="teacher_class_container">
      <divider orientation="left" class="font">我的班级管理</divider>
      <Row type="flex" align="middle" justify="center">
        <Col span="24">
          <Table v-if="teacherClass.length" border :columns="ClassColumns" :data="teacherClass">
            <template slot-scope="{ row }" slot="name">
              <strong>{{ row.name }}</strong>
            </template>
            <template slot-scope="{ row, index }" slot="action">
              <template slot-scope="{ row }" slot="name">
                <strong>{{ row.name }}</strong>
              </template>
              <Button type="primary" size="small" style="margin-right: 5px">View</Button>
            </template>
          </Table>
          <h2 v-else>暂无课程</h2>
        </Col>
      </Row>
<!--      <Modal-->
<!--        title="Title"-->
<!--        v-model="modal"-->
<!--        :styles="styles">-->
<!--        <Table :columns="ClassColumns" :data="studentData" border max-height="500">-->
<!--        </Table>-->
<!--      </Modal>-->
    </div>
  </div>
</template>

<script>
  import ReturnSystemHome from "@/components/commons/ReturnSystemHome";
  import {asyn} from "../../../network/asyn";

  export default {
    name: "TeacherClass",
    components: {
      ReturnSystemHome
    },
    data(){
      return{
        viewStudent:false,
        styles: {
          height: 'calc(100% - 55px)',
          overflow: 'auto',
          paddingBottom: '53px',
          position: 'static'
        },
        ClassColumns: [
          {
            title: '班级',
            key: 'className'
          },
          {
            title: '教授课程',
            key:'courseName'
          },
          {
            title: '人数',
            key: 'studentNumber'
          },
          {
            title: 'Action',
            slot: 'action',
            width: 150,
            align: 'center'
          }
        ],
        teacherClass: [],
        studentClass: [],
      }
    },
    methods:{
      returnSystemHome(){
        this.$store.commit('needLoading',true)
        setTimeout(()=>{
          this.$router.push('/EducationSystem/teacher-system')
          this.$store.commit('needLoading',false)
        },750)
      }
    },
    created() {
      asyn({
        method: 'get',
        url: '/course/queryCourseByTeacherId',
        params:{
          teacherId: this.$store.state._UserId_
        }
      }).then(rs=>{
        let singleClass = []
        let matchRepeat = ''
        for (let course of rs.data){
          console.log(rs.data);
          if(matchRepeat !== course.className){
            if(matchRepeat.trim()!=null){
              asyn({
                method: 'get',
                url: '/student/queryStudentByClass',
                params:{
                  studentClass: course.className
                }
              }).then(rs=>{
                console.log(rs.data);
                this.studentClass.push(rs.data)
                course.studentNumber = rs.data.length
                singleClass.push(course)
              }).catch(err=>{
                console.log(err);
              })
            }
            matchRepeat = course.className
          }
        }
        this.teacherClass = singleClass
      }).catch(err=>{
        console.log(err);
      })
      console.log("hello");
      console.log(this.teacherClass);
      console.log(this.studentClass);
    }
  }
</script>

<style scoped>
  #teacher_class_warp{
    width: 85%;
    height: auto;
  }
  #teacher_class_container{
    width: 100%;
    height: auto;
    background-color: rgba(22,22,22,.5);
  }
  .font{
    padding-top: 20px;
    font-size: 20px;
    text-shadow: 0 0 2px black;
    color: rgba(255,255,255,0.8);
  }
  .border{
    margin-top: 20px;
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
</style>
