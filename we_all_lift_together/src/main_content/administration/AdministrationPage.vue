<template>
  <div id="admin_page_warp">
    <keep-alive>
      <router-view/>
    </keep-alive>
  </div>
</template>

<script>

  export default {
    name: "AdministrationPage",
  }
</script>

<style scoped>
  #admin_page_warp{
    width: 100%;
    height: auto;
    display: flex;
    justify-content: center;
    align-items: center;
  }

</style>