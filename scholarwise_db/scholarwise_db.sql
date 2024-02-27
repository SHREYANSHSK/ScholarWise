CREATE DATABASE  IF NOT EXISTS `scholarwise_db` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `scholarwise_db`;
-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: scholarwise_db
-- ------------------------------------------------------
-- Server version	8.0.36

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `attendance_student`
--

DROP TABLE IF EXISTS `attendance_student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `attendance_student` (
  `SUBJECT_CODE` varchar(45) NOT NULL,
  `SUBJECT_NAME` varchar(45) NOT NULL,
  `FACULTY_NAME` varchar(45) DEFAULT NULL,
  `ROOM_NO` varchar(45) DEFAULT NULL,
  `CLASS_CONDUCTED` int NOT NULL,
  `CLASS_ATTENDED` int NOT NULL,
  `CREDITS` int DEFAULT NULL,
  `ATTENDANCE` int NOT NULL,
  `GRADE` varchar(45) DEFAULT NULL,
  `SEMESTER` varchar(45) NOT NULL,
  `FACULTY_NO` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`SUBJECT_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `attendance_student`
--

LOCK TABLES `attendance_student` WRITE;
/*!40000 ALTER TABLE `attendance_student` DISABLE KEYS */;
INSERT INTO `attendance_student` VALUES ('21CSC201J','Data Analysis and Algorithms','Dr. Nithyashri J','TP703',5,4,4,80,'O','4th','98789878'),('21CSC204J','Artificial Intelligence','Dr Supriya A','TP704',9,6,3,67,'O','4th','67567654');
/*!40000 ALTER TABLE `attendance_student` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `attendance_teacher`
--

DROP TABLE IF EXISTS `attendance_teacher`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `attendance_teacher` (
  `STUDENT_NAME` varchar(45) NOT NULL,
  `CLASS_CONDUCTED` int NOT NULL,
  `CLASS_ATTENDED` int NOT NULL,
  `PERCENTAGE` int NOT NULL,
  `COURSE_NAME` varchar(45) DEFAULT NULL,
  `SECTION` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `attendance_teacher`
--

LOCK TABLES `attendance_teacher` WRITE;
/*!40000 ALTER TABLE `attendance_teacher` DISABLE KEYS */;
INSERT INTO `attendance_teacher` VALUES ('Aryan Kumawat',6,6,100,'Data Analysis and Algorithms','AA2'),('Shreyansh Khandelwal',7,6,86,'Artificial Intelligence','F1');
/*!40000 ALTER TABLE `attendance_teacher` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `course`
--

DROP TABLE IF EXISTS `course`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `course` (
  `Subject_Code` varchar(20) DEFAULT NULL,
  `Subject_Name` varchar(50) DEFAULT NULL,
  `Faculty_Name` varchar(50) DEFAULT NULL,
  `Room_Number` int DEFAULT NULL,
  `Credits` int DEFAULT NULL,
  `Class_Conducted` int DEFAULT NULL,
  `Class_Attended` int DEFAULT NULL,
  `Attendence` float DEFAULT NULL,
  `Grade` varchar(10) DEFAULT NULL,
  `Semester` int DEFAULT NULL,
  `FacultyNumber` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `course`
--

LOCK TABLES `course` WRITE;
/*!40000 ALTER TABLE `course` DISABLE KEYS */;
INSERT INTO `course` VALUES ('21MAB201T','Transforms and Boundary Value Problems','Dr. H. Merlyn Margaret',1005,4,20,10,50,'-',3,982932542),('21CSS201T','Computer Organization and Architecture','Dr.Vijayalakshmi K',1005,4,20,18,90,'-',3,982932542),('21CSC203P','Advanced Programming Practice','Dr. Arunarani AR',1005,4,20,15,75,'-',3,982932542),('21CSC202J','Operating Systems','Dr.A.Saranya',1005,4,20,18,90,'-',3,982932542),('21DCS201P','Design Thinking and Methodology','Mrs. Panimalar K',1005,4,20,19,95,'-',3,982932542),('21LEH104T','GERMAN','Praveen Acharya',1013,3,20,20,100,'O',2,982932567),('21MAB102T','ADVANCED CALCULUS AND COMPLEX ANALYSIS','Rahul Iyenger',1003,4,20,15,75,'A',2,982932567),('21CYB101J','CHEMISTRY','Ashish Rastogi',1003,5,20,20,100,'O',2,982932567),('21BTB102T','Biology','Akshat Saini',1003,2,20,16,80,'O',2,982932567),('21PDM102L','Philosophy of Engineering','Shantanu Sharma',1003,3,20,18,90,'O',2,982932567),('21GNM102L','Semiconductor Physics','Jai kumar',1002,5,20,20,100,'A',1,982932267),('21PDM102L','Calculus and Algebra','Abhishek Singh',1002,4,20,15,75,'O',1,982932267),('21GNM102L','English','Aryan Gupta',1002,3,20,20,100,'O',1,982932267),('21LEM201T','EEE','Tanmay Shrivastav',1002,2,20,20,100,'B',1,982932267);
/*!40000 ALTER TABLE `course` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `information`
--

DROP TABLE IF EXISTS `information`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `information` (
  `NOTIFICATIONS` varchar(70) DEFAULT NULL,
  `DATES` date DEFAULT NULL,
  `SUBJECT_NAME` varchar(45) NOT NULL,
  `SUBJECT_CODE` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `information`
--

LOCK TABLES `information` WRITE;
/*!40000 ALTER TABLE `information` DISABLE KEYS */;
INSERT INTO `information` VALUES ('NPTEL course needs to be updated in GCR','2024-03-12','DAA','21CSC204J'),('DBMS CLA 2 Exam','2024-02-27','DBMS','21CSC205P'),('MATHS CT2','2024-03-17','MATHS','21MAB204T');
/*!40000 ALTER TABLE `information` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `login` (
  `net_id` varchar(200) NOT NULL,
  `password` varchar(200) DEFAULT NULL,
  `designation` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`net_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` VALUES ('Ak1007@srmist.edu.in','Ak1007','Teacher'),('as8819','as8819','Student'),('kj1130','kj1130','Student'),('kp7078@srmist.edu.in','kp7078','Teacher'),('ng1003@srmist.edu.in','ng1003','Student'),('ps1569@srmist.edu.in','ps1569','Teacher'),('rk2289@srmist.edu.in','rk2289','Teacher'),('sg2982','sg2982','Student'),('sk1903','sk1903','Student'),('sm5001','sm5001','Teacher');
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `marks`
--

DROP TABLE IF EXISTS `marks`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `marks` (
  `Subject_Code` varchar(20) DEFAULT NULL,
  `Subject_Name` varchar(50) DEFAULT NULL,
  `Faculty` varchar(100) DEFAULT NULL,
  `Semester` int DEFAULT NULL,
  `CT_1_THEORY` int DEFAULT NULL,
  `CT_1_P` int DEFAULT NULL,
  `CT_1_I` int DEFAULT NULL,
  `CT_2_THEORY` int DEFAULT NULL,
  `CT_2_P` int DEFAULT NULL,
  `CT_2_I` int DEFAULT NULL,
  `CT_3_THEORY` int DEFAULT NULL,
  `CT_3_P` int DEFAULT NULL,
  `CT_3_I` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `marks`
--

LOCK TABLES `marks` WRITE;
/*!40000 ALTER TABLE `marks` DISABLE KEYS */;
INSERT INTO `marks` VALUES ('21MAB201T','Transforms and Boundary Value Problems','Dr. H. Merlyn Margaret (9872346731)',3,8,0,7,5,0,1,5,0,8),('21CSS201T','Computer Organization and Architecture','Dr.Vijayalakshmi K (9872346451)',3,14,0,4,5,0,6,8,0,2),('21CSC203P','Advanced Programming Practice','Dr. Arunarani AR (9872347831)',3,13,0,7,3,0,4,11,0,4),('21CSC202J','Operating Systems','Dr.A.Saranya (9872536731)',3,1,10,10,9,2,6,1,2,10),('21DCS201P','Design Thinking and Methodology','Mrs. Panimalar K (9872342131)',3,1,0,4,6,0,6,3,0,5),('21LEH104T','GERMAN','Dr. Praveen Acharya (9872322731)',2,9,0,8,10,0,10,7,0,8),('21MAB102T','ADVANCED CALCULUS AND COMPLEX ANALYSIS','Dr. Rahul Iyenger (9872346151)',2,6,0,5,1,0,10,8,0,4),('21CYB101J','CHEMISTRY','Dr. Ashish Rastogi (9861346731)',2,7,9,10,6,9,8,11,9,3),('21BTB102T','Biology','Dr. Akshat Saini (9872196731)',2,4,0,3,6,0,3,15,0,4),('21PDM102L','Philosophy of Engineering','Dr. Shantanu Sharma (9872342731)',2,3,2,5,1,8,5,13,2,3),('21GNM102L','Semiconductor Physics','Dr. Jai kumar (9872346721)',1,11,8,1,10,7,4,15,7,6),('21PDM102L','Calculus and Algebra','Dr. Abhishek Singh (9879846731)',1,14,0,8,4,0,8,9,0,3),('21GNM102L','English','Dr. Aryan Gupta (9872776731)',1,3,0,7,1,0,8,3,0,4),('21LEM201T','EEE','Dr. Tanmay Shrivastav (9872346731)',1,4,6,8,10,4,10,12,10,9);
/*!40000 ALTER TABLE `marks` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `studentdb`
--

DROP TABLE IF EXISTS `studentdb`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `studentdb` (
  `NAME` varchar(50) NOT NULL,
  `REG_ID` varchar(45) NOT NULL,
  `DEPARTMENT` varchar(45) DEFAULT NULL,
  `COURSE` varchar(45) DEFAULT NULL,
  `SEMESTER` int DEFAULT NULL,
  `SECTION` varchar(5) DEFAULT NULL,
  `FACULTY_ADVISOR` varchar(45) DEFAULT NULL,
  `FA_PHNO` int DEFAULT NULL,
  `FA_EMAIL` varchar(45) DEFAULT NULL,
  `DOB` date DEFAULT NULL,
  `CITY` varchar(10) DEFAULT NULL,
  `STATE` varchar(10) DEFAULT NULL,
  `PHNO` int DEFAULT NULL,
  `PERSONAL_MAIL_ID` varchar(45) DEFAULT NULL,
  `Net_id` varchar(20) NOT NULL,
  `Desingnation` varchar(45) DEFAULT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`REG_ID`,`Net_id`),
  UNIQUE KEY `Net_id_UNIQUE` (`Net_id`),
  UNIQUE KEY `REG_ID_UNIQUE` (`REG_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `studentdb`
--

LOCK TABLES `studentdb` WRITE;
/*!40000 ALTER TABLE `studentdb` DISABLE KEYS */;
INSERT INTO `studentdb` VALUES ('Shreyansh khandelwal','RA2211003010387','ctech','CSE CORE',3,'f1','dr sathyapriya l',983279239,'sl1203@srmist.edu.in','2004-06-09','jaipur','rajasthan',982953035,'khandelwal.happy.hk@gmail.com','sk1903','student','sk1903'),('Abhishek Soni','RA2211003011185','CTECH','CSE',3,'B2','DR. NITHYASHRI J',999999999,'nj2234@srmist.edu.in','2017-06-04','JAIPUR','RAJASTHAN',894983467,'abhisoni1764@gmail.com','as8819','Student','as8819'),('shantanu gahtori','RA2211033010112','cintel','cse swe',3,'aa-2','DR. ar arunirani',984023182,'arunaraa@srmist.edu.in','2003-09-09','chandigarh','chandigarh',964648254,'shantanugahtori4@gmail.com','sg2982','student','sg2982');
/*!40000 ALTER TABLE `studentdb` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teacherdb`
--

DROP TABLE IF EXISTS `teacherdb`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `teacherdb` (
  `NET_ID` varchar(45) NOT NULL,
  `FACULTY_ID` varchar(45) NOT NULL,
  `NAME` varchar(45) NOT NULL,
  `EMAIL_ID` varchar(45) DEFAULT NULL,
  `PH_NO` int DEFAULT NULL,
  `DEPT_ID` varchar(45) NOT NULL,
  `DEPARTMENT` varchar(45) DEFAULT NULL,
  `DESIGNATION` varchar(45) DEFAULT NULL,
  `QUALIFICATION` varchar(45) NOT NULL,
  `CITY` varchar(45) DEFAULT NULL,
  `PASSWORD` varchar(45) NOT NULL,
  PRIMARY KEY (`FACULTY_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teacherdb`
--

LOCK TABLES `teacherdb` WRITE;
/*!40000 ALTER TABLE `teacherdb` DISABLE KEYS */;
INSERT INTO `teacherdb` VALUES ('kt2345','FA2211003010376','Dr. T. Karthick','karthict@srmist.edu.in',94444172,'DSMS','Data Science and Business Systems','Assiciate Professor','Ph.D in ICE','Chennai','kt2345'),('kb7676','FA2211003011143','Dr. Kanisha B','kanishab@srmist.edu.in',76543456,'CSC202J','Computing Technologies','Associate Professor','Ph.D in ICE','Chennai','kb7676'),('rs9981','FA2211003011165','Dr. Ramamoorthy S','ramamoos@srmist.edu.in',98786756,'q','Computing Technologies','Professor','Ph.D in CSE','Chennai','rs9981'),('nj4321','FA2211003011199','Dr. Nithyashri J','nj2358@srmist.edu.in',78967856,'CSC202J','Computing Technologies','Assistant Teacher','Ph D in CSE','Chennai','nj4321');
/*!40000 ALTER TABLE `teacherdb` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `timetable`
--

DROP TABLE IF EXISTS `timetable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `timetable` (
  `net_id` varchar(45) DEFAULT NULL,
  `d1h1` varchar(45) DEFAULT NULL,
  `d1h2` varchar(45) DEFAULT NULL,
  `d1h3` varchar(45) DEFAULT NULL,
  `d1h4` varchar(45) DEFAULT NULL,
  `d1h5` varchar(45) DEFAULT NULL,
  `d1h6` varchar(45) DEFAULT NULL,
  `d1h7` varchar(45) DEFAULT NULL,
  `d1h8` varchar(45) DEFAULT NULL,
  `d1h9` varchar(45) DEFAULT NULL,
  `d1h10` varchar(45) DEFAULT NULL,
  `d2h1` varchar(45) DEFAULT NULL,
  `d2h2` varchar(45) DEFAULT NULL,
  `d2h3` varchar(45) DEFAULT NULL,
  `d2h4` varchar(45) DEFAULT NULL,
  `d2h5` varchar(45) DEFAULT NULL,
  `d2h6` varchar(45) DEFAULT NULL,
  `d2h7` varchar(45) DEFAULT NULL,
  `d2h8` varchar(45) DEFAULT NULL,
  `d2h9` varchar(45) DEFAULT NULL,
  `d2h10` varchar(45) DEFAULT NULL,
  `d3h1` varchar(45) DEFAULT NULL,
  `d3h2` varchar(45) DEFAULT NULL,
  `d3h3` varchar(45) DEFAULT NULL,
  `d3h4` varchar(45) DEFAULT NULL,
  `d3h5` varchar(45) DEFAULT NULL,
  `d3h6` varchar(45) DEFAULT NULL,
  `d3h7` varchar(45) DEFAULT NULL,
  `d3h8` varchar(45) DEFAULT NULL,
  `d3h9` varchar(45) DEFAULT NULL,
  `d3h10` varchar(45) DEFAULT NULL,
  `d4h1` varchar(45) DEFAULT NULL,
  `d4h2` varchar(45) DEFAULT NULL,
  `d4h3` varchar(45) DEFAULT NULL,
  `d4h4` varchar(45) DEFAULT NULL,
  `d4h5` varchar(45) DEFAULT NULL,
  `d4h6` varchar(45) DEFAULT NULL,
  `d4h7` varchar(45) DEFAULT NULL,
  `d4h8` varchar(45) DEFAULT NULL,
  `d4h9` varchar(45) DEFAULT NULL,
  `d4h10` varchar(45) DEFAULT NULL,
  `d5h1` varchar(45) DEFAULT NULL,
  `d5h2` varchar(45) DEFAULT NULL,
  `d5h3` varchar(45) DEFAULT NULL,
  `d5h4` varchar(45) DEFAULT NULL,
  `d5h5` varchar(45) DEFAULT NULL,
  `d5h6` varchar(45) DEFAULT NULL,
  `d5h7` varchar(45) DEFAULT NULL,
  `d5h8` varchar(45) DEFAULT NULL,
  `d5h9` varchar(45) DEFAULT NULL,
  `d5h10` varchar(45) DEFAULT NULL,
  UNIQUE KEY `net_id_UNIQUE` (`net_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `timetable`
--

LOCK TABLES `timetable` WRITE;
/*!40000 ALTER TABLE `timetable` DISABLE KEYS */;
INSERT INTO `timetable` VALUES ('sk1903','daa','maths',NULL,'app','','maths','','dsa lab','','','','maths','',NULL,'','coa',NULL,'','','',NULL,'','','maths',NULL,'','','','','','','',NULL,'',NULL,NULL,'','app','','','','','os','coa','','','','','',''),('sg2982','app','maths','','','','','','','','','','','','','','maths','','','','','','maths','','','','','','','','','','','','','','','','','','','','','','','','','','','','');
/*!40000 ALTER TABLE `timetable` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-02-27 21:17:14
