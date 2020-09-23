import {asyn} from "@/network/asyn";

export default {

  /**
   * *StudentRepository Request
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
 *TeacherRepository Request
 */
  requestTeacherInfo(context){
    asyn({
      method:'get',
      url:'/teacher/queryInfoById',
      params:{
        teacherId: context.state._UserId_
      }
    }).then(rs =>{
      context.commit('teacherInfo',rs.data)
    }).catch(err=>{
      console.log(err)
    })
  },
  requestTeacherStudentAffairs(context){
    asyn({
      method:'get',
      url:'/teacher/queryAffairsByTeacher',
      params:{
        teacherId: context.state._UserId_
      }
    }).then(rs =>{
      context.commit('teacherStudentAffairs',rs.data)
    }).catch(err=>{
      console.log(err)
    })
  },
  requestTeacherCourseData(context){
    asyn({
      method:'get',
      url:'/teacher/queryCourseByTeacherId',
      params:{
        teacherId: context.state._UserId_
      }
    }).then(rs =>{
      context.commit('teacherCourseData',rs.data)
    }).catch(err=>{
      console.log(err)
    })
  },
  requestTeacherElectiveData(context){
    asyn({
      method:'get',
      url:'/teacher/queryElectiveByTeacherId',
      params:{
        teacherId: context.state._UserId_
      }
    }).then(rs =>{
      context.commit('teacherElectiveData',rs.data)
    }).catch(err=>{
      console.log(err)
    })
  },
  requestTeacherTranscript(context){
    asyn({
      method:'get',
      url:'/teacher/queryTranscriptByTeacherId',
      params:{
        teacherId: context.state._UserId_
      }
    }).then(rs =>{
      context.commit('teacherTranscript',rs.data)
    }).catch(err=>{
      console.log(err)
    })
  },
  requestTeacherStudentElective(context){
    for(let elective of context.state._teacherRepository_.electiveData){
      asyn({
        method:'get',
        url:'/elective/queryStudentElectiveByElectiveId',
        params: {
          electiveId: elective.electiveId
        }
      }).then(rs =>{
        console.log(rs.data);
      }).catch(err=>{
        console.log(err)
      })
    }

  },

  /**
   * AdminRepository Request
   * @param context
   */
  requestAdminAllStudentInfo(context){
    asyn({
      method:'get',
      url:'/student/queryAllInfo',
    }).then(rs =>{
      context.commit('adminAllStudentInfo',rs.data)
    }).catch(err=>{
      console.log(err)
    })
  },
  requestAdminAllStudentAccount(context){
    asyn({
      method:'get',
      url:'/student/queryAllAccount',
    }).then(rs =>{
      context.commit('adminAllStudentAccount',rs.data)
    }).catch(err=>{
      console.log(err)
    })
  },
  requestAdminAllTeacherInfo(context){
    asyn({
      method:'get',
      url:'/teacher/queryAllInfo',
    }).then(rs =>{
      context.commit('adminAllTeacherInfo',rs.data)
    }).catch(err=>{
      console.log(err)
    })
  },
  requestAdminAllTeacherAccount(context){
    asyn({
      method:'get',
      url:'/teacher/queryAllAccount',
    }).then(rs =>{
      context.commit('adminAllTeacherAccount',rs.data)
    }).catch(err=>{
      console.log(err)
    })
  },
  requestAdminAllStudentAffairs(context){
    asyn({
      method:'get',
      url:'/studentAffairs/queryAllAffairs',
    }).then(rs =>{
      context.commit('adminAllStudentAffairs',rs.data)
    }).catch(err=>{
      console.log(err)
    })
  },
  requestAdminAllCourseData(context){
    asyn({
      method:'get',
      url:'/course/queryAllCourse',
    }).then(rs =>{
      context.commit('adminAllCourseData',rs.data)
    }).catch(err=>{
      console.log(err)
    })
  },
  requestAdminAllElectiveData(context){
    asyn({
      method:'get',
      url:'/elective/queryAllElective',
    }).then(rs =>{
      context.commit('adminAllElectiveData',rs.data)
    }).catch(err=>{
      console.log(err)
    })
  },
  requestAdminAllStudentTranscript(context){
    asyn({
      method:'get',
      url:'/course/queryAllTranscript',
    }).then(rs =>{
      context.commit('adminAllStudentTranscript',rs.data)
    }).catch(err=>{
      console.log(err)
    })
  },
  requestAdminAllStudentElective(context){
    asyn({
      method:'get',
      url:'/elective/queryAllStudentElective',
    }).then(rs =>{
      context.commit('adminAllStudentElective',rs.data)
    }).catch(err=>{
      console.log(err)
    })
  },
  
}