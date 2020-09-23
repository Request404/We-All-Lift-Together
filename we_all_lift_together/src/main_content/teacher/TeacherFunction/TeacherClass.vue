<template>
  <div id="teacher_class_warp">
    <div @click="returnSystemHome">
      <return-system-home />
    </div>
    <div id="teacher_class_container">
      affairs
    </div>
  </div>
</template>

<script>
  import ReturnSystemHome from "@/components/commons/ReturnSystemHome";

  export default {
    name: "TeacherClass",
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
  #teacher_class_warp{
    width: 85%;
    height: auto;
  }
  #teacher_class_container{
    width: 100%;
    height: 500px;
    background-color: rgba(22,22,22,.5);
  }
</style>