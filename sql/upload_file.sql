/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50724
 Source Host           : localhost:3306
 Source Schema         : spring-boot-upload

 Target Server Type    : MySQL
 Target Server Version : 50724
 File Encoding         : 65001

 Date: 29/12/2020 12:59:09
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for upload_file
-- ----------------------------
DROP TABLE IF EXISTS `upload_file`;
CREATE TABLE `upload_file`  (
  `upload_file_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '上传文件表 主键',
  `upload_file_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '上传文件名',
  `upload_file_blob` longblob NULL COMMENT '上传文件内容',
  `upload_file_type` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '上传文件类型',
  `upload_file_size` int(11) NULL DEFAULT NULL COMMENT '上传文件大小，单位：B',
  PRIMARY KEY (`upload_file_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '上传文件表' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
