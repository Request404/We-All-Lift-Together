<template>
  <div id="home_account_warp" ref="home_account_warp">
   <home-login v-show="accountOperate=='login'" @resetPassword="resetPassword"></home-login>
   <home-reset-info v-show="accountOperate=='reset'" @returnLogin="returnLogin"></home-reset-info>
 </div>
</template>

<script>
import HomeLogin from "@/components/Home/HomeLogin";
import HomeResetInfo from "@/components/Home/HomeResetInfo";

export default {
  name: "HomeAccountPane",
  data(){
    return{
      accountOperate: 'login'
    }
  },
  methods:{
    resetPassword(reset){
      setTimeout(()=>{this.accountOperate = reset},750)
    },
    returnLogin(login){
      setTimeout(()=>{this.accountOperate = login},750)
    }
  },
  components:{
    HomeLogin,
    HomeResetInfo
  },
  mounted() {
    setTimeout(()=>{
      // this.$refs.home_account_warp.style.transition = '1.2s ease'
      this.$refs.home_account_warp.style.opacity = 1
      this.$refs.home_account_warp.style.transform = 'scale(1,1)'
      setTimeout(()=>{
        this.$refs.home_account_warp.style.transition = 'none'
      },2000)
    },300)
  },
}
</script>

<style scoped>
  #home_account_warp{
    width: 25%;
    height: auto;
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
    /*display: grid;*/
    /*justify-content: center;*/
    /*justify-items: center;*/
    background-color: rgba(225,225,225,.88);
    border-radius: 5px;
    opacity: 0;
    font-weight: 100;
    font-size: 1.2rem;
    user-select: none;
    box-shadow: 1px 3px 10px rgba(22,22,22,.8);
    transition: 1s ease;
    transform: scale(0.8,0.8);
  }
  @media screen and (max-width: 550px){
    #home_account_warp{
      width: 85%;
    }
  }
  @media screen and (min-width: 550px) and (max-width: 1000px){
    #home_account_warp{
      width: 50%;
    }
  }
  @media screen and (min-width: 1000px) and (max-width: 1100px) {
    #home_account_warp{
      width: 40%;
    }
  }
  @media screen and (min-width: 1100px) and (max-width: 1200px){
    #home_account_warp{
      width: 30%;
    }
  }
</style>