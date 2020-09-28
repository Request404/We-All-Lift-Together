<template>
  <div id="teacher_info_warp">
    <div @click="returnSystemHome">
      <return-system-home />
    </div>
    <div id="teacher_info_container">
      <divider class="title" orientation="left">我的信息</divider>
      <Row type="flex" align="middle" justify="center">
        <Col span="24">
          <table class="responsive">
            <tr>
              <td class="fix">教师编号：</td>
              <td class="content more">{{this.$store.state._teacherRepository_.teacherInfo.teacherId}}</td>
              <td class="fix">姓名：</td>
              <td class="content more">{{this.$store.state._teacherRepository_.teacherInfo.teacherName}}</td>
              <td class="fix">性别：</td>
              <td class="content more">{{this.$store.state._teacherRepository_.teacherInfo.teacherGender}}</td>
              <td style="min-width: 100px;width: 100px;" rowspan="3" align="center"><img class="avatar_img" src="../../../assets/img/student_page_img/test.jpg" alt=""></td>
            </tr>
            <tr>
              <td class="fix">生日：</td>
              <td class="content">{{this.$store.state._teacherRepository_.teacherInfo.teacherBirthday | getNormalTime}}</td>
              <td class="fix">民族：</td>
              <td class="content">{{this.$store.state._teacherRepository_.teacherInfo.teacherRacial}}</td>
              <td class="fix">籍贯：</td>
              <td class="content">{{this.$store.state._teacherRepository_.teacherInfo.teacherNativePlace}}</td>
            </tr>
            <tr>
              <td class="fix">入职时间：</td>
              <td class="content">{{this.$store.state._teacherRepository_.teacherInfo.teacherJoinTime | getNormalTime}}</td>
              <td class="fix">婚姻状况：</td>
              <td class="content">{{this.$store.state._teacherRepository_.teacherInfo.teacherMaritalStatus}}</td>
              <td class="fix">职位：</td>
              <td class="content">{{this.$store.state._teacherRepository_.teacherInfo.teacherPosition}}</td>
            </tr>
            <tr>

              <td class="fix">电话：</td>
              <td class="content" colspan="2">{{this.$store.state._teacherRepository_.teacherInfo.teacherPhone}}</td>
              <td class="fix">手机：</td>
              <td class="fix" colspan="3">{{this.$store.state._teacherRepository_.teacherInfo.teacherCellphone}}</td>
            </tr>
            <tr>
              <td class="fix">学历：</td>
              <td class="content" colspan="2">{{this.$store.state._teacherRepository_.teacherInfo.teacherEducation}}</td>
              <td class="fix">毕业学校：</td>
              <td class="content more" colspan="3">{{this.$store.state._teacherRepository_.teacherInfo.teacherGraduatedPlace}}</td>
            </tr>
            <tr>
              <td class="fix">教师评价：</td>
              <td class="content" colspan="2">{{this.$store.state._teacherRepository_.teacherInfo.teacherRemark}}</td>
              <td class="fix">电子邮箱：</td>
              <td class="content" colspan="3">{{this.$store.state._teacherRepository_.teacherInfo.teacherEamil}}</td>
            </tr>
            <tr>
              <td class="fix">个人描述：</td>
              <td class="content more" colspan="6">{{this.$store.state._teacherRepository_.teacherInfo.teacherRemark}}</td>
            </tr>
          </table>
        </Col>
      </Row>
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
    },
    filters: {
      getNormalTime(datetime){
        return datetime.slice(0,10)
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
    height: auto;
    background-color: rgba(22,22,22,.5);
  }
  *{
    margin: 0;
    padding: 0;
  }

  .responsive {

    width: 100%;
    margin: 0 auto;
    border: 1px solid #ccc;
    border-collapse: collapse;
    font-size: 1.2rem;
    background-color: rgba(255,255,255,0.4);

  }
  .title{
    color: rgba(255,255,255,0.6);
    padding-top: 20px;
    padding-bottom: 10px;
    font-size: 22px;
    margin-left: 10px;
  }
  .fix{
    text-align: center;
    white-space: nowrap;
  }
  .responsive th,
  .responsive td {
    color: rgba(22,22,22,0.9);
    border: 1px solid #ccc;
    padding: 0.5em 1em;
  }
  .more{
    word-wrap: break-word;
    word-break: break-all;
    min-width: 120px;
  }
  .avatar_img{
    width: 100%;
  }
  @media (max-width : 480px) {
    /* 清除其它宽度下所设置的表格样式 */
    .responsive {
      -webkit-box-shadow: none;
      -moz-box-shadow: none;
      box-shadow: none;
      border: none;
    }
    .responsive td {
      text-align: left;
      display: block;
      border: none;
    }
    .content{
      word-wrap: break-word;
      word-break: break-all;
    }
  }
</style>
