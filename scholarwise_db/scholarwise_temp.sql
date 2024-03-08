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
-- Table structure for table `attendancesem1`
--

DROP TABLE IF EXISTS `attendancesem1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `attendancesem1` (
  `Subject_Code` varchar(20) NOT NULL,
  `Subject_Name` varchar(50) NOT NULL,
  `Room_Number` int DEFAULT NULL,
  `Class_Conducted` int DEFAULT NULL,
  `Class_Attended` int DEFAULT NULL,
  `Attendence` float NOT NULL,
  `Grade` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`Subject_Code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `attendancesem1`
--

LOCK TABLES `attendancesem1` WRITE;
/*!40000 ALTER TABLE `attendancesem1` DISABLE KEYS */;
INSERT INTO `attendancesem1` VALUES ('21BTB102T','Biology',1003,20,16,80,'O'),('21CSC202J','Operating Systems',1005,20,18,90,'-'),('21CSC203P','Advanced Programming Practice',1005,20,15,75,'-'),('21CSS201T','Computer Organization and Architecture',1005,20,18,90,'-'),('21CYB101J','CHEMISTRY',1003,20,20,100,'O'),('21DCS201P','Design Thinking and Methodology',1005,20,19,95,'-'),('21LEH104T','GERMAN',1013,20,20,100,'O'),('21LEM201T','EEE',1002,20,20,100,'B'),('21MAB102T','ADVANCED CALCULUS AND COMPLEX ANALYSIS',1003,20,15,75,'A'),('21MAB201T','Transforms and Boundary Value Problems',1005,20,10,50,'-'),('21PDM102L','Calculus and Algebra',1002,20,15,75,'O');
/*!40000 ALTER TABLE `attendancesem1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `attendancesem2`
--

DROP TABLE IF EXISTS `attendancesem2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `attendancesem2` (
  `Subject_Code` varchar(20) NOT NULL,
  `Subject_Name` varchar(50) NOT NULL,
  `Room_Number` int DEFAULT NULL,
  `Class_Conducted` int DEFAULT NULL,
  `Class_Attended` int DEFAULT NULL,
  `Attendence` float NOT NULL,
  `Grade` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`Subject_Code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `attendancesem2`
--

LOCK TABLES `attendancesem2` WRITE;
/*!40000 ALTER TABLE `attendancesem2` DISABLE KEYS */;
INSERT INTO `attendancesem2` VALUES ('21BTB102T','Biology',1003,20,16,80,'O'),('21CSC202J','Operating Systems',1005,20,18,90,'-'),('21CSC203P','Advanced Programming Practice',1005,20,15,75,'-'),('21CSS201T','Computer Organization and Architecture',1005,20,18,90,'-'),('21CYB101J','CHEMISTRY',1003,20,20,100,'O'),('21DCS201P','Design Thinking and Methodology',1005,20,19,95,'-'),('21LEH104T','GERMAN',1013,20,20,100,'O'),('21LEM201T','EEE',1002,20,20,100,'B'),('21MAB102T','ADVANCED CALCULUS AND COMPLEX ANALYSIS',1003,20,15,75,'A'),('21MAB201T','Transforms and Boundary Value Problems',1005,20,10,50,'-'),('21PDM102L','Calculus and Algebra',1002,20,15,75,'O');
/*!40000 ALTER TABLE `attendancesem2` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `attendancesem3`
--

DROP TABLE IF EXISTS `attendancesem3`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `attendancesem3` (
  `Subject_Code` varchar(20) NOT NULL,
  `Subject_Name` varchar(50) NOT NULL,
  `Room_Number` int DEFAULT NULL,
  `Class_Conducted` int DEFAULT NULL,
  `Class_Attended` int DEFAULT NULL,
  `Attendence` float NOT NULL,
  `Grade` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`Subject_Code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `attendancesem3`
--

LOCK TABLES `attendancesem3` WRITE;
/*!40000 ALTER TABLE `attendancesem3` DISABLE KEYS */;
INSERT INTO `attendancesem3` VALUES ('21BTB102T','Biology',1003,20,16,80,'O'),('21CSC202J','Operating Systems',1005,20,18,90,'-'),('21CSC203P','Advanced Programming Practice',1005,20,15,75,'-'),('21CSS201T','Computer Organization and Architecture',1005,20,18,90,'-'),('21CYB101J','CHEMISTRY',1003,20,20,100,'O'),('21DCS201P','Design Thinking and Methodology',1005,20,19,95,'-'),('21LEH104T','GERMAN',1013,20,20,100,'O'),('21LEM201T','EEE',1002,20,20,100,'B'),('21MAB102T','ADVANCED CALCULUS AND COMPLEX ANALYSIS',1003,20,15,75,'A'),('21MAB201T','Transforms and Boundary Value Problems',1005,20,10,50,'-'),('21PDM102L','Calculus and Algebra',1002,20,15,75,'O');
/*!40000 ALTER TABLE `attendancesem3` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `attendancesem4`
--

DROP TABLE IF EXISTS `attendancesem4`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `attendancesem4` (
  `Subject_Code` varchar(20) NOT NULL,
  `Subject_Name` varchar(50) NOT NULL,
  `Room_Number` int DEFAULT NULL,
  `Class_Conducted` int DEFAULT NULL,
  `Class_Attended` int DEFAULT NULL,
  `Attendence` float NOT NULL,
  `Grade` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`Subject_Code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `attendancesem4`
--

LOCK TABLES `attendancesem4` WRITE;
/*!40000 ALTER TABLE `attendancesem4` DISABLE KEYS */;
INSERT INTO `attendancesem4` VALUES ('21BTB102T','Biology',1003,20,16,80,'O'),('21CSC202J','Operating Systems',1005,20,18,90,'-'),('21CSC203P','Advanced Programming Practice',1005,20,15,75,'-'),('21CSS201T','Computer Organization and Architecture',1005,20,18,90,'-'),('21CYB101J','CHEMISTRY',1003,20,20,100,'O'),('21DCS201P','Design Thinking and Methodology',1005,20,19,95,'-'),('21LEH104T','GERMAN',1013,20,20,100,'O'),('21LEM201T','EEE',1002,20,20,100,'B'),('21MAB102T','ADVANCED CALCULUS AND COMPLEX ANALYSIS',1003,20,15,75,'A'),('21MAB201T','Transforms and Boundary Value Problems',1005,20,10,50,'-'),('21PDM102L','Calculus and Algebra',1002,20,15,75,'O');
/*!40000 ALTER TABLE `attendancesem4` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `attendancesem5`
--

DROP TABLE IF EXISTS `attendancesem5`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `attendancesem5` (
  `Subject_Code` varchar(20) NOT NULL,
  `Subject_Name` varchar(50) NOT NULL,
  `Room_Number` int DEFAULT NULL,
  `Class_Conducted` int DEFAULT NULL,
  `Class_Attended` int DEFAULT NULL,
  `Attendence` float NOT NULL,
  `Grade` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`Subject_Code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `attendancesem5`
--

LOCK TABLES `attendancesem5` WRITE;
/*!40000 ALTER TABLE `attendancesem5` DISABLE KEYS */;
INSERT INTO `attendancesem5` VALUES ('21BTB102T','Biology',1003,20,16,80,'O'),('21CSC202J','Operating Systems',1005,20,18,90,'-'),('21CSC203P','Advanced Programming Practice',1005,20,15,75,'-'),('21CSS201T','Computer Organization and Architecture',1005,20,18,90,'-'),('21CYB101J','CHEMISTRY',1003,20,20,100,'O'),('21DCS201P','Design Thinking and Methodology',1005,20,19,95,'-'),('21LEH104T','GERMAN',1013,20,20,100,'O'),('21LEM201T','EEE',1002,20,20,100,'B'),('21MAB102T','ADVANCED CALCULUS AND COMPLEX ANALYSIS',1003,20,15,75,'A'),('21MAB201T','Transforms and Boundary Value Problems',1005,20,10,50,'-'),('21PDM102L','Calculus and Algebra',1002,20,15,75,'O');
/*!40000 ALTER TABLE `attendancesem5` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `attendancesem6`
--

DROP TABLE IF EXISTS `attendancesem6`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `attendancesem6` (
  `Subject_Code` varchar(20) NOT NULL,
  `Subject_Name` varchar(50) NOT NULL,
  `Room_Number` int DEFAULT NULL,
  `Class_Conducted` int DEFAULT NULL,
  `Class_Attended` int DEFAULT NULL,
  `Attendence` float NOT NULL,
  `Grade` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`Subject_Code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `attendancesem6`
--

LOCK TABLES `attendancesem6` WRITE;
/*!40000 ALTER TABLE `attendancesem6` DISABLE KEYS */;
INSERT INTO `attendancesem6` VALUES ('21BTB102T','Biology',1003,20,16,80,'O'),('21CSC202J','Operating Systems',1005,20,18,90,'-'),('21CSC203P','Advanced Programming Practice',1005,20,15,75,'-'),('21CSS201T','Computer Organization and Architecture',1005,20,18,90,'-'),('21CYB101J','CHEMISTRY',1003,20,20,100,'O'),('21DCS201P','Design Thinking and Methodology',1005,20,19,95,'-'),('21LEH104T','GERMAN',1013,20,20,100,'O'),('21LEM201T','EEE',1002,20,20,100,'B'),('21MAB102T','ADVANCED CALCULUS AND COMPLEX ANALYSIS',1003,20,15,75,'A'),('21MAB201T','Transforms and Boundary Value Problems',1005,20,10,50,'-'),('21PDM102L','Calculus and Algebra',1002,20,15,75,'O');
/*!40000 ALTER TABLE `attendancesem6` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `attendancesem7`
--

DROP TABLE IF EXISTS `attendancesem7`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `attendancesem7` (
  `Subject_Code` varchar(20) NOT NULL,
  `Subject_Name` varchar(50) NOT NULL,
  `Room_Number` int DEFAULT NULL,
  `Class_Conducted` int DEFAULT NULL,
  `Class_Attended` int DEFAULT NULL,
  `Attendence` float NOT NULL,
  `Grade` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`Subject_Code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `attendancesem7`
--

LOCK TABLES `attendancesem7` WRITE;
/*!40000 ALTER TABLE `attendancesem7` DISABLE KEYS */;
INSERT INTO `attendancesem7` VALUES ('21BTB102T','Biology',1003,20,16,80,'O'),('21CSC202J','Operating Systems',1005,20,18,90,'-'),('21CSC203P','Advanced Programming Practice',1005,20,15,75,'-'),('21CSS201T','Computer Organization and Architecture',1005,20,18,90,'-'),('21CYB101J','CHEMISTRY',1003,20,20,100,'O'),('21DCS201P','Design Thinking and Methodology',1005,20,19,95,'-'),('21LEH104T','GERMAN',1013,20,20,100,'O'),('21LEM201T','EEE',1002,20,20,100,'B'),('21MAB102T','ADVANCED CALCULUS AND COMPLEX ANALYSIS',1003,20,15,75,'A'),('21MAB201T','Transforms and Boundary Value Problems',1005,20,10,50,'-'),('21PDM102L','Calculus and Algebra',1002,20,15,75,'O');
/*!40000 ALTER TABLE `attendancesem7` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `attendancesem8`
--

DROP TABLE IF EXISTS `attendancesem8`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `attendancesem8` (
  `Subject_Code` varchar(20) NOT NULL,
  `Subject_Name` varchar(50) NOT NULL,
  `Room_Number` int DEFAULT NULL,
  `Class_Conducted` int DEFAULT NULL,
  `Class_Attended` int DEFAULT NULL,
  `Attendence` float NOT NULL,
  `Grade` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`Subject_Code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `attendancesem8`
--

LOCK TABLES `attendancesem8` WRITE;
/*!40000 ALTER TABLE `attendancesem8` DISABLE KEYS */;
INSERT INTO `attendancesem8` VALUES ('21BTB102T','Biology',1003,20,16,80,'O'),('21CSC202J','Operating Systems',1005,20,18,90,'-'),('21CSC203P','Advanced Programming Practice',1005,20,15,75,'-'),('21CSS201T','Computer Organization and Architecture',1005,20,18,90,'-'),('21CYB101J','CHEMISTRY',1003,20,20,100,'O'),('21DCS201P','Design Thinking and Methodology',1005,20,19,95,'-'),('21LEH104T','GERMAN',1013,20,20,100,'O'),('21LEM201T','EEE',1002,20,20,100,'B'),('21MAB102T','ADVANCED CALCULUS AND COMPLEX ANALYSIS',1003,20,15,75,'A'),('21MAB201T','Transforms and Boundary Value Problems',1005,20,10,50,'-'),('21PDM102L','Calculus and Algebra',1002,20,15,75,'O');
/*!40000 ALTER TABLE `attendancesem8` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `course`
--

DROP TABLE IF EXISTS `course`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `course` (
  `Subject_Code` varchar(20) NOT NULL,
  `Subject_Name` varchar(50) NOT NULL,
  `Faculty_Name` varchar(50) DEFAULT NULL,
  `Room_Number` int DEFAULT NULL,
  `Credits` int DEFAULT NULL,
  `Grade` varchar(10) DEFAULT NULL,
  `Semester` int NOT NULL,
  `FacultyNumber` int DEFAULT NULL,
  PRIMARY KEY (`Subject_Code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `course`
--

LOCK TABLES `course` WRITE;
/*!40000 ALTER TABLE `course` DISABLE KEYS */;
INSERT INTO `course` VALUES ('21BTB102T','Biology','Akshat Saini',1003,2,'O',2,982932567),('21CSC202J','Operating Systems','Dr.A.Saranya',1005,4,'-',3,982932542),('21CSC203P','Advanced Programming Practice','Dr. Arunarani AR',1005,4,'-',3,982932542),('21CSS201T','Computer Organization and Architecture','Dr.Vijayalakshmi K',1005,4,'-',3,982932542),('21CYB101J','CHEMISTRY','Ashish Rastogi',1003,5,'O',2,982932567),('21DCS201P','Design Thinking and Methodology','Mrs. Panimalar K',1005,4,'-',3,982932542),('21GNM102L','Semiconductor Physics','Jai kumar',1002,5,'A',1,982932267),('21LEH104T','GERMAN','Praveen Acharya',1013,3,'O',2,982932567),('21LEM201T','EEE','Tanmay Shrivastav',1002,2,'B',1,982932267),('21MAB102T','ADVANCED CALCULUS AND COMPLEX ANALYSIS','Rahul Iyenger',1003,4,'A',2,982932567),('21MAB201T','Transforms and Boundary Value Problems','Dr. H. Merlyn Margaret',1005,4,'-',3,982932542),('21PDM102L','Philosophy of Engineering','Shantanu Sharma',1003,3,'O',2,982932567);
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
INSERT INTO `login` VALUES ('ar0354','ar0354','student'),('as8819','as8819','teacher'),('kj1130','kj1130','Student'),('sg2982','sg2982','Student'),('sk1903','sk1903','Student'),('sm5001','sm5001','Teacher');
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `marks`
--

