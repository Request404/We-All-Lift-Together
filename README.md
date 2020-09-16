# Create World
Young man , never give up yourself that change the world

### 后面接口对象

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