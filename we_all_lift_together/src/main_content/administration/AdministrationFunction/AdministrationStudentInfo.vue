<template>
  <div id="admin_student_info_warp">
    <div @click="returnSystemHome">
      <return-system-home />
    </div>
    <div id="admin_student_info_container">
      <Row type="flex" class="c1 bg" align="middle" justify="center" >
        <Col span="12" >
          <Input style="width: 90%"  search enter-button="查询"  placeholder="清输入学生学号" />
        </Col>
        <Col  align="middle" span="2"><Button size="large" @click="JudgmentType" type="success">插入信息</Button></Col>
      </Row>
      <Drawer
              title="添加学生信息"
              v-model="insertStudent"
              width="720"
              :mask-closable="false"
              :styles="styles"
      >
        <Form :model="formData">
          <Row :gutter="32">
            <Col span="10">
              <FormItem label="姓名" label-position="top">
                <Input v-model="formData.name" placeholder="please enter user name" />
              </FormItem>
            </Col>
            <Col span="10">
              <FormItem label="班级类别" label-position="top">
                <Input v-model="formData.major" placeholder="please enter major"/>
              </FormItem>
            </Col>
          </Row>
          <Row :gutter="32">
            <Col span="10">
              <FormItem label="邮箱" label-position="top">
                <Input v-model="formData.email" placeholder="please enter email"/>
              </FormItem>
            </Col>
            <Col span="10">
              <FormItem label="班级" label-position="top">
                <Input v-model="formData.className" placeholder="please enter classname"/>
              </FormItem>
            </Col>
          </Row>
          <Row :gutter="32">
            <Col span="10">
              <FormItem label="性别" label-position="top">
                <Select v-model="formData.gender" placeholder="please select a gender">
                  <Option value="男">男</Option>
                  <Option value="女">女</Option>
                </Select>
              </FormItem>
            </Col>
            <Col span="10">
              <FormItem label="入学时间" label-position="top">
                <DatePicker v-model="formData.joinTime" type="date" placeholder="please select the date" style="display: block" placement="bottom-end"></DatePicker>
              </FormItem>
            </Col>
          </Row>
          <Row :gutter="32">
            <Col span="10">
              <FormItem label="学生民族" label-position="top">
                <Input v-model="formData.racial" placeholder="please enter racial"/>
              </FormItem>
            </Col>
            <Col span="10">
              <FormItem label="生日" label-position="top">
                <DatePicker v-model="formData.birthday" type="date" placeholder="please select the date" style="display: block" placement="bottom-end"></DatePicker>
              </FormItem>
            </Col>
          </Row>
          <Row :gutter="32">
            <Col span="10">
              <FormItem label="学生电话号码" label-position="top">
                <Input v-model="formData.phone" placeholder="please enter student phone"/>
              </FormItem>
            </Col>
            <Col span="10">
              <FormItem label="学生手机号码" label-position="top">
                <Input v-model="formData.cellPhone" placeholder="please enter the cell phone"/>
              </FormItem>
            </Col>
          </Row>
          <Row :gutter="32">
            <Col span="10">
              <FormItem label="紧急联系人" label-position="top">
                <Input v-model="formData.emergencyContact" placeholder="please enter emergencyContact"/>
              </FormItem>
            </Col>
            <Col span="10">
              <FormItem label="联系人电话" label-position="top">
                <Input v-model="formData.contactPhone" placeholder="please enter contactPhone"/>
              </FormItem>
            </Col>
          </Row>
          <Row :gutter="32">
            <Col span="10">
              <FormItem label="学生户籍" label-position="top">
                <Input v-model="formData.nativePlace" placeholder="please enter a native place"/>
              </FormItem>
            </Col>
            <Col span="10">
              <FormItem label="学生家庭住址" label-position="top">
                <Input v-model="formData.address" placeholder="please enter student address"/>
              </FormItem>
            </Col>
          </Row>
          <FormItem label="备注" label-position="top">
            <Input type="textarea" v-model="formData.remark" :rows="4" placeholder="please enter the description" />
          </FormItem>
        </Form>
        <div class="demo-drawer-footer">
          <Button style="margin-right: 8px" @click="value3 = false">Cancel</Button>
          <Button type="primary" @click="value3 = false">Submit</Button>
        </div>
      </Drawer>
      <Divider class="font">查询结果</Divider>
      <Row type="flex" align="middle" justify="center">
        <Col push="0.5" span="24">
          <Table border :columns="studentColumns" :data="data5">
            <template slot-scope="{ row }" slot="name">
              <strong>{{ row.name }}</strong>
            </template>
            <template slot-scope="{ row, index }" slot="action">
              <template slot-scope="{ row }" slot="name">
                <strong>{{ row.name }}</strong>
              </template>
              <Button type="success" size="small" style="margin-right: 5px">View</Button>
              <Button type="error" size="small" >Delete</Button>
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
    name: "AdministrationStudentInfo",
    components:{
      ReturnSystemHome
    },
    data(){
      return{
        insertStudent:false,
        styles: {
          height: 'calc(100% - 80px)',
          overflow: 'auto',
          paddingBottom: '53px',
          position: 'static'
        },
        formData: {
          name: '',
          className: '',
          gender: '',
          joinTime: '',
          racial: '',
          birthday: '',
          remark: '',
          nativePlace:'',
          address:'',
          phone:'',
          cellPhone:'',
          emergencyContact:'',
          contactPhone:'',
          major:'',
          email:''
        },
        studentColumns: [
          {
            title: '学号',
            key: 'id'
          },
          {
            title: '姓名',
            slot: 'name'
          },
          {
            title: '班级',
            key: 'class'
          },
          {
            title: 'Action',
            slot: 'action',
            width: 250,
            align: 'center'
          }
        ],
        data5: [
          {
            name: 'wwt',
            id: 100101,
            class: '18计应二班'
          },
          {
            name: 'SB wwt',
            id: 100101,
            class: '18计应二班'
          },
          {
            name: 'Joe Black',
            id: 100101,
            class: '18计应二班'
          },
          {
            name: 'Jon Snow',
            id: 100101,
            class: '18计应二班'
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
      JudgmentType(){
        this.insertStudent=true
      }
    }
  }
</script>

<style scoped>
  #admin_student_info_warp{
    width: 85%;
    height: auto;
  }
  #admin_student_info_container{
    width: 100%;
    height: auto;
    background-color: rgba(22,22,22,.5);
  }
  .c1{
    padding-top: 20px;
  }
  .font{
    font-size: 22px;
    color: rgba(255,255,255,0.5);
  }
  /deep/ .ivu-input{
    background-color: rgba(255,255,255,0.4)!important;
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
</style>