DROP TABLE IF EXISTS `marks`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `marks` (
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
  `CT_3_I` int DEFAULT NULL,
  PRIMARY KEY (`Subject_Code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `marks`
--

LOCK TABLES `marks` WRITE;
/*!40000 ALTER TABLE `marks` DISABLE KEYS */;
INSERT INTO `marks` VALUES ('21BTB102T','Biology','Dr. Akshat Saini (9872196731)',2,4,0,3,6,0,3,15,0,4),('21CSC202J','Operating Systems','Dr.A.Saranya (9872536731)',3,1,10,10,9,2,6,1,2,10),('21CSC203P','Advanced Programming Practice','Dr. Arunarani AR (9872347831)',3,13,0,7,3,0,4,11,0,4),('21CSS201T','Computer Organization and Architecture','Dr.Vijayalakshmi K (9872346451)',3,14,0,4,5,0,6,8,0,2),('21CYB101J','CHEMISTRY','Dr. Ashish Rastogi (9861346731)',2,7,9,10,6,9,8,11,9,3),('21GNM102L','English','Dr. Aryan Gupta (9872776731)',1,3,0,7,1,0,8,3,0,4),('21LEH104T','GERMAN','Dr. Praveen Acharya (9872322731)',2,9,0,8,10,0,10,7,0,8),('21MAB102T','ADVANCED CALCULUS AND COMPLEX ANALYSIS','Dr. Rahul Iyenger (9872346151)',2,6,0,5,1,0,10,8,0,4),('21MAB201T','Transforms and Boundary Value Problems','Dr. H. Merlyn Margaret (9872346731)',3,8,0,7,5,0,1,5,0,8),('21PDM102L','Calculus and Algebra','Dr. Abhishek Singh (9879846731)',1,14,0,8,4,0,8,9,0,3);
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
INSERT INTO `studentdb` VALUES ('Shreyansh khandelwal','RA2211003010387','ctech','CSE CORE',3,'f1','dr sathyapriya l',983279239,'sl1203@srmist.edu.in','2004-06-09','jaipur','rajasthan',982953035,'khandelwal.happy.hk@gmail.com','sk1903','student','sk1903'),('Abhishek Soni','RA2211003011185','CTECH','CSE',3,'B2','DR. NITHYASHRI J',999999999,'nj2234@srmist.edu.in','2017-06-04','JAIPUR','RAJASTHAN',894983467,'abhisoni1764@gmail.com','as8819','Student','as8819'),('shantanu gahtori','RA2211033010112','cintel','cse swe',3,'aa-2','DR. ar arunirani',984023182,'arunaraa@srmist.edu.in','2003-09-09','chandigarh','chandigarh',964648254,'shantanugahtori4@gmail.com','sg2982','student','sg2982');
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
INSERT INTO `timetable` VALUES ('sg2982','app','maths','','','','','','','','','','','','','','maths','','','','','','maths','','','','','','','','','','','','','','','','','','','','','','','','','','','',''),('sk1903','daa','maths',NULL,'app','','maths','','dsa lab','','','','maths','',NULL,'','coa',NULL,'','','',NULL,'','','maths',NULL,'','','','','','','',NULL,'',NULL,NULL,'','app','','','','','os','coa','','','','','','');
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

-- Dump completed on 2024-03-06  1:27:07
