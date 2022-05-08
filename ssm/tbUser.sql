/*
  Navicat Premium Data Transfer

  Source Server         : ssm
  Source Server Type    : MySQL
  Source Server Version : 80011
  Source Host           : localhost:3306
  Source Schema         : ssm

  Target Server Type    : MySQL
  Target Server Version : 80011
  File Encoding         : 65001

  Date: 02/08/2019 08:24:19
 */

SET NAMES utf8mb4;
SET
FOREIGN_KEY_CHECKS = 0;

 -- ----------------------------
 -- Table structure for tbuser
 -- ----------------------------
DROP TABLE IF EXISTS `tbuser`;
CREATE TABLE `tbuser`
(
    `id`       int(11) NOT NULL AUTO_INCREMENT,
    `uId`      varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
    `userName` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
    `password` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
    `uName`    varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
    `age`      int(11) NULL DEFAULT NULL,
    `sex`      int(11) NULL DEFAULT NULL,
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 19 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET
FOREIGN_KEY_CHECKS = 1;

