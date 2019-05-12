DROP TABLE IF EXISTS `tms_order`;
CREATE TABLE `tms_order` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
	`weight` int(7) DEFAULT NULL  COMMENT '重量',
  `update_dt` timestamp  DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
  
) ENGINE=InnoDB AUTO_INCREMENT=1 ;


CREATE TABLE `undo_log` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `branch_id` bigint(20) NOT NULL,
  `xid` varchar(100) NOT NULL,
  `rollback_info` longblob NOT NULL,
  `log_status` int(11) NOT NULL,
  `log_created` datetime NOT NULL,
  `log_modified` datetime NOT NULL,
  `ext` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `ux_undo_log` (`xid`,`branch_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;