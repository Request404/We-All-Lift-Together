<template>
  <!--  学生课表组件-->
  <div id="student_course_warp">
    <div @click="returnSystemHome">
      <return-system-home />
    </div>
    <div id="student_course_container">
      <Row type="flex" align="middle" justify="center">
        <Col span="18" class="title font" pull="1">
          我的课表
        </Col>
        <Col span="2" class="title">
          <Select v-model="weekIndex">
            <Option v-for="i in array" :value="i" :key="i">{{i}}</Option>
          </Select>
        </Col>
      </Row>
      <divider/>
      <Row type="flex" align="middle" justify="center">
        <Col span="24">
          <table class="wrap">
            <tr class="flex">
              <td colspan="2">时间</td>
              <td class="flex">星期一</td>
              <td class="flex">星期二</td>
              <td class="flex">星期三</td>
              <td class="flex">星期四</td>
              <td class="flex">星期五</td>
              <td class="flex">星期六</td>
              <td class="flex">星期日</td>
            </tr>
            <tr>
              <td rowspan="4">上午</td>
              <td>第一节</td>
              <td rowspan="2"><span v-if="getCourseData(course,1,1)" v-for="course in this.$store.state._studentRepository_.courseData">{{course.courseName}}</span></td>
              <td rowspan="2"><span v-if="getCourseData(course,2,1)" v-for="course in this.$store.state._studentRepository_.courseData">{{course.courseName}}</span></td>
              <td rowspan="2"><span v-if="getCourseData(course,3,1)" v-for="course in this.$store.state._studentRepository_.courseData">{{course.courseName}}</span></td>
              <td rowspan="2"><span v-if="getCourseData(course,4,1)" v-for="course in this.$store.state._studentRepository_.courseData">{{course.courseName}}</span></td>
              <td rowspan="2"><span v-if="getCourseData(course,5,1)" v-for="course in this.$store.state._studentRepository_.courseData">{{course.courseName}}</span></td>
              <td rowspan="2"><span v-if="getCourseData(course,6,1)" v-for="course in this.$store.state._studentRepository_.courseData">{{course.courseName}}</span></td>
              <td rowspan="2"><span v-if="getCourseData(course,7,1)" v-for="course in this.$store.state._studentRepository_.courseData">{{course.courseName}}</span></td>
            </tr>
            <tr>
              <td>第二节</td>
            </tr>
            <tr>
              <td>第三节</td>
              <td rowspan="2"><span v-if="getCourseData(course,1,2)" v-for="course in this.$store.state._studentRepository_.courseData">{{course.courseName}}</span></td>
              <td rowspan="2"><span v-if="getCourseData(course,2,2)" v-for="course in this.$store.state._studentRepository_.courseData">{{course.courseName}}</span></td>
              <td rowspan="2"><span v-if="getCourseData(course,3,2)" v-for="course in this.$store.state._studentRepository_.courseData">{{course.courseName}}</span></td>
              <td rowspan="2"><span v-if="getCourseData(course,4,2)" v-for="course in this.$store.state._studentRepository_.courseData">{{course.courseName}}</span></td>
              <td rowspan="2"><span v-if="getCourseData(course,5,2)" v-for="course in this.$store.state._studentRepository_.courseData">{{course.courseName}}</span></td>
              <td rowspan="2"><span v-if="getCourseData(course,6,2)" v-for="course in this.$store.state._studentRepository_.courseData">{{course.courseName}}</span></td>
              <td rowspan="2"><span v-if="getCourseData(course,7,2)" v-for="course in this.$store.state._studentRepository_.courseData">{{course.courseName}}</span></td>
            </tr>
            <tr>
              <td>第四节</td>
            </tr>
            <tr>
              <td rowspan="4">下午</td>
              <td>第五节</td>
              <td rowspan="2"><span v-if="getCourseData(course,1,3)" v-for="course in this.$store.state._studentRepository_.courseData">{{course.courseName}}</span></td>
              <td rowspan="2"><span v-if="getCourseData(course,2,3)" v-for="course in this.$store.state._studentRepository_.courseData">{{course.courseName}}</span></td>
              <td rowspan="2"><span v-if="getCourseData(course,3,3)" v-for="course in this.$store.state._studentRepository_.courseData">{{course.courseName}}</span></td>
              <td rowspan="2"><span v-if="getCourseData(course,4,3)" v-for="course in this.$store.state._studentRepository_.courseData">{{course.courseName}}</span></td>
              <td rowspan="2"><span v-if="getCourseData(course,5,3)" v-for="course in this.$store.state._studentRepository_.courseData">{{course.courseName}}</span></td>
              <td rowspan="2"><span v-if="getCourseData(course,6,3)" v-for="course in this.$store.state._studentRepository_.courseData">{{course.courseName}}</span></td>
              <td rowspan="2"><span v-if="getCourseData(course,7,3)" v-for="course in this.$store.state._studentRepository_.courseData">{{course.courseName}}</span></td>
            </tr>
            <tr>
              <td>第六节</td>
            </tr>
            <tr>
              <td>第七节</td>
              <td rowspan="2"><span v-if="getCourseData(course,1,4)" v-for="course in this.$store.state._studentRepository_.courseData">{{course.courseName}}</span></td>
              <td rowspan="2"><span v-if="getCourseData(course,2,4)" v-for="course in this.$store.state._studentRepository_.courseData">{{course.courseName}}</span></td>
              <td rowspan="2"><span v-if="getCourseData(course,3,4)" v-for="course in this.$store.state._studentRepository_.courseData">{{course.courseName}}</span></td>
              <td rowspan="2"><span v-if="getCourseData(course,4,4)" v-for="course in this.$store.state._studentRepository_.courseData">{{course.courseName}}</span></td>
              <td rowspan="2"><span v-if="getCourseData(course,5,4)" v-for="course in this.$store.state._studentRepository_.courseData">{{course.courseName}}</span></td>
              <td rowspan="2"><span v-if="getCourseData(course,6,4)" v-for="course in this.$store.state._studentRepository_.courseData">{{course.courseName}}</span></td>
              <td rowspan="2"><span v-if="getCourseData(course,7,4)" v-for="course in this.$store.state._studentRepository_.courseData">{{course.courseName}}</span></td>
            </tr>
            <tr>
              <td>第八节</td>
            </tr>
            <tr>
              <td rowspan="4">晚上</td>
              <td>第九节</td>
              <td rowspan="2"><span v-if="getCourseData(course,1,5)" v-for="course in this.$store.state._studentRepository_.courseData">{{course.courseName}}</span></td>
              <td rowspan="2"><span v-if="getCourseData(course,2,5)" v-for="course in this.$store.state._studentRepository_.courseData">{{course.courseName}}</span></td>
              <td rowspan="2"><span v-if="getCourseData(course,3,5)" v-for="course in this.$store.state._studentRepository_.courseData">{{course.courseName}}</span></td>
              <td rowspan="2"><span v-if="getCourseData(course,4,5)" v-for="course in this.$store.state._studentRepository_.courseData">{{course.courseName}}</span></td>
              <td rowspan="2"><span v-if="getCourseData(course,5,5)" v-for="course in this.$store.state._studentRepository_.courseData">{{course.courseName}}</span></td>
              <td rowspan="2"><span v-if="getCourseData(course,6,5)" v-for="course in this.$store.state._studentRepository_.courseData">{{course.courseName}}</span></td>
              <td rowspan="2"><span v-if="getCourseData(course,7,5)" v-for="course in this.$store.state._studentRepository_.courseData">{{course.courseName}}</span></td>
            </tr>
            <tr>
              <td>第十节</td>
            </tr>
          </table>
        </Col>
      </Row>
    </div>
  </div>
