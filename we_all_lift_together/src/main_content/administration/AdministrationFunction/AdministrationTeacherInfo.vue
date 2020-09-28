<template>
  <div id="admin_teacher_info_warp">
    <div @click="returnSystemHome">
      <return-system-home />
    </div>
    <div id="admin_teacher_info_container">
      <Row type="flex" class="c1 bg" align="middle" justify="center" >
        <Col span="12">
          <Input  style="width: 90%" search enter-button="查询" placeholder="请输入教师编号" />
        </Col>
        <Col  align="middle" span="2"><Button size="large" @click="JudgmentType" type="success">插入信息</Button></Col>
      </Row>
      <Drawer
              title="添加教师信息"
              v-model="insertTeacher"
              width="720"
              :mask-closable="false"
              :styles="styles"
      >
        <Form :model="teacherFormData">
          <Row :gutter="32">
            <Col span="10">
              <FormItem label="姓名" label-position="top">
                <Input v-model="teacherFormData.name" placeholder="please enter user name" />
              </FormItem>
            </Col>
            <Col span="10">
              <FormItem label="性别" label-position="top">
                <Select v-model="teacherFormData.gender" placeholder="please select a gender">
                  <Option value="男">男</Option>
                  <Option value="女">女</Option>
                </Select>
              </FormItem>
            </Col>
          </Row>
          <Row :gutter="32">
            <Col span="10">
              <FormItem label="邮箱" label-position="top">
                <Input v-model="teacherFormData.email" placeholder="please enter email"/>
              </FormItem>
            </Col>
            <Col span="10">
              <FormItem label="定位" label-position="top">
                <Input v-model="teacherFormData.position" placeholder="please enter position"/>
              </FormItem>
            </Col>
          </Row>
          <Row :gutter="32">
            <Col span="10">
              <FormItem label="学历" label-position="top">
                <Input v-model="teacherFormData.education" placeholder="please enter classname"/>
              </FormItem>
            </Col>
            <Col span="10">
              <FormItem label="入职时间" label-position="top">
                <DatePicker v-model="teacherFormData.joinTime" type="date" placeholder="please select the date" style="display: block" placement="bottom-end"></DatePicker>
              </FormItem>
            </Col>
          </Row>
          <Row :gutter="32">
            <Col span="10">
              <FormItem label="教师民族" label-position="top">
                <Input v-model="teacherFormData.racial" placeholder="please enter racial"/>
              </FormItem>
            </Col>
            <Col span="10">
              <FormItem label="出生日期" label-position="top">
                <DatePicker v-model="teacherFormData.birthday" type="date" placeholder="please select the date" style="display: block" placement="bottom-end"></DatePicker>
              </FormItem>
            </Col>
          </Row>
          <Row :gutter="32">
            <Col span="10">
              <FormItem label="教师电话号码" label-position="top">
                <Input v-model="teacherFormData.phone" placeholder="please enter student phone"/>
              </FormItem>
            </Col>
            <Col span="10">
              <FormItem label="教师手机号码" label-position="top">
                <Input v-model="teacherFormData.cellPhone" placeholder="please enter the cell phone"/>
              </FormItem>
            </Col>
          </Row>
          <Row :gutter="32">
            <Col span="10">
              <FormItem label="教师户籍" label-position="top">
                <Input v-model="teacherFormData.nativePlace" placeholder="please enter a native place"/>
              </FormItem>
            </Col>
            <Col span="10">
              <FormItem label="教师婚姻状态" label-position="top">
                <Select v-model="teacherFormData.maritalStatus" placeholder="please select a maritalStatus">
                  <Option value="已婚">已婚</Option>
                  <Option value="未婚">未婚</Option>
                </Select>
              </FormItem>
            </Col>
          </Row>
          <FormItem label="备注" label-position="top">
            <Input type="textarea" v-model="teacherFormData.remark" :rows="4" placeholder="please enter the description" />
          </FormItem>
        </Form>
        <div class="demo-drawer-footer">
          <Button style="margin-right: 8px" @click="value3 = false">Cancel</Button>
          <Button type="primary" @click="value3 = false">Submit</Button>
        </div>
      </Drawer>
      <Divider>查询结果</Divider>
      <Row type="flex" align="middle"  justify="center">
        <Col  span="24">
          <Table border :columns="teacherColumns" :data="data6">
            <template slot-scope="{ row, index }" slot="action">
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
    name: "AdministrationTeacherInfo",
    components: {
      ReturnSystemHome
    },
    data(){
      return{
        insertTeacher:false,
        styles: {
          height: 'calc(100% - 90px)',
          overflow: 'auto',
          paddingBottom: '53px',
          position: 'static',
        },
        teacherFormData: {
          name: '',
          gender: '',
          joinTime: '',
          racial: '',
          maritalStatus: '',
          remark: '',
          nativePlace: '',
          phone: '',
          cellPhone: '',
          GraduatedPlace: '',
          education: '',
          position:'',
          email: ''
        },
        teacherColumns: [
          {
            title: '教师编号',
            key: 'id'
          },
          {
            title: '姓名',
            key: 'name'
          },
          {
            title: '定位',
            key: 'position'
          },
          {
            title: 'Action',
            slot: 'action',
            width: 250,
            align: 'center'
          }
        ],
        data6: [
          {
            name: 'John Brown',
            id: 100101,
            position: '教师'
          },
          {
            name: 'Jim Green',
            id: 100101,
            position: '教师'
          },
          {
            name: 'Joe Black',
            id: 100101,
            position: '教师'
          },
          {
            name: 'Jon Snow',
            id: 100101,
            position: '教师'
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
      JudgmentType () {
        this.insertTeacher = true
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
  /deep/.ivu-input-search {
    background: #19be6b !important;
    color: #fff!important;
    border-color: #19be6b !important;
  }
  /deep/ .ivu-input{
    background-color: rgba(255,255,255,0.4)!important;
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
