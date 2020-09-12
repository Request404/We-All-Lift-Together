<template>
  <div id="link_us_container">
    <h1 id="link_us_headline">广告位招租</h1>
    <h2 id="link_us_phone">联系人：17876842084</h2>
    <div id="return_login_box">
      <span @click="returnLogin" class="return_button">返回登录</span>
      <span class="return_button">联系我们</span>
    </div>
  </div>
</template>

<script>


  export default {
    name: "LineUs",
    methods:{
      returnLogin(){
        this.$emit('returnLogin','login')
      }
    }
  }
</script>

<style scoped>
  #link_us_container{
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
  }
  #link_us_headline{
    font-size: 3rem;
  }
  #return_login_box{
    width: auto;
    height: 2.5rem;
    margin: 1rem auto 1.2rem;
  }
  .return_button{
    margin: 0 1rem;
    font-size: 1.1rem;
    transition: .5s ease;
    cursor: pointer;
  }
  .return_button:hover{
    color: dimgray;
  }
</style>