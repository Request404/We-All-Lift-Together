<template>
  <!--  学生事务申请-->
  <div id="student_affairs_warp">
    <div @click="returnSystemHome">
      <return-system-home />
    </div>
    <div id="student_affairs_container">
      <Row type="flex" justify="center" align="middle">
        <Col align="middle" span="5" push="1" class="border" >
          <p class="font">我的事务信息</p>
        </Col>
        <Col span="5" push="8" class="border">
          <Button @click="applicationApply = true" type="success" style="width: 100px">申请事务</Button>
        </Col>
      </Row>
      <Drawer
              title="申请事务"
              v-model="applicationApply"
              width="50%"
              :mask-closable="false"
              :styles="styles"
      >
        <Form :model="formData">
          <Row :gutter="32">
            <Col span="10">
              <FormItem label="标题" label-position="top">
                <Input v-model="formData.title" placeholder="申请标题"/>
              </FormItem>
            </Col>
            <Col span="10">
              <FormItem label="审核人" label-position="top">
                <Select v-model="handler">
                  <Option v-for="(item,index) in handlerList" :value="item.name" :key="index">{{item.name}}</Option>
                </Select>
              </FormItem>
            </Col>
          </Row>
          <Row :gutter="32">
            <Col span="20">
              <FormItem label="内容" label-position="top">
                <Input  type="textarea" v-model="formData.content" :rows="4" placeholder="申请内容" />
              </FormItem>
            </Col>
          </Row>

        </Form>
        <div class="demo-drawer-footer">
          <Button type="primary" @click="commitStudentAffairs">提交</Button>
          <Button style="margin-left: 10px" @click="applicationApply = false">取消</Button>
        </div>
      </Drawer>
      <Divider />
      <Row type="flex" justify="center" align="middle">
        <Col span="24">
          <Table max-height="500" border :columns="columns3" :data="data1">
            <template slot-scope="{row,index}" slot="applicationTime">
              {{data1[index].applicationTime | getNormalTime}}
            </template>
          </Table>
        </Col>
      </Row>
    </div>
  </div>
</template>

<script>
  import ReturnSystemHome from "@/components/commons/ReturnSystemHome";
  import {asyn} from "../../../network/asyn";

  export default {
    name: "StudentAffairs",
    data(){
      return {
        value5:'',
        styles: {
          height: 'calc(100% - 55px)',
          overflow: 'auto',
          paddingBottom: '53px',
          position: 'static'
        },
        formData: {
          StudentId:'',
          StudentName:'',
          ClassName:'',
          Title:'',
          Handler:'',
          content:''
        },
        modal1:false,
        applicationApply:false,
        columns3: [
          {
            title: '学号',
            key: 'studentId'
          },
          {
            title: '姓名',
            key: 'applicationName'
          },
          {
            title: '申请时间',
            slot: 'applicationTime',
            width:200,
            align:'center'
          },
          {
            title: '申请事务',
            key: 'affairsTitle'
          },
          {
            title: '事务内容',
            key: 'affairsContent'
          },
          {
            title: '审核人',
            key: 'handleTeacher'
          },
          {
            title: '审核结果',
            key: 'applicationStatus'
          }
        ],
        data1: this.$store.state._studentRepository_.studentAffairs,
        handler:'',
        handlerList: []
      }
    },
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
      },
      commitStudentAffairs(){
        this.applicationApply = false
        asyn({
          method: 'post',
          url: '',
          data: {

          }
        })
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
  #student_affairs_warp{
    width: 85%;
    height: auto;
  }
  #student_affairs_container{
    width: 100%;
    height: auto;
    background-color: rgba(22,22,22,.5);
  }
  .font{
    color: rgba(255,255,255,0.5);
    font-size: 22px;
  }
  .border{
    margin-top: 20px;
    padding-left: 10px;
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
</style>
