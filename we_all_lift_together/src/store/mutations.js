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

  studentInfo(state,student){
    state._studentRepository_.studentInfo = student
  },
  studentAffairs(state,affairs){
    state._studentRepository_.studentAffairs = affairs
  },
  studentCourseData(state,courses){
    state._studentRepository_.courseData = courses
  },
  studentElectiveData(state,electives){
    state._studentRepository_.electiveData = electives
  },
  studentTranscript(state,transcripts){
    state._studentRepository_.studentTranscript = transcripts
  },
  studentElective(state,electives){
    state._studentRepository_.studentElective = electives
  },

  teacherInfo(state,teacher){
    state._teacherRepository_.teacherInfo = teacher
  },
  teacherStudentAffairs(state,affairs){
    state._teacherRepository_.studentAffairs = affairs
  },
  teacherCourseData(state,courses){
    state._teacherRepository_.courseData = courses
  },
  teacherElectiveData(state,electives){
    state._teacherRepository_.electiveData = electives
  },
  teacherTranscript(state,transcripts){
    state._teacherRepository_.studentTranscript = transcripts
  },
  teacherStudentElective(state,electives){
    state._teacherRepository_.studentElective = electives
  },

  adminAllStudentInfo(state,students){
    state._adminRepository_.studentInfo = students
  },
  adminAllStudentAccount(state,accounts){
    state._adminRepository_.studentAccount = accounts
  },
  adminAllTeacherInfo(state,teachers){
    state._adminRepository_.teacherInfo = teachers
  },
  adminAllTeacherAccount(state,accounts){
    state._adminRepository_.teacherAccount = accounts
  },
  adminAllStudentAffairs(state,affairs){
    state._adminRepository_.studentAffairs = affairs
  },
  adminAllCourseData(state,courses){
    state._adminRepository_.courseData = courses
  },
  adminAllElectiveData(state,electives){
    state._adminRepository_.electiveData = electives
  },
  adminAllStudentTranscript(state,transcripts){
    state._adminRepository_.studentTranscript = transcripts
  },
  adminAllStudentElective(state,electives){
    state._adminRepository_.studentElective = electives
  },

  _dataDestroy_(state){
    state._verificationIdentity_=null
    state._verificationAccount_=null

    state._responseStatus_=200
    state._needLoading_=false
    state._loginState_=false
    state._UserId_=null
    state._UserName_=null
    state._UserPhoto_=null
    state._studentRepository_ = {
      studentInfo: null,
      studentAccount: null,
      studentAffairs: null,
      courseData: null,
      studentElective: null,
      electiveData: null,
      studentTranscript: null,
    }
    state._teacherRepository_ = {
      teacherInfo: null,
      teacherAccount: null,
      studentAffairs: null,
      courseData: null,
      electiveData: null,
      studentElective: null,
      studentTranscript: null
    }
    state._adminRepository_={
      adminAccount: null,
        studentInfo: null,
        studentAccount: null,
        teacherInfo: null,
        teacherAccount: null,
        studentAffairs: null,
        courseData: null,
        electiveData: null,
        studentElective: null,
        studentTranscript: null
    }
  }
}