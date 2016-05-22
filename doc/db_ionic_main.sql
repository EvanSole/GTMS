/*
 Navicat Premium Data Transfer

 Source Server         : 127.0.0.1
 Source Server Type    : MySQL
 Source Server Version : 50621
 Source Host           : 127.0.0.1
 Source Database       : db_ionic_main

 Target Server Type    : MySQL
 Target Server Version : 50621
 File Encoding         : utf-8

 Date: 01/29/2016 12:24:28 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `t_ionic_module`
-- ----------------------------
DROP TABLE IF EXISTS `t_ionic_module`;
CREATE TABLE `t_ionic_module` (
	`id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
	`type_code` varchar(255) CHARACTER SET utf8 NOT NULL COMMENT '业务类型代码（WMS/OMS/CRM/TMS...）',
	`module_type` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '模块类型 默认为web 分为web,手持设备rf',
	`parent_id` bigint(20) NOT NULL COMMENT '上级ID',
	`module_name` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '模块名称',
	`module_path` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '文件路径（用于反射调用）',
	`description` text CHARACTER SET utf8 DEFAULT NULL COMMENT '模块描述',
	`position` int(10) NOT NULL COMMENT '排列顺序（多级分组排序）',
	`is_visible` tinyint(1) NOT NULL DEFAULT 1 COMMENT '是否可见',
	`create_user` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '记录创建者',
	`create_time` bigint(20) DEFAULT NULL COMMENT '记录创建日期',
	`update_user` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '最后更新者',
	`update_time` bigint(20) DEFAULT NULL COMMENT '最后更新日期',
	`is_del` tinyint(1) DEFAULT 0 COMMENT '是否删除',
	PRIMARY KEY (`id`),
	INDEX `UQ_IONIC_Module_ModulePath` (`parent_id`) comment '',
	INDEX `UQ_IONIC_Module_ModuleName` (`module_name`) comment '',
	INDEX `IX_IONIC_Module_Type` (`type_code`) comment ''
) ENGINE=`InnoDB` AUTO_INCREMENT=1 DEFAULT CHARACTER SET utf8 COLLATE utf8_bin ROW_FORMAT=COMPACT COMMENT='系统模块表' CHECKSUM=0 DELAY_KEY_WRITE=0;

-- ----------------------------
--  Table structure for `t_ionic_permission`
-- ----------------------------
DROP TABLE IF EXISTS `t_ionic_permission`;
CREATE TABLE `t_ionic_permission` (
	`id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '权限ID',
	`module_id` bigint(20) NOT NULL COMMENT '模块ID',
	`action_name` varchar(200) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '功能名',
	`action_code` varchar(255) CHARACTER SET utf8 NOT NULL COMMENT '操作类型代码（增/删/改/查...）',
	`is_active` tinyint(1) NOT NULL DEFAULT 1 COMMENT '是否有效',
	`url_pattern` varchar(200) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '访问url',
	`method_type` varchar(10) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT 'url对应http动作',
	`relation_url` varchar(500) CHARACTER SET utf8 DEFAULT NULL COMMENT '其他相关url url+method的模式',
	`description` varchar(300) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '功能描述',
	`create_user` varchar(255) CHARACTER SET utf8 DEFAULT 'user_name()' COMMENT '记录创建者',
	`create_time` bigint(20) DEFAULT NULL COMMENT '记录创建日期',
	`update_user` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '最后更新者',
	`update_time` bigint(20) DEFAULT NULL COMMENT '最后更新日期',
	`is_default` tinyint(1) DEFAULT NULL COMMENT '是否为模块默认的操作',
	PRIMARY KEY (`id`)
) ENGINE=`InnoDB` AUTO_INCREMENT=1 DEFAULT CHARACTER SET utf8 COLLATE utf8_bin ROW_FORMAT=COMPACT COMMENT='模块权限表' CHECKSUM=0 DELAY_KEY_WRITE=0;

-- ----------------------------
--  Table structure for `t_ionic_role`
-- ----------------------------
DROP TABLE IF EXISTS `t_ionic_role`;
CREATE TABLE `t_ionic_role` (
	`id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '角色ID',
	`tenant_id` bigint(20) NOT NULL COMMENT '租户ID',
	`role_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '角色名称',
	`is_active` tinyint(1) DEFAULT 1 COMMENT '是否可用',
	`create_user` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '记录创建者',
	`create_time` bigint(20) DEFAULT NULL COMMENT '记录创建日期',
	`update_user` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '最后更新者',
	`update_time` bigint(20) DEFAULT NULL COMMENT '最后更新日期',
	`is_del` tinyblob DEFAULT NULL COMMENT '是否删除 0可用 1删除',
	PRIMARY KEY (`id`)
) ENGINE=`InnoDB` AUTO_INCREMENT=1 DEFAULT CHARACTER SET utf8 COLLATE utf8_bin ROW_FORMAT=COMPACT COMMENT='角色信息表' CHECKSUM=0 DELAY_KEY_WRITE=0;

-- ----------------------------
--  Table structure for `t_ionic_role_permission`
-- ----------------------------
DROP TABLE IF EXISTS `t_ionic_role_permission`;
CREATE TABLE `t_ionic_role_permission` (
	`id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
	`permission_id` bigint(20) NOT NULL COMMENT '权限ID',
	`role_id` bigint(20) NOT NULL COMMENT '角色ID',
	`create_user` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '记录创建者',
	`create_time` bigint(20) DEFAULT NULL COMMENT '记录创建日期',
	`update_user` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '最后更新者',
	`update_time` bigint(20) DEFAULT NULL COMMENT '最后更新日期',
	PRIMARY KEY (`id`)
) ENGINE=`InnoDB` AUTO_INCREMENT=1 DEFAULT CHARACTER SET utf8 COLLATE utf8_bin ROW_FORMAT=COMPACT COMMENT='角色权限信息表' CHECKSUM=0 DELAY_KEY_WRITE=0;

-- ----------------------------
--  Table structure for `t_ionic_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_ionic_user`;
CREATE TABLE `t_ionic_user` (
	`id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
	`tenant_id` bigint(20) NOT NULL COMMENT '租户ID',
	`real_name` varchar(25) CHARACTER SET utf8 NOT NULL DEFAULT '' COMMENT '真实姓名',
	`user_name` varchar(25) CHARACTER SET utf8 NOT NULL DEFAULT '' COMMENT '登陆账户',
	`password` varchar(100) CHARACTER SET utf8 NOT NULL DEFAULT '' COMMENT '登录密码（加密后保存）',
	`email` varchar(50) CHARACTER SET utf8 DEFAULT NULL COMMENT '电子信箱',
	`telephone` varchar(25) CHARACTER SET utf8 DEFAULT NULL COMMENT '固定电话',
	`mobile` varchar(25) CHARACTER SET utf8 DEFAULT NULL COMMENT '移动电话',
	`is_admin` tinyint(1) NOT NULL DEFAULT 0 COMMENT '是否为系统管理员',
	`is_active` tinyint(1) NOT NULL DEFAULT 1 COMMENT '帐号是否可用',
	`failed_times` int(11) NOT NULL DEFAULT 0 COMMENT '累计登录出错次数',
	`expired_date` bigint(20) DEFAULT NULL COMMENT '账号到期日',
	`is_del` tinyint(1) DEFAULT NULL,
	`create_user` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '记录创建者',
	`create_time` bigint(20) DEFAULT NULL COMMENT '记录创建日期',
	`update_user` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '最后更新者',
	`update_time` bigint(20) DEFAULT NULL COMMENT '最后更新日期',
	`is_locked` tinyint(1) DEFAULT 1 COMMENT '帐号是否锁定',
	PRIMARY KEY (`id`)
) ENGINE=`InnoDB` AUTO_INCREMENT=2 DEFAULT CHARACTER SET utf8 COLLATE utf8_bin ROW_FORMAT=COMPACT COMMENT='用户信息表' CHECKSUM=0 DELAY_KEY_WRITE=0;

-- ----------------------------
--  Records of `t_ionic_user`
-- ----------------------------
BEGIN;
INSERT INTO `t_ionic_user` VALUES ('1', '89', 'administrator', 'admin', 'e0ca61eecfe3b1f7fdf5cd3dca5a7c1f', 'admin@gmail.com', '123456789', '122', '1', '1', '0', null, '0', null, null, null, null, '1');
COMMIT;

-- ----------------------------
--  Table structure for `t_ionic_user_role`
-- ----------------------------
DROP TABLE IF EXISTS `t_ionic_user_role`;
CREATE TABLE `t_ionic_user_role` (
	`id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
	`user_id` bigint(20) NOT NULL COMMENT '用户ID',
	`role_id` bigint(20) NOT NULL COMMENT '角色ID',
	`create_user` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '记录创建者',
	`create_time` bigint(20) DEFAULT NULL COMMENT '记录创建日期',
	`update_user` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '最后更新者',
	`update_time` bigint(20) DEFAULT NULL COMMENT '最后更新日期',
	PRIMARY KEY (`id`)
) ENGINE=`InnoDB` AUTO_INCREMENT=1 DEFAULT CHARACTER SET utf8 COLLATE utf8_bin ROW_FORMAT=COMPACT COMMENT='用户角色信息表' CHECKSUM=0 DELAY_KEY_WRITE=0;

SET FOREIGN_KEY_CHECKS = 1;
