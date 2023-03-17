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
-- Table structure for table `t_share_room`
--

DROP TABLE IF EXISTS `t_share_room`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `t_share_room` (
  `share_room_id` int(11) NOT NULL AUTO_INCREMENT,
  `member_id` varchar(20) NOT NULL,
  `share_room_name` varchar(20) NOT NULL,
  PRIMARY KEY (`share_room_id`)
) ENGINE=InnoDB AUTO_INCREMENT=126 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_share_room`
--

LOCK TABLES `t_share_room` WRITE;
/*!40000 ALTER TABLE `t_share_room` DISABLE KEYS */;
INSERT INTO `t_share_room` VALUES (1,'testtest','test'),(3,'test1','shareroomnametest'),(4,'testtest1234','이건 나의 교환 일기'),(102,'yebbii5','yeyeyey'),(103,'jksin13','asdf'),(104,'yebbii5','jlkj'),(105,'testtest1234','테스트용교환일기'),(113,'yebbii5','이건 되야지'),(114,'yebbii5','이건 될거니?'),(115,'yebbii5','dssss'),(116,'yebbii5','dlfma'),(117,'testtest1234','~♡'),(118,'testtest1234','우리 교환 일기'),(119,'testtest1234','우리 꼭 매일 쓰자'),(120,'yebbii5','초초랑'),(122,'testtest1234','까먹으면죽음뿐'),(123,'yebbii5','초초랑 쓰는 교환일기'),(125,'someus','예빈이랑 일기');
/*!40000 ALTER TABLE `t_share_room` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-03-16 15:34:25
