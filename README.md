# Create World
Young man , never give up yourself that change the world

## 找图片，背景图，要超清的；WWT，A级考不过的，别考了
## 插数据，课表多插几条，教师要求10个，管理员3条，学生要2个班级以上，要15条，
## 别偷懒

### 功能模块
#### 学生、教师、管理员，先查询账户状态再进行登录操作
#### 学生、教师、管理员通过账号、邮箱验证身份
#### 学生、教师、管理员修改密码
#### 用户登录后获取相应的数据
#### 用户退出登录后数据释放、清空
#### 管理员：普通用户添加、查询、修改、状态修改；选课CRUD，普通课程CRUD，成绩CRU，事务CR

### 后端接口对象

```java
//AdministrationUser
queryAccountStatus(Integer id)
queryAccountInfoMatch(AdminAccount adminAccount)
userLogin(AdminAccount adminAccount)
alterAccountInfo(AdminAccount adminAccount)
createAccount(AdminAccount adminAccount)
queryAdministrationInfo(Integer adminId)
queryIdIsExist(Integer id)
```

```java
//StudentUser
queryAccountStatus(Integer studentId)
queryAccountInfoMatch(StudentAccount studentAccount)
userLogin(StudentAccount studentAccount)
alterAccountInfo(StudentAccount studentAccount)
createAccount(StudentAccount studentAccount)
queryInfoById(Integer id)
alterInfoById(StudentInfo studentInfo)
insertInfo(StudentInfo studentInfo)
queryStudentByClass(String studentClass)
queryIdIsExist(Integer id)
```

```java
//TeacherUser
queryAccountStatus(Integer teacherId)
queryAccountInfoMatch(TeacherAccount teacherAccount)
userLogin(TeacherAccount teacherAccount)
alterAccountInfo(TeacherAccount teacherAccount)
createAccount(TeacherAccount teacherAccount)
queryInfoById(Integer id)
alterInfoById(TeacherInfo teacherInfo)
insertInfo(TeacherInfo teacherInfo)
queryIdIsExist(Integer id)
```

```JAVA
//StudentAffairs
affairsApplication(StudentAffairs affairs)
callBackAffairs(Integer affairsId)
queryAffairsByStudent(Integer studentId)
queryAffairsByTeacher(Integer teacherId)
alterAffairsInfo(StudentAffairs studentAffairs)
queryAllAffairs()
```

```JAVA
//Course
queryCourseByStudentClass(String studentClass) 
queryCourseByTeacherId(Integer teacherId)
queryAllCourse()
createCourse(CourseData courseData)
updateCourseById(CourseData courseData)
removeCourse(Integer courseId)
queryTranscriptByStudentId(Integer studentId)
queryTranscriptByTeacherId(Integer teacherId)
queryTranscriptByCourseId(Integer courseId)
queryAllTranscript()
updateTranscript(StudentTranscript transcript)
createTranscript(StudentTranscript transcript)
```

```JAVA
//Elective
queryAllElective()
queryElectiveByTeacherId(Integer teacherId)
createElective(ElectiveData electiveData)
updateElectiveData(ElectiveData electiveData)
removeElective(Integer electiveId)
queryAllStudentElective()
queryStudentElectiveByStudentId(Integer studentId)
queryStudentElectiveByElectiveId(Integer electiveId)
updateStudentElective(StudentElective studentElective)
createStudentElective(StudentElective studentElective)
```
