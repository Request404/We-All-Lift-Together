<template>
  <div id="student_page_warp">
    <div id="student_page_container" v-if="true">
      <functions-box>
        <template v-slot:function_img>
          <img src="../../assets/img/function_box/fa4f7765cb326b2971889b188917e15.jpg" alt="">
        </template>
        <template v-slot:function_description>
          <span>学生信息</span>
        </template>
      </functions-box>
      <functions-box>
        <template v-slot:function_img>
          <img src="../../assets/img/function_box/function_background2.jpg" alt="">
        </template>
        <template v-slot:function_description>
          <span>课表概况</span>
        </template>
      </functions-box>
      <functions-box>
        <template v-slot:function_img>
          <img src="../../assets/img/function_box/function_background3.jpg" alt="">
        </template>
        <template v-slot:function_description>
          <span>噩梦选课</span>
        </template>
      </functions-box>
      <functions-box>
        <template v-slot:function_img>
          <img src="../../assets/img/function_box/function_background4.jpg" alt="">
        </template>
        <template v-slot:function_description>
          <span>成绩查询</span>
        </template>
      </functions-box>
      <functions-box>
        <template v-slot:function_img>
          <img src="../../assets/img/function_box/function_background5.jpg" alt="">
        </template>
        <template v-slot:function_description>
          <span>事务申请</span>
        </template>
      </functions-box>
    </div >
    <student-info v-else-if="false"></student-info>
    <student-grade v-else-if="false"></student-grade>
    <student-application v-else-if="false"></student-application>
    <student-class-schedule v-else></student-class-schedule>
  </div>
</template>

<script>
  import FunctionsBox from "@/components/commons/FunctionsBox";
  import StudentInfo from "@/main_content/student/StudentInfo";
  import StudentGrade from "@/main_content/student/StudentGrade";
  import StudentClassSchedule from "@/main_content/student/StudentClassSchedule";
  import StudentApplication from "@/main_content/student/StudentApplication";

  export default {
    name: "StudentPage",
    components:{
      FunctionsBox,
      StudentApplication,
      StudentInfo,
      StudentClassSchedule,
      StudentGrade
    },
  }
</script>

<style scoped>
  #student_page_warp{
    width: 100%;
    height: auto;
    display: flex;
    justify-content: center;
    align-items: center;
  }
  #student_page_container{
    width: 90%;
    height: auto;
    display: grid;
    grid-template-columns:1fr 1fr 1fr 1fr;
    justify-items: center;
    align-items: center;
  }
  @media screen and (max-width: 450px){
    #student_page_container{
      grid-template-columns: 1fr 1fr;
    }
  }
  @media screen and (min-width: 450px) and (max-width: 860px){
    #student_page_container{
      grid-template-columns:1fr 1fr;
    }
  }
  @media screen and (min-width: 860px) and (max-width: 1100px) {
    #student_page_container{
      grid-template-columns: 1fr 1fr 1fr;
    }
  }
  @media screen and (min-width: 1100px) and (max-width: 1200px){
    #student_page_container{
      grid-template-columns: 1fr 1fr 1fr 1fr;
    }
  }
</style>