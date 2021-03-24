/*
 Navicat Premium Data Transfer

 Source Server         : 本地MYSQL
 Source Server Type    : MySQL
 Source Server Version : 80020
 Source Host           : localhost:3306
 Source Schema         : db_hxpay

 Target Server Type    : MySQL
 Target Server Version : 80020
 File Encoding         : 65001

 Date: 24/03/2021 08:15:23
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for hx_component_account
-- ----------------------------
DROP TABLE IF EXISTS `hx_component_account`;
CREATE TABLE `hx_component_account`  (
  `id` bigint(0) UNSIGNED NOT NULL COMMENT '主键',
  `username` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '登录账号',
  `password` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '登录密码',
  `pay_password` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '支付密码',
  `is_admin` bit(1) NOT NULL COMMENT '是否管理员',
  `open_id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '对外开放ID',
  `origin` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '所属平台',
  `status` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '帐号状态',
  `type` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '账号类型',
  `created_time` datetime(6) NULL DEFAULT NULL COMMENT '创建时间',
  `modified_time` datetime(6) NULL DEFAULT NULL COMMENT '修改时间',
  `version` bigint(0) UNSIGNED NULL DEFAULT NULL COMMENT '版本',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '账号表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for hx_component_account_info
-- ----------------------------
DROP TABLE IF EXISTS `hx_component_account_info`;
CREATE TABLE `hx_component_account_info`  (
  `id` bigint(0) UNSIGNED NOT NULL COMMENT '主键',
  `e_account_id` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT 'E签保账户ID',
  `card_no` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '身份证号码',
  `hand_card_no_img` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '手持身份证地址',
  `card_no_back_img` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '身份证反面地址',
  `card_no_img` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '身份证正面地址',
  `certification` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '是否实名认证',
  `email` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `icon` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '头像',
  `init_status` bit(1) NULL DEFAULT NULL COMMENT '新建标识',
  `mobile` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '手机号码',
  `qq` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT 'QQ号码',
  `realname` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '真实姓名',
  `remark` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注信息',
  `seal_data` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '印章信息',
  `account_id` bigint(0) UNSIGNED NULL DEFAULT NULL COMMENT '关联账号表外键',
  `created_time` datetime(6) NULL DEFAULT NULL COMMENT '创建时间',
  `modified_time` datetime(6) NULL DEFAULT NULL COMMENT '修改时间',
  `version` bigint(0) UNSIGNED NULL DEFAULT NULL COMMENT '版本',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '账号信息详情表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for hx_component_bloc
-- ----------------------------
DROP TABLE IF EXISTS `hx_component_bloc`;
CREATE TABLE `hx_component_bloc`  (
  `id` bigint(0) UNSIGNED NOT NULL COMMENT '主键',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '集团名称',
  `created_time` datetime(6) NULL DEFAULT NULL COMMENT '创建时间',
  `modified_time` datetime(6) NULL DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '集团表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for hx_component_client
-- ----------------------------
DROP TABLE IF EXISTS `hx_component_client`;
CREATE TABLE `hx_component_client`  (
  `id` bigint(0) UNSIGNED NOT NULL COMMENT '主键',
  `name` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '客户名称',
  `number` bigint(0) UNSIGNED NULL DEFAULT NULL COMMENT '客户编号',
  `phone` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '手机号',
  `status` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '客户状态',
  `bank_account` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '银行账号',
  `bank_name` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '银行名称',
  `bizlic_no` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '税务识别号',
  `contact_email` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '联系人邮箱',
  `contact_mobile` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '联系人电话',
  `contact_name` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '联系人姓名',
  `invoice_content` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '开票内容',
  `abbreviate` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '缩写编号',
  `address` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '客户地址',
  `bloc_id` bigint(0) UNSIGNED NULL DEFAULT NULL COMMENT '关联集团外键',
  `created_time` datetime(6) NULL DEFAULT NULL COMMENT '创建时间',
  `modified_time` datetime(6) NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '客户信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for hx_component_company
-- ----------------------------
DROP TABLE IF EXISTS `hx_component_company`;
CREATE TABLE `hx_component_company`  (
  `id` bigint(0) UNSIGNED NOT NULL COMMENT '主键',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '公司名称',
  `area` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '地址',
  `biz_lic_no` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '印业执照编号',
  `contact_email` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '联系人邮箱',
  `contact_mobile` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '联系人电话',
  `contact_name` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '联系人姓名',
  `declaration_type` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '申报类型',
  `business_tax_formula` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '缴税计算公式',
  `individual_tax_formula` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '门征个人缴税计算公式',
  `return_tax_formula` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '税返计算公式',
  `invoice_notify_mobile` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '开票上限通知手机号',
  `month_invoice_count` bigint(0) NULL DEFAULT NULL COMMENT '月开票数量上限',
  `month_invoice_warning_amount` decimal(19, 2) NULL DEFAULT NULL COMMENT '月开票金额报警阈值',
  `month_invoice_warning_count` bigint(0) NULL DEFAULT NULL COMMENT '月开票数量报警阈值',
  `personal_month_pay_amount_max` decimal(19, 2) NULL DEFAULT NULL COMMENT '个人月代发金额上限',
  `personal_year_pay_amount_max` decimal(19, 2) NULL DEFAULT NULL COMMENT '个人年代发金额上限',
  `single_invoice_amount` decimal(19, 2) NULL DEFAULT NULL COMMENT '单张票额',
  `is_stop` bit(1) NULL DEFAULT NULL COMMENT '逻辑停用标识',
  `is_check_mobile` bit(1) NULL DEFAULT NULL COMMENT '是否校验手机号',
  `created_time` datetime(6) NULL DEFAULT NULL COMMENT '创建时间',
  `modified_time` datetime(6) NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '公司信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for hx_component_company_paychannel
-- ----------------------------
DROP TABLE IF EXISTS `hx_component_company_paychannel`;
CREATE TABLE `hx_component_company_paychannel`  (
  `id` bigint(0) UNSIGNED NOT NULL COMMENT '主键',
  `is_deleted` bit(1) NULL DEFAULT NULL COMMENT '逻辑删除标识',
  `type` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '代发渠道',
  `company_id` bigint(0) UNSIGNED NULL DEFAULT NULL COMMENT '公司外键',
  `created_time` datetime(6) NULL DEFAULT NULL COMMENT '创建时间',
  `modified_time` datetime(6) NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '公司配置代发渠道表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for hx_component_project
-- ----------------------------
DROP TABLE IF EXISTS `hx_component_project`;
CREATE TABLE `hx_component_project`  (
  `id` bigint(0) UNSIGNED NOT NULL COMMENT '主键',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '项目名称',
  `number` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '项目编号',
  `merchant_code` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '系统API配置KEY',
  `merchant_secret` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '系统API配置密钥',
  `pay_open_id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '网商支付ID',
  `scopes` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '项目备注权限',
  `status` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '状态',
  `account_id` bigint(0) UNSIGNED NULL DEFAULT NULL COMMENT '外键',
  `client_id` bigint(0) UNSIGNED NULL DEFAULT NULL COMMENT '外键',
  `contract_id` bigint(0) UNSIGNED NULL DEFAULT NULL COMMENT '外键',
  `sign_flag` bit(1) NULL DEFAULT NULL COMMENT '是否必签约',
  `before_ticket_flag` bit(1) NULL DEFAULT NULL COMMENT '是否预开票',
  `content_ticket` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '开票内容',
  `qr_code_img` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '二维码',
  `import_flag` bit(1) NULL DEFAULT NULL COMMENT '导入权限',
  `created_time` datetime(6) NULL DEFAULT NULL COMMENT '创建时间',
  `modified_time` datetime(6) NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '项目信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for hx_component_project_contract
-- ----------------------------
DROP TABLE IF EXISTS `hx_component_project_contract`;
CREATE TABLE `hx_component_project_contract`  (
  `id` bigint(0) UNSIGNED NOT NULL COMMENT '主键',
  `contract_no` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '合同编号',
  `contract_url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '合同地址',
  `bill_comprises` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '账单组成',
  `agreement_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT 'C端协议名称',
  `agreement_path` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT 'C端协议地址',
  `agreement_url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT 'C端协议路径',
  `customer_ratio` decimal(19, 2) NULL DEFAULT NULL COMMENT '客户奖励比例',
  `express_address_id` bigint(0) UNSIGNED NULL DEFAULT NULL COMMENT '快递ID',
  `is_risk_control` bit(1) NULL DEFAULT NULL COMMENT '是否开启风控',
  `month_closing` bit(1) NULL DEFAULT NULL COMMENT '是否月结',
  `pay_model` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '代发录入金额类型',
  `poundage_status` bit(1) NULL DEFAULT NULL COMMENT '是否收手续费',
  `toll_process` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '开票类型',
  `project_id` bigint(0) UNSIGNED NULL DEFAULT NULL COMMENT '项目ID',
  `return_ratio` decimal(19, 2) NULL DEFAULT NULL COMMENT '合同奖励比例',
  `return_status` bit(1) NOT NULL COMMENT '是否奖励',
  `start_date` date NULL DEFAULT NULL COMMENT '项目合同有效日期',
  `end_date` date NULL DEFAULT NULL COMMENT '项目合同有效日期',
  `status` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '状态',
  `total_tax_status` bit(1) NOT NULL COMMENT '门征税金',
  `company_id` bigint(0) UNSIGNED NULL DEFAULT NULL COMMENT '外键',
  `ebank_account_id` bigint(0) UNSIGNED NULL DEFAULT NULL COMMENT '外键',
  `pay_warning` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '代发限制处理',
  `sign_type` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '签约类型',
  `created_time` datetime(6) NULL DEFAULT NULL COMMENT '创建时间',
  `modified_time` datetime(6) NULL DEFAULT NULL COMMENT '更新时间',
  `version` bigint(0) UNSIGNED NULL DEFAULT NULL COMMENT '版本',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '项目合同信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for hx_component_toll_batch
-- ----------------------------
DROP TABLE IF EXISTS `hx_component_toll_batch`;
CREATE TABLE `hx_component_toll_batch`  (
  `id` bigint(0) UNSIGNED NOT NULL COMMENT '主键',
  `batch_no` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '批次号',
  `realpay` decimal(19, 2) NULL DEFAULT NULL COMMENT '开票总额',
  `expspay` decimal(19, 2) NULL DEFAULT NULL COMMENT '实发总额',
  `channel_code` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '导入渠道;MANAGER(管理端)\r\nWEB(B端)\r\nAPI(API)',
  `construction_tax` decimal(19, 2) NULL DEFAULT NULL COMMENT '城建税总额',
  `is_deleted` bit(1) NULL DEFAULT NULL COMMENT '逻辑删除标识',
  `education_attach_tax` decimal(19, 2) NULL DEFAULT NULL COMMENT '教育附加税率总额',
  `bill_total_tax` decimal(19, 2) NULL DEFAULT NULL COMMENT '佣金税金合计;税总额',
  `invoice_tax` decimal(19, 2) NULL DEFAULT NULL COMMENT '公司开票税金',
  `other_surtax` decimal(19, 2) NULL DEFAULT NULL COMMENT '其它附加税总额',
  `pay_channel` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '代发渠道;CMBEBANK(招商银行)\r\nMYBANK(网商银行)\r\nQPAY(QQ钱包)\r\nEPAY(网易宝)\r\nOFFLINE(线下代发)',
  `pertax` decimal(19, 2) NULL DEFAULT NULL COMMENT '个税总额',
  `poundage` decimal(10, 0) NULL DEFAULT NULL COMMENT '手续费',
  `receivable` decimal(10, 0) NULL DEFAULT NULL COMMENT '账单应收合计',
  `remark` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注信息',
  `service_and_tax_amount` decimal(19, 2) NULL DEFAULT NULL COMMENT '服务费及税金',
  `service_charge` decimal(19, 2) NULL DEFAULT NULL COMMENT '服务费总额',
  `step` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '数据类型;TEST(测算)\r\nREGULAR(正式)',
  `success_amount` decimal(19, 2) NULL DEFAULT NULL COMMENT '成功总金额',
  `success_count` bigint(0) NULL DEFAULT NULL COMMENT '成功总笔数',
  `total_amount` decimal(19, 2) NULL DEFAULT NULL COMMENT '总金额',
  `total_count` bigint(0) NULL DEFAULT NULL COMMENT '总笔数',
  `tax_attach` decimal(19, 2) NULL DEFAULT NULL COMMENT '地方教育附加总额',
  `total_tax` decimal(19, 2) NULL DEFAULT NULL COMMENT '税费总额',
  `vatax` decimal(19, 2) NULL DEFAULT NULL COMMENT '增值税总额',
  `bill_id` bigint(0) UNSIGNED NULL DEFAULT NULL COMMENT '账单外键;关联账单信息ID',
  `flow_id` bigint(0) UNSIGNED NULL DEFAULT NULL COMMENT '流程外键;关联流程状态ID',
  `project_id` bigint(0) UNSIGNED NULL DEFAULT NULL COMMENT '项目外键',
  `contract_id` bigint(0) UNSIGNED NULL DEFAULT NULL COMMENT ' 项目合同外键',
  `belong_date` date NULL DEFAULT NULL COMMENT '所属月份',
  `created_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `modified_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for hx_component_toll_batch_flow
-- ----------------------------
DROP TABLE IF EXISTS `hx_component_toll_batch_flow`;
CREATE TABLE `hx_component_toll_batch_flow`  (
  `id` bigint(0) UNSIGNED NOT NULL COMMENT '主键',
  `remark` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `state` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '综合状态；PAY_PENDING(待付款)\r\nPAY_SUCCESS(已完成)\r\nPAY_FAIL(部分完成)',
  `status` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '流程状态；INIT(导入)\r\nPAY_HANDLE(待付款)\r\nPAY_CHECKING(待审核)\r\nPAY_CHECKING_FAIL(驳回)\r\nPAID(正在代发)\r\nREHANDLE_PAID(正在重发)\r\nREHANDLE_PREPARE(重发待审核)\r\nREHANDLE_CHECKING_FAIL(重发驳回)\r\nREHANDLE_CHECKING_SUCCESS(重发待付款)\r\nPAY_FAIL(部分完成)\r\nPAY_SUCCESS(已完成)',
  `batch_id` bigint(0) UNSIGNED NULL DEFAULT NULL COMMENT '批次外键',
  `created_user_id` bigint(0) UNSIGNED NULL DEFAULT NULL COMMENT '操作账户ID',
  `created_user_name` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '操作账户姓名',
  `created_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `modified_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for hx_component_toll_order
-- ----------------------------
DROP TABLE IF EXISTS `hx_component_toll_order`;
CREATE TABLE `hx_component_toll_order`  (
  `id` bigint(0) UNSIGNED NOT NULL COMMENT '主键',
  `order_no` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单号',
  `bank_account` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '银行账号',
  `bank_card_location` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '银行卡归属地',
  `bank_name` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '银行名称',
  `expspay` decimal(19, 2) NULL DEFAULT NULL COMMENT '实发金额',
  `realpay` decimal(19, 2) NULL DEFAULT NULL COMMENT '应发金额',
  `construction_tax` decimal(19, 2) NULL DEFAULT NULL COMMENT '应发金额',
  `education_attach_tax` decimal(19, 2) NULL DEFAULT NULL COMMENT '教育附加税',
  `other_surtax` decimal(19, 2) NULL DEFAULT NULL COMMENT '其他附加税',
  `pertax` decimal(19, 2) NULL DEFAULT NULL COMMENT '个税',
  `tax_attach` decimal(19, 2) NULL DEFAULT NULL COMMENT '地方教育附加税',
  `vatax` decimal(19, 2) NULL DEFAULT NULL COMMENT '增值税',
  `invoice_tax` decimal(19, 2) NULL DEFAULT NULL COMMENT '开票税金',
  `poundage` decimal(10, 0) NULL DEFAULT NULL COMMENT '手续费',
  `receivable` decimal(19, 2) NULL DEFAULT NULL COMMENT '账单应收合计',
  `service_charge` decimal(19, 2) NULL DEFAULT NULL COMMENT '服务费',
  `surtax` decimal(19, 2) NULL DEFAULT NULL COMMENT '附加费',
  `total_tax` decimal(19, 2) NULL DEFAULT NULL COMMENT '税费总额',
  `status` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '导入状态',
  `order_status` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '代发状态',
  `final_status` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '对账状态',
  `order_reason` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '代发信息说明',
  `model` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '代发方式;EXPSPAY(佣金实发)\r\nREALPAY(佣金应发)\r\nBILLPAY(账单金额)',
  `sub_branch` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '银行支行',
  `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注信息',
  `memo` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注信息;手动通过备注',
  `trans_no` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '三方平台交易号',
  `bill_flow_id` bigint(0) UNSIGNED NULL DEFAULT NULL COMMENT '关联账单流水ID',
  `bill_status` bit(1) NULL DEFAULT NULL COMMENT '出账标记',
  `delete_status` bit(1) NULL DEFAULT NULL COMMENT '逻辑删除标识',
  `order_fail_status` bit(1) NULL DEFAULT NULL COMMENT '手动标记失败状态',
  `refund` bit(1) NULL DEFAULT NULL COMMENT '待退款标志',
  `sign` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '出账修改状态;UPDATE(修改处理)\r\nSUCCESS(已出账处理)',
  `batch_id` bigint(0) UNSIGNED NULL DEFAULT NULL COMMENT '批次外键',
  `customer_id` bigint(0) UNSIGNED NULL DEFAULT NULL COMMENT '代发客户外键',
  `created_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `modified_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for hx_component_wallet
-- ----------------------------
DROP TABLE IF EXISTS `hx_component_wallet`;
CREATE TABLE `hx_component_wallet`  (
  `id` bigint(0) UNSIGNED NOT NULL COMMENT '主键',
  `balance` decimal(19, 2) NULL DEFAULT NULL COMMENT '余额',
  `frozen_balance` decimal(19, 2) NULL DEFAULT NULL COMMENT '冻结资金',
  `remark` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注信息',
  `reward` decimal(10, 2) NULL DEFAULT NULL COMMENT '奖励金额',
  `project_id` bigint(0) UNSIGNED NULL DEFAULT NULL COMMENT '项目外键',
  `created_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `modified_time` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '钱包表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for hx_component_wallet_flow
-- ----------------------------
DROP TABLE IF EXISTS `hx_component_wallet_flow`;
CREATE TABLE `hx_component_wallet_flow`  (
  `id` bigint(0) UNSIGNED NOT NULL COMMENT '主键',
  `amount` decimal(19, 2) NULL DEFAULT NULL COMMENT '交易金额',
  `associated_id` bigint(0) UNSIGNED NULL DEFAULT NULL COMMENT '业务关联ID',
  `balance` decimal(19, 2) NULL DEFAULT NULL COMMENT '余额',
  `bill_status` bit(1) NULL DEFAULT NULL COMMENT '出账标记',
  `flow_no` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '流水号',
  `operator` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '操作人',
  `remark` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注信息',
  `status` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '交易状态',
  `type` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '交易类型',
  `project_id` bigint(0) UNSIGNED NULL DEFAULT NULL COMMENT '项目外键',
  `created_time` datetime(6) NULL DEFAULT NULL COMMENT '创建时间',
  `modified_time` datetime(6) NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '钱包流水表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for hx_customer
-- ----------------------------
DROP TABLE IF EXISTS `hx_customer`;
CREATE TABLE `hx_customer`  (
  `id` bigint(0) UNSIGNED NOT NULL COMMENT '主键',
  `qq` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'QQ号码',
  `e_account_id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'E签宝用户ID',
  `card_no_back_img` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '身份证反面地址',
  `card_no_img` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '身份证正面地址',
  `cert_no` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '身份证号码',
  `mobile` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '手机号码',
  `open_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '对外开放ID',
  `papers_type` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '证件类型;ID_CARD(身份证)\r\nPASSPORT(护照)',
  `realname` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '真实姓名',
  `seal_data` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '印章信息',
  `created_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `modified_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
