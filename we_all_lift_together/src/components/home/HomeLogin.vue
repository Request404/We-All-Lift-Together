<template>
  <div id="home_login_warp">
    <p id="home_login_headline">登录</p>
    <div class="login_input_warp">
      <label class="login_input_label" for="login_user" >账号:</label>
      <input class="login_input" id="login_user" type="number" maxlength="16" v-model="userId" @keyup.enter="userLogin(identity)">
    </div>
    <div class="login_input_warp">
      <label class="login_input_label" for="login_password">密码:</label>
      <input class="login_input"  id="login_password" :type="psdType" maxlength="16" v-model="password" @keyup.enter="userLogin(identity)">
      <img v-show="!Visible" @click="passwordVisible" class="password_visible_eye" src="../../assets/img/home_img/invisible_eye.svg" alt="">
      <img v-show="Visible" @click="passwordVisible" class="password_visible_eye" src="../../assets/img/home_img/visible_eye.svg" alt="">
    </div>
    <div id="identify_choose_warp" @keyup.enter="userLogin(identity)">
      <label class="identify_choose" for="student">
        <input id="student" name="the_identify" type="radio" value="student" v-model="identity">
        学生
      </label>
      <label class="identify_choose" for="teacher">
        <input id="teacher" name="the_identify" type="radio" value="teacher" v-model="identity">
        教师
      </label>
      <label class="identify_choose" for="administration">
        <input id="administration" name="the_identify" type="radio" value="admin" v-model="identity">
        管理员
      </label>
    </div>
    <div id="login_fail_hint" ref="login_fail">
      用户名或密码错误
    </div>
    <div id="login_button" ref="login_button" @click="userLogin(identity)">登录</div>
    <div id="resets_fun_box">
      <span class="call_forget_password" @click="resetPassword">忘记密码？</span>
      <span class="call_forget_password" @click="linkUs">联系我们</span>
    </div>
  </div>
</template>

<script>
  import {asyn} from '@/network/asyn'

  export default {
    name: "HomeLogin",
    data(){
      return{
        Visible: false,
        psdType: 'password',
        userId: '',
        password: '',
        infoComplete: false,
        identity: 'student'
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
      },
      resetPassword(){
        this.$emit('resetPassword','reset')
      },
      linkUs(){
        this.$emit('linkUs','linkUs')
      },
      clearPassword(){
        this.password = ''
      } ,
      loginRequestSuccess(rs){
        this.$store.commit('needLoading',false)
        if (rs.data){
          console.log(rs);
        }else {
          this.loginFail()
        }
      },
      loginRequestError(err){
        this.$store.commit('needLoading',false)
        this.$store.commit('rsErrorStatus',err.response.status)
        this.$router.push("/request-deny")
      },
      loginFail(){
        this.$refs.login_fail.style.opacity = 1
        setTimeout(()=>{
          this.$refs.login_fail.style.opacity = 0
        },1000)
      },
      userLogin(identity){
        if(this.infoComplete){
          switch (identity) {
            case "student":
              this.$store.commit('needLoading',true)
              asyn({
                method: "post",
                url: "/student/userLogin",
                data: {
                  studentId: this.userId,
                  studentPassword: this.password,
                }
              }).then(rs=>{
                this.loginRequestSuccess(rs)
              }).catch(err=>{
                this.loginRequestError(err)
              });
              this.clearPassword()
              break;
            case "teacher":
              this.$store.commit('needLoading',true)
              asyn({
                method: "post",
                url: "/teacher/userLogin",
                data: {
                  teacherId: this.userId,
                  teacherPassword: this.password
                }
              }).then(rs=>{
                this.loginRequestSuccess(rs)
              }).catch(err=>{
                this.loginRequestError(err)
              });
              this.clearPassword()
              break;
            case "admin":
              this.$store.commit('needLoading',true)
              asyn({
                method: "post",
                url: "/admin/userLogin",
                data: {
                  administrationId: this.userId,
                  administrationPassword: this.password
                }
              }).then(rs=>{
                this.loginRequestSuccess(rs)
              }).catch(err=>{
                this.loginRequestError(err)
              });
              this.clearPassword()
              break;
            default:
              console.log("no identity");
              break;
          }
        }
      }
    },
    updated() {
      if (this.userId.trim()&&this.password.trim()){
        this.infoComplete = true
        this.$refs.login_button.style.backgroundColor = 'rgba(51,105,153,.9)'
      }else {
        this.$refs.login_button.style.backgroundColor = 'rgba(220,220,220,.9)'
        this.infoComplete = false
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
  #login_fail_hint{
    padding-bottom: 6px;
    width: auto;
    height: 1rem;
    opacity: 0;
    font-size: 1.2rem;
    color: #d13639;
    background-color: rgba(225,225,225,.3);
    transition: .5s ease;
  }

  input{
    border-radius: 1px;
    border: none;
    outline: none;
    background-color: rgba(230,230,230,.8);
  }
  input::-ms-clear,
  input::-ms-reveal{display: none;}
  input::-ms-clear,
  input::-ms-reveal{display: none;}
  /* 谷歌 */
  input::-webkit-outer-spin-button,
  input::-webkit-inner-spin-button {
    -webkit-appearance: none;
    appearance: none;
    margin: 0;
  }
  /* 火狐 */
  input{
    -moz-appearance:textfield;
  }
</style>