<template>
  <div id="admin_page_container" v-if="true">
    <div @click="goAdminFunction('student-system')">
      <functions-box>
        <template v-slot:function_img>
          <img src="../../assets/img/function_box/function_background13.jpg" alt="">
        </template>
        <template v-slot:function_description>
          <span>学生信息</span>
        </template>
      </functions-box>
    </div>
    <div @click="goAdminFunction('teacher-system')">
      <functions-box>
        <template v-slot:function_img>
          <img src="../../assets/img/function_box/function_background14.jpg" alt="">
        </template>
        <template v-slot:function_description>
          <span>教师信息</span>
        </template>
      </functions-box>
    </div>
    <div @click="goAdminFunction('course-system')">
      <functions-box>
        <template v-slot:function_img>
          <img src="../../assets/img/function_box/function_background11.jpg" alt="">
        </template>
        <template v-slot:function_description>
          <span>课程系统</span>
        </template>
      </functions-box>
    </div>
    <div @click="goAdminFunction('elective-system')">
      <functions-box>
        <template v-slot:function_img>
          <img src="../../assets/img/function_box/function_background12.jpg" alt="">
        </template>
        <template v-slot:function_description>
          <span>选课系统</span>
        </template>
      </functions-box>
    </div>
    <div @click="goAdminFunction('transcript-system')">
      <functions-box>
        <template v-slot:function_img>
          <img src="../../assets/img/function_box/function_background15.jpg" alt="">
        </template>
        <template v-slot:function_description>
          <span>成绩系统</span>
        </template>
      </functions-box>
    </div>
    <div @click="goAdminFunction('affairs-system')">
      <functions-box>
        <template v-slot:function_img>
          <img src="../../assets/img/function_box/function_background16.jpg" alt="">
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
    name: "AdministrationMainPage",
    methods: {
      goAdminFunction(loading){
        this.$store.commit('needLoading',true)
        this.isEnterFunction = true
        setTimeout(()=>{

          this.$router.push('/EducationSystem/administration-system/'+loading)
          this.$store.commit('needLoading',false)
        },750)
      }
    },
    components:{
        FunctionsBox,
    }
  }
</script>

<style scoped>
  #admin_page_container{
    width: 90%;
    height: auto;
    display: grid;
    margin: 5rem 0;
    grid-template-columns:1fr 1fr 1fr 1fr;
    justify-items: center;
    align-items: center;
  }
  @media screen and (max-width: 450px){
    #admin_page_container{
      margin: 3rem 0;
      grid-template-columns: 1fr 1fr;
    }
  }
  @media screen and (min-width: 450px) and (max-width: 860px){
    #admin_page_container{
      grid-template-columns:1fr 1fr;
    }
  }
  @media screen and (min-width: 860px) and (max-width: 1100px) {
    #admin_page_container{
      grid-template-columns: 1fr 1fr 1fr;
    }
  }
  @media screen and (min-width: 1100px) and (max-width: 1200px){
    #admin_page_container{
      grid-template-columns: 1fr 1fr 1fr 1fr;
    }
  }
</style>