/*
SQLyog Ultimate v10.00 Beta1
MySQL - 5.1.45-community : Database - sportshoes
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`sportshoes` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `sportshoes`;

/*Table structure for table `hibernate_sequence` */

DROP TABLE IF EXISTS `hibernate_sequence`;

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `hibernate_sequence` */

insert  into `hibernate_sequence`(`next_val`) values (24),(24);

/*Table structure for table `product` */

DROP TABLE IF EXISTS `product`;

CREATE TABLE `product` (
  `product_id` int(5) NOT NULL AUTO_INCREMENT,
  `season` varchar(20) DEFAULT NULL,
  `brand` varchar(20) DEFAULT NULL,
  `category` varchar(30) DEFAULT NULL,
  `price` int(5) DEFAULT NULL,
  `color` varchar(10) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `product_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`product_id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

/*Data for the table `product` */

insert  into `product`(`product_id`,`season`,`brand`,`category`,`price`,`color`,`date`,`product_name`) values (1,'Rainy','Nike','Male',5000,'Blue','2021-09-29','Running shoes'),(2,'Winter','Nike','Female',4000,'Black','2021-09-28','Casual shoes'),(3,'Summer','Puma','Female',4500,'Blue','2021-10-02','Running shoes'),(4,'Winter','Adidas','Male',7500,NULL,'2021-09-27','Sport shoes'),(5,'Summer','Puma','Male',6500,'Blue','2021-10-04','Walking shoes'),(8,'Summer','Puma','Female',4000,'Blue','2021-09-30','Walking shoes'),(9,'Winter','Adidas','Female',6000,'Red','2021-09-30','Running shoes'),(10,'Summer','Nike','Male',6000,'Black','2021-09-13','Sport shoes'),(12,'Summer','Nike','Female',3700,'White','2021-10-05','Casual shoes'),(21,'Summer','Nike','Female',3700,'White','2021-10-05','Casual shoes');

/*Table structure for table `purchase` */

DROP TABLE IF EXISTS `purchase`;

CREATE TABLE `purchase` (
  `purchase_id` int(5) NOT NULL AUTO_INCREMENT,
  `purchase_name` varchar(30) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `brand` varchar(10) DEFAULT NULL,
  `price` int(5) DEFAULT NULL,
  `color` varchar(10) DEFAULT NULL,
  `size` int(5) DEFAULT NULL,
  `date` date DEFAULT NULL,
  PRIMARY KEY (`purchase_id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8;

/*Data for the table `purchase` */

insert  into `purchase`(`purchase_id`,`purchase_name`,`email`,`brand`,`price`,`color`,`size`,`date`) values (1,'navi','navi@gmail.com','Adidas',4500,'Black',8,'2021-10-02'),(2,'Vijaysai','v@gmail.com','Adidas',6000,'Blue',9,'2021-09-27'),(3,'Ankit','A@gmail.com','Puma',7500,'Red',8,'2021-09-26'),(4,'Aiwashrya','ays@gmail.com','Nike',6000,'Red',7,'2021-09-25'),(5,'suraj','suraj@gmail.com','Nike',4500,'Black',10,'2021-10-02'),(6,'woong','woong@gmail.com','Adidas',6000,'Blue',8,'2021-10-02'),(22,NULL,'vipul@gmail.com','Nike',10000,'Black',10,'2021-10-06');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `password` varchar(20) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) DEFAULT NULL,
  `mobile_no` int(111) DEFAULT NULL,
  `product_id` int(11) NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`password`,`email`,`user_id`,`user_name`,`mobile_no`,`product_id`) values ('123456','a@gmail.com',4,'walmaert',789456,456),('4561','sav@gmail.com',5,'sav@gmail.com',2147483647,458),('321654','Avhi@gmail.com',6,'Avhi@gmail.com',2147483647,7584),('45748','naruto@gmail.com',7,'naruto@gmail.com',2147483647,753),('45678','a@gmail.com',19,'Cisco',4525,125),('45678','acc@gmail.com',20,'Accen',4525,125);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
