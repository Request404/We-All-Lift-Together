<template>
  <div id="return_warp">
    <div class="return_button_container">
      <span>&#8635;&nbsp;返回主页</span>
    </div>
  </div>
</template>

<script>
  export default {
    name: "ReturnSystemHome"
  }
</script>

<style scoped>
  #return_warp{
    width: 100%;
    height: auto;
    margin: 1rem 0;
  }
  .return_button_container{
    width: 8rem;
    height: auto;
    display: flex;
    align-items: center;
  }
  .return_button_container>span{
    color: gray;
    font-size: 1.3rem;
    line-height: 1rem;
    cursor: pointer;
    transition: 1s ease;
    text-shadow: 1px 1px 3px rgba(22,22,22,.8);
  }
  .return_button_container>span:hover{
    color: whitesmoke;
  }
</style>