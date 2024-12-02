/*
SQLyog Ultimate v12.14 (64 bit)
MySQL - 8.0.26 : Database - day02_database2
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`day02_database2` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `day02_database2`;

/*Table structure for table `product` */

DROP TABLE IF EXISTS `product`;

CREATE TABLE `product` (
  `pid` int NOT NULL,
  `pname` varchar(20) DEFAULT NULL,
  `price` double DEFAULT NULL,
  PRIMARY KEY (`pid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

/*Data for the table `product` */

insert  into `product`(`pid`,`pname`,`price`) values 
(1,'联想',5000),
(2,'海尔',3000),
(3,'雷神',5000),
(4,'JACK JONES',800),
(5,'真维斯',200),
(6,'花花公子',440),
(7,'劲霸',2000),
(8,'香奈儿',800),
(9,'相宜本草',200),
(10,'面霸',5),
(11,'好想你枣',56),
(12,'香飘飘奶茶',1),
(13,'果9',1),
(14,'好想你枣',44),
(15,'果9',1999),
(16,'霸王防脱',500);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
