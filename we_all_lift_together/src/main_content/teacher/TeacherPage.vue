<template>
  <div id="teacher_page_container">
    <functions-box>
      <template v-slot:function_img>
        <img src="../../assets/img/student_page_img/test_background_img.jpg" alt="">
      </template>
      <template v-slot:function_description>
        <span>教师信息</span>
      </template>
    </functions-box>
    <functions-box>
      <template v-slot:function_img>
        <img src="../../assets/img/student_page_img/test_background_img2.jpg" alt="">
      </template>
      <template v-slot:function_description>
        <span>我的课程</span>
      </template>
    </functions-box>
    <functions-box>
      <template v-slot:function_img>
        <img src="../../assets/img/student_page_img/test_background_img3.jpg" alt="">
      </template>
      <template v-slot:function_description>
        <span>成绩录入</span>
      </template>
    </functions-box>
    <functions-box>
      <template v-slot:function_img>
        <img src="../../assets/img/student_page_img/test_background_img4.jpg" alt="">
      </template>
      <template v-slot:function_description>
        <span>事务申请</span>
      </template>
    </functions-box>
  </div>
</template>

<script>
  import FunctionsBox from "@/components/commons/FunctionsBox";

  export default {
    name: "TeacherPage",
    components:{
      FunctionsBox
    }
  }
</script>

<style scoped>
  #teacher_page_container{
    width: 90%;
    height: auto;
    display: grid;
    grid-template-columns:1fr 1fr 1fr 1fr;
    justify-items: center;
    align-items: center;
  }
  @media screen and (max-width: 450px){
    #teacher_page_container{
      grid-template-columns: 1fr;
    }
  }
  @media screen and (min-width: 450px) and (max-width: 860px){
    #teacher_page_container{
      grid-template-columns:1fr 1fr;
    }
  }
  @media screen and (min-width: 860px) and (max-width: 1100px) {
    #teacher_page_container{
      grid-template-columns: 1fr 1fr 1fr;
    }
  }
  @media screen and (min-width: 1100px) and (max-width: 1200px){
    #teacher_page_container{
      grid-template-columns: 1fr 1fr 1fr 1fr;
    }
  }
</style>