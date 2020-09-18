export default {
  _verificationIdentity_(state,loading){
    state._verificationIdentity_ = loading
  },
  _verificationAccount_(state,loading){
   state._verificationAccount_ = loading
  },
  rsErrorStatus(state,loading){
    state._responseStatus_ = loading
  },
  needLoading(state,loading){
    state._needLoading_ = loading
  },

}