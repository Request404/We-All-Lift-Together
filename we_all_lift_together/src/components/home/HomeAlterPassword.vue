<template>
  <div id="home_alter_warp">
    <p id="home_alter_headline">修改密码</p>
    <div class="alter_input_warp">
      <label class="alter_input_label" for="reset_password">密码：</label>
      <input class="alter_input" id="reset_password" type="password" v-model="password">
    </div>
    <div class="alter_input_warp" ref="confirm_password">
      <label class="alter_input_label" for="confirm_password">确认：</label>
      <input class="alter_input" id="confirm_password" type="password" v-model="confirm">
    </div>
    <div id="alter_button" ref="alter_button">
      确认修改
    </div>
    <div id="alter_fun_box">
      <span class="call_return_login" @click="returnLogin">返回登录</span>
      <span class="call_return_login" @click="linkUs">联系我们</span>
    </div>
  </div>
</template>

<script>
  export default {
    name: "HomeAlterPassword",
    data(){
      return{
        password:'',
        confirm:'',
        pass_confirm: false
      }
    },
    watch:{
      confirm(){
        if (this.password==this.confirm){
          this.$refs.confirm_password.style.borderColor="#27ae60"
          this.pass_confirm=true
        }else {
          this.$refs.confirm_password.style.borderColor="#d13639"
          this.pass_confirm=false
        }
      }
    },
    methods:{
      returnLogin(){
        this.$emit('returnLogin','login')
      },
      linkUs(){
        this.$emit('linkUs','linkUs')
      }
    },
    updated(){
      if(!this.confirm){
        this.$refs.confirm_password.style.borderColor="rgba(22,22,22,.8)"
        this.pass_confirm=false
      }
      if (this.pass_confirm){
        this.$refs.alter_button.style.backgroundColor="#27ae60"
      }else {
        this.$refs.alter_button.style.backgroundColor="rgba(220,220,220,.9)"
      }
    }
  }
</script>

<style scoped>
  #home_alter_warp{
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
  }
  #home_alter_headline{
    font-size: 2.5rem;
  }
  .alter_input_warp{
    width: auto;
    height: 3rem;
    margin: 0 auto 10px;
    display: flex;
    justify-content: center;
    align-items: center;
    border: 1px solid black;
    position: relative;

  }
  .alter_input_label{
    padding: 0 5px;
    cursor: pointer;
  }
  .alter_input{
    width: auto;
    height: 95%;
    padding: 0 3px;
    margin: 1px 0;
  }
  #alter_button{
    width: 6.5rem;
    height: 1.5rem;
    margin: 5px;
    padding: 1px;
    background-color: rgba(220,220,220,.9);
    text-align: center;
    border-radius: 5px;
    letter-spacing: 1px;
    cursor: pointer;
    border: 1px solid rgba(22,22,22,.8);
    transition: 1s ease;
  }
  #alter_fun_box{
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