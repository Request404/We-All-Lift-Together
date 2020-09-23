<template>
<!--  学生信息组件-->
  <div id="student_info_warp">
    <div @click="returnSystemHome">
      <return-system-home />
    </div>
    <div id="student_info_container"></div>
  </div>
</template>

<script>
  import StudentTestImg from '../../../assets/img/student_page_img/student_info_test.jpg'
  import ReturnSystemHome from "@/components/commons/ReturnSystemHome";

  export default {
    name: "StudentInfo",
    components: {
      ReturnSystemHome
    },
    data(){
      return{
        studentTestInfo:{
          id: 12345678,
          name: "魏文涛",
          sex:"male",
          birthday: "2000-01-01",
          nation:"汉族",
          nativePlace:"梅州不知道那条街",
          joinTime:"2018-09-01",
          major:"计算机应用技术",
          class:"18计应2班",
          photos: StudentTestImg,
          smartphone:123456789565,
          phone:5225525,
          place:"广东省深圳不知道那个街道那条路那一间多少楼",
          ER:"506全体(wwt除外",
          ERP:12345648465468,
          email:"1234567899@qq.com",
          remark:"啦可是到附近啦是肯德基发来肯德基放假啊速度呗你夸奖你收到就发我ie奇偶拉萨看得见覅耳机"

        }
      }
    },
    methods:{
      returnSystemHome(){
        this.$store.commit('needLoading',true)
        setTimeout(()=>{
          this.$router.push('/EducationSystem/student-system')
          this.$store.commit('needLoading',false)
        },750)
      }
    }
  }
</script>

<style scoped>
  #student_info_warp{
    width: 85%;
    height: auto;
  }
  #student_info_container{
    width: 100%;
    height: 500px;
    background-color: rgba(22,22,22,.5);
  }
</style>