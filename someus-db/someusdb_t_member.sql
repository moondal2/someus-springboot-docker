-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: localhost    Database: someusdb
-- ------------------------------------------------------
-- Server version	5.7.40-log

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
-- Table structure for table `t_member`
--

DROP TABLE IF EXISTS `t_member`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `t_member` (
  `member_id` varchar(20) NOT NULL,
  `member_name` varchar(20) NOT NULL,
  `member_email` varchar(50) NOT NULL,
  `member_pw` varchar(300) NOT NULL,
  PRIMARY KEY (`member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_member`
--

LOCK TABLES `t_member` WRITE;
/*!40000 ALTER TABLE `t_member` DISABLE KEYS */;
INSERT INTO `t_member` VALUES ('a123456789','chocho','test@test.com','$2a$10$TO3DwAhdRtyGIfxejW2W7uK6OSzE08Hv7kG2AjtM.zwtqGnNEI0EK'),('choimj','최문정','choimj@test.com','$2a$10$jPi3vT78iW.obZ4e8wVHqeMHtcR2JVzhKpr9Fk1PtZPk90AdwSH4K'),('jksin13','정교성','jks@jks.com','$2a$10$/Ck7Mf26UgqPhwmJWJMppeCrWsKsQa1BF4wUltFTSGTwrvbzf6P2q'),('someus','썸어스','someus@someus.com','$2a$10$YcDTB1igAK5dARiPTOMo8ueRptmkdRtwjGhQw5eXztMSCwxNHECBe'),('test','test','test@test.com','test'),('test1','김예빈','test@test.com','12341234'),('test123','임은정','test123@naver.com','$2a$10$2SRXbvjUlyQcW69kfLKZ5udnZKA5bWet2KJjdDSaCXUFm2XzTloc2'),('test1234','정교성','test@test.com','12341234'),('test12341234','김초원','test@test.com','$2a$10$.KqdFcMUutCUvAEFIaNOQOJrrULaU3RZlNY5joYjxbwXjb8A92zwa'),('test2','최문정','test@test.com','12341234'),('test3','임은정','test@test.com','12341234'),('testtest','김초원','test@test.com','$2a$10$lYmaNkwaGMLIWKAnQMf/WuxjS3oRucCXDPd1fKwbDh/C6ME35htaW'),('testtest1234','김초원','test@test.com','$2a$10$e7QarPhRjRTiSFDID6PHHuiWe0dZXwLRldcFqB6JISdEUunyd.Ihu'),('yebbbii','예빈','yebbii@test.com','$2a$10$ZkCy3u39dSKOSOKaJ76ESeJL6w8Po.WfSvLHPQicpOGvjLvVn3Nwi'),('yebbii','예빈','yebbii@test.com','$2a$10$RNk02UAXw.bxeRDv2w9ec.FYz9pw1gk7aGYKjf5Dgg5yGw1Uc4ZUK'),('yebbii5','김예빈','yebbii@test.com','$2a$10$69aXFisPvzFgi3EIN/hsPudbDkHeFKzFUEkTk6F8ApVfOhJsradcK');
/*!40000 ALTER TABLE `t_member` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-03-16 15:34:26
