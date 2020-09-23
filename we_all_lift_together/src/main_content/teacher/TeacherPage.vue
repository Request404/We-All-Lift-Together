<template>
  <div id="teacher_page_warp">
    <keep-alive>
      <router-view/>
    </keep-alive>
  </div>
</template>

<script>
  export default {
    name: "TeacherPage",
    data(){
      return{
        teacherFunctionPart: 'home'
      }
    }
  }
</script>

<style scoped>
  #teacher_page_warp{
    width: 100%;
    height: auto;
    display: flex;
    justify-content: center;
    align-items: center;
  }
</style>