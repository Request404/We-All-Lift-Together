import VueRouter from 'vue-router'
import Vue from 'vue'

const Home = () => import('../components/home/HomePage')
const RequestDeny = () => import('../components/commons/RequestDeny')
const MainContentPage = () => import('../main_content/content_frame/MainContentPage')
const AdministrationPage = () => import('../main_content/administration/AdministrationPage')
const StudentPage = () => import('../main_content/student/StudentPage')
const TeacherPage = () => import('../main_content/teacher/TeacherPage')

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
      {
        path:'',
        redirect: '/request-deny',
      },
      {
        path:'student-system',
        component: StudentPage,
        meta: {
          title: '学生系统'
        }
      },{
        path:'teacher-system',
        component: TeacherPage,
        meta: {
          title: '教师系统'
        }
      },{
        path:'administration-system',
        component: AdministrationPage,
        meta: {
          title: '管理员系统'
        }
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
