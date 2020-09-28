<template>
  <div id="admin_student_affairs_warp">
    <div @click="returnSystemHome">
      <return-system-home />
    </div>
    <div id="admin_student_affairs_container">
      <Row type="flex" justify="center" align="middle" class="r1">
        <Col span="10" class="border" pull="6">
          <p class="font">消息审核</p>
        </Col>
      </Row>
      <divider/>
      <Row type="flex" justify="center" align="middle">
        <Col span="24" class="border" >
          <Table border :columns="columns" :data="AffairsData">
            <template slot-scope="{ row, index }" slot="content">
              <Button type="primary" @click="modal1 = true">内容</Button>
              <Modal
                      v-model="modal1"
                      title="事务内容"
                      @on-ok="ok"
                      @on-cancel="cancel">
                <p>{{data[index].content}}</p>
              </Modal>
            </template>
          </Table>
        </Col>
      </Row>
      <Row class="pageRow" type="flex" justify="center" align="middle">
        <Col align="middle" span="5" >
          <Page class="page"  @on-change="changePage" :page-size="pageSize"  :total="this.data.length" />
        </Col>
      </Row>
    </div>
  </div>
</template>

<script>
  import ReturnSystemHome from "@/components/commons/ReturnSystemHome";

  export default {
    name: "AdministrationStudentAffairs",
    components: {
      ReturnSystemHome
    },
    data(){
      return{
        pageSize:6,
        currentPage:0,
        AffairsData:[],
        modal1:false,
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
            key: 'status',
            width: 200,
            align: 'center'
          },
          {
            title:'审核人',
            key: 'handler',
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
            status:'未处理',
            handler:'张国华'
          },
          {
            StudentId:'1355402',
            StudentName :'魏文涛',
            title:'傻逼魏文涛',
            Time:'2020-09-19 09:14:43',
            content:'12312321312321312',
            status:'未处理',
            handler:'张国华'
          },
          {
            StudentId:'1355402',
            StudentName :'魏文涛',
            title:'傻逼魏文涛',
            Time:'2020-09-19 09:14:43',
            content:'12312321312321312',
            status:'未处理',
            handler:'张国华'
          },
          {
            StudentId:'1355402',
            StudentName :'魏文涛',
            title:'傻逼魏文涛',
            Time:'2020-09-19 09:14:43',
            content:'12312321312321312',
            status:'未处理',
            handler:'张国华'
          },
          {
            StudentId:'1355402',
            StudentName :'魏文涛',
            title:'傻逼魏文涛',
            Time:'2020-09-19 09:14:43',
            content:'12312321312321312',
            status:'未处理',
            handler:'张国华'
          },
          {
            StudentId:'1355402',
            StudentName :'魏文涛',
            title:'傻逼魏文涛',
            Time:'2020-09-19 09:14:43',
            content:'12312321312321312',
            status:'未处理',
            handler:'张国华'
          },
          {
            StudentId:'1355402',
            StudentName :'魏文涛',
            title:'傻逼魏文涛',
            Time:'2020-09-19 09:14:43',
            content:'12312321312321312',
            status:'未处理',
            handler:'张国华'
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
      DataShow(){
        if(this.data.length<this.pageSize){
          this.AffairsData =this.data;
        }
        else{
          this.AffairsData=this.data.slice(0,this.pageSize)
        }
      },
      changePage(index){
        let start = (index - 1) * this.pageSize
        let end = index * this.pageSize
        this.AffairsData = this.data.slice(start, end)
      },
      ok(){},
      cancel(){}
    },
    created () {
      this.DataShow();

    }
  }
</script>

<style scoped>
  #admin_student_affairs_warp{
    width: 85%;
    height: auto;
  }
  #admin_student_affairs_container{
    width: 100%;
    height: auto;
    background-color: rgba(22,22,22,.5);
  }

  .font{
    color: rgba(255,255,255,0.6);
    font-size: 22px;
    padding-top: 24px;
  }
  .page{
    margin-top: 20px;
    padding-bottom: 20px;
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
