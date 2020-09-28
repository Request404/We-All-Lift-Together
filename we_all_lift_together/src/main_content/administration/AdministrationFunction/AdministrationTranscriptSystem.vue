<template>
  <div id="admin_transcript_system_warp">
    <div @click="returnSystemHome">
      <return-system-home />
    </div>
    <div id="admin_transcript_system_container">
      <Row class="r1" type="flex" justify="center" align="middle">
        <Col span="4">班级&nbsp<Input v-model="value1"  style="width: 70%"/></Col>
        <Col span="4">课程&nbsp<Input v-model="value2"   style="width: 70%"/></Col>
        <Col span="4">教师名&nbsp<Input v-model="value3" style="width: 70%"/></Col>
        <Col span="4">学生学号&nbsp<Input v-model="value4" style="width: 70%"/></Col>
        <Col span="2">
          <Select v-model="type" style="width: 80%" @click="SelectType(type)">
            <Option v-for="(item,index) in typeList" :key="index" :value="item.value" :label="item.label" >
              {{item.label}}
            </Option>
          </Select>
        </Col>
        <Col span="3"><Button type="success">查询</Button></Col>
      </Row>
      <div v-if="type=='主修'">
        <divider class="font">主修成绩</divider>
        <Row type="flex" justify="center" align="middle">
          <Col span="24">
            <Table border :columns="columns" :data="courseData">
              <template slot-scope="{ row, index }" slot="total_score">
                <InputNumber :max="100" :min="1" v-model="data[index].totalScore"></InputNumber>
              </template>
              <template slot-scope="{ row, index }" slot="action">
                <Button type="success" size="small" style="margin-right: 5px" >修改</Button>
              </template>
            </Table>
          </Col>
        </Row>
        <Row class="pageRow" type="flex" justify="center" align="middle">
          <Col align="middle" span="5" >
            <Page class="page" :current.sync="CoursePage"   @on-change="changeCoursePage"  :page-size="pageSize"  :total="this.data.length" />
          </Col>
        </Row>
      </div>
      <div v-else-if="type='选修'">
        <divider class="font">选修成绩</divider>
        <Row type="flex" justify="center" align="middle">
          <Col span="24">
            <Table border :columns="columns" :data="electiveData">
              <template slot-scope="{ row, index }" slot="total_score">
                <InputNumber :max="100" :min="1" v-model="data[index].totalScore"></InputNumber>
              </template>
              <template slot-scope="{ row, index }" slot="action">
                <Button type="success" size="small" style="margin-right: 5px" >提交</Button>
              </template>
            </Table>
          </Col>
        </Row>
        <Row class="pageRow" type="flex" justify="center" align="middle">
          <Col align="middle" span="5" >
            <Page class="page" :current.sync="ElectivePage" :key="ElectivePage"  @on-change="changeElectivePage" :page-size="pageSize"  :total="this.data1.length" />
          </Col>
        </Row>
      </div>
    </div>
  </div>
</template>

