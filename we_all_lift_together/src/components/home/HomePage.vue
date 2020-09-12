<template>
  <div id="home_page_warp">
    <home-account-pane></home-account-pane>
  </div>
</template>

<script>
import HomeAccountPane from "@/components/home/HomeAccountPane";

export default {
  name: "HomePage",
  components:{
    HomeAccountPane
   }
}

</script>

<style scoped>
  #home_page_warp{
    width: 100%;
    height: 100%;
    background-image: url("../../assets/img/home_img/home_background.jpg");
    background-position: center center;
    background-size: 100% 100%;
    display: flex;
    justify-content: center;
    align-items: center;
  }
</style>