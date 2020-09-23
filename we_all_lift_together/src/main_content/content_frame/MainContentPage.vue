<template>
  <div id="main_content_container">
    <video src="../../assets/img/background-video/background-video.mp4" autoplay="" muted="" loop=""
           id="content_background_video" poster="../../assets/img/home_img/home_background.jpg"></video>
    <div id="user_tab_bar">
      <p class="a_blat_word">
        {{blatWord[randomMun]}}
      </p>
      <div class="user_info_pane">
        <div class="user_info_">
          <span class="user_name_">姓名:&nbsp;&nbsp; {{$store.state._UserName_}}</span>
          <span class="user_id_">账号:&nbsp;&nbsp; {{$store.state._UserId_}}</span>
        </div>
        <div class="logout_img_" @click="userLogout">
          <img src="../../assets/img/main_content/logout.svg" alt="">
        </div>
        <div class="user_avatar_">
          <img src="../../assets/img/student_page_img/test_touxiang.jpg" alt="">
        </div>
      </div>
    </div>
    <div id="main_content_page">
      <keep-alive>
        <router-view></router-view>
      </keep-alive>
    </div>
  </div>
</template>

<script>


  export default {
    name: "MainContentPage",
    data(){
      return{
        blatWord: [
          "真正的大师永远都怀着一颗学徒的心",
          "集中起来的意志可以击穿顽石",
          "树叶的一生只是为了归根吗！",
          "一点寒芒先到，随后枪出入龙"],
        randomMun: 1
      }
    },
    methods:{
      userLogout(){
        this.$store.commit('needLoading',true)
        setTimeout(()=>{
          this.$router.replace('/')
          this.$store.commit('_dataDestroy_')
        },750)
      }
    },
    mounted(){
      this.randomMun = Math.round(Math.random()*3);
      console.log(this.randomMun);
    },
    // created(){
    //   if(this.$store._loginState_){
    //     console.log("hello world");
    //   }else {
    //     this.$router.replace('/')
    //   }
    // }
  }
</script>

<style scoped>
  #main_content_container{
    width: 100%;
    height: 100%;
    min-height: 700px;
    /*display: flex;*/
    /*flex-direction: column;*/
    /*justify-content: center;*/
    /*background-image: url("../../assets/img/student_page_img/test_background.jpg");*/
    /*background-position: center center;*/
    /*background-size: auto 150%;*/
    user-select: none;
  }
  #user_tab_bar{
    width: 100%;
    height: 15%;
    background-color: rgba(22,22,22,.5);
    box-shadow: -1px -1px 3px rgba(122,122,122,.8);
    position: relative;
  }
  #main_content_page{
    width: 100%;
    height: 85%;
    /*display: flex;*/
    /*flex-direction: column;*/
    /*justify-content: center;*/
    /*align-items: center;*/
    overflow-y: scroll;
    overflow-x: hidden;
  }

  #main_content_container>div::-webkit-scrollbar {
    width: 8px;
    height: 1px;
  }
  /*滚动条滑块*/
  #main_content_container>div::-webkit-scrollbar-thumb {
    border-radius: 8px;
    -webkit-box-shadow: inset 0 0 5px rgba(0,0,0,0.2);
    background-color: rgba(22,22,22,.4);
  }
  /*滚动条轨道*/
  #main_content_container>div::-webkit-scrollbar-track {
    -webkit-box-shadow: inset 0 0 1px rgba(0,0,0,0);
    border-radius: 8px;
    background-color: rgba(122,122,122,.5);
  }

  .a_blat_word{
    font-size: 2rem;
    color: seashell;
    user-select: none;
    position: absolute;
    left: 5%;
    top: 8%;
  }
  .user_info_pane{
    width: 19rem;
    height: 100%;
    position: absolute;
    right: 5%;
    top: 0;
    display: flex;
    justify-content: center;
    align-items: center;
    cursor: pointer;
  }
  .logout_img_{
    width: 30px;
    height: 30px;
    margin-right: 20px;
    display: flex;
    justify-content: center;
    align-items: center;
  }
  .logout_img_>img{
    width: 25px;
    height: auto;
    transition: .5s ease;
  }
  .logout_img_>img:hover{
    transform: scale(1.05,1.05);
  }
  .user_info_{
    width: 10rem;
    height: auto;
  }
  .user_name_{
    display: block;
    font-size: 1.3rem;
    color: seashell;
    margin: 10px 0;
  }
  .user_id_{
    display: block;
    font-size: 1.3rem;
    color: seashell;
    margin: 12px 0;
  }
  .user_avatar_{
    width: 3.8rem;
    height: 3.8rem;
    overflow: hidden;
    border-radius: 50%;
    display: flex;
    justify-content: center;
    align-items: center;
    margin: 6px;
  }
  .user_avatar_>img{
    width: 100%;
    height: auto;
  }
  #content_background_video{
     width: 100%;
     height: 100%;
     object-fit: cover;
     position: absolute;
     z-index: -1;
   }
  @media screen and (max-width: 700px){
    .a_blat_word{
      display: none;
    }
    .user_info_pane{
     right: 7%;
    }
  }
  @media screen and (min-width: 700px) and (max-width: 815px){
    .a_blat_word{
      font-size: 1.2rem;
    }
  }
  @media screen and (min-width: 815px) and (max-width: 950px){
    .a_blat_word{
      font-size: 1.5rem;
    }
  }
</style>