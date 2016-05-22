/*
 Navicat Premium Data Transfer

 Source Server         : 127.0.0.1
 Source Server Type    : MySQL
 Source Server Version : 50621
 Source Host           : 127.0.0.1
 Source Database       : db_ionic_autoid_slave

 Target Server Type    : MySQL
 Target Server Version : 50621
 File Encoding         : utf-8

 Date: 01/29/2016 12:23:44 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `res_slave_current_0`
-- ----------------------------
DROP TABLE IF EXISTS `res_slave_current_0`;
CREATE TABLE `res_slave_current_0` (
	`k` smallint(5) UNSIGNED NOT NULL,
	`id` int(10) UNSIGNED NOT NULL,
	`num` int(10) UNSIGNED NOT NULL,
	PRIMARY KEY (`k`)
) ENGINE=`InnoDB` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ROW_FORMAT=COMPACT COMMENT='' CHECKSUM=0 DELAY_KEY_WRITE=0;

-- ----------------------------
--  Records of `res_slave_current_0`
-- ----------------------------
BEGIN;
INSERT INTO `res_slave_current_0` VALUES ('2000', '1002', '998');
COMMIT;

-- ----------------------------
--  Table structure for `res_slave_current_1`
-- ----------------------------
DROP TABLE IF EXISTS `res_slave_current_1`;
CREATE TABLE `res_slave_current_1` (
	`k` smallint(5) UNSIGNED NOT NULL,
	`id` int(10) UNSIGNED NOT NULL,
	`num` int(10) UNSIGNED NOT NULL,
	PRIMARY KEY (`k`)
) ENGINE=`InnoDB` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ROW_FORMAT=COMPACT COMMENT='' CHECKSUM=0 DELAY_KEY_WRITE=0;

-- ----------------------------
--  Records of `res_slave_current_1`
-- ----------------------------
BEGIN;
INSERT INTO `res_slave_current_1` VALUES ('2000', '4001', '999');
COMMIT;

-- ----------------------------
--  Table structure for `res_slave_current_2`
-- ----------------------------
DROP TABLE IF EXISTS `res_slave_current_2`;
CREATE TABLE `res_slave_current_2` (
	`k` smallint(5) UNSIGNED NOT NULL,
	`id` int(10) UNSIGNED NOT NULL,
	`num` int(10) UNSIGNED NOT NULL,
	PRIMARY KEY (`k`)
) ENGINE=`InnoDB` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ROW_FORMAT=COMPACT COMMENT='' CHECKSUM=0 DELAY_KEY_WRITE=0;

-- ----------------------------
--  Table structure for `res_slave_current_3`
-- ----------------------------
DROP TABLE IF EXISTS `res_slave_current_3`;
CREATE TABLE `res_slave_current_3` (
	`k` smallint(5) UNSIGNED NOT NULL,
	`id` int(10) UNSIGNED NOT NULL,
	`num` int(10) UNSIGNED NOT NULL,
	PRIMARY KEY (`k`)
) ENGINE=`InnoDB` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ROW_FORMAT=COMPACT COMMENT='' CHECKSUM=0 DELAY_KEY_WRITE=0;

-- ----------------------------
--  Table structure for `res_slave_current_4`
-- ----------------------------
DROP TABLE IF EXISTS `res_slave_current_4`;
CREATE TABLE `res_slave_current_4` (
	`k` smallint(5) UNSIGNED NOT NULL,
	`id` int(10) UNSIGNED NOT NULL,
	`num` int(10) UNSIGNED NOT NULL,
	PRIMARY KEY (`k`)
) ENGINE=`InnoDB` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ROW_FORMAT=COMPACT COMMENT='' CHECKSUM=0 DELAY_KEY_WRITE=0;

-- ----------------------------
--  Table structure for `res_slave_current_5`
-- ----------------------------
DROP TABLE IF EXISTS `res_slave_current_5`;
CREATE TABLE `res_slave_current_5` (
	`k` smallint(5) UNSIGNED NOT NULL,
	`id` int(10) UNSIGNED NOT NULL,
	`num` int(10) UNSIGNED NOT NULL,
	PRIMARY KEY (`k`)
) ENGINE=`InnoDB` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ROW_FORMAT=COMPACT COMMENT='' CHECKSUM=0 DELAY_KEY_WRITE=0;

-- ----------------------------
--  Records of `res_slave_current_5`
-- ----------------------------
BEGIN;
INSERT INTO `res_slave_current_5` VALUES ('2000', '5001', '999');
COMMIT;

-- ----------------------------
--  Table structure for `res_slave_current_6`
-- ----------------------------
DROP TABLE IF EXISTS `res_slave_current_6`;
CREATE TABLE `res_slave_current_6` (
	`k` smallint(5) UNSIGNED NOT NULL,
	`id` int(10) UNSIGNED NOT NULL,
	`num` int(10) UNSIGNED NOT NULL,
	PRIMARY KEY (`k`)
) ENGINE=`InnoDB` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ROW_FORMAT=COMPACT COMMENT='' CHECKSUM=0 DELAY_KEY_WRITE=0;

-- ----------------------------
--  Records of `res_slave_current_6`
-- ----------------------------
BEGIN;
INSERT INTO `res_slave_current_6` VALUES ('2000', '3001', '999');
COMMIT;

-- ----------------------------
--  Table structure for `res_slave_current_7`
-- ----------------------------
DROP TABLE IF EXISTS `res_slave_current_7`;
CREATE TABLE `res_slave_current_7` (
	`k` smallint(5) UNSIGNED NOT NULL,
	`id` int(10) UNSIGNED NOT NULL,
	`num` int(10) UNSIGNED NOT NULL,
	PRIMARY KEY (`k`)
) ENGINE=`InnoDB` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ROW_FORMAT=COMPACT COMMENT='' CHECKSUM=0 DELAY_KEY_WRITE=0;

-- ----------------------------
--  Table structure for `res_slave_current_8`
-- ----------------------------
DROP TABLE IF EXISTS `res_slave_current_8`;
CREATE TABLE `res_slave_current_8` (
	`k` smallint(5) UNSIGNED NOT NULL,
	`id` int(10) UNSIGNED NOT NULL,
	`num` int(10) UNSIGNED NOT NULL,
	PRIMARY KEY (`k`)
) ENGINE=`InnoDB` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ROW_FORMAT=COMPACT COMMENT='' CHECKSUM=0 DELAY_KEY_WRITE=0;

-- ----------------------------
--  Records of `res_slave_current_8`
-- ----------------------------
BEGIN;
INSERT INTO `res_slave_current_8` VALUES ('2000', '2001', '999');
COMMIT;

-- ----------------------------
--  Table structure for `res_slave_current_9`
-- ----------------------------
DROP TABLE IF EXISTS `res_slave_current_9`;
CREATE TABLE `res_slave_current_9` (
	`k` smallint(5) UNSIGNED NOT NULL,
	`id` int(10) UNSIGNED NOT NULL,
	`num` int(10) UNSIGNED NOT NULL,
	PRIMARY KEY (`k`)
) ENGINE=`InnoDB` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ROW_FORMAT=COMPACT COMMENT='' CHECKSUM=0 DELAY_KEY_WRITE=0;

SET FOREIGN_KEY_CHECKS = 1;
