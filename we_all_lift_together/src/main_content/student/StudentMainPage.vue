<template>
  <div id="student_page_container">
    <div @click="goStudentFunction('student-info')">
      <functions-box>
        <template v-slot:function_img>
          <img src="../../assets/img/function_box/function_background1.jpg" alt="">
        </template>
        <template v-slot:function_description>
          <span>学生信息</span>
        </template>
      </functions-box>
    </div>
    <div @click="goStudentFunction('student-course')">
      <functions-box>
        <template v-slot:function_img>
          <img src="../../assets/img/function_box/function_background2.jpg" alt="">
        </template>
        <template v-slot:function_description>
          <span>课表概况</span>
        </template>
      </functions-box>
    </div>
    <div @click="goStudentFunction('student-elective')">
      <functions-box >
        <template v-slot:function_img>
          <img src="../../assets/img/function_box/function_background3.jpg" alt="">
        </template>
        <template v-slot:function_description>
          <span>噩梦选课</span>
        </template>
      </functions-box>
    </div>
    <div @click="goStudentFunction('student-transcript')">
      <functions-box>
        <template v-slot:function_img>
          <img src="../../assets/img/function_box/function_background4.jpg" alt="">
        </template>
        <template v-slot:function_description>
          <span>成绩查询</span>
        </template>
      </functions-box>
    </div>
    <div @click="goStudentFunction('student-affairs')">
      <functions-box>
        <template v-slot:function_img>
          <img src="../../assets/img/function_box/function_background5.jpg" alt="">
        </template>
        <template v-slot:function_description>
          <span>事务申请</span>
        </template>
      </functions-box>
    </div>
  </div >
</template>

<script>
  import FunctionsBox from "@/components/commons/FunctionsBox";

  export default {
    name: "StudentMainPage",
    components:{
      FunctionsBox,
    },
    methods: {
      goStudentFunction(loading){
        this.$store.commit('needLoading',true)
        setTimeout(()=>{
          this.$router.push('/EducationSystem/student-system/'+loading)
          this.$store.commit('needLoading',false)
        },750)
      },
      returnSystemHome(home){
        this.studentFunctionPart = home
      }
    }
  }
</script>

<style scoped>
  #student_page_container{
    width: 90%;
    padding: 5rem 0;
    height: auto;
    display: grid;
    grid-template-columns:1fr 1fr 1fr 1fr;
    justify-items: center;
    align-items: center;
  }
  @media screen and (max-width: 450px){
    #student_page_container{
      padding: 3rem 0;
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