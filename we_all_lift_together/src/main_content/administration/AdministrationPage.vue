<template>
  <div id="admin_page_container">
    <functions-box>
      <template v-slot:function_img>
        <img src="../../assets/img/function_box/function_background11.jpg" alt="">
      </template>
      <template v-slot:function_description>
        <span>学生信息</span>
      </template>
    </functions-box>
    <functions-box>
      <template v-slot:function_img>
        <img src="../../assets/img/function_box/function_background12.jpg" alt="">
      </template>
      <template v-slot:function_description>
        <span>教师信息</span>
      </template>
    </functions-box>
    <functions-box>
      <template v-slot:function_img>
        <img src="../../assets/img/function_box/function_background12.jpg" alt="">
      </template>
      <template v-slot:function_description>
        <span>课程系统</span>
      </template>
    </functions-box>
    <functions-box>
      <template v-slot:function_img>
        <img src="../../assets/img/function_box/function_background11.jpg" alt="">
      </template>
      <template v-slot:function_description>
        <span>选课系统</span>
      </template>
    </functions-box>
    <functions-box>
      <template v-slot:function_img>
        <img src="../../assets/img/function_box/function_background12.jpg" alt="">
      </template>
      <template v-slot:function_description>
        <span>成绩系统</span>
      </template>
    </functions-box>
    <functions-box>
      <template v-slot:function_img>
        <img src="../../assets/img/function_box/function_background12.jpg" alt="">
      </template>
      <template v-slot:function_description>
        <span>学生事务</span>
      </template>
    </functions-box>
  </div>
</template>

<script>
  import FunctionsBox from "@/components/commons/FunctionsBox";


  export default {
    name: "AdministrationPage",
    components:{
      FunctionsBox
    }
  }
</script>

<style scoped>
  #admin_page_container{
    width: 90%;
    height: auto;
    display: grid;
    grid-template-columns:1fr 1fr 1fr 1fr;
    justify-items: center;
    align-items: center;
  }
  @media screen and (max-width: 450px){
    #admin_page_container{
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