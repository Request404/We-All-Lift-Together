<template>
  <div id="admin_course_system_warp">
    <div @click="returnSystemHome">
      <return-system-home />
    </div>
    <div id="admin_course_system_container">
      <Row type="flex" class="c1" align="middle" justify="center" >
        <Col span="12" >
          <Input style="width: 90%" search enter-button="查询" placeholder="Enter something..." />
        </Col>
        <Col  align="middle" span="2"><Button size="large" @click="Draw=true" type="success">插入信息</Button></Col>
      </Row>
      <divider class="font">主修课程列表</divider>
      <Drawer
              title="添加课程信息"
              v-model="Draw"
              width="720"
              :mask-closable="false"
              :styles="styles"
      >
        <Form :model="formData">
          <Row :gutter="32">
            <Col span="10">
              <FormItem label="课程名" label-position="top">
                <Input v-model="formData.courseName" placeholder="please enter user name" />
              </FormItem>
            </Col>
            <Col span="10">
              <FormItem label="所属班级" label-position="top">
                <Input v-model="formData.className" placeholder="please enter major"/>
              </FormItem>
            </Col>
          </Row>
          <Row :gutter="32">
            <Col span="10">
              <FormItem label="授课教师id" label-position="top">
                <Input v-model="formData.teacherId" placeholder="please enter email"/>
              </FormItem>
            </Col>
            <Col span="10">
              <FormItem label="授课教师名" label-position="top">
                <Input v-model="formData.teacherName" placeholder="please enter classname"/>
              </FormItem>
            </Col>
          </Row>
          <Row :gutter="32">
            <Col span="10">
              <FormItem label="开始周" label-position="top">
                <Input v-model="formData.startTime" placeholder="please enter startTime"/>
              </FormItem>
            </Col>
            <Col span="10">
              <FormItem label="结束周" label-position="top">
                <Input v-model="formData.endTime" placeholder="please enter endTime"/>
              </FormItem>
            </Col>
          </Row>
          <Row :gutter="32">
            <Col span="10">
              <FormItem label="每周上课时间" label-position="top">
                <Input v-model="formData.courseDate" placeholder="please enter courseDate"/>
              </FormItem>
            </Col>
            <Col span="10">
              <FormItem label="上课节" label-position="top">
                <Input v-model="formData.courseSessions" placeholder="please enter courseDate"/>
              </FormItem>
            </Col>
          </Row>
          <Row :gutter="32">
            <Col span="10">
              <FormItem label="课程学分" label-position="top">
                <Input v-model="formData.courseCredit" placeholder="please enter Credit"/>
              </FormItem>
            </Col>
          </Row>
        </Form>
        <div class="demo-drawer-footer">
          <Button style="margin-right: 8px" @click="cancel">Cancel</Button>
          <Button type="primary" @click="ok">Submit</Button>
        </div>
      </Drawer>
      <Row type="flex" justify="center" align="middle">
        <Col span="24">
          <Table border :columns="courseColumns" :data="courseData2">
            <template slot-scope="{ row, index }" slot="time">
              {{startAndEnd(index)}}
            </template>
            <template slot-scope="{ row, index }" slot="week_time">
              {{weekTime(index)}}
            </template>
          </Table>
        </Col>
      </Row>
      <Row class="pageRow" type="flex" justify="center" align="middle">
        <Col align="middle" span="5" >
          <Page class="page"  @on-change="changePage" :page-size="pageSize"  :total="this.courseData.length" />
        </Col>
      </Row>
    </div>
  </div>
</template>

