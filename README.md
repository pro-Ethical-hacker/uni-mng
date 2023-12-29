# University Management Project in Java

Project follows the following file structure
- Repository code is in folder: University-Database-Management-System-main/src/universitydatabasemanagementsystem
- Test cases for each file can be found here: University-Database-Management-System-main/test/universitydatabasemanagementsystem

```
.
├── bin
│   └── universitydatabasemanagementsystem
│       ├── AddNewFacultyTest.class
│       ├── AddNewStaffTest.class
│       ├── AddNewStudentTest.class
│       ├── AdminStaffPortalTest.class
│       ├── Connection
│       │   └── DataBaseConnection.class
│       ├── FacultyPortalTest$MockAddNewFaculty.class
│       ├── FacultyPortalTest.class
│       ├── GPACalculatorTest.class
│       ├── Images
│       │   ├── Add New Record Icon.jpg
│       │   ├── Admin icon.jpg
│       │   ├── Administration staff.png
│       │   ├── back icon.png
│       │   ├── Exit.png
│       │   ├── login1.png
│       │   ├── logout.png
│       │   ├── Password icon.png
│       │   ├── Search icon.jpg
│       │   ├── Students icon.png
│       │   ├── Teacher icon.png
│       │   ├── universitylogo2.png
│       │   └── Username icon.png
│       ├── LoginPageTest.class
│       ├── MainPage1Test.class
│       ├── MainPageTest.class
│       ├── StudentPortalTest.class
│       ├── StudentsResultDataBaseTest.class
│       └── WelcomePageTest.class
├── README.md
├── SE 314 - Project Details.pdf
└── University-Database-Management-System-main
    ├── AccessDrivers Jar Files
    │   ├── assertj-core-3.17.2.jar
    │   ├── assertj-swing-3.17.1.jar
    │   ├── byte-buddy-1.10.14.jar
    │   ├── byte-buddy-1.14.10.jar
    │   ├── byte-buddy-agent-1.10.14.jar
    │   ├── byte-buddy-agent-1.14.10.jar
    │   ├── commons-lang3-3.8.1.jar
    │   ├── commons-logging-1.2.jar
    │   ├── fest-util-1.2.5.jar
    │   ├── hamcrest-core-1.3.jar
    │   ├── hsqldb-2.5.0.jar
    │   ├── jackcess-3.0.1.jar
    │   ├── javassist-3.27.0-GA.jar
    │   ├── junit-4.12.jar
    │   ├── mockito-core-5.8.0.jar
    │   ├── objenesis-3.0.1.jar
    │   ├── objenesis-3.3.jar
    │   ├── powermock-core-2.0.9.jar
    │   ├── powermock-module-junit4-common-2.0.9.jar
    │   ├── powermock-module-junit4-rule-2.0.9.jar
    │   ├── powermock-reflect-2.0.9.jar
    │   └── ucanaccess-5.0.0.jar
    ├── build
    │   └── classes
    │       └── universitydatabasemanagementsystem
    │           ├── AddNewFaculty$1.class
    │           ├── AddNewFaculty$2.class
    │           ├── AddNewFaculty$3.class
    │           ├── AddNewFaculty$4.class
    │           ├── AddNewFaculty$5.class
    │           ├── AddNewFaculty$6.class
    │           ├── AddNewFaculty.class
    │           ├── AddNewFaculty.form
    │           ├── AddNewStaff$1.class
    │           ├── AddNewStaff$2.class
    │           ├── AddNewStaff$3.class
    │           ├── AddNewStaff$4.class
    │           ├── AddNewStaff$5.class
    │           ├── AddNewStaff$6.class
    │           ├── AddNewStaff.class
    │           ├── AddNewStaff.form
    │           ├── AddNewStudent$1.class
    │           ├── AddNewStudent$2.class
    │           ├── AddNewStudent$3.class
    │           ├── AddNewStudent$4.class
    │           ├── AddNewStudent$5.class
    │           ├── AddNewStudent$6.class
    │           ├── AddNewStudent.class
    │           ├── AddNewStudent.form
    │           ├── AdminStaffPortal$10.class
    │           ├── AdminStaffPortal$11.class
    │           ├── AdminStaffPortal$12.class
    │           ├── AdminStaffPortal$13.class
    │           ├── AdminStaffPortal$1.class
    │           ├── AdminStaffPortal$2.class
    │           ├── AdminStaffPortal$3.class
    │           ├── AdminStaffPortal$4.class
    │           ├── AdminStaffPortal$5.class
    │           ├── AdminStaffPortal$6.class
    │           ├── AdminStaffPortal$7.class
    │           ├── AdminStaffPortal$8.class
    │           ├── AdminStaffPortal$9.class
    │           ├── AdminStaffPortal.class
    │           ├── AdminStaffPortal.form
    │           ├── Connection
    │           │   └── DataBaseConnection.class
    │           ├── FacultyPortal$10.class
    │           ├── FacultyPortal$11.class
    │           ├── FacultyPortal$12.class
    │           ├── FacultyPortal$13.class
    │           ├── FacultyPortal$1.class
    │           ├── FacultyPortal$2.class
    │           ├── FacultyPortal$3.class
    │           ├── FacultyPortal$4.class
    │           ├── FacultyPortal$5.class
    │           ├── FacultyPortal$6.class
    │           ├── FacultyPortal$7.class
    │           ├── FacultyPortal$8.class
    │           ├── FacultyPortal$9.class
    │           ├── FacultyPortal.class
    │           ├── FacultyPortal.form
    │           ├── GPACalculator$10.class
    │           ├── GPACalculator$11.class
    │           ├── GPACalculator$12.class
    │           ├── GPACalculator$13.class
    │           ├── GPACalculator$14.class
    │           ├── GPACalculator$15.class
    │           ├── GPACalculator$16.class
    │           ├── GPACalculator$1.class
    │           ├── GPACalculator$2.class
    │           ├── GPACalculator$3.class
    │           ├── GPACalculator$4.class
    │           ├── GPACalculator$5.class
    │           ├── GPACalculator$6.class
    │           ├── GPACalculator$7.class
    │           ├── GPACalculator$8.class
    │           ├── GPACalculator$9.class
    │           ├── GPACalculator.class
    │           ├── GPACalculator.form
    │           ├── Images
    │           │   ├── Add New Record Icon.jpg
    │           │   ├── Admin icon.jpg
    │           │   ├── Administration staff.png
    │           │   ├── back icon.png
    │           │   ├── Exit.png
    │           │   ├── login1.png
    │           │   ├── logout.png
    │           │   ├── Password icon.png
    │           │   ├── Search icon.jpg
    │           │   ├── Students icon.png
    │           │   ├── Teacher icon.png
    │           │   ├── universitylogo2.png
    │           │   └── Username icon.png
    │           ├── LoginPage$1.class
    │           ├── LoginPage$2.class
    │           ├── LoginPage$3.class
    │           ├── LoginPage$4.class
    │           ├── LoginPage$5.class
    │           ├── LoginPage$6.class
    │           ├── LoginPage.class
    │           ├── LoginPage.form
    │           ├── MainPage$1.class
    │           ├── MainPage$2.class
    │           ├── MainPage$3.class
    │           ├── MainPage$4.class
    │           ├── MainPage$5.class
    │           ├── MainPage$6.class
    │           ├── MainPage$7.class
    │           ├── MainPage1$1.class
    │           ├── MainPage1$2.class
    │           ├── MainPage1$3.class
    │           ├── MainPage1$4.class
    │           ├── MainPage1$5.class
    │           ├── MainPage1$6.class
    │           ├── MainPage1.class
    │           ├── MainPage1.form
    │           ├── MainPage.class
    │           ├── MainPage.form
    │           ├── StudentPortal$10.class
    │           ├── StudentPortal$11.class
    │           ├── StudentPortal$12.class
    │           ├── StudentPortal$13.class
    │           ├── StudentPortal$14.class
    │           ├── StudentPortal$15.class
    │           ├── StudentPortal$1.class
    │           ├── StudentPortal$2.class
    │           ├── StudentPortal$3.class
    │           ├── StudentPortal$4.class
    │           ├── StudentPortal$5.class
    │           ├── StudentPortal$6.class
    │           ├── StudentPortal$7.class
    │           ├── StudentPortal$8.class
    │           ├── StudentPortal$9.class
    │           ├── StudentPortal.class
    │           ├── StudentPortal.form
    │           ├── StudentsResultDataBase$10.class
    │           ├── StudentsResultDataBase$11.class
    │           ├── StudentsResultDataBase$12.class
    │           ├── StudentsResultDataBase$1.class
    │           ├── StudentsResultDataBase$2.class
    │           ├── StudentsResultDataBase$3.class
    │           ├── StudentsResultDataBase$4.class
    │           ├── StudentsResultDataBase$5.class
    │           ├── StudentsResultDataBase$6.class
    │           ├── StudentsResultDataBase$7.class
    │           ├── StudentsResultDataBase$8.class
    │           ├── StudentsResultDataBase$9.class
    │           ├── StudentsResultDataBase.class
    │           ├── StudentsResultDataBase.form
    │           ├── WelcomePage$1.class
    │           ├── WelcomePage$2.class
    │           ├── WelcomePage$3.class
    │           ├── WelcomePage.class
    │           └── WelcomePage.form
    ├── build.xml
    ├── manifest.mf
    ├── nbproject
    │   ├── build-impl.xml
    │   ├── genfiles.properties
    │   ├── private
    │   │   ├── private.properties
    │   │   └── private.xml
    │   ├── project.properties
    │   └── project.xml
    ├── src
    │   └── universitydatabasemanagementsystem
    │       ├── AddNewFaculty.form
    │       ├── AddNewFaculty.java
    │       ├── AddNewStaff.form
    │       ├── AddNewStaff.java
    │       ├── AddNewStudent.form
    │       ├── AddNewStudent.java
    │       ├── AdminStaffPortal.form
    │       ├── AdminStaffPortal.java
    │       ├── Connection
    │       │   └── DataBaseConnection.java
    │       ├── FacultyPortal.form
    │       ├── FacultyPortal.java
    │       ├── GPACalculator.form
    │       ├── GPACalculator.java
    │       ├── Images
    │       │   ├── Add New Record Icon.jpg
    │       │   ├── Admin icon.jpg
    │       │   ├── Administration staff.png
    │       │   ├── back icon.png
    │       │   ├── Exit.png
    │       │   ├── login1.png
    │       │   ├── logout.png
    │       │   ├── Password icon.png
    │       │   ├── Search icon.jpg
    │       │   ├── Students icon.png
    │       │   ├── Teacher icon.png
    │       │   ├── universitylogo2.png
    │       │   └── Username icon.png
    │       ├── LoginPage.form
    │       ├── LoginPage.java
    │       ├── MainPage1.form
    │       ├── MainPage1.java
    │       ├── MainPage.form
    │       ├── MainPage.java
    │       ├── StudentPortal.form
    │       ├── StudentPortal.java
    │       ├── StudentsResultDataBase.form
    │       ├── StudentsResultDataBase.java
    │       ├── WelcomePage.form
    │       └── WelcomePage.java
    ├── test
    │   └── universitydatabasemanagementsystem
    │       ├── AddNewFacultyTest.java
    │       ├── AddNewStaffTest.java
    │       ├── AddNewStudentTest.java
    │       ├── AdminStaffPortalTest.java
    │       ├── FacultyPortalTest.java
    │       ├── GPACalculatorTest.java
    │       ├── LoginPageTest.java
    │       ├── MainPage1Test.java
    │       ├── MainPageTest.java
    │       ├── StudentPortalTest.java
    │       ├── StudentsResultDataBaseTest.java
    │       └── WelcomePageTest.java
    └── UniversityAccessDatabase.accdb
```