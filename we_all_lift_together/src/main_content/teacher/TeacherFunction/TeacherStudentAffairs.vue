<template>
  <div id="teacher_student_affairs_warp">
    <div @click="returnSystemHome">
      <return-system-home />
    </div>
    <div id="teacher_student_affairs_container">
      <Row type="flex" justify="center" align="middle" class="r1">
        <Col span="24" class="border" align="middle"  >
          <p class="font">消息审核</p>
        </Col>
      </Row>
      <divider/>
      <Row type="flex" justify="center" align="middle">
        <Col span="24" class="border" >
          <Table border :columns="columns" :data="data">
            <template slot-scope="{ row, index }"  slot="content">
              <Button type="primary" @click="modal1 = true">内容</Button>
              <Modal
                      v-model="modal1"
                      title="事务内容"
                      :styles="{top:'30%'}"
                      @on-ok="ok"
                      @on-cancel="cancel">
                <p>{{data[index].content}}</p>
              </Modal>
            </template>
            <template slot-scope="{ row, index }"  slot="status">
              <Select>
                <Option v-for="item in optionContent" :value="item.value" :key="item.value">{{item.label}}</Option>
              </Select>
            </template>
            <template slot-scope="{ row, index }"   slot="submit">
              <Button type="success">提交</Button>
            </template>
          </Table>
        </Col>
      </Row>
    </div>
  </div>
</template>

<script>
  import ReturnSystemHome from "@/components/commons/ReturnSystemHome";

  export default {
    name: "TeacherStudentAffairs",
    data(){
      return{
        modal1:false,
        optionContent:[
          {
            value:'不批准',
            label:'不批准'
          },
          {
            value:'批准',
            label:'批准'
          }
        ],
        columns:[
          {
            title:'学生学号',
            key:'StudentId'
          },
          {
            title:'学生姓名',
            key:'StudentName'
          },
          {
            title:'申请时间',
            key:'Time'
          },
          {
            title:'事务标题',
            key:'title'
          },
          {
            title:'事务内容',
            slot: 'content',
            width: 200,
            align: 'center'
          },
          {
            title:'处理',
            slot: 'status',
            width: 200,
            align: 'center'
          },
          {
            title:'提交',
            slot: 'submit',
            width: 200,
            align: 'center'
          }
        ],
        data:[
          {
            StudentId:'1355402',
            StudentName :'魏文涛',
            title:'傻逼魏文涛',
            Time:'2020-09-19 09:14:43',
            content:'12312321312321312',
            status:'未处理'
          },
          {
            StudentId:'1355402',
            StudentName :'魏文涛',
            title:'傻逼魏文涛',
            Time:'2020-09-19 09:14:43',
            content:'12312321312321312',
            status:'未处理'
          },
          {
            StudentId:'1355402',
            StudentName :'魏文涛',
            title:'傻逼魏文涛',
            Time:'2020-09-19 09:14:43',
            content:'12312321312321312',
            status:'未处理'
          },
          {
            StudentId:'1355402',
            StudentName :'魏文涛',
            title:'傻逼魏文涛',
            Time:'2020-09-19 09:14:43',
            content:'12312321312321312',
            status:'未处理'
          }
        ]
      }
    }
    ,
    components: {
      ReturnSystemHome
    },
    methods:{
      ok(){},
      cancel(){},
      returnSystemHome() {
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
  #teacher_student_affairs_warp{
    width: 85%;
    height: auto;
  }
  #teacher_student_affairs_container{
    width: 100%;
    height: auto;
    background-color: rgba(22,22,22,.5);
  }
  .font{
    margin-top: 16px;
    color: rgba(255,255,255,0.7);
    font-size: 22px;
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
    color: #19be6b !important;
  }
  /deep/.ivu-select-selection{
    background-color: rgba(255,255,255,0.4) !important;
  }
  /deep/.ivu-select-item-focus{
    background-color: rgba(255,255,255,0.4) !important;
  }
  /deep/.ivu-table-wrapper{
    overflow: unset !important;
  }
  /deep/.ivu-modal-mask{
    background-color: rgba(55,55,55,.2) !important;
  }
</style>
