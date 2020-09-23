<template>
  <div id="teacher_info_warp">
    <div @click="returnSystemHome">
      <return-system-home />
    </div>
    <div id="teacher_info_container">
      affairs
    </div>
  </div>
</template>

<script>
  import ReturnSystemHome from "@/components/commons/ReturnSystemHome";

  export default {
    name: "TeacherInfo",
    components: {
      ReturnSystemHome
    },
    methods:{
      returnSystemHome(){
        this.$store.commit('needLoading',true)
        setTimeout(()=>{
          this.$router.push('/EducationSystem/teacher-system')
          this.$store.commit('needLoading',false)
        },750)
      }
    }
  }
</script>

<style scoped>
  #teacher_info_warp{
    width: 85%;
    height: auto;
  }
  #teacher_info_container{
    width: 100%;
    height: 500px;
    background-color: rgba(22,22,22,.5);
  }
</style>