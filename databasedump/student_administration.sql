-- MySQL dump 10.13  Distrib 5.7.19, for macos10.12 (x86_64)
--
-- Host: localhost    Database: student_administartion
-- ------------------------------------------------------
-- Server version	5.7.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `student_administartion`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `student_administartion` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `student_administartion`;

--
-- Table structure for table `students`
--

DROP TABLE IF EXISTS `students`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `students` (
  `student_id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `last_name` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `enrollmentdate` date DEFAULT NULL,
  `cpr` varchar(11) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`student_id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `students`
--

LOCK TABLES `students` WRITE;
/*!40000 ALTER TABLE `students` DISABLE KEYS */;
INSERT INTO `students` VALUES (1,'Claus','Bove','2010-10-21','221070-3333'),(2,'Anna','Bove','2010-10-21','221070-3333'),(3,'Claus','Bove','2010-10-10','221070-3333'),(4,'Claus','Bove','2010-10-10','221070-3333'),(5,'Claus','Bove','2010-10-10','221070-3333'),(6,'Claus','Bove','2010-10-10','221070-3333'),(7,'Tammi','Bent','2010-10-10','221070-3333'),(8,'Tammi','Bent','2010-10-10','221070-3333'),(9,'hrirrr','Bove','2010-10-21','221070-3333'),(10,'ole','Bove','2010-10-10','221070-3333'),(11,'ole','Bove','2010-10-10','221070-3333'),(12,'Troels','Bent','2010-10-10','221070-3333'),(13,'Claus','Bove','2010-10-10','221070-3333'),(14,'Troels555','Bent','2010-10-10','221070-3333'),(15,'Claus','Bove','2010-10-10','221070-3333'),(16,'Troels666','Bent','2010-10-10','221070-3333'),(17,'Claus666','Bove','2010-10-10','221070-3333'),(18,'Claus666','Bove','2010-10-10','221070-3333'),(19,'Claus666','Bove','2010-10-10','221070-3333'),(20,'Claus666','Bove','2010-10-10','221070-3333'),(21,'Claus666','Bove','2010-10-10','221070-3333'),(22,'Claus666','Bove','2010-10-10','221070-3333');
/*!40000 ALTER TABLE `students` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-10-24  9:44:51
