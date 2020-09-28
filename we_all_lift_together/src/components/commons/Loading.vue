<template>
  <div id="loading_container">
    <div id="loading_bar">
      <img id="loading_img" src="../../assets/img/request_page/Loading.svg" alt="">
    </div>
  </div>
</template>

<script>
  export default {
    name: "Loading"
  }
</script>

<style scoped>
 #loading_container{
   width: 100%;
   height: 100%;
   position: absolute;
   top: 0;
   left: 0;
   z-index: 100;
   background-color: rgba(22,22,22,.3);
   display: flex;
   justify-content: center;
   align-items: center;
   user-select: none;
 }
  #loading_bar{
    display: flex;
    justify-content: center;
    align-items: center;
  }
  #loading_img{
    width: auto;
    height: 3rem;
    animation: anim 60s linear;
  }
 @keyframes anim{
   form{transform: rotate(0deg);}
   to{transform: rotate(12800deg);}
 }
</style>
