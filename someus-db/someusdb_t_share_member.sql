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
-- Table structure for table `t_share_member`
--

DROP TABLE IF EXISTS `t_share_member`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `t_share_member` (
  `share_member_id` int(11) NOT NULL AUTO_INCREMENT,
  `share_room_id` int(11) DEFAULT NULL,
  `member_id` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`share_member_id`),
  KEY `share_room_id` (`share_room_id`),
  KEY `member_id` (`member_id`),
  CONSTRAINT `t_share_member_ibfk_1` FOREIGN KEY (`share_room_id`) REFERENCES `t_share_room` (`share_room_id`),
  CONSTRAINT `t_share_member_ibfk_2` FOREIGN KEY (`member_id`) REFERENCES `t_member` (`member_id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_share_member`
--

LOCK TABLES `t_share_member` WRITE;
/*!40000 ALTER TABLE `t_share_member` DISABLE KEYS */;
INSERT INTO `t_share_member` VALUES (1,117,'testtest1234'),(2,117,'test1'),(3,118,'testtest1234'),(4,118,'test1'),(5,119,'testtest1234'),(6,119,'test1'),(7,120,'yebbii5'),(8,120,'testtest1234'),(9,123,'yebbii5'),(10,123,'testtest1234'),(13,125,'someus'),(14,125,'yebbii5');
/*!40000 ALTER TABLE `t_share_member` ENABLE KEYS */;
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