</template>

<script>
  import ReturnSystemHome from "@/components/commons/ReturnSystemHome";


  export default {
    name: "StudentClassCourse",
    data(){
      return{
        array: 20,
        weekIndex: 1
      }
    },
    computed:{

    },
    components:{
      ReturnSystemHome
    },
    methods:{
      returnSystemHome(){
        this.$store.commit('needLoading',true)
        setTimeout(()=>{
          this.$router.push('/EducationSystem/student-system')
          this.$store.commit('needLoading',false)
        },750)
      },
      getCourseData(course,courseDate,courseSessions){
        return Number(course.startTime)<=this.weekIndex&&Number(course.endTime)>=this.weekIndex&&Number(course.courseDate)===courseDate&&course.courseSessions===courseSessions
      }
    },
    created() {
      console.log("???");
      this.$store.dispatch('requestCourseData')
    }
  }
</script>

<style scoped>
  #student_course_warp{
    width: 85%;
    height: auto;
  }
  #student_course_container{
    width: 100%;
    height: auto;
    background-color: rgba(22,22,22,.5);
  }
  .font{
    color: rgba(255,255,255,0.8);
    font-size: 22px;
  }
  .wrap {
    width: 100%;
    margin: 0 auto;
    border: 1px solid #ccc;
    border-collapse: collapse;
    font-size: 1.2rem;
    background-color: rgba(255,255,255,0.5);
    text-align: center;
  }
  .wrap tr,
  .wrap td{
    border: 1px solid #ccc;
    color: rgba(22,22,22,1);
    padding: 0.25em 0.5em;
    word-wrap: break-word;
    word-break: break-all;
  }
  .flex{
    min-width: 100px;
  }
  .title{
    font-size: 24px;
    margin-top: 12px;
    padding-bottom: 12px;
  }
  /deep/.ivu-select-item:hover {
    background: rgba(255,255,255,0.7) !important;
  }

  /deep/.ivu-select-dropdown::-webkit-scrollbar {
    width: 5px !important;
    height: 1px !important;
  }
  /*滚动条滑块*/
  /deep/.ivu-select-dropdown::-webkit-scrollbar-thumb {
    border-radius: 5px !important;
    -webkit-box-shadow: inset 0 0 5px rgba(0,0,0,0.2) !important;
    background-color: rgba(22,22,22,.4) !important;
  }
  /*滚动条轨道*/
  /deep/.ivu-select-dropdown::-webkit-scrollbar-track {
    -webkit-box-shadow: inset 0 0 1px rgba(0,0,0,0) !important;
    border-radius: 5px !important;
    background-color: rgba(122,122,122,.5) !important;
  }

  /deep/.ivu-select-item{
    background: rgba(255,255,255,0.4) !important;
  }
  /deep/.ivu-select-dropdown{
    background-color: rgba(255,255,255,0.4) !important;
  }
  /deep/.ivu-select-item-selected, /deep/.ivu-select-item-selected:hover {
    color: rgba(255,255,255,0.7) !important;
  }
  /deep/.ivu-select-selection{
    background-color: rgba(255,255,255,0.4) !important;
  }
  /deep/.ivu-select-item-focus{
    background-color: rgba(255,255,255,0.4) !important;
  }
</style>
