CREATE TABLE `test_table` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `value` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

INSERT INTO `test_table` (`id`, `value`) VALUES ('1', 'fizz');
INSERT INTO `test_table` (`id`, `value`) VALUES ('1', 'buzz');



CREATE TABLE `kisume` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

INSERT INTO `kisume` (`id`) VALUES ('1');
INSERT INTO `kisume` (`id`) VALUES ('2');
INSERT INTO `kisume` (`id`) VALUES ('3');



CREATE TABLE `kurodani_yamame` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `string` varchar(45) DEFAULT NULL,
  `number` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

INSERT INTO `kurodani_yamame` (`id`, `string`, `number`) VALUES ('1', 'one', '100');
INSERT INTO `kurodani_yamame` (`id`, `string`, `number`) VALUES ('2', 'two', '200');
INSERT INTO `kurodani_yamame` (`id`, `string`, `number`) VALUES ('3', 'three', '300');
INSERT INTO `kurodani_yamame` (`id`, `string`, `number`) VALUES ('4', 'four', '400');
INSERT INTO `kurodani_yamame` (`id`, `string`, `number`) VALUES ('5', 'five', '500');



CREATE TABLE `mizuhashi_parsee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `value` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

INSERT INTO `mizuhashi_parsee` (`id`, `value`) VALUES ('1', 'hoge');
INSERT INTO `mizuhashi_parsee` (`id`, `value`) VALUES ('2', 'fuga');
INSERT INTO `mizuhashi_parsee` (`id`, `value`) VALUES ('3', 'piyo');



CREATE TABLE `hoshiguma_yugi` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `value` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

INSERT INTO `hoshiguma_yugi` (`id`, `value`) VALUES ('1', 'hoge');
INSERT INTO `hoshiguma_yugi` (`id`, `value`) VALUES ('2', 'fuga');
INSERT INTO `hoshiguma_yugi` (`id`, `value`) VALUES ('3', 'piyo');



CREATE TABLE `komeiji_koishi` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `value` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

INSERT INTO `komeiji_koishi` (`id`, `value`) VALUES ('1', 'hoge');
INSERT INTO `komeiji_koishi` (`id`, `value`) VALUES ('2', 'fuga');
INSERT INTO `komeiji_koishi` (`id`, `value`) VALUES ('3', 'piyo');



CREATE TABLE `komeiji_satori` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `komeiji_koishi_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `komeiji_satori_fk_idx` (`komeiji_koishi_id`),
  CONSTRAINT `komeiji_satori_fk` FOREIGN KEY (`komeiji_koishi_id`) REFERENCES `komeiji_koishi` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

INSERT INTO `komeiji_satori` (`id`, `komeiji_koishi_id`) VALUES ('1', '1');
INSERT INTO `komeiji_satori` (`id`, `komeiji_koishi_id`) VALUES ('2', '2');
INSERT INTO `komeiji_satori` (`id`, `komeiji_koishi_id`) VALUES ('3', '3');



CREATE TABLE `kaenbyo_rin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `number` int(11) DEFAULT NULL,
  `string` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

INSERT INTO `kaenbyo_rin` (`id`, `number`, `string`) VALUES ('1', '111', 'hoge');
INSERT INTO `kaenbyo_rin` (`id`, `number`, `string`) VALUES ('2', '222', 'fuga');
INSERT INTO `kaenbyo_rin` (`id`, `number`, `string`) VALUES ('3', '333', 'piyo');



CREATE TABLE `reiuji_utsubo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `number` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

INSERT INTO `reiuji_utsubo` (`id`, `number`) VALUES ('1', '100');
INSERT INTO `reiuji_utsubo` (`id`, `number`) VALUES ('2', '200');
INSERT INTO `reiuji_utsubo` (`id`, `number`) VALUES ('3', '300');

CREATE TABLE `nazrin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `number` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

INSERT INTO `nazrin` (`id`, `number`) VALUES ('1', '200');
INSERT INTO `nazrin` (`id`, `number`) VALUES ('2', '300');
INSERT INTO `nazrin` (`id`, `number`) VALUES ('3', '100');



CREATE TABLE `tatara_kogasa` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `string` varchar(45) DEFAULT NULL,
  `number` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

INSERT INTO `tatara_kogasa` (`id`, `string`, `number`) VALUES ('1', 'hoge', '10');
INSERT INTO `tatara_kogasa` (`id`, `string`, `number`) VALUES ('2', 'fuga', '70');
INSERT INTO `tatara_kogasa` (`id`, `string`, `number`) VALUES ('3', 'piyo', '130');
INSERT INTO `tatara_kogasa` (`id`, `string`, `number`) VALUES ('4', 'hoge', '30');
INSERT INTO `tatara_kogasa` (`id`, `string`, `number`) VALUES ('5', 'fuga', '80');
INSERT INTO `tatara_kogasa` (`id`, `string`, `number`) VALUES ('6', 'hoge', '40');



CREATE TABLE `kumoi_ichirin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

INSERT INTO `kumoi_ichirin` (`id`) VALUES ('1');
INSERT INTO `kumoi_ichirin` (`id`) VALUES ('2');
INSERT INTO `kumoi_ichirin` (`id`) VALUES ('3');



CREATE TABLE `kumoi_unzan` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ichirin_id` int(11) DEFAULT NULL,
  `value` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `kumoi_unzan_fk_idx` (`ichirin_id`),
  CONSTRAINT `kumoi_unzan_fk` FOREIGN KEY (`ichirin_id`) REFERENCES `kumoi_ichirin` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

INSERT INTO `kumoi_unzan` (`id`, `ichirin_id`, `value`) VALUES ('1', '1', 'one');
INSERT INTO `kumoi_unzan` (`id`, `ichirin_id`, `value`) VALUES ('2', '1', 'two');
INSERT INTO `kumoi_unzan` (`id`, `ichirin_id`, `value`) VALUES ('3', '1', 'three');
INSERT INTO `kumoi_unzan` (`id`, `ichirin_id`, `value`) VALUES ('4', '2', 'four');
INSERT INTO `kumoi_unzan` (`id`, `ichirin_id`, `value`) VALUES ('5', '2', 'five');
INSERT INTO `kumoi_unzan` (`id`, `ichirin_id`, `value`) VALUES ('6', '3', 'six');



CREATE TABLE `murasa_minamitsu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

INSERT INTO `murasa_minamitsu` (`id`) VALUES ('1');
INSERT INTO `murasa_minamitsu` (`id`) VALUES ('2');
INSERT INTO `murasa_minamitsu` (`id`) VALUES ('3');



CREATE TABLE `toramaru_shou` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `toramaru_shou` (`id`) VALUES ('1');
INSERT INTO `toramaru_shou` (`id`) VALUES ('3');



CREATE TABLE `hijiri_byakuren` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `value` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

INSERT INTO `hijiri_byakuren` (`id`, `value`) VALUES ('1', 'hoge');
INSERT INTO `hijiri_byakuren` (`id`, `value`) VALUES ('2', 'fuga');
INSERT INTO `hijiri_byakuren` (`id`, `value`) VALUES ('3', 'piyo');



CREATE TABLE `hojo_nue` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `hojo_nue` (`id`) VALUES ('1');
INSERT INTO `hojo_nue` (`id`) VALUES ('2');
INSERT INTO `hojo_nue` (`id`) VALUES ('3');