<script>
  import ReturnSystemHome from "@/components/commons/ReturnSystemHome";

  export default {
    name: "AdministrationCourseSystem",
    components:{
      ReturnSystemHome
    },
    data(){
      return{
        styles: {
          height: 'calc(100% - 55px)',
          overflow: 'auto',
          paddingBottom: '53px',
          position: 'static'
        },
        courseData2:[],
        Draw:false,
        pageSize:5,
        currentPage:0,
        formData: {
          courseName: '',
          className: '',
          teacherId:'',
          teacherName: '',
          startTime: '',
          endTime: '',
          courseCredit: '',
          courseDate: '',
          courseSessions:'',
        },
        courseColumns:[
          {
            title:'课程ID',
            key:'course_id'
          },
          {
            title:'教师ID',
            key:'course_id'
          },
          {
            title:'教师',
            key:'course_id'
          },
          {
            title:'课程名',
            key:'course_id'
          },
          {
            title:'班级',
            key:'class_name'
          },
          {
            title:'学分',
            key:'course_credit'
          },
          {
            title: '时间',
            slot: 'time',
            width: 150,
            align: 'center'
          },
          {
            title: '每周时间',
            slot: 'week_time',
            width: 150,
            align: 'center'
          },

        ],
        courseData:[
          {
            course_id:1001,
            teacher_id:100102,
            teacher_name:"张国华",
            course_name:'PS数字图像处理',
            start_time:5,
            end_time:11,
            class_name:'18计算机应用技术一班',
            course_credit:6,
            course_date:1,
            course_sessions:1
          },
          {
            course_id:1001,
            teacher_id:100102,
            teacher_name:"张国华",
            course_name:'PS数字图像处理',
            start_time:5,
            end_time:11,
            class_name:'18计算机应用技术一班',
            course_credit:6,
            course_date:1,
            course_sessions:1
          },
          {
            course_id:1001,
            teacher_id:100102,
            teacher_name:"张国华",
            course_name:'PS数字图像处理',
            start_time:5,
            end_time:11,
            class_name:'18计算机应用技术一班',
            course_credit:6,
            course_date:1,
            course_sessions:1
          },
          {
            course_id:1001,
            teacher_id:100102,
            teacher_name:"张国华",
            course_name:'PS数字图像处理',
            start_time:5,
            end_time:11,
            class_name:'18计算机应用技术一班',
            course_credit:6,
            course_date:1,
            course_sessions:1
          },
          {
            course_id:1001,
            teacher_id:100102,
            teacher_name:"张国华",
            course_name:'PS数字图像处理',
            start_time:5,
            end_time:11,
            class_name:'18计算机应用技术一班',
            course_credit:6,
            course_date:1,
            course_sessions:1
          },
          {
            course_id:1001,
            teacher_id:100102,
            teacher_name:"张国华",
            course_name:'PS数字图像处理',
            start_time:5,
            end_time:11,
            class_name:'18计算机应用技术一班',
            course_credit:6,
            course_date:1,
            course_sessions:1
          },
          {
            course_id:1004,
            teacher_id:100102,
            teacher_name:"张国华",
            course_name:'PS数字图像处理',
            start_time:5,
            end_time:11,
            class_name:'18计算机应用技术一班',
            course_credit:6,
            course_date:1,
            course_sessions:1
          },
          {
            course_id:1002,
            teacher_id:100102,
            teacher_name:"张国华",
            course_name:'PS数字图像处理',
            start_time:5,
            end_time:11,
            class_name:'18计算机应用技术一班',
            course_credit:6,
            course_date:1,
            course_sessions:1
          },
          {
            course_id:1002,
            teacher_id:100102,
            teacher_name:"张国华",
            course_name:'PS数字图像处理',
            start_time:5,
            end_time:11,
            class_name:'18计算机应用技术一班',
            course_credit:6,
            course_date:1,
            course_sessions:1
          },
          {
            course_id:1002,
            teacher_id:100102,
            teacher_name:"张国华",
            course_name:'PS数字图像处理',
            start_time:5,
            end_time:11,
            class_name:'18计算机应用技术一班',
            course_credit:6,
            course_date:1,
            course_sessions:1
          }
        ]
      }
    },
    methods: {
      returnSystemHome(){
        this.$store.commit('needLoading',true)
        setTimeout(()=>{
          this.$router.push('/EducationSystem/administration-system')
          this.$store.commit('needLoading',false)
        },750)
      },
      dataShow(){
        if(this.courseData.length<this.pageSize){
          this.courseData2 =this.courseData;
        }
        else{
          this.courseData2=this.courseData.slice(0,this.pageSize)
        }
      },
      startAndEnd(index){
        let start=this.courseData[index].start_time;
        let end=this.courseData[index].end_time;
        let sae='第'+start+'周开始'+'第'+end+'周结束';
        return sae;
      },
      weekTime(index){
        let day=this.courseData[index].course_date;
        let time=this.courseData[index].course_sessions;
        let wd='周'+day+''+'第'+time+'节';
        return wd;
      },
      ok(){
        this.Draw=false;
      },
      cancel(){
        this.Draw=false;
      },
      changePage(index){
        let start =(index-1)*this.pageSize
        let end =index*this.pageSize
        this.courseData2=this.courseData.slice(start,end)
      }
    },
    created() {
      this.dataShow()
    }
  }
</script>

<style scoped>
  #admin_course_system_warp{
    width: 85%;
    height: auto;
  }
  #admin_course_system_container{
    width: 100%;
    height: auto;
    background-color: rgba(22,22,22,.5);
  }
  .font{
    color: rgba(255,255,255,0.5);
    font-size: 22px;
  }
  .c1{
    padding-top: 24px;
  }
  .page{
    margin-top: 20px;
    margin-bottom: 20px;
    color: rgba(255,255,255,0.8);
  }
  /deep/.ivu-input-search {
    background: #19be6b !important;
    color: #fff!important;
    border-color: #19be6b !important;
  }
  /deep/.ivu-table{
    background-color: rgba(255,255,255,0.4) !important;
  }
  /deep/.ivu-table td,/deep/.ivu-table th{
    background-color:rgba(255,255,255,0.4) !important;
  }
  /deep/.ivu-table-row-hover td{
    background-color:rgba(255,255,255,0.6) !important;
  }
  /deep/ .ivu-input{
    background-color: rgba(255,255,255,0.4)!important;
  }
  /deep/.ivu-page-item{
    background-color: rgba(255,255,255,0.4) !important;
  }
  /deep/.ivu-page-next{
    background-color: rgba(255,255,255,0.4) !important;
  }
  /deep/.ivu-page-next,/deep/.ivu-page-prev{background-color:rgba(255,255,255,0.4) !important;}
  /deep/.ivu-page-next:hover,/deep/.ivu-page-prev:hover{border-color:rgba(255,255,255,0.8)!important;}
  /deep/.ivu-page-next:hover a,/deep/.ivu-page-prev:hover a{color:rgba(255,255,255,0.4)!important;}
  /deep/.ivu-page-item:hover a{color:rgba(255,255,255,0.4)!important;}
  /deep/.ivu-page-item:hover{border-color:rgba(255,255,255,0.8)!important;}
  /deep/.ivu-page-item-active{border-color:rgba(255,255,255,0.4)!important;}
  /deep/.ivu-page-item-active a,/deep/.ivu-page-item-active:hover a{color:rgba(255,255,255,0.8)!important;}
</style>
