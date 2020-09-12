<template>
  <div id="home_reset_warp">
    <p id="home_reset_headline">重置密码</p>
    <div class="reset_input_warp">
      <label class="reset_input_label" for="user_name">账号：</label>
      <input class="reset_input" id="user_name" type="text" maxlength="16" v-model="username">
    </div>
    <div class="reset_input_warp" ref="email">
      <label class="reset_input_label" for="user_email" >邮箱：</label>
      <input class="reset_input" id="user_email" type="text" maxlength="20" v-model="email">
    </div>
    <div id="reset_button" ref="reset_button">验证</div>
    <div id="return_login_box">
      <span class="call_return_login" @click="returnLogin">返回登录</span>
      <span class="call_return_login" @click="linkUs">联系我们</span>
    </div>
  </div>
</template>

<script>
export default {
  name: "HomeResetInfo",
  data(){
    return{
      username: '',
      email: '',
      emailPass: false
    }
  },
  watch:{
    email(){
      if(this.email){
        this.isEmail()
      }else {
        this.$refs.email.style.borderColor="rgba(66,66,66,.9)"
      }
    }
  },
  methods:{
    isEmail() {
      if (this.email.search(/^\w+((-\w+)|(\.\w+))*@[A-Za-z0-9]+((\.|-)[A-Za-z0-9]+)*\.[A-Za-z0-9]+$/) != -1) {
        this.$refs.email.style.borderColor="#27ae60"
        this.emailPass = true
      } else{
        this.$refs.email.style.borderColor="#d13639"
        this.emailPass = false
      }
    },
    returnLogin(){
      this.$emit('returnLogin','login')
    },
    linkUs(){
      this.$emit('linkUs','linkUs')
    }
  },
  updated() {
    if (this.username.trim()&&this.emailPass){
      this.$refs.reset_button.style.backgroundColor = '#27ae60'
    }else {
      this.$refs.reset_button.style.backgroundColor = 'rgba(220,220,220,.9)'
    }
  }
}
</script>

<style scoped>
  #home_reset_warp{
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
  }
  #home_reset_headline{
    font-size: 2.5rem;
  }
  .reset_input_warp{
    width: auto;
    height: 3rem;
    margin: 0 auto 10px;
    display: flex;
    justify-content: center;
    align-items: center;
    border: 1px solid black;
    position: relative;
  }
  .reset_input_label{
    padding: 0 5px;
    cursor: pointer;
  }
  .reset_input{
    width: auto;
    height: 95%;
    padding: 0 3px;
    margin: 1px 0;
  }
  #reset_button{
    width: 4.5rem;
    height: 1.5rem;
    margin: 5px;
    padding: 1px;
    background-color: rgba(220,220,220,.9);
    text-align: center;
    border-radius: 5px;
    letter-spacing: 5px;
    cursor: pointer;
    border: 1px solid rgba(22,22,22,.8);
    transition: 1s ease;
  }
  #return_login_box{
    width: auto;
    height: 2.5rem;
    margin: 1rem auto 1.2rem;
  }
  .call_return_login{
    margin: 0 1rem;
    font-weight: 100;
    font-size: 1.1rem;
    transition: .5s ease;
    cursor: pointer;
  }
  .call_return_login:hover{
    color: dimgray;
  }
  input{
    border-radius: 1px;
    border: none;
    outline: none;
    background-color: rgba(230,230,230,.9);
  }
  input::-ms-clear,
  input::-ms-reveal{display: none;}
</style>