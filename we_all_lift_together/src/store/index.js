import Vue from 'vue'
import Vuex from 'vuex'
import getters from './gettters'
import mutations from './mutations'
import actions from './actions'

Vue.use(Vuex)

const  state = {
  _verificationIdentity_: null,
  _verificationAccount_: null,

  _responseStatus_: 200,
  _needLoading_: false,
  _loginState_: null,
  _UserIdentity_: null,
  _loginUserInfo_: {

  },
  _coursesData_: [

  ]
}



const store = new Vuex.Store({
  state,
  getters,
  mutations,
  actions
})

export default store