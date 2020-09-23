import VueRouter from 'vue-router'
import Vue from 'vue'

const Home = () => import('../components/home/HomePage')
const RequestDeny = () => import('../components/commons/RequestDeny')

const MainContentPage = () => import('../main_content/content_frame/MainContentPage')
const AdministrationPage = () => import('../main_content/administration/AdministrationPage')
const StudentPage = () => import('../main_content/student/StudentPage')
const TeacherPage = () => import('../main_content/teacher/TeacherPage')

const StudentMainPage = () => import('../main_content/student/StudentMainPage')
const StudentInfo = () => import('../main_content/student/StudentFunction/StudentInfo')
const StudentCourse = () => import('../main_content/student/StudentFunction/StudentCourse')
const StudentElective = () => import('../main_content/student/StudentFunction/StudentElective')
const StudentTranscript = () => import('../main_content/student/StudentFunction/StudentTranscript')
const StudentAffairs = () => import('../main_content/student/StudentFunction/StudentAffairs')

const TeacherMainPage = () => import('../main_content/teacher/TeacherMainPage')
const TeacherInfo = () => import('../main_content/teacher/TeacherFunction/TeacherInfo')
const TeacherClass = () => import('../main_content/teacher/TeacherFunction/TeacherClass')
const TeacherCourse = () => import('../main_content/teacher/TeacherFunction/TeacherCourse')
const TeacherStudentAffairs = () => import('../main_content/teacher/TeacherFunction/TeacherStudentAffairs')
const TeacherTranscript = () => import('../main_content/teacher/TeacherFunction/TeacherTranscriptSystem')

const AdminMainPage = () => import('../main_content/administration/AdministrationMainPage')
const AdminStudentInfo = () => import('../main_content/administration/AdministrationFunction/AdministrationStudentInfo')
const AdminTeacherInfo = () => import('../main_content/administration/AdministrationFunction/AdministrationTeacherInfo')
const AdminCourseSystem = () => import('../main_content/administration/AdministrationFunction/AdministrationCourseSystem')
const AdminElectiveSystem = () => import('../main_content/administration/AdministrationFunction/AdministrationElectiveSystem')
const AdminStudentAffairs = () => import('../main_content/administration/AdministrationFunction/AdministrationStudentAffairs')
const AdminStudentTranscript = () => import('../main_content/administration/AdministrationFunction/AdministrationTranscriptSystem')

//解决路由跳转重复
const routerReplace = VueRouter.prototype.replace
VueRouter.prototype.replace = function replace(location) {
  return routerReplace.call(this, location).catch(error=> error)
}

Vue.use(VueRouter)


const routes = [
  {
    path: '',
    component: Home,
    meta:{
      title: '教务系统-请登录',
    }
  },{
    path: '/request-deny',
    component: RequestDeny,
    meta: {
      title: '请求错误'
    }
  },{
    path: '/EducationSystem',
    component: MainContentPage,
    children:[
      // {
      //   path:'',
      //   redirect: '',
      // },
      {
        path:'student-system',
        component: StudentPage,
        meta: {
          title: '学生系统'
        },
        children: [
          {
            path: '/',
            component: StudentMainPage
          },
          {
            path: 'student-info',
            component: StudentInfo,
            meta: {
              title: '学生系统-学生信息'
            }
          },
          {
            path: 'student-course',
            component: StudentCourse,
            meta: {
              title: '学生系统-学生课程'
            }
          },
          {
            path: 'student-elective',
            component: StudentElective,
            meta: {
              title: '学生系统-学生选课'
            }
          },
          {
            path: 'student-transcript',
            component: StudentTranscript,
            meta: {
              title: '学生系统-学生成绩'
            }
          },{
            path: 'student-affairs',
            component: StudentAffairs,
            meta: {
              title: '学生系统-学生事务'
            }
          }
        ]
      },{
        path:'teacher-system',
        component: TeacherPage,
        meta: {
          title: '教师系统'
        },
        children: [
          {
            path: '/',
            component: TeacherMainPage
          },
          {
            path: 'teacher-info',
            component: TeacherInfo,
            meta: {
              title: '教师系统-教师'
            }
          },{
            path: 'teacher-class',
            component: TeacherClass,
            meta: {
              title: '教师系统-班级信息'
            }
          },{
            path: 'teacher-course',
            component: TeacherCourse,
            meta: {
              title: '教师系统-课程安排'
            }
          },{
            path: 'teacher-transcript',
            component: TeacherTranscript,
            meta: {
              title: '教师系统-成绩系统'
            }
          },{
            path: 'teacher-affairs',
            component: TeacherStudentAffairs,
            meta: {
              title: '教师系统-学生事务'
            }
          }
        ]
      },{
        path:'administration-system',
        component: AdministrationPage,
        meta: {
          title: '管理员系统'
        },
        children: [
          {
            path: '/',
            component: AdminMainPage
          },
          {
            path: 'student-system',
            component: AdminStudentInfo,
            meta: {
              title: '管理员系统-学生系统',
            }
          }, {
            path: 'teacher-system',
            component:  AdminTeacherInfo,
            meta: {
              title: '管理员系统-教师系统',
            }
          },{
            path: 'course-system',
            component: AdminCourseSystem,
            meta: {
              title: '管理员系统-课程系统',
            }
          },{
            path: 'elective-system',
            component: AdminElectiveSystem,
            meta: {
              title: '管理员系统-选课系统',
            }
          },{
            path: 'transcript-system',
            component: AdminStudentTranscript,
            meta: {
              title: '管理员系统-成绩系统',
            }
          },{
            path: 'affairs-system',
            component: AdminStudentAffairs,
            meta: {
              title: '管理员系统-事务系统',
            }
          },
        ]
      },
    ]
  }
]


const router = new VueRouter({
  routes,
  mode: 'history'
})

router.beforeEach((to,from,next)=>{
  document.title = to.meta.title
  next()
})

export default router
