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
-- Table structure for table `t_goal`
--

DROP TABLE IF EXISTS `t_goal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `t_goal` (
  `goal_id` int(11) NOT NULL AUTO_INCREMENT,
  `member_id` varchar(20) NOT NULL,
  `goal_contents` varchar(300) NOT NULL,
  `goal_date` date NOT NULL,
  `goal_state` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`goal_id`),
  KEY `member_id` (`member_id`),
  CONSTRAINT `t_goal_ibfk_1` FOREIGN KEY (`member_id`) REFERENCES `t_member` (`member_id`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_goal`
--

LOCK TABLES `t_goal` WRITE;
/*!40000 ALTER TABLE `t_goal` DISABLE KEYS */;
INSERT INTO `t_goal` VALUES (6,'yebbii5','someus','2023-02-27',1),(7,'yebbii5','일기','2023-02-27',0),(24,'testtest1234','아자아자!(to do)','2023-02-27',0),(25,'testtest1234','프로젝트 열심히 하기(~ing)','2023-02-27',1),(26,'testtest1234','집에 가기(done)','2023-02-27',2),(27,'yebbii5','ing ','2023-02-27',0),(29,'someus','다이어트','2023-02-27',1),(30,'someus','독서','2023-02-27',1),(32,'someus','리액트 공부','2023-02-27',2),(33,'someus','그마아아안','2023-02-27',2);
/*!40000 ALTER TABLE `t_goal` ENABLE KEYS */;
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
