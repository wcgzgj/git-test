# 用户表
drop table if exists `user`;
CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into `user` values (1,'admin','123');
insert into `user` values (2,'guest1','1');
insert into `user` values (3,'guest2','2');
insert into `user` values (4,'guest3','3');