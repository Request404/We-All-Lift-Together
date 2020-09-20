export default {
  _verificationIdentity_(state,loading){
    state._verificationIdentity_ = loading
  },
  _verificationAccount_(state,loading){
    state._verificationAccount_ = loading
  },
  _loginSuccess_(state,loading){
    state._loginState_ = loading
  },
  rsErrorStatus(state,loading){
    state._responseStatus_ = loading
  },
  needLoading(state,loading){
    state._needLoading_ = loading
  },
  _dataDestroy_(state){
    state._needLoading_=false
    console.log(state);
    // state = {
    //   _verificationIdentity_: null,
    //   _verificationAccount_: null,
    //
    //   _responseStatus_: 200,
    //   _needLoading_: false,
    //   _loginState_: false,
    //   _UserIdentity_: null,
    //   _UserId_: null,
    //   _studentRepository_: {
    //     studentInfo: null,
    //     studentAccount: null,
    //     studentAffairs: null,
    //     courseData: null,
    //     studentElective: null,
    //     electiveData: null,
    //     studentTranscript: null,
    //   },
    //   _teacherRepository_:{
    //     teacherInfo: null,
    //     teacherAccount: null,
    //     studentAffairs: null,
    //     courseData: null,
    //     ElectiveData: null,
    //     studentElective: null,
    //     studentTranscript: null
    //   },
    //   adminRepository_:{
    //     adminAccount: null,
    //     studentInfo: null,
    //     studentAccount: null,
    //     teacherInfo: null,
    //     teacherAccount: null,
    //     studentAffairs: null,
    //     courseData: null,
    //     ElectiveData: null,
    //     studentElective: null,
    //     studentTranscript: null
    //   }
    // }
  }
}