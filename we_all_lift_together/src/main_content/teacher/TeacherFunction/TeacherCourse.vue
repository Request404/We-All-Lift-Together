<template>
  <div id="teacher_course_warp">
    <div @click="returnSystemHome">
      <return-system-home />
    </div>
    <div id="teacher_course_container">
      <Row type="flex" justify="center" align="middle">
        <Col span="24" class="border" >
          <p  class="font" >我的课程管理</p>
        </Col>
      </Row>
      <divider/>
      <Row type="flex" align="middle" justify="center">
        <Col  span="24">
          <Table border :columns="CourseColumns" :data="data">
            <template slot-scope="{ row,index }" slot="name">
              <strong>{{ row.name }}</strong>
            </template>
            <template slot-scope="{ row,index }" slot="week">
              <strong>{{ startAndEnd(index) }}</strong>
            </template>
            <template slot-scope="{ row,index }" slot="date">
              <strong>{{ weekTime(index) }}</strong>
            </template>
          </Table>
        </Col>
      </Row>
    </div>
  </div>
</template>

<script>
  import ReturnSystemHome from "@/components/commons/ReturnSystemHome";

  export default {
    name: "TeacherCourse",
    components:{
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
        CourseColumns: [
          {
            title: '课程Id',
            key: 'courseId'
          },
          {
            title: '课程',
            key: 'course'
          },
          {
            title:'上课周',
            slot:'week'
          },
          {
            title:'上课时间',
            slot:'date'
          },
          {
            title:'学分',
            key:'credit'
          }
        ],
        teacherFormData: {
          name: '',
          gender: '',
          joinTime: '',
          racial: '',
          maritalStatus: '',
          remark: '',
          nativePlace: '',
          phone: '',
          cellPhone: '',
          GraduatedPlace: '',
          education: '',
          position:'',
          email: ''
        }
        ,
        data: [
          {
            courseId: 1,
            start_time:'5',
            end_time:'7',
            course: '计算机应用基础',
            start_time:'1',
            end_time:'5',
            credit:'4',
            date:'2',
            sessions:'2'
          },
          {
            courseId: 2,
            start_time:'5',
            end_time:'7',
            course: '计算机应用基础',
            start_time:'1',
            end_time:'5',
            credit:'4',
            date:'2',
            sessions:'2'
          },
          {
            courseId: 3,
            start_time:'5',
            end_time:'7',
            course: '计算机应用基础',
            start_time:'1',
            end_time:'5',
            credit:'4',
            date:'2',
            sessions:'2'
          },
          {
            courseId: 4,
            start_time:'5',
            end_time:'7',
            course: '计算机应用基础',
            start_time:'1',
            end_time:'5',
            credit:'4',
            date:'2',
            sessions:'2'
          }
        ]
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
      startAndEnd(index){
        let start=this.data[index].start_time;
        let end=this.data[index].end_time;
        let sae='第'+start+'周开始'+'第'+end+'周结束';
        return sae;
      },
      weekTime(index){
        let day=this.data[index].date;
        let time=this.data[index].sessions;
        let wd='周'+day+''+'第'+time+'节';
        return wd;
      }
    }

  }
</script>

<style scoped>
  #teacher_course_warp{
    width: 85%;
    height: auto;
  }
  #teacher_course_container{
    width: 100%;
    height: auto;
    background-color: rgba(22,22,22,.5);
  }
  .font{
    font-size: 20px;
    text-shadow: 0 0 2px black;
    color: rgba(255,255,255,0.8);
  }
  .border{
    padding-left:15px;
  }
  .font{
    padding-top: 20px;
    font-size: 20px;
    text-shadow: 0 0 2px black;
    color: rgba(255,255,255,0.8);
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