<script>
  import ReturnSystemHome from "@/components/commons/ReturnSystemHome";

  export default {
    name: "AdministrationTranscriptSystem",
    components:{
      ReturnSystemHome
    },
    data(){
      return{
        CoursePage:1,
        ElectivePage:1,
        pageSize:5,
        currentPage:0,
        type:'主修',
        typeList:[
          {
            label:'主修',
            value:'主修'
          },
          {
            label:'选修',
            value:'选修'
          }
        ],
        value1:'',
        value2:'',
        value3:'',
        value4:'',
        columns:[
          {
            title:'学生Id',
            key:'StudentId'
          },
          {
            title:'学生名',
            key:'StudentName'
          },
          {
            title:'课程编号',
            key:'electiveID'
          },
          {
            title:'课程名',
            key:'elective'
          },
          {
            title:'总成绩',
            slot: 'total_score',
            width: 200,
            align: 'center'
          },
          {
            title:'修改',
            slot:'action',
            width:200,
            align:'center'
          }
        ],
        changeColumns:[
          {
            title:'学生Id',
            key:'StudentId'
          },
          {
            title:'学生名',
            key:'StudentName'
          },
          {
            title:'课程编号',
            key:'electiveID'
          },
          {
            title:'课程名',
            key:'elective'
          },
          {
            title:'总成绩',
            key:'totalScore'
          },
          {
            title:'提交',
            slot:'action',
            width:200,
            align:'center'
          }
        ],
        data: [
          {
            electiveID:'1355402',
            elective:'视觉设计竞赛',
            StudentId:'SB250',
            StudentName:'wwt',
            totalScore:88
          },
          {
            electiveID:'1355402',
            elective:'视觉设计竞赛',
            StudentId:'SB250',
            StudentName:'wwt',
            totalScore:88
          },
          {
            electiveID:'1355402',
            elective:'视觉设计竞赛',
            StudentId:'SB250',
            StudentName:'wwt',
            totalScore:88
          },
          {
            electiveID:'1355402',
            elective:'视觉设计竞赛',
            StudentId:'SB250',
            StudentName:'wwt',
            totalScore:88
          },
          {
            electiveID:'1355402',
            elective:'视觉设计竞赛',
            StudentId:'SB250',
            StudentName:'wwt',
            totalScore:88
          },
          {
            electiveID:'1355402',
            elective:'视觉设计竞赛',
            StudentId:'SB250',
            StudentName:'wwt',
            totalScore:88
          },
          {
            electiveID:'1355402',
            elective:'视觉设计竞赛',
            StudentId:'SB250',
            StudentName:'wwt',
            totalScore:88
          }
        ],
        data1:[
          {
            electiveID:'1355402',
            elective:'视觉设计竞赛',
            StudentId:'SB250',
            StudentName:'wwt',
            totalScore:59
          },
          {
            electiveID:'1355402',
            elective:'视觉设计竞赛',
            StudentId:'SB250',
            StudentName:'wwt',
            totalScore:59
          },
          {
            electiveID:'1355402',
            elective:'视觉设计竞赛',
            StudentId:'SB250',
            StudentName:'wwt',
            totalScore:59
          },
          {
            electiveID:'1355402',
            elective:'视觉设计竞赛',
            StudentId:'SB250',
            StudentName:'wwt',
            totalScore:59
          },
          {
            electiveID:'1355402',
            elective:'视觉设计竞赛',
            StudentId:'SB250',
            StudentName:'wwt',
            totalScore:59
          },
          {
            electiveID:'1355402',
            elective:'视觉设计竞赛',
            StudentId:'SB250',
            StudentName:'wwt',
            totalScore:59
          }
        ],
        courseData:[],
        electiveData:[]
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
      CourseDataShow(){
        if(this.data.length<this.pageSize){
          this.courseData =this.data;
        }
        else{
          this.courseData=this.data.slice(0,this.pageSize)
        }
      },
      ElectiveDataShow(){
        if(this.data1.length<this.pageSize){
          this.electiveData =this.data1;
        }
        else{
          this.electiveData=this.data1.slice(0,this.pageSize)
        }
      },
      SelectType(value){
        if(value=='主修'){
          console.log("123")
          this.CourseDataShow()
          this.CoursePage=1;
        }
        else{
          this.ElectiveDataShow()
          this.ElectivePage=1;
        }
      },
      changeCoursePage(index){
        let start = (index - 1) * this.pageSize
        let end = index * this.pageSize
        this.courseData = this.data.slice(start, end)
      },
      changeElectivePage(index){
        let start = (index - 1) * this.pageSize
        let end = index * this.pageSize
        this.electiveData = this.data1.slice(start, end)
      }
    },
    created() {
      this.CourseDataShow();
      this.ElectiveDataShow();
    }
  }
</script>

<style scoped>
  #admin_transcript_system_warp{
    width: 85%;
    height: auto;
  }
  #admin_transcript_system_container{
    width: 100%;
    height:auto;
    background-color: rgba(22,22,22,.5);
  }
  .r1{
    padding-top: 24px;
    color: rgba(255,255,255,0.5);
    font-size: 14px;
  }
  .font{
    color: rgba(255,255,255,0.5);
    font-size: 22px;
  }
  .page{
    margin-top: 20px;
    margin-bottom: 20px;
    color: rgba(255,255,255,0.8);
  }
  /deep/.ivu-select-item:hover {
    background: rgba(255,255,255,0.7) !important;
  }
  /deep/.ivu-select-item{
    background: rgba(255,255,255,0.4) !important;
  }
  /deep/.ivu-select-dropdown{
    background-color: rgba(255,255,255,0.4) !important;
  }
  /deep/.ivu-select-item-selected, /deep/.ivu-select-item-selected:hover {
    color: rgba(255,255,255,0.7) !important;
  }
  /deep/.ivu-select-selection{
    background-color: rgba(255,255,255,0.4) !important;
  }
  /deep/.ivu-select-item-focus{
    background-color: rgba(255,255,255,0.4) !important;
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
    padding: 0 !important;
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
