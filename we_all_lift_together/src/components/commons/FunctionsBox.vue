<template>
  <div class="function_box_container" @mouseenter="enterFunBox" @mouseleave="leaveFunBox">
    <div class="function_img_container" ref="img_container">
      <slot name="function_img">
        <img src="../../assets/img/student_page_img/test_background_img.jpg" alt="">
      </slot>
    </div>
    <div class="function_description_container" ref="description">
      <slot name="function_description">
        <span>你好，世界</span>
      </slot>
      <img class="go_img" src="../../assets/img/function_box/go_setup.svg" alt="">
    </div>
    <div class="enter_go_logo" ref="enter_go_logo">
      <img src="../../assets/img/function_box/go_setup.svg" alt="">
    </div>
  </div>
</template>

<script>
  export default {
    name: "FunctionsBox",
    methods:{
      enterFunBox(){
        this.$refs.img_container.style.transform = "scale(1.2,1.2)"
        this.$refs.description.style.opacity = 0
        this.$refs.enter_go_logo.style.opacity = 0.8
      },
      leaveFunBox(){
        this.$refs.img_container.style.transform = "scale(1,1)"
        this.$refs.enter_go_logo.style.opacity = 0
        this.$refs.description.style.opacity = 0.8
      }
    }
  }
</script>

<style scoped>
  .function_box_container{
    width: 18.5rem;
    height: 12rem;
    overflow: hidden;
    box-sizing: border-box;
    border: 5px solid rgba(22,22,22,1);
    box-shadow: 1px 3px 15px rgba(22,22,22,.8);
    display: flex;
    flex-wrap: wrap;
    flex-direction: column;
    justify-content: center;
    align-items: center;
    background-color: rgba(22,22,22,.8);
    cursor: pointer;
    position: relative;
    transition: 0.35s ease;
    margin: 5px;
  }
  .function_img_container{
    width: 100%;
    height: 100%;
    transition: 3s ease;
  }
  .function_img_container>img{
    width: auto;
    height: 100%;
  }
  .function_description_container{
    width: 100%;
    height: 100%;
    position: absolute;
    top: 0;
    right: 0;
    z-index: 50;
    background-color: rgba(22,22,22,.5);
    display: flex;
    justify-content: center;
    align-items: center;
    flex-direction: column;
    transition: 0.5s ease;
  }
  .function_description_container>span{
    margin-bottom: 20px;
    font-size: 2rem;
    color: seashell;
    text-shadow: -1px -5px 3px rgba(122,122,122,.9);
  }
  .go_img{
    position: absolute;
    bottom: 10%;
    left: 45%;
    width: 30px;
    height: auto;
  }
  .enter_go_logo{
    position: absolute;
    top: 0;
    right: 0;
    width: 100%;
    height: 100%;
    display: flex;
    justify-content: center;
    align-items: center;
    opacity: 0;
    transition: 0.5s ease;
  }
  .enter_go_logo>img{
    width: 7.5rem;
    height: auto;
  }
  @media screen and (max-width: 450px){
    .function_box_container{
      width: 11rem;
      height: 7.5rem;
    }
    .function_description_container>span{
      font-size: 1.5rem;
    }
  }
  @media screen and (min-width: 450px) and (max-width: 860px){
    .function_box_container{
      width: 13rem;
      height: 8.5rem;
    }
    .function_description_container>span{
      font-size: 1.6rem;
    }
  }
  @media screen and (min-width: 860px) and (max-width: 1100px) {
    .function_box_container{
      transform: scale(.9,.9);
    }
    .function_description_container>span{
      font-size: 1.8rem;
    }
  }
  @media screen and (min-width: 1100px) and (max-width: 1200px){
    .function_box_container{
      transform: scale(1,1);
    }
    .function_description_container>span{
      font-size: 2rem;
    }
  }
</style>