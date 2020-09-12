<template>
  <div id="home_login_warp">
    <p id="home_login_headline">登录</p>
    <div class="login_input_warp">
      <label class="login_input_label" for="login_user">账号:</label>
      <input class="login_input" id="login_user" type="text" maxlength="16" v-model="username">
    </div>
    <div class="login_input_warp">
      <label class="login_input_label" for="login_password">密码:</label>
      <input class="login_input"  id="login_password" :type="psdType" maxlength="16" v-model="password">
      <img v-show="!Visible" @click="passwordVisible" class="password_visible_eye" src="../../assets/img/home_img/invisible_eye.svg" alt="">
      <img v-show="Visible" @click="passwordVisible" class="password_visible_eye" src="../../assets/img/home_img/visible_eye.svg" alt="">
    </div>
    <div id="identify_choose_warp">
      <label class="identify_choose" for="student"><input id="student" name="the_identify" type="radio">学生</label>
      <label class="identify_choose" for="teacher"><input id="teacher" name="the_identify" type="radio">教师</label>
      <label class="identify_choose" for="administration"><input id="administration" name="the_identify" type="radio">管理员</label>
    </div>
    <div id="login_button" ref="login_button">登录</div>
    <div id="resets_fun_box">
      <span class="call_forget_password" @click="resetPassword">忘记密码？</span>
      <span class="call_forget_password" @click="linkUs">联系我们</span>
    </div>
  </div>
</template>

<script>
  export default {
    name: "HomeLogin",
    data(){
      return{
        Visible: false,
        psdType: 'password',
        username: '',
        password: '',
      }
    },
    methods:{
      passwordVisible(){
        this.Visible = !this.Visible
        if(this.Visible){
          this.psdType = 'text'
        }else {
          this.psdType = 'password'
        }
        return this.Visible,this.psdType
      },
      resetPassword(){
        this.$emit('resetPassword','reset')
      },
      linkUs(){
        this.$emit('linkUs','linkUs')
      }
    },
    updated() {
      if (this.username.trim()&&this.password.trim()){
        this.$refs.login_button.style.backgroundColor = 'rgba(51,105,153,.9)'
      }else {
        this.$refs.login_button.style.backgroundColor = 'rgba(220,220,220,.9)'
      }
    }
  }
</script>

<style scoped>
  #home_login_warp{
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
  }
  #home_login_headline{
    font-size: 2.5rem;
  }
  .login_input_warp{
    width: auto;
    height: 3rem;
    margin: 0 auto 10px;
    display: flex;
    justify-content: center;
    align-items: center;
    border: 1px solid black;
    position: relative;

  }
  .login_input_label{
    padding: 0 5px;
    cursor: pointer;
  }
  .login_input{
    width: auto;
    height: 95%;
    padding: 0 3px;
    margin: 1px 0;
  }
  #identify_choose_warp{
    width: auto;
    height: 2rem;
    padding: 10px 0;
    display: flex;
    justify-content: center;
    align-content: center;
  }
  .identify_choose{
    margin: 4px;
    cursor: pointer;
  }

  #login_button{
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
  #resets_fun_box{
    width: auto;
    height: 2.5rem;
    margin: 1rem auto 1.2rem;
  }
  .call_forget_password{
    margin: 0 1rem;
    font-weight: 100;
    font-size: 1.1rem;
    transition: .5s ease;
    cursor: pointer;
  }
  .call_forget_password:hover{
    color: dimgray;
  }
  .password_visible_eye{
    width: 1.3rem;
    height: auto;
    position: absolute;
    right: 8px;
    top: 30%;
    cursor: pointer;
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