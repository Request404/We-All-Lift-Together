import Vue from 'vue'
import Vuex from 'vuex'
import getters from './gettters'
import mutations from './mutations'
import actions from './actions'

Vue.use(Vuex)

const  state = {
  _verificationIdentity_: null,
  _verificationAccount_: null,

  _responseStatus_: 400,
  _needLoading_: false,
  _loginState_: false,
  _UserIdentity_: null,
  _UserId_: null,
  _UserName_: null,
  _UserPhoto_: null,
  _studentRepository_: {
    studentInfo: null,
    studentAccount: null,
    studentAffairs: null,
    courseData: null,
    studentElective: null,
    electiveData: null,
    studentTranscript: null,
  },
  _teacherRepository_:{
    teacherInfo: null,
    teacherAccount: null,
    studentAffairs: null,
    courseData: null,
    ElectiveData: null,
    studentElective: null,
    studentTranscript: null
  },
  adminRepository_:{
    adminAccount: null,
    studentInfo: null,
    studentAccount: null,
    teacherInfo: null,
    teacherAccount: null,
    studentAffairs: null,
    courseData: null,
    ElectiveData: null,
    studentElective: null,
    studentTranscript: null
  },
}



const store = new Vuex.Store({
  state,
  getters,
  mutations,
  actions
})

export default store