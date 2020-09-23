<template>
  <div id="teacher_page_container">
    <div @click="goTeacherFunction('teacher-info')">
      <functions-box>
        <template v-slot:function_img>
          <img src="../../assets/img/function_box/function_background6.jpg" alt="">
        </template>
        <template v-slot:function_description>
          <span>教师信息</span>
        </template>
      </functions-box>
    </div>
    <div @click="goTeacherFunction('teacher-class')">
      <functions-box>
        <template v-slot:function_img>
          <img src="../../assets/img/function_box/function_background7.jpg" alt="">
        </template>
        <template v-slot:function_description>
          <span>我的班级</span>
        </template>
      </functions-box>
    </div>
    <div @click="goTeacherFunction('teacher-course')">
      <functions-box>
        <template v-slot:function_img>
          <img src="../../assets/img/function_box/function_background8.jpg" alt="">
        </template>
        <template v-slot:function_description>
          <span>我的课程</span>
        </template>
      </functions-box>
    </div>
    <div @click="goTeacherFunction('teacher-transcript')">
      <functions-box>
        <template v-slot:function_img>
          <img src="../../assets/img/function_box/function_background9.jpg" alt="">
        </template>
        <template v-slot:function_description>
          <span>成绩系统</span>
        </template>
      </functions-box>
    </div>
    <div @click="goTeacherFunction('teacher-affairs')">
      <functions-box>
        <template v-slot:function_img>
          <img src="../../assets/img/function_box/function_background10.jpg" alt="">
        </template>
        <template v-slot:function_description>
          <span>学生事务</span>
        </template>
      </functions-box>
    </div>
  </div>
</template>

<script>
  import FunctionsBox from "@/components/commons/FunctionsBox";

  export default {
    name: "TeacherMainPage",
    components:{
      FunctionsBox,
    },
    methods: {
      goTeacherFunction(loading){
        this.$store.commit('needLoading',true)
        setTimeout(()=>{
          this.$router.push('/EducationSystem/teacher-system/'+loading)
          this.$store.commit('needLoading',false)
        },750)
      }
    }
  }
</script>

<style scoped>
  #teacher_page_container{
    width: 90%;
    height: auto;
    display: grid;
    margin: 5rem 0;
    grid-template-columns:1fr 1fr 1fr 1fr;
    justify-items: center;
    align-items: center;
  }
  @media screen and (max-width: 450px){
    #teacher_page_container{
      margin: 3rem 0;
      grid-template-columns: 1fr 1fr;
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