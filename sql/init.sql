-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        5.5.47-MariaDB - mariadb.org binary distribution
-- 服务器操作系统:                      Win64
-- HeidiSQL 版本:                  9.1.0.4867
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT = @@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS = @@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS = 0 */;
/*!40101 SET @OLD_SQL_MODE = @@SQL_MODE, SQL_MODE = 'NO_AUTO_VALUE_ON_ZERO' */;


-- 导出  表 .all_message 结构
CREATE TABLE IF NOT EXISTS `all_message`
(
    `time`        bigint(20)                          NOT NULL,
    `id`          int(11)                             NOT NULL,
    `internal_id` int(11)                             NOT NULL,
    `sender_id`   bigint(20)                          NOT NULL,
    `bot_id`      bigint(20)                          NOT NULL,
    `type`        text                                NOT NULL,
    `from_id`     bigint(20)                          NOT NULL,
    `content`     varchar(4096) CHARACTER SET utf8mb4 NOT NULL COMMENT '内容',
    `recalled`    int(11)                             NOT NULL DEFAULT '0'
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;


-- 导出  表 .achievement 结构
CREATE TABLE IF NOT EXISTS `achievement`
(
    `id`   int(11)    NOT NULL AUTO_INCREMENT,
    `aid`  int(11)    NOT NULL COMMENT '成就id',
    `qid`  bigint(20) NOT NULL COMMENT '领取人id',
    `time` bigint(20) NOT NULL COMMENT '时间',
    PRIMARY KEY (`id`),
    KEY `id` (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8 COMMENT ='成就领取mydb1记录';

-- 正在导出表  .achievement 的数据：~0 rows (大约)
DELETE
FROM `achievement`;
/*!40000 ALTER TABLE `achievement`
    DISABLE KEYS */;
/*!40000 ALTER TABLE `achievement`
    ENABLE KEYS */;


-- 导出  表 .aq_bag 结构
CREATE TABLE IF NOT EXISTS `aq_bag`
(
    `id`    int(11)    NOT NULL AUTO_INCREMENT,
    `oid`   int(11)    NOT NULL,
    `qid`   bigint(20) NOT NULL,
    `num`   int(11)    NOT NULL,
    `time`  bigint(20) NOT NULL,
    `state` int(11)    NOT NULL DEFAULT '0',
    PRIMARY KEY (`id`),
    KEY `id` (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

-- 正在导出表  .aq_bag 的数据：~0 rows (大约)
DELETE
FROM `aq_bag`;
/*!40000 ALTER TABLE `aq_bag`
    DISABLE KEYS */;
/*!40000 ALTER TABLE `aq_bag`
    ENABLE KEYS */;


-- 导出  表 .auto_reply 结构
CREATE TABLE IF NOT EXISTS `auto_reply`
(
    `id`          int(11)                             NOT NULL AUTO_INCREMENT,
    `gid`         bigint(20)                          NOT NULL DEFAULT '278681553',
    `k`           varchar(1024) CHARACTER SET utf8mb4 NOT NULL DEFAULT '0',
    `v`           varchar(1024) CHARACTER SET utf8mb4 NOT NULL DEFAULT '',
    `who`         varchar(50)                         NOT NULL,
    `time`        varchar(50)                         NOT NULL,
    `delete_stat` int(1) unsigned zerofill            NOT NULL,
    PRIMARY KEY (`id`),
    KEY `id` (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

-- 正在导出表  .auto_reply 的数据：~0 rows (大约)
DELETE
FROM `auto_reply`;
/*!40000 ALTER TABLE `auto_reply`
    DISABLE KEYS */;
/*!40000 ALTER TABLE `auto_reply`
    ENABLE KEYS */;


-- 导出  表 .bag 结构
CREATE TABLE IF NOT EXISTS `bag`
(
    `id`    int(11)     NOT NULL AUTO_INCREMENT COMMENT '主键id',
    `oid`   int(11)     NOT NULL COMMENT '物品ID',
    `qid`   bigint(20)  NOT NULL COMMENT '拥有者ID',
    `time`  bigint(20)  NOT NULL COMMENT '时间',
    `desc`  varchar(50) NOT NULL DEFAULT '无描述' COMMENT '描述',
    `state` int(11)     NOT NULL DEFAULT '0' COMMENT '1 已失效',
    PRIMARY KEY (`id`),
    KEY `id` (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8 COMMENT ='玩家背包库';

-- 正在导出表  .bag 的数据：~0 rows (大约)
DELETE
FROM `bag`;
/*!40000 ALTER TABLE `bag`
    DISABLE KEYS */;
/*!40000 ALTER TABLE `bag`
    ENABLE KEYS */;


-- 导出  表 .father 结构
CREATE TABLE IF NOT EXISTS `father`
(
    `id`         bigint(20)  NOT NULL,
    `permission` varchar(50) NOT NULL DEFAULT 'all',
    UNIQUE KEY `id` (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

-- 正在导出表  .father 的数据：~53 rows (大约)
DELETE
FROM `father`;
/*!40000 ALTER TABLE `father`
    DISABLE KEYS */;

-- 导出  表 .group_conf 结构
CREATE TABLE IF NOT EXISTS `group_conf`
(
    `id`      bigint(18) DEFAULT NULL,
    `open`    tinyint(4) DEFAULT NULL,
    `speak`   tinyint(4) DEFAULT NULL,
    `show`    tinyint(4) DEFAULT NULL,
    `cap`     tinyint(4) DEFAULT NULL,
    `voice_k` tinyint(4) DEFAULT NULL,
    UNIQUE KEY `id` (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

-- 正在导出表  .group_conf 的数据：~0 rows (大约)
DELETE
FROM `group_conf`;
/*!40000 ALTER TABLE `group_conf`
    DISABLE KEYS */;
/*!40000 ALTER TABLE `group_conf`
    ENABLE KEYS */;


-- 导出  表 .g_info 结构
CREATE TABLE IF NOT EXISTS `g_info`
(
    `qid`          bigint(20) NOT NULL,
    `xlc`          int(11)    NOT NULL,
    `joinc`        int(11)    NOT NULL,
    `master_point` int(11)    NOT NULL,
    `gotc`         int(11)    NOT NULL,
    `lostc`        int(11)    NOT NULL,
    `diedc`        int(11)    NOT NULL,
    `useskillc`    int(11)    NOT NULL,
    `star`         int(11)    NOT NULL,
    `reqc`         int(11)    NOT NULL COMMENT '请求支援次数',
    `helpc`        int(11)    NOT NULL COMMENT '支援次数',
    `buyc`         int(11)    NOT NULL COMMENT '购买次数',
    `salec`        int(11)    NOT NULL COMMENT '出售次数',
    `ftc`          int(11)    NOT NULL COMMENT '完成任务次数',
    UNIQUE KEY `qid` (`qid`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

-- 正在导出表  .g_info 的数据：~0 rows (大约)
DELETE
FROM `g_info`;
/*!40000 ALTER TABLE `g_info`
    DISABLE KEYS */;
/*!40000 ALTER TABLE `g_info`
    ENABLE KEYS */;


-- 导出  表 .hhpz 结构
CREATE TABLE IF NOT EXISTS `hhpz`
(
    `id`    int(11)    NOT NULL AUTO_INCREMENT,
    `qid`   bigint(20) NOT NULL,
    `oid`   int(11)    NOT NULL,
    `time`  bigint(20) NOT NULL,
    `state` int(11)    NOT NULL DEFAULT '0',
    `p`     int(11)    NOT NULL DEFAULT '1',
    PRIMARY KEY (`id`),
    KEY `id` (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

-- 正在导出表  .hhpz 的数据：~0 rows (大约)
DELETE
FROM `hhpz`;
/*!40000 ALTER TABLE `hhpz`
    DISABLE KEYS */;
/*!40000 ALTER TABLE `hhpz`
    ENABLE KEYS */;


-- 导出  表 .killc 结构
CREATE TABLE IF NOT EXISTS `killc`
(
    `id`  bigint(20) NOT NULL,
    `num` int(11)    NOT NULL DEFAULT '0',
    UNIQUE KEY `id` (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

-- 正在导出表  .killc 的数据：~0 rows (大约)
DELETE
FROM `killc`;
/*!40000 ALTER TABLE `killc`
    DISABLE KEYS */;
/*!40000 ALTER TABLE `killc`
    ENABLE KEYS */;


-- 导出  表 .person_info 结构
CREATE TABLE IF NOT EXISTS `person_info`
(
    `name`          varchar(255) NOT NULL,
    `gold`          bigint(18)   NOT NULL,
    `help_toc`      int(9)       NOT NULL,
    `help_c`        int(9)       NOT NULL,
    `buy_help_c`    int(9)       NOT NULL,
    `buy_help_to_c` int(9)       NOT NULL,
    `k1`            bigint(18)   NOT NULL,
    `k2`            bigint(18)   NOT NULL,
    `gk1`           bigint(18)   NOT NULL,
    `uk1`           bigint(18)   NOT NULL,
    `jk1`           bigint(18)   NOT NULL,
    `cbk1`          bigint(18)   NOT NULL,
    `mk1`           bigint(18)   NOT NULL,
    `ak1`           bigint(18)   NOT NULL,
    `jak1`          bigint(18)   NOT NULL,
    `usinged`       varchar(255) NOT NULL DEFAULT 'null',
    `next_r1`       int(9)       NOT NULL,
    `next_r2`       int(9)       NOT NULL,
    `next_r3`       int(9)       NOT NULL,
    `sname`         varchar(255) NOT NULL,
    `my_tag`        varchar(255) NOT NULL,
    `died`          tinyint(4)   NOT NULL,
    `downed`        tinyint(4)   NOT NULL,
    `dt1`           bigint(18)   NOT NULL,
    `temp`          tinyint(4)   NOT NULL,
    `win_c`         int(9)       NOT NULL,
    `bg`            tinyint(4)   NOT NULL,
    `bgk`           bigint(20)   NOT NULL,
    `p`             int(11)      NOT NULL DEFAULT '1' COMMENT '武魂信息指向',
    UNIQUE KEY `name` (`name`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

-- 正在导出表  .person_info 的数据：~0 rows (大约)
DELETE
FROM `person_info`;
/*!40000 ALTER TABLE `person_info`
    DISABLE KEYS */;
/*!40000 ALTER TABLE `person_info`
    ENABLE KEYS */;


-- 导出  表 .raffle 结构
CREATE TABLE IF NOT EXISTS `raffle`
(
    `qid` bigint(20) NOT NULL,
    `c1`  int(11)    NOT NULL DEFAULT '0',
    `c2`  int(11)    NOT NULL DEFAULT '0',
    UNIQUE KEY `qid` (`qid`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8 COMMENT ='抽奖记录';

-- 正在导出表  .raffle 的数据：~0 rows (大约)
DELETE
FROM `raffle`;
/*!40000 ALTER TABLE `raffle`
    DISABLE KEYS */;
/*!40000 ALTER TABLE `raffle`
    ENABLE KEYS */;


-- 导出  表 .shop_item 结构
CREATE TABLE IF NOT EXISTS `shop_item`
(
    `id`      int(9)     NOT NULL,
    `state`   int(1)     NOT NULL DEFAULT '0' COMMENT '1 deleted',
    `who`     bigint(20) NOT NULL,
    `item_id` int(9)     NOT NULL,
    `num`     int(9)     NOT NULL,
    `time`    bigint(20) NOT NULL,
    `price`   bigint(20) NOT NULL,
    UNIQUE KEY `id` (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

-- 正在导出表  .shop_item 的数据：~0 rows (大约)
DELETE
FROM `shop_item`;
/*!40000 ALTER TABLE `shop_item`
    DISABLE KEYS */;
/*!40000 ALTER TABLE `shop_item`
    ENABLE KEYS */;


-- 导出  表 .signlist 结构
CREATE TABLE IF NOT EXISTS `signlist`
(
    `id`   int(11)     NOT NULL AUTO_INCREMENT,
    `qid`  bigint(20)  NOT NULL,
    `day`  varchar(50) NOT NULL,
    `time` bigint(20)  NOT NULL,
    PRIMARY KEY (`id`),
    KEY `id` (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

-- 正在导出表  .signlist 的数据：~0 rows (大约)
DELETE
FROM `signlist`;
/*!40000 ALTER TABLE `signlist`
    DISABLE KEYS */;
/*!40000 ALTER TABLE `signlist`
    ENABLE KEYS */;


-- 导出  表 .skill_info 结构
CREATE TABLE IF NOT EXISTS `skill_info`
(
    `qq`          bigint(18)   NOT NULL,
    `uuid`        varchar(255) NOT NULL,
    `name`        varchar(255) NOT NULL DEFAULT '',
    `st`          int(9)       NOT NULL,
    `id`          int(9)       NOT NULL,
    `jid`         int(9)       NOT NULL,
    `add_percent` int(9)       NOT NULL,
    `use_percent` int(9)       NOT NULL,
    `time`        bigint(18)   NOT NULL,
    `time_l`      bigint(18)   NOT NULL,
    `md_time`     bigint(18)   NOT NULL,
    `state`       int(9)       NOT NULL,
    `p`           int(11)      NOT NULL DEFAULT '1',
    UNIQUE KEY `u_u_i_d` (`uuid`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

-- 正在导出表  .skill_info 的数据：~0 rows (大约)
DELETE
FROM `skill_info`;
/*!40000 ALTER TABLE `skill_info`
    DISABLE KEYS */;
/*!40000 ALTER TABLE `skill_info`
    ENABLE KEYS */;


-- 导出  表 .soul_attribute 结构
CREATE TABLE IF NOT EXISTS `soul_attribute`
(
    `wh`          int(9)  NOT NULL,
    `hp_chance`   int(9)  NOT NULL,
    `hl_chance`   int(9)  NOT NULL,
    `hj_chance`   int(9)  NOT NULL,
    `hp_effect`   int(9)  NOT NULL,
    `hl_effect`   int(9)  NOT NULL,
    `hj_effect`   int(9)  NOT NULL,
    `hide_chance` int(11) NOT NULL,
    UNIQUE KEY `wh` (`wh`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

-- 正在导出表  .soul_attribute 的数据：~0 rows (大约)
DELETE
FROM `soul_attribute`;
/*!40000 ALTER TABLE `soul_attribute`
    DISABLE KEYS */;
INSERT INTO `soul_attribute` (`wh`, `hp_chance`, `hl_chance`, `hj_chance`, `hp_effect`, `hl_effect`, `hj_effect`,
                              `hide_chance`)
VALUES (1, 0, 0, 0, 10, 10, 10, 5),
       (2, 0, 0, 0, 10, 10, 10, 0),
       (3, 0, 5, 0, 10, 15, 10, 0),
       (4, 0, 0, 5, 10, 10, 10, 0),
       (5, 5, 5, 0, 10, 10, 10, 0),
       (6, 0, 0, 0, 10, 10, 10, 5),
       (7, 0, 0, 0, 10, 10, 10, 0),
       (8, 0, 0, 0, 10, 10, 10, 0),
       (9, 0, 0, 0, 10, 10, 10, 0),
       (10, 0, 0, 0, 10, 10, 10, 0),
       (11, 0, 4, 0, 10, 10, 10, 0),
       (12, 0, 0, 0, 10, 10, 10, 0),
       (13, 0, 0, 0, 10, 10, 10, 0),
       (14, 0, 0, 0, 10, 10, 10, 0),
       (15, 0, 0, 0, 10, 10, 10, 0),
       (16, 0, 3, 0, 10, 10, 10, 0),
       (17, 0, 3, 0, 10, 10, 10, 0),
       (18, 0, 0, 0, 10, 10, 10, 0),
       (19, 5, 0, 0, 10, 10, 10, 0),
       (20, 5, 0, 0, 25, 10, 10, 0),
       (21, 0, 0, 0, 10, 10, 10, 10),
       (22, 0, 5, 0, 10, 10, 10, 6),
       (23, 0, 0, 5, 10, 10, 10, 5),
       (24, 0, 0, 0, 10, 10, 14, 0),
       (25, 0, 0, 0, 10, 10, 10, 3),
       (26, 0, 5, 0, 10, 10, 10, 0),
       (27, 0, 0, 0, 10, 10, 10, 0),
       (28, 0, 0, 0, 10, 10, 10, 0),
       (29, 0, 0, 0, 10, 10, 10, 0),
       (30, 0, 0, 0, 10, 10, 14, 0),
       (31, 0, 0, 0, 10, 10, 10, 0),
       (50, 10, 10, 10, 20, 10, 15, 5);
/*!40000 ALTER TABLE `soul_attribute`
    ENABLE KEYS */;


-- 导出  表 .soul_bone 结构
CREATE TABLE IF NOT EXISTS `soul_bone`
(
    `qid`   bigint(18)   NOT NULL,
    `type`  varchar(255) NOT NULL,
    `value` int(9)       NOT NULL,
    `oid`   int(9)       NOT NULL,
    `time`  bigint(20)   NOT NULL
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

-- 正在导出表  .soul_bone 的数据：~0 rows (大约)
DELETE
FROM `soul_bone`;
/*!40000 ALTER TABLE `soul_bone`
    DISABLE KEYS */;
/*!40000 ALTER TABLE `soul_bone`
    ENABLE KEYS */;


-- 导出  表 .task_point 结构
CREATE TABLE IF NOT EXISTS `task_point`
(
    `q`              bigint(18) NOT NULL,
    `prentice_index` int(9)     NOT NULL,
    `master_index`   int(9)     NOT NULL,
    `normal_index`   int(9)     NOT NULL,
    `expert_index`   int(9)     NOT NULL,
    `next_can`       bigint(18) NOT NULL,
    UNIQUE KEY `q` (`q`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

-- 正在导出表  .task_point 的数据：~0 rows (大约)
DELETE
FROM `task_point`;
/*!40000 ALTER TABLE `task_point`
    DISABLE KEYS */;
/*!40000 ALTER TABLE `task_point`
    ENABLE KEYS */;


-- 导出  表 .trading_record 结构
CREATE TABLE IF NOT EXISTS `trading_record`
(
    `type0` varchar(255) NOT NULL,
    `type1` varchar(255) NOT NULL,
    `from`  bigint(20)   NOT NULL,
    `to`    bigint(20)   NOT NULL,
    `main`  bigint(20)   NOT NULL,
    `now`   int(18)      NOT NULL,
    `many`  int(18)      NOT NULL,
    `desc`  varchar(255) NOT NULL,
    `time`  bigint(20)   NOT NULL
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

-- 正在导出表  .trading_record 的数据：~0 rows (大约)
DELETE
FROM `trading_record`;
/*!40000 ALTER TABLE `trading_record`
    DISABLE KEYS */;
/*!40000 ALTER TABLE `trading_record`
    ENABLE KEYS */;


-- 导出  表 .upup 结构
CREATE TABLE IF NOT EXISTS `upup`
(
    `qid`   bigint(20) NOT NULL,
    `level` int(11)    NOT NULL,
    `state` int(11)    NOT NULL DEFAULT '0',
    `p`     int(11)    NOT NULL DEFAULT '1'
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

-- 正在导出表  .upup 的数据：~0 rows (大约)
DELETE
FROM `upup`;
/*!40000 ALTER TABLE `upup`
    DISABLE KEYS */;
/*!40000 ALTER TABLE `upup`
    ENABLE KEYS */;


-- 导出  表 .user_score 结构
CREATE TABLE IF NOT EXISTS `user_score`
(
    `who`       bigint(20) NOT NULL,
    `day`       int(11)    NOT NULL DEFAULT '0',
    `days`      int(11)    NOT NULL DEFAULT '0',
    `fz`        int(11)    NOT NULL DEFAULT '0',
    `k`         bigint(20) NOT NULL DEFAULT '0',
    `score`     bigint(20) NOT NULL DEFAULT '0',
    `s_score`   bigint(20) NOT NULL DEFAULT '0',
    `times`     int(11)    NOT NULL DEFAULT '0',
    `times_day` int(11)    NOT NULL DEFAULT '0',
    `s_times`   int(11)    NOT NULL DEFAULT '0',
    `earnings`  bigint(20) NOT NULL DEFAULT '0',
    `debuffs`   bigint(20) NOT NULL DEFAULT '0',
    UNIQUE KEY `who` (`who`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8 COMMENT ='用户积分相关信息';

-- 正在导出表  .user_score 的数据：~0 rows (大约)
DELETE
FROM `user_score`;
/*!40000 ALTER TABLE `user_score`
    DISABLE KEYS */;
/*!40000 ALTER TABLE `user_score`
    ENABLE KEYS */;


-- 导出  表 .warp 结构
CREATE TABLE IF NOT EXISTS `warp`
(
    `id`       bigint(18)  DEFAULT NULL,
    `bind_q`   bigint(18)  DEFAULT NULL,
    `master`   bigint(18)  DEFAULT NULL,
    `prentice` varchar(50) DEFAULT NULL,
    UNIQUE KEY `id` (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

-- 正在导出表  .warp 的数据：~0 rows (大约)
DELETE
FROM `warp`;
/*!40000 ALTER TABLE `warp`
    DISABLE KEYS */;
/*!40000 ALTER TABLE `warp`
    ENABLE KEYS */;


-- 导出  表 .wh_info 结构
CREATE TABLE IF NOT EXISTS `wh_info`
(
    `att`     bigint(18) NOT NULL,
    `hl`      bigint(18) NOT NULL,
    `hll`     bigint(18) NOT NULL,
    `hp`      bigint(18) NOT NULL,
    `hpl`     bigint(18) NOT NULL,
    `hj`      bigint(18) NOT NULL,
    `hj_l`    bigint(18) NOT NULL,
    `level`   int(9)     NOT NULL,
    `wh`      int(9)     NOT NULL,
    `wh_type` int(9)     NOT NULL,
    `xp`      bigint(18) NOT NULL,
    `xp_l`    bigint(18) NOT NULL,
    `qid`     bigint(18) NOT NULL,
    `p`       int(9)     NOT NULL
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

-- 正在导出表  .wh_info 的数据：~0 rows (大约)
DELETE
FROM `wh_info`;
/*!40000 ALTER TABLE `wh_info`
    DISABLE KEYS */;
/*!40000 ALTER TABLE `wh_info`
    ENABLE KEYS */;


-- 导出  表 .zon 结构
CREATE TABLE IF NOT EXISTS `zon`
(
    `id`     int(9)     NOT NULL,
    `qq`     bigint(18) NOT NULL,
    `level`  int(9)     NOT NULL,
    `times`  int(9)     NOT NULL,
    `xper`   int(9)     NOT NULL,
    `active` int(11)    NOT NULL COMMENT '活跃点数',
    UNIQUE KEY `qq` (`qq`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

-- 正在导出表  .zon 的数据：~0 rows (大约)
DELETE
FROM `zon`;
/*!40000 ALTER TABLE `zon`
    DISABLE KEYS */;
/*!40000 ALTER TABLE `zon`
    ENABLE KEYS */;


-- 导出  表 .zong 结构
CREATE TABLE IF NOT EXISTS `zong`
(
    `name`      varchar(255) NOT NULL,
    `id`        int(9)       NOT NULL,
    `state`     int(9)       NOT NULL,
    `main`      bigint(18)   NOT NULL,
    `members`   int(9)       NOT NULL,
    `elders`    int(9)       NOT NULL,
    `xp`        bigint(18)   NOT NULL,
    `xp_max`    bigint(18)   NOT NULL,
    `level`     int(9)       NOT NULL,
    `icon`      varchar(255) NOT NULL,
    `elder_num` int(9)       NOT NULL,
    `max_p`     int(9)       NOT NULL,
    `gold`      bigint(18)   NOT NULL,
    `mk`        bigint(18)   NOT NULL,
    `pub`       int(9)       NOT NULL,
    `active`    int(9)       NOT NULL COMMENT '活跃点数',
    UNIQUE KEY `id` (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

-- 正在导出表  .zong 的数据：~0 rows (大约)
DELETE
FROM `zong`;
/*!40000 ALTER TABLE `zong`
    DISABLE KEYS */;
/*!40000 ALTER TABLE `zong`
    ENABLE KEYS */;
/*!40101 SET SQL_MODE = IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS = IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT = @OLD_CHARACTER_SET_CLIENT */;
