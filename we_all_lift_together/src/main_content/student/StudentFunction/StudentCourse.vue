<template>
<!--  学生课表组件-->
  <div id="student_course_warp">
    <div @click="returnSystemHome">
      <return-system-home />
    </div>
    <div id="student_course_container">
      course
    </div>
  </div>
</template>

<script>
  import ReturnSystemHome from "@/components/commons/ReturnSystemHome";


  export default {
    name: "StudentClassCourse",
    components:{
      ReturnSystemHome
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
  #student_course_warp{
    width: 85%;
    height: auto;
  }
  #student_course_container{
    width: 100%;
    height: 500px;
    background-color: rgba(22,22,22,.5);
  }
</style>