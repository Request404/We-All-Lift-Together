<template>
  <div id="request_deny_pane">
    <div id="request_deny_reasons">
      <span id="request_deny_state">{{requestState}}</span>
      <span id="request_deny_word">{{denyWord}}</span>
      <span id="return_hint_word">
        点击这里返回
        <span id="page_redirect_button" @click="returnHome">首页</span>
      </span>
    </div>
  </div>
</template>

<script>
  export default {
    name: "RequestDeny",
    data(){
      return{
        requestState: this.$store.state._responseStatus_
      }
    },
    computed:{
      denyWord(){
        if (this.requestState === 200){
          return "都没报错,来干嘛!!!"
        }
        if (this.requestState === 404){
          return "请求被拒绝了!!!"
        }if (this.requestState === 500){
          return "在bug上写了个程序,很抱歉"
        }else {
          return "发生未知错误了!!!"
        }
      }
    },
    methods:{
      returnHome(){
        this.$store.commit('needLoading',true)
        setTimeout(()=>{
          this.$router.push('/')
          this.$store.commit('needLoading',false)
        },500)
      }
    }
  }
</script>

<style scoped>
  #request_deny_pane{
    width: 100%;
    height: 100%;
    background-image: url("../../assets/img/request_page/request_deny.png");
    opacity: .95;
    background-size: auto 100%;
    background-position: center center;
    display: flex;
    flex-direction: column;
    justify-content: center;
    user-select: none;
  }
  #request_deny_reasons{
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
  }
  #request_deny_state{
    font-size: 11rem;
    font-family: 华文行楷;
    color: honeydew;
    letter-spacing: 10px;
    text-shadow:  rgba(22,22,22,.8) 2px 10px 10px;;
  }
  #request_deny_word{
    font-size: 3.2rem;
    font-family: 华文新魏;
    color: honeydew;
    letter-spacing: 5px;
    text-align: center;
    text-shadow:  rgba(22,22,22,.8) 2px 10px 10px;
    text-transform: uppercase;
  }
  #return_hint_word{
    font-size: 1.9rem;
    font-family: 华文新魏;
    color: honeydew;
    text-align: center;
    text-shadow:  rgba(22,22,22,.8) 1px 10px 10px;
    margin: 2rem 0;
  }
  #page_redirect_button{
    text-shadow:  rgba(22,22,22,.8) 0px 1px 0px;
    color: darkblue;
    cursor: pointer;
    transition: .75s ease;
  }
  #page_redirect_button:hover{
    text-shadow:  rgba(225,225,225,.8) 0px -5px 1px;
    color: seashell;
  }
  @media screen and (max-width: 550px){
    #request_deny_word{
      font-size: 1.2rem;
    }
    #return_hint_word{
      font-size: 1.5rem;
    }
  }
  @media screen and (min-width: 550px) and (max-width: 1000px){
    #request_deny_word{
      font-size: 2rem;
    }
    #return_hint_word{
      font-size: 1.7rem;
    }
  }
</style>