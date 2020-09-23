<template>
  <div id="student_page_warp">
    <keep-alive>
      <router-view/>
    </keep-alive>
  </div>
</template>

<script>

  export default {
    name: "StudentPage",

  }
</script>

<style scoped>
  #student_page_warp{
    width: 100%;
    height: auto;
    display: flex;
    justify-content: center;
  }
</style>