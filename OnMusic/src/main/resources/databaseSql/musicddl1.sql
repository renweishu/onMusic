/*
Navicat MySQL Data Transfer

Source Server         : DB
Source Server Version : 50505
Source Host           : localhost:3306
Source Database       : musicddl1

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2015-06-29 11:08:11
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `music_backup`
-- ----------------------------
DROP TABLE IF EXISTS `music_backup`;
CREATE TABLE `music_backup` (
  `id` int(6) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) DEFAULT NULL,
  `singer` varchar(30) NOT NULL,
  `special` varchar(30) NOT NULL,
  `value` text NOT NULL,
  `time` varchar(13) NOT NULL,
  `click` int(5) NOT NULL,
  `url` longtext,
  `user_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of music_backup
-- ----------------------------
