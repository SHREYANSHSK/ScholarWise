CREATE DATABASE  IF NOT EXISTS `scholarwise_temp` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `scholarwise_temp`;
-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: scholarwise_temp
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
-- Table structure for table `attendance`
--

DROP TABLE IF EXISTS `attendance`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `attendance` (
  `Net_Id` varchar(45) DEFAULT NULL,
  `Semester` varchar(45) DEFAULT NULL,
  `Subject_Code` varchar(20) NOT NULL,
  `Subject_Name` varchar(50) NOT NULL,
  `Faculty_name` varchar(45) DEFAULT NULL,
  `Faculty_Number` bigint DEFAULT NULL,
  `Room_Number` int DEFAULT NULL,
  `Class_Ratio` varchar(45) DEFAULT NULL,
  `Attendence` float NOT NULL,
  `Credits` varchar(45) DEFAULT NULL,
  `Grade` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `attendance`
--

LOCK TABLES `attendance` WRITE;
/*!40000 ALTER TABLE `attendance` DISABLE KEYS */;
INSERT INTO `attendance` VALUES (NULL,NULL,'21BTB102T','Biology',NULL,NULL,1003,NULL,80,NULL,'O'),(NULL,NULL,'21CSC202J','Operating Systems',NULL,NULL,1005,NULL,90,NULL,'-'),(NULL,NULL,'21CSC203P','Advanced Programming Practice',NULL,NULL,1005,NULL,75,NULL,'-'),(NULL,NULL,'21CSS201T','Computer Organization and Architecture',NULL,NULL,1005,NULL,90,NULL,'-'),(NULL,NULL,'21CYB101J','CHEMISTRY',NULL,NULL,1003,NULL,100,NULL,'O'),(NULL,NULL,'21DCS201P','Design Thinking and Methodology',NULL,NULL,1005,NULL,95,NULL,'-'),(NULL,NULL,'21LEH104T','GERMAN',NULL,NULL,1013,NULL,100,NULL,'O'),(NULL,NULL,'21LEM201T','EEE',NULL,NULL,1002,NULL,100,NULL,'B'),(NULL,NULL,'21MAB102T','ADVANCED CALCULUS AND COMPLEX ANALYSIS',NULL,NULL,1003,NULL,75,NULL,'A'),(NULL,NULL,'21MAB201T','Transforms and Boundary Value Problems',NULL,NULL,1005,NULL,50,NULL,'-'),(NULL,NULL,'21PDM102L','Calculus and Algebra',NULL,NULL,1002,NULL,75,NULL,'O');
/*!40000 ALTER TABLE `attendance` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `course`
--

DROP TABLE IF EXISTS `course`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `course` (
  `Net_id` varchar(45) DEFAULT NULL,
  `Subject_Code` varchar(20) NOT NULL,
  `Subject_Name` varchar(50) NOT NULL,
  `Faculty_Name` varchar(50) DEFAULT NULL,
  `Room_Number` int DEFAULT NULL,
  `Credits` int DEFAULT NULL,
  `Grade` varchar(10) DEFAULT NULL,
  `Semester` int NOT NULL,
  `FacultyNumber` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `course`
--

LOCK TABLES `course` WRITE;
/*!40000 ALTER TABLE `course` DISABLE KEYS */;
INSERT INTO `course` VALUES (NULL,'21BTB102T','INTRODUCTION TO COMPUTATIONAL BIOLOGY	','Dr. Arunkumar J',819,2,'A',1,998574224),(NULL,'21CSC101T','OBJECT ORIENTED DESIGN AND PROGRAMMING	','Dr. Ida Seraphim B',604,3,'O',2,982613082),(NULL,'21CSC201J','DATA STRUCTURES AND ALGORITHMS	','Dr. C N Subalalitha',303,4,'O',3,978613082),(NULL,'21CSC202J','OPERATING SYSTEMS	','Dr. Sibi Amaran',303,4,'O',3,978613082),(NULL,'21CSC203P','ADVANCED PROGRAMMING PRACTICE	','Dr. P. Rama',303,4,'O',3,967413082),(NULL,'21CSS101J','PROGRAMMING FOR PROBLEM SOLVING	','Dr. Madhumitha K',819,4,'O',1,978613082),(NULL,'21CSS201T','COMPUTER ORGANIZATION AND ARCHITECTURE	','Dr. R. Jebakumar',303,4,'A+',3,875522434),(NULL,'21CYB101J','CHEMISTRY','Dr. Sundaravadivel E',819,5,'O',1,994015870),(NULL,'21CYM101T','ENVIRONMENTAL SCIENCE	','Dr. Bhuvana M',604,0,'A+',2,978613082),(NULL,'21DCS201P','DESIGN THINKING AND METHODOLOGY	','Dr K B Praveen',303,3,'O',3,978613082),(NULL,'21EES101T','ELECTRICAL AND ELECTRONICS ENGINEERING	','Dr. Senthil Kumar',604,4,'O',2,978613082),(NULL,'21GNH101J','PHILOSOPHY OF ENGINEERING	','Dr. Sathyapriya L',819,2,'A+',1,989242182),(NULL,'21GNM104L','NSO','Dr. Muthukumaran V',819,0,'O',1,872224341),(NULL,'21LEH101T','COMMUNICATIVE ENGLISH	','Dr. Ramya S',604,3,'A+',2,978613082),(NULL,'21LEH104T','GERMAN','Dr. Chitra V',819,3,'A',1,994003600),(NULL,'21LEM101T','CONSTITUTION OF INDIA	','Dr. A. V. Radhamani',604,0,'O',2,978413082),(NULL,'21LEM201T','PROFESSIONAL ETHICS	','Dr. Kanmani G R',303,0,'A',3,872224341),(NULL,'21MAB101T','CALCULUS AND LINEAR ALGEBRA	','Dr. Kalyanasundaram V',819,4,'A+',1,961428082),(NULL,'21MAB102T','ADVANCED CALCULUS AND COMPLEX ANALYSIS	','Dr. Archana K S',604,4,'O',2,872224341),(NULL,'21MAB201T','TRANSFORMS AND BOUNDARY VALUE PROBLEMS	','Dr. Melita Vinoliah',303,4,'O',3,960089282),(NULL,'21MES101L','BASIC CIVIL AND MECHANICAL WORKSHOP	','Dr. Muthu Kumaran A M J',819,2,'O',1,978613082),(NULL,'21MES102L','ENGINEERING GRAPHICS AND DESIGN	','Dr. Kumaran D',604,2,'O',2,872224341),(NULL,'21PDM101L','PROFESSIONAL SKILLS AND PRACTICES	','Dr. Balakumaran G',819,0,'A+',1,989242182),(NULL,'21PDM102L','GENERAL APTITUDE	','Dr. Jayaraj R',604,0,'A+',2,873724349),(NULL,'21PDM201L','VERBAL REASONING	','Dr. Krishnaveni G',303,0,'A+',3,978613082),(NULL,'21PYB102J','SEMICONDUCTOR PHYSICS AND COMPUTATIONAL METHODS	','Dr. Alagiri Swamy A A',604,5,'O',2,941613082);
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
  `SUBJECT_CODE` varchar(45) NOT NULL,
  PRIMARY KEY (`SUBJECT_CODE`)
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
INSERT INTO `login` VALUES ('ac6729','ac6729','Student'),('ar0354','ar0354','student'),('as8819','as8819','Student'),('kb7676','kb7676','Teacher'),('rs9981','rs9981','Teacher'),('sg2982','sg2982','Student'),('sk1903','sk1903','Student');
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `marks`
--

DROP TABLE IF EXISTS `marks`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `marks` (
  `Net_Id` varchar(45) DEFAULT NULL,
  `Subject_Code` varchar(20) NOT NULL,
  `Subject_Name` varchar(50) NOT NULL,
  `Faculty` varchar(100) NOT NULL,
  `Semester` int NOT NULL,
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
INSERT INTO `marks` VALUES (NULL,'21BTB102T','Biology','Dr. Akshat Saini (9872196731)',2,4,0,3,6,0,3,15,0,4),(NULL,'21CSC202J','Operating Systems','Dr.A.Saranya (9872536731)',3,1,10,10,9,2,6,1,2,10),(NULL,'21CSC203P','Advanced Programming Practice','Dr. Arunarani AR (9872347831)',3,13,0,7,3,0,4,11,0,4),(NULL,'21CSS201T','Computer Organization and Architecture','Dr.Vijayalakshmi K (9872346451)',3,14,0,4,5,0,6,8,0,2),(NULL,'21CYB101J','CHEMISTRY','Dr. Ashish Rastogi (9861346731)',2,7,9,10,6,9,8,11,9,3),(NULL,'21GNM102L','English','Dr. Aryan Gupta (9872776731)',1,3,0,7,1,0,8,3,0,4),(NULL,'21LEH104T','GERMAN','Dr. Praveen Acharya (9872322731)',2,9,0,8,10,0,10,7,0,8),(NULL,'21MAB102T','ADVANCED CALCULUS AND COMPLEX ANALYSIS','Dr. Rahul Iyenger (9872346151)',2,6,0,5,1,0,10,8,0,4),(NULL,'21MAB201T','Transforms and Boundary Value Problems','Dr. H. Merlyn Margaret (9872346731)',3,8,0,7,5,0,1,5,0,8),(NULL,'21PDM102L','Calculus and Algebra','Dr. Abhishek Singh (9879846731)',1,14,0,8,4,0,8,9,0,3);
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
  PRIMARY KEY (`REG_ID`),
  UNIQUE KEY `Net_id_UNIQUE` (`Net_id`),
  UNIQUE KEY `REG_ID_UNIQUE` (`REG_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `studentdb`
--

LOCK TABLES `studentdb` WRITE;
/*!40000 ALTER TABLE `studentdb` DISABLE KEYS */;
INSERT INTO `studentdb` VALUES ('Aryavart Chandel','RA2211003010374','CTECH','CSE CORE',3,'F1','Dr Sathyapriya l',983279239,'sl1203@srmist.edu.in','2003-11-09','LUCKNOW','UP',780060055,'aryavartchandel2@gmail.com','ac6729','student','ac6729'),('Shreyansh khandelwal','RA2211003010387','ctech','CSE CORE',3,'F1','Dr Sathyapriya l',983279239,'sl1203@srmist.edu.in','2004-06-09','jaipur','rajasthan',982953035,'khandelwal.happy.hk@gmail.com','sk1903','student','sk1903'),('Abhishek Soni','RA2211003011185','CTECH','CSE',3,'B2','DR. NITHYASHRI J',999999999,'nj2234@srmist.edu.in','2017-06-04','JAIPUR','RAJASTHAN',894983467,'abhisoni1764@gmail.com','as8819','Student','as8819'),('shantanu gahtori','RA2211033010112','cintel','cse swe',3,'aa-2','DR. ar arunirani',984023182,'arunaraa@srmist.edu.in','2003-09-09','chandigarh','chandigarh',964648254,'shantanugahtori4@gmail.com','sg2982','student','sg2982');
/*!40000 ALTER TABLE `studentdb` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teacherabout`
--

DROP TABLE IF EXISTS `teacherabout`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `teacherabout` (
  `name` varchar(45) NOT NULL,
  `net_id` varchar(45) NOT NULL,
  `qualification1` varchar(200) NOT NULL,
  `subq1` varchar(200) DEFAULT NULL,
  `year1` int DEFAULT NULL,
  `qualification2` varchar(200) DEFAULT NULL,
  `subq2` varchar(200) DEFAULT NULL,
  `year2` int DEFAULT NULL,
  `qualification3` varchar(200) DEFAULT NULL,
  `subq3` varchar(200) DEFAULT NULL,
  `year3` int DEFAULT NULL,
  `campus` varchar(45) NOT NULL,
  `experience` varchar(100) NOT NULL,
  `research` varchar(200) DEFAULT NULL,
  `member` varchar(100) DEFAULT NULL,
  `course1` varchar(200) NOT NULL,
  `course2` varchar(200) DEFAULT NULL,
  `course3` varchar(200) DEFAULT NULL,
  `course4` varchar(200) DEFAULT NULL,
  `course5` varchar(200) DEFAULT NULL,
  `course6` varchar(200) DEFAULT NULL,
  `course7` varchar(200) DEFAULT NULL,
  `course8` varchar(200) DEFAULT NULL,
  `course9` varchar(200) DEFAULT NULL,
  `course10` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`net_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teacherabout`
--

LOCK TABLES `teacherabout` WRITE;
/*!40000 ALTER TABLE `teacherabout` DISABLE KEYS */;
INSERT INTO `teacherabout` VALUES ('Dr. Kanisha B','kb7676','Anna University','Wireless Network',2022,'Pondicherry University','Network and Internet Engineering',2012,'Pondicherry University','Computer Science and Engineering',2010,'Computing Technologies','11.2 years','Wireless Network','Assistant Professor','Computer Networks','Soft Computing','Artificial Intelligence','Cryptography Techniques','Java Programming',NULL,NULL,NULL,NULL,NULL),('Dr. T. Karthick','kt2345','SRM Institute of Science and Technology','Performance Evaluation of Induction motor using Sliding Mode, Fuzzy and Artificial Neural Network controllers',2020,'Bharath Engg College','	Instrumentation and control Engg',2005,'	Thiagarajar College of Engineering','	Electrical and Electronics Engineering',1999,'Electrical and Electronics Engineering','21.8 Years','Power Electronics and Drives: Drives Applications, Fuzzy Logic and Neural Network, DSP, FPGA, Modeling of Electrical Machines, Soft computing','Assistant Professor','Analysis of converter','Modeling of Electrical Machines','Fuzzy & neural network','Power quality management','Special Electrical Machines',NULL,NULL,NULL,NULL,NULL),('Dr. Nithyashri J','nj4321','University of Madras','Inorganic Chemistry',2014,'University of Madras','Inorganic Chemistry',2009,'University of Madras','	Chemistry',2006,'Chemistry','8.3 years','Nanomaterials, Biomass-derived Nano compounds','Assistant Professor','B.Sc – Inorganic Chemistry','B.Tech – Chemistry','B.Tech – Principles of Environmental Science','M.Sc – Qualitative analysis','B.Sc – Fuel Chemistry',NULL,NULL,NULL,NULL,NULL),('Dr. Ramamoorthy S','rs9981','SSN College Of Engineering, Anna University','Information and Communication Engineering',2021,'Aarupadai Veedu Institute Of Technology','Computer Science and Engineering',2014,'Anand Institute Of higher Technology','Computer Science and Engineering',2010,'Computing Technologies','2 years','Wireless Sensor Networks, Machine Learning','Assistant Professor','Foundation of Data Science','Computer Networks','Data Structures',NULL,NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `teacherabout` ENABLE KEYS */;
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
  `net_id` varchar(45) NOT NULL,
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
  PRIMARY KEY (`net_id`),
  UNIQUE KEY `net_id_UNIQUE` (`net_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `timetable`
--

LOCK TABLES `timetable` WRITE;
/*!40000 ALTER TABLE `timetable` DISABLE KEYS */;
INSERT INTO `timetable` VALUES ('as8819','daa',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('kb7676','dbms','daa','maths','daa','AI','','','','','','','','','','','','','','','','','','','','','','','','','','','','','','','','','','','','','','','','','','','','',''),('rs9981','daa',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('sk1903','daa','maths',NULL,'app','','maths','','dsa lab','','','','maths','maths','dbms','',NULL,NULL,'','','',NULL,'','daa','maths',NULL,'','','','','','','',NULL,'daa',NULL,NULL,'','app','','','','','os','coa','','','','','','');
/*!40000 ALTER TABLE `timetable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'scholarwise_temp'
--

--
-- Dumping routines for database 'scholarwise_temp'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-03-16 19:24:58
