<template>
<!--  学生信息组件-->
  <div id="student_info_page">
    <table class="student_info_table" border="1">
      <tr >
        <th>
          学生信息
        </th>
      </tr>
      <tr>
        <td>
          <table border="1">
            <tr>
              <td colspan="">学号:{{studentTestInfo.id}}</td>
              <td>姓名:{{studentTestInfo.name}}</td>
              <td>性别:{{studentTestInfo.sex}}</td>
            </tr>
            <tr>
              <td>生日:{{studentTestInfo.brithday}}</td>
              <td>民族:{{studentTestInfo.nation}}</td>
              <td>籍贯:{{studentTestInfo.nativePlace}}</td>
            </tr>
            <tr>
              <td>入学时间:{{studentTestInfo.joinTime}}</td>
              <td>专业:{{studentTestInfo.major}}</td>
              <td>班级:{{studentTestInfo.class}}</td>
            </tr>
          </table>
        </td>
        <td class="student_info_photos">
          <img :src="studentTestInfo.photos" alt="学生相片">
        </td>
      </tr>
      <tr>
        <td>联系电话:{{studentTestInfo.phone}}</td>
        <td>联系手机:{{studentTestInfo.smartphone}}</td>
      </tr>
      <tr>
        <td>家庭地址:{{studentTestInfo.place}}</td>
      </tr>
      <tr>
        <td>紧急联系人:{{studentTestInfo.ER}}</td>
        <td>紧急联系方式:{{studentTestInfo.ERP}}</td>
      </tr>
      <tr>
        <td>电子邮箱地址:{{studentTestInfo.email}}</td>
      </tr>
      <tr>
        <td>个人信息备注:{{studentTestInfo.remark}}</td>
      </tr>
    </table>
  </div>
</template>

<script>
  import StudentTestImg from '../../assets/img/student_page_img/student_info_test.jpg'

  export default {
    name: "StudentInfo",
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
    }
  }
</script>

<style scoped>
  #student_info_page{
    width: 90%;
    height: auto;
    display: flex;
    justify-content: center;
    align-items: center;
  }
  .student_info_table{
    width: 90%;
    height: auto;
    background-color: #ffffff;
  }
  .student_info_photos{
    width: 5rem;
    height: auto;
  }
  .student_info_photos>img{
    width: 5rem;
    height: auto;
  }
</style>