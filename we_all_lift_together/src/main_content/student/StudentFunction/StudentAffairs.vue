<template>
<!--  学生事务申请-->
  <div id="student_affairs_warp">
    <div @click="returnSystemHome">
      <return-system-home />
    </div>
    <div id="student_affairs_container">
      affairs
    </div>
  </div>
</template>

<script>
  import ReturnSystemHome from "@/components/commons/ReturnSystemHome";

  export default {
    name: "StudentAffairs",
    components: {
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
  #student_affairs_warp{
    width: 85%;
    height: auto;
  }
  #student_affairs_container{
    width: 100%;
    height: 500px;
    background-color: rgba(22,22,22,.5);
  }
</style>