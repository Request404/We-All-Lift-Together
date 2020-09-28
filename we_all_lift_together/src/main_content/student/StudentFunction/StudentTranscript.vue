<template>
  <!--  学生成绩组件-->
  <div id="student_transcript_warp">
    <div @click="returnSystemHome">
      <return-system-home />
    </div>
    <div id="student_transcript_container">
      <divider class="font">成绩列表</divider>
      <Row type="flex" justify="center" align="middle">
        <Col span="24">
          <Table max-height="300"  :columns="columns" :data="data1" border></Table>
        </Col>
      </Row>
      <divider class="font">学分统计</divider>
      <Row type="flex" justify="center" align="middle">
        <Col span="24">
          <Table  :columns="c2" :data="studentCurrentCredits" border></Table>
        </Col>
      </Row>
    </div>
  </div>
</template>

<script>
  import ReturnSystemHome from "@/components/commons/ReturnSystemHome";

  export default {
    name: "StudentTranscript",
    components: {
      ReturnSystemHome
    },
    data(){
      return{
        value1:'',
        value2:'',
        value3:'',
        columns: [
          {
            title: '课程Id',
            key: 'courseId'
          },
          {
            title: '课程',
            key: 'courseName'
          },
          {
            title:'教师姓名',
            key:'teacherName'
          },
          {
            title:'成绩',
            key:'courseScore'
          },
          {
            title: '等级',
            key: 'courseGrade'
          },
          {
            title:'学分',
            key:'courseCredit'
          }
        ],
        c2:[
          {
            title:'所需学分',
            key:'all'
          },
          {
            title:'目前学分',
            key:'now'
          },
          {
            title:'还需学分',
            key:'need'
          }
        ],
        data1: this.$store.state._studentRepository_.studentTranscript
      }
    },

    methods:{
      returnSystemHome(){
        this.$store.commit('needLoading',true)
        setTimeout(()=>{
          this.$router.push('/EducationSystem/student-system')
          this.$store.commit('needLoading',false)
        },750)
      }
    },
    computed: {
      studentCurrentCredits(){
        let credit = 0
        for (let transcript of this.$store.state._studentRepository_.studentTranscript){
          credit += transcript.courseCredit
        }
        return [
          {
            all: 107,
            now: credit,
            need: 107 - credit
          }
        ]
      }
    }
  }
</script>

<style scoped>
  #student_transcript_warp{
    width: 85%;
    height: auto;
  }
  #student_transcript_container{
    width: 100%;
    height: auto;
    background-color: rgba(22,22,22,.5);
  }
  .font{
    padding: 20px 0;
    color: rgba(255,255,255,0.5);
    font-size: 18px;
  }
  .r1{
    padding-top: 20px;

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
</style>
