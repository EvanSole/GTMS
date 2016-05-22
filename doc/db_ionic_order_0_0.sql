/*
 Navicat Premium Data Transfer

 Source Server         : 127.0.0.1
 Source Server Type    : MySQL
 Source Server Version : 50621
 Source Host           : 127.0.0.1
 Source Database       : db_ionic_order_0_0

 Target Server Type    : MySQL
 Target Server Version : 50621
 File Encoding         : utf-8

 Date: 01/29/2016 12:25:14 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `os_ionic`
-- ----------------------------
DROP TABLE IF EXISTS `os_ionic`;
CREATE TABLE `os_ionic` (
	`id` bigint(20) NOT NULL COMMENT '唯一ID',
	`zone_id` bigint(20) NOT NULL,
	`title` varchar(255) NOT NULL DEFAULT '' COMMENT '标题',
	`content` varchar(255) NOT NULL DEFAULT '' COMMENT '介绍',
	`face_image` varchar(255) NOT NULL DEFAULT '' COMMENT '头像',
	`remark` varchar(255) NOT NULL DEFAULT '' COMMENT '备注',
	`create_time` bigint(20) NOT NULL COMMENT '创建时间',
	`create_user` varchar(25) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '创建人',
	`update_time` bigint(20) NOT NULL COMMENT '修改时间',
	`update_user` varchar(25) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '修改人',
	PRIMARY KEY (`id`)
) ENGINE=`InnoDB` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ROW_FORMAT=COMPACT COMMENT='os_ionic' CHECKSUM=0 DELAY_KEY_WRITE=0;

-- ----------------------------
--  Records of `os_ionic`
-- ----------------------------
BEGIN;
INSERT INTO `os_ionic` VALUES ('2001', '88', '三国演义', '草船借箭', 'None', '', '1450585652595', 'admin', '1450585652595', 'admin'), ('3001', '88', '三国演义', '三顾茅庐', 'None', '', '1450585707240', 'admin', '1450585707240', 'admin');
COMMIT;

-- ----------------------------
--  Table structure for `os_ionic_1`
-- ----------------------------
DROP TABLE IF EXISTS `os_ionic_1`;
CREATE TABLE `os_ionic_1` (
	`id` bigint(20) NOT NULL COMMENT '唯一ID',
	`zone_id` bigint(20) NOT NULL,
	`title` varchar(255) NOT NULL DEFAULT '' COMMENT '标题',
	`content` varchar(255) NOT NULL DEFAULT '' COMMENT '介绍',
	`face_image` varchar(255) NOT NULL DEFAULT '' COMMENT '头像',
	`remark` varchar(255) NOT NULL DEFAULT '' COMMENT '备注',
	`create_time` bigint(20) NOT NULL COMMENT '创建时间',
	`create_user` varchar(25) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '创建人',
	`update_time` bigint(20) NOT NULL COMMENT '修改时间',
	`update_user` varchar(25) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '修改人',
	PRIMARY KEY (`id`)
) ENGINE=`InnoDB` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ROW_FORMAT=COMPACT COMMENT='os_ionic' CHECKSUM=0 DELAY_KEY_WRITE=0;

-- ----------------------------
--  Records of `os_ionic_1`
-- ----------------------------
BEGIN;
INSERT INTO `os_ionic_1` VALUES ('1001', '89', '三国演义', '欲擒故纵', 'None', '', '1450585560545', 'admin', '1450585560545', 'admin'), ('4001', '89', '三国演义', '笑里藏刀', 'None', '', '1450585806512', 'admin', '1450585806512', 'admin');
COMMIT;

-- ----------------------------
--  Table structure for `os_ionic_2`
-- ----------------------------
DROP TABLE IF EXISTS `os_ionic_2`;
CREATE TABLE `os_ionic_2` (
	`id` bigint(20) NOT NULL COMMENT '唯一ID',
	`zone_id` bigint(20) NOT NULL,
	`title` varchar(255) NOT NULL DEFAULT '' COMMENT '标题',
	`content` varchar(255) NOT NULL DEFAULT '' COMMENT '介绍',
	`face_image` varchar(255) NOT NULL DEFAULT '' COMMENT '头像',
	`remark` varchar(255) NOT NULL DEFAULT '' COMMENT '备注',
	`create_time` bigint(20) NOT NULL COMMENT '创建时间',
	`create_user` varchar(25) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '创建人',
	`update_time` bigint(20) NOT NULL COMMENT '修改时间',
	`update_user` varchar(25) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '修改人',
	PRIMARY KEY (`id`)
) ENGINE=`InnoDB` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ROW_FORMAT=COMPACT COMMENT='os_ionic' CHECKSUM=0 DELAY_KEY_WRITE=0;

SET FOREIGN_KEY_CHECKS = 1;
