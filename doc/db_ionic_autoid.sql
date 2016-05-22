/*
 Navicat Premium Data Transfer

 Source Server         : 127.0.0.1
 Source Server Type    : MySQL
 Source Server Version : 50621
 Source Host           : 127.0.0.1
 Source Database       : db_ionic_autoid

 Target Server Type    : MySQL
 Target Server Version : 50621
 File Encoding         : utf-8

 Date: 01/29/2016 12:23:15 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `res`
-- ----------------------------
DROP TABLE IF EXISTS `res`;
CREATE TABLE `res` (
	`k` smallint(5) UNSIGNED NOT NULL,
	`id` int(10) UNSIGNED NOT NULL,
	PRIMARY KEY (`k`)
) ENGINE=`InnoDB` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ROW_FORMAT=COMPACT COMMENT='' CHECKSUM=0 DELAY_KEY_WRITE=0;

-- ----------------------------
--  Records of `res`
-- ----------------------------
BEGIN;
INSERT INTO `res` VALUES ('2000', '6000');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
