<template>
<!--  学生成绩组件-->
  <div id="student_transcript_warp">
    <div @click="returnSystemHome">
      <return-system-home />
    </div>
    <div id="student_transcript_container">
      transcript
    </div>
  </div>
</template>

<script>
  import ReturnSystemHome from "@/components/commons/ReturnSystemHome";

  export default {
    name: "StudentTranscript",
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
  #student_transcript_warp{
    width: 85%;
    height: auto;
  }
  #student_transcript_container{
    width: 100%;
    height: 500px;
    background-color: rgba(22,22,22,.5);
  }
</style>