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

  Date: 05/08/2019 16:44:14
 */

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tbsyslog
-- ----------------------------
DROP TABLE IF EXISTS `tbsyslog`;
CREATE TABLE `tbsyslog`
(
    `id`              int(11)                                                 NOT NULL AUTO_INCREMENT,
    `logId`           varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci  NULL DEFAULT NULL,
    `accessDate`      datetime(0)                                             NULL DEFAULT NULL,
    `requestType`     varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci  NULL DEFAULT NULL,
    `accessInterface` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
    `interfaceParams` text CHARACTER SET utf8 COLLATE utf8_general_ci         NULL,
    `accessSource`    varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci  NULL DEFAULT NULL,
    `accessIp`        varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci  NULL DEFAULT NULL,
    `executeTime`     int(11)                                                 NULL DEFAULT NULL,
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB
  AUTO_INCREMENT = 761
  CHARACTER SET = utf8
  COLLATE = utf8_general_ci
  ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;

