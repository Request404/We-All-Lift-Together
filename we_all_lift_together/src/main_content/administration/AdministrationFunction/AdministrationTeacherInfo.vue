<template>
  <div id="admin_teacher_info_warp">
    <div @click="returnSystemHome">
      <return-system-home />
    </div>
    <div id="admin_teacher_info_container">
      admin_teacher_info_container
    </div>
  </div>
</template>

<script>
  import ReturnSystemHome from "@/components/commons/ReturnSystemHome";

  export default {
    name: "AdministrationTeacherInfo",
    components: {
      ReturnSystemHome
    },
    methods: {
      returnSystemHome(){
        this.$store.commit('needLoading',true)
        setTimeout(()=>{
          this.$router.push('/EducationSystem/administration-system')
          this.$store.commit('needLoading',false)
        },750)
      }
    }
  }
</script>

<style scoped>
  #admin_teacher_info_warp{
    width: 85%;
    height: auto;
  }
  #admin_teacher_info_container{
    width: 100%;
    height: 500px;
    background-color: rgba(22,22,22,.5);
  }
</style>