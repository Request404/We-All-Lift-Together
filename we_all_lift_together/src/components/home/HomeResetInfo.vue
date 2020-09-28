<template>
  <div id="home_reset_warp">
    <p id="home_reset_headline">重置密码</p>
    <div class="reset_input_warp">
      <label class="reset_input_label" for="user_id">账号：</label>
      <input class="reset_input" id="user_id" type="number" maxlength="16" v-model="userId" @keyup.enter="userVerification(alter_identity)">
    </div>
    <div class="reset_input_warp" ref="email">
      <label class="reset_input_label" for="user_email" >邮箱：</label>
      <input class="reset_input" id="user_email" type="text" maxlength="20" v-model="email" @keyup.enter="userVerification(alter_identity)">
    </div>
    <div id="alter_identify_choose_warp" @keyup.enter="userVerification(alter_identity)">
      <label class="identify_choose" for="alter_student">
        <input id="alter_student" name="the_alter_identify" type="radio" value="student" v-model="alter_identity">
        学生
      </label>
      <label class="identify_choose" for="alter_teacher">
        <input id="alter_teacher" name="the_alter_identify" type="radio" value="teacher" v-model="alter_identity">
        教师
      </label>
      <label class="identify_choose" for="alter_administration">
        <input id="alter_administration" name="the_alter_identify" type="radio" value="admin" v-model="alter_identity">
        管理员
      </label>
    </div>
    <div id="verification_fail_hint" ref="verification_fail">
      验证失败
    </div>
    <div id="reset_button" ref="reset_button" @click="userVerification(alter_identity)">验证</div>
    <div id="return_login_box">
      <span class="call_return_login" @click="returnLogin">返回登录</span>
      <span class="call_return_login" @click="linkUs">联系我们</span>
    </div>
  </div>
</template>

<script>
import {asyn} from "@/network/asyn";

export default {
  name: "HomeResetInfo",
  data(){
    return{
      userId: '',
      email: '',
      infoComplete: false,
      alter_identity:'student',
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
      if (this.email.search(/^\w+((-\w+)|(\.\w+))*@[A-Za-z0-9]+((\.|-)[A-Za-z0-9]+)*\.[A-Za-z0-9]+$/) !== -1) {
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
    },
    clearEmail(){
      this.email = ''
      this.emailPass = false
    },
    verRequestSuccess(rs){
      this.$store.commit('needLoading',false)
      if (rs.data){
        this.$store.commit('_verificationIdentity_',this.alter_identity)
        this.$store.commit('_verificationAccount_',this.userId)
        this.$emit('alterPassword','alter')
        console.log(rs.data);
      }else {
        this.clearEmail()
        this.verificationFail()
      }
    },
    verRequestError(err){
      this.$store.commit('needLoading',false)
      this.$store.commit('rsErrorStatus',err.response.status)
      this.$router.push("/request-deny")
    },
    verificationFail(){
      this.$refs.verification_fail.style.opacity = 1
      setTimeout(()=>{
        this.$refs.verification_fail.style.opacity = 0
      },1000)
    },
    userVerification(alter_identity){
      if(this.infoComplete){
        switch (alter_identity) {
          case "student":
            this.$store.commit('needLoading',true)
            asyn({
              method: 'get',
              url: '/student/queryAccountStatus',
              params: {
                studentId: this.userId
              }
            }).then(rs=>{
              console.log(rs);
              if (rs.data===100){
                asyn({
                  method: "post",
                  url: "/student/queryAccountInfoMatch",
                  data: {
                    studentId: this.userId,
                    studentEmail: this.email,
                  }
                }).then(rs=>{
                  console.log(rs);
                  this.verRequestSuccess(rs)
                }).catch(err=>{
                  this.verRequestError(err)
                });
              }else {
                this.clearEmail()
                this.verificationFail()
                this.$store.commit('needLoading',false)
              }
            }).catch(err=>{
              this.verRequestError(err)
            })
            break;
          case "teacher":
            this.$store.commit('needLoading',true)
            asyn({
              method: 'get',
              url: '/teacher/queryAccountStatus',
              params: {
                teacherId: this.userId
              }
            }).then(rs=>{
              if(rs.data){
                asyn({
                  method: "post",
                  url: "/teacher/queryAccountInfoMatch",
                  data: {
                    teacherId: this.userId,
                    teacherEmail: this.email
                  }
                }).then(rs=>{
                  this.verRequestSuccess(rs)
                }).catch(err=>{
                  this.verRequestError(err)
                });
              }else {
                this.clearEmail()
                this.verificationFail()
                this.$store.commit('needLoading',false)
              }
            }).catch(err=>{
              this.verRequestError(err)
            })
            break;
          case "admin":
            this.$store.commit('needLoading',true)
            asyn({
              method: 'get',
              url: '/administration/queryAccountStatus',
              params: {
                administrationId: this.userId
              }
            }).then(rs=>{
              console.log(rs.data);
              if (rs.data===100){
                asyn({
                  method: "post",
                  url: "/administration/queryAccountInfoMatch",
                  data: {
                    administrationId: this.userId,
                    administrationIdEmail: this.email
                  }
                }).then(rs=>{
                  this.verRequestSuccess(rs)
                }).catch(err=>{
                  this.verRequestError(err)
                });
              }else {
                this.clearEmail()
                this.verificationFail()
                this.$store.commit('needLoading',false)
              }
            }).catch(err=>{
              this.verRequestError(err)
            })
            break;
          default:
            console.log("no identity");
            break;
        }
      }
    },
  },
  updated() {
    if (this.userId.trim()&&this.emailPass){
      this.infoComplete = true
      this.$refs.reset_button.style.backgroundColor = '#27ae60'
    }else {
      this.infoComplete = false
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
    margin: 40px 0px !important;
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
  #alter_identify_choose_warp{
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
  #verification_fail_hint{
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
