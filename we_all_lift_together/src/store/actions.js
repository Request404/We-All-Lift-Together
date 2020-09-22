import {asyn} from "@/network/asyn";

export default {
  /*
   *StudentRepository Request
  */
  requestStudentInfo(context){
    asyn({
      method: 'get',
      url: '/student/queryInfoById',
      params:{
        studentId: context.state._UserId_
      }
    }).then( rs => {
      context.commit('studentInfo',rs.data)
    }).catch( err => {
      console.log(err);
    })
  },
  requestStudentAffairs(context){
    asyn({
      method: 'get',
      url: '/studentAffairs/queryAffairsByStudent',
      params: {
        studentId: context.state._UserId_
      }
    }).then(rs=>{
      context.commit('studentAffairs',rs.data)
    }).catch(err=>{
      console.log(err);
    })
  },
  requestCourseData(context){
    asyn({
      method: 'get',
      url: '/course/queryCourseByStudentClass',
      params: {
        studentClass: context.state._studentRepository_.studentInfo.studentClass
      }
    }).then(rs=>{
      context.commit('studentCourseData',rs.data)
    }).catch(err=>{
      console.log(err);
    })
  },
  requestElectiveData(context){
    asyn({
      method: 'get',
      url: '/elective/queryAllElective',
    }).then(rs=>{
      context.commit('studentElectiveData',rs.data)
    }).catch(err=>{
      console.log(err);
    })
  },
  requestStudentTranscript(context){
    asyn({
      method: 'get',
      url: '/course/queryTranscriptByStudentId',
      params:{
        studentId: context.state._UserId_
      }
    }).then(rs=>{
      context.commit('studentTranscript',rs.data)
    }).catch(err=>{
      console.log(err);
    })
  },
  requestStudentElective(context){
    asyn({
      method: 'get',
      url: '/elective/queryStudentElectiveByStudentId',
      params: {
        studentId: context.state._UserId_
      }
    }).then(rs=>{
      context.commit('studentElective',rs.data)
    }).catch(err=>{
      console.log(err);
    })
  },


/**
 *
 */
  requestTeacherInfo(){

  },
  requestTeacherStudentAffairs(){

  },
  requestTeacherCourseData(){

  },
  reqeustTeacherElective

}