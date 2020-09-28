<template>
  <!--  学生信息组件-->
  <div id="student_info_warp">
    <div @click="returnSystemHome">
      <return-system-home />
    </div>
    <div id="student_info_container">
      <divider orientation="left" class="font">我的信息</divider>
      <Row type="flex" justify="center" align="middle" class="container">
        <Col span="24">
          <table class="responsive">
            <tr>
              <td class="fix">学号：</td>
              <td class="content">
                {{$store.state._studentRepository_.studentInfo.studentId}}
              </td>
              <td class="fix">姓名：</td>
              <td class="content">
                {{$store.state._studentRepository_.studentInfo.studentName}}
              </td>
              <td class="fix">性别：</td>
              <td class="content">
                {{$store.state._studentRepository_.studentInfo.studentGender}}
              </td>
              <td rowspan="3" align="center">
                <img class="avatar_img" src="../../../assets/img/student_page_img/test.jpg" alt="">
              </td>
            </tr>
            <tr>
              <td class="fix">生日：</td>
              <td class="content">
                {{$store.state._studentRepository_.studentInfo.studentBirthday | getNormalTime}}
              </td>
              <td class="fix">民族：</td>
              <td class="content">
                {{$store.state._studentRepository_.studentInfo.studentRacial}}
              </td>
              <td class="fix">籍贯：</td>
              <td class="content">
                {{$store.state._studentRepository_.studentInfo.studentNativePlace}}
              </td>
            </tr>
            <tr>
              <td class="fix">入学时间：</td>
              <td class="content">
                {{$store.state._studentRepository_.studentInfo.studentJoinTime | getNormalTime}}
              </td>
              <td class="fix">学院：</td>
              <td class="content">
                {{$store.state._studentRepository_.studentInfo.studentMajor}}
              </td>
              <td class="fix">班级：</td>
              <td class="content">
                {{$store.state._studentRepository_.studentInfo.studentClass}}
              </td>
            </tr>
            <tr>
              <td class="fix">电话：</td>
              <td class="content" colspan="3">
                {{$store.state._studentRepository_.studentInfo.studentPhone}}
              </td>
              <td class="fix">手机：</td>
              <td class="content" colspan="2">
                {{$store.state._studentRepository_.studentInfo.studentCellphone}}
              </td>
            </tr>
            <tr>
              <td class="fix">家庭住址：</td>
              <td class="content" colspan="6">
                {{$store.state._studentRepository_.studentInfo.studentAddress}}
              </td>
            </tr>
            <tr>
              <td class="fix">紧急联系人：</td>
              <td class="content" colspan="2">
                {{$store.state._studentRepository_.studentInfo.studentEmergencyContact}}
              </td>
              <td class="fix">紧急联系方式：</td>
              <td class="content" colspan="3">
                {{$store.state._studentRepository_.studentInfo.studentContactPhone}}
              </td>
            </tr>
            <tr>
              <td class="fix">电子邮箱：</td>
              <td class="content" colspan="6">
                {{$store.state._studentRepository_.studentInfo.studentEmail}}
              </td>
            </tr>
            <tr>
              <td class="fix">备注：</td>
              <td class="content more" colspan="6">
                {{$store.state._studentRepository_.studentInfo.studentRemark}}
              </td>
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
    name: "StudentInfo",
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
    },
    filters: {
      getNormalTime(datetime){
        return datetime.slice(0,10)
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
    height: auto;
    background-color: rgba(22,22,22,.5);
  }
  .font{
    color: rgba(255,255,255,0.7);
    font-size: 22px;
    padding-top: 10px;
  }
  .container {
    color: black;
    width: 100%;
  }
  table {
    width: 100%;
    border-collapse: collapse;
    margin: 0 auto;
  }
  td {
    width: 14%;
    border: 1px solid #808080;
    line-height: 50px;
    text-align: center;
  }
  .responsive {
    width: 98%;
    margin: 0 auto;
    border: 1px solid #ccc;
    border-collapse: collapse;
    font-size: 1.2rem;
    font-weight: 1000;
    background-color: rgba(255,255,255,0.5);
  }
  .fix{
    text-align: center;
    white-space: nowrap;
  }
  .responsive th,
  .responsive td {
    border: 1px solid #ccc;
    color: rgba(22,22,22,.95);
    padding: 0.5em 1em;
  }
  .content{
    word-wrap: break-word;
    word-break: break-all;
    text-align: left;
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
    .more{
      word-wrap: break-word;
      word-break: break-all;
    }
  }
</style>
