/*
Navicat MySQL Data Transfer

Source Server         : DB
Source Server Version : 50505
Source Host           : localhost:3306
Source Database       : musicddl

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2015-06-25 23:50:00
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `admin`
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `pwd` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('1', 'admin', '21232f297a57a5a743894a0e4a801fc3');

-- ----------------------------
-- Table structure for `comments`
-- ----------------------------
DROP TABLE IF EXISTS `comments`;
CREATE TABLE `comments` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `value` text,
  `name` varchar(20) DEFAULT NULL,
  `music_id` int(4) DEFAULT NULL,
  `time` varchar(13) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of comments
-- ----------------------------
INSERT INTO `comments` VALUES ('1', '凤凰花开评论-----第一条', '游客', '5', '1434012767282');
INSERT INTO `comments` VALUES ('2', '凤凰花开评论-----第2条', '游客', '5', '1434012781792');
INSERT INTO `comments` VALUES ('3', '凤凰花开评论-----第3条', '游客', '5', '1434012788685');
INSERT INTO `comments` VALUES ('4', '单身情歌------评论第1条', '游客', '4', '1434012838823');
INSERT INTO `comments` VALUES ('5', '单身情歌------评论第2条', '游客', '4', '1434012845027');
INSERT INTO `comments` VALUES ('6', '单身情歌------评论第3条', '游客', '4', '1434012850248');
INSERT INTO `comments` VALUES ('7', '千里之外--------评论第1条', '游客', '3', '1434012892331');
INSERT INTO `comments` VALUES ('8', '千里之外--------评论第2条', '游客', '3', '1434012899279');
INSERT INTO `comments` VALUES ('9', '千里之外--------评论第3条', '游客', '3', '1434012910335');
INSERT INTO `comments` VALUES ('10', '夜的第七章-------评论第1条', '游客', '2', '1434012936997');
INSERT INTO `comments` VALUES ('11', '夜的第七章-------评论第2条', '游客', '2', '1434012944113');
INSERT INTO `comments` VALUES ('12', '夜的第七章-------评论第3条', '游客', '2', '1434012950947');
INSERT INTO `comments` VALUES ('13', '夜曲---------评论第1条', '游客', '1', '1434012977054');
INSERT INTO `comments` VALUES ('14', '夜曲---------评论第2条', '游客', '1', '1434012982648');
INSERT INTO `comments` VALUES ('15', '夜曲---------评论第3条', '游客', '1', '1434012987509');

-- ----------------------------
-- Table structure for `link`
-- ----------------------------
DROP TABLE IF EXISTS `link`;
CREATE TABLE `link` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `value` text,
  `title` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of link
-- ----------------------------
INSERT INTO `link` VALUES ('3', 'http://baidu.com', 'baidu');
INSERT INTO `link` VALUES ('4', 'http://google.com', 'google');

-- ----------------------------
-- Table structure for `message`
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `user_from` varchar(20) DEFAULT NULL,
  `user_to` int(4) DEFAULT NULL,
  `title` varchar(200) NOT NULL,
  `value` text NOT NULL,
  `time` varchar(13) NOT NULL,
  `read_flg` int(1) DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of message
-- ----------------------------

-- ----------------------------
-- Table structure for `music`
-- ----------------------------
DROP TABLE IF EXISTS `music`;
CREATE TABLE `music` (
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
-- Records of music
-- ----------------------------
INSERT INTO `music` VALUES ('1', '夜曲', '周杰伦', '叶惠美', '简介-夜曲！！！！！！！！！！！！！！！！！！', '1434012167448', '1', 'upload\\\\\\201506114962.mp3', '38');
INSERT INTO `music` VALUES ('2', '夜的第七章', '周杰伦', '十一月的肖邦', '简介-十一月的肖邦！！！！！！！', '1434012238665', '1', 'upload\\\\\\201506114413.mp3', '38');
INSERT INTO `music` VALUES ('3', '千里之外', '周杰伦、费玉清', '十二月的冬天', '简介-千里之外！！！！！！！！！！！', '1434012354229', '1', 'upload\\\\\\201506112436.mp3', '38');
INSERT INTO `music` VALUES ('4', '单身情歌', '林志炫', '默默不语', '简介-单身情歌！！！！！！！！！！！！', '1434012624839', '1', 'upload\\\\\\201506112265.mp3', '39');
INSERT INTO `music` VALUES ('5', '凤凰花开', '林志炫', '默默不语', '简介-凤凰花开！！！！！！', '1434012672834', '2', 'upload\\\\\\201506112631.mp3', '39');

-- ----------------------------
-- Table structure for `tip`
-- ----------------------------
DROP TABLE IF EXISTS `tip`;
CREATE TABLE `tip` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `value` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tip
-- ----------------------------
INSERT INTO `tip` VALUES ('1', '[mac] 分享了歌曲 [夜曲]');
INSERT INTO `tip` VALUES ('2', '[mac] 分享了歌曲 [夜的第七章]');
INSERT INTO `tip` VALUES ('3', '[mac] 分享了歌曲 [千里之外]');
INSERT INTO `tip` VALUES ('4', '[lichao] 分享了歌曲 [单身情歌]');
INSERT INTO `tip` VALUES ('5', '[lichao] 分享了歌曲 [凤凰花开]');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `pwd` varchar(32) DEFAULT NULL,
  `music_box` longtext,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=40 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('38', 'mac', '140c1f12feeb2c52dfbeb2da6066a73a', null);
INSERT INTO `user` VALUES ('39', 'lichao', 'a382cd40eaf65b6d98f0135e2fa3f016', null);
