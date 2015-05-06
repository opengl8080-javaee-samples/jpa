CREATE TABLE `chen` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `value` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

INSERT INTO `test`.`chen` (`id`, `value`) VALUES ('1', 'hoge');
INSERT INTO `test`.`chen` (`id`, `value`) VALUES ('2', 'fuga');
INSERT INTO `test`.`chen` (`id`, `value`) VALUES ('3', 'piyo');


CREATE TABLE `alice_margatroid` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `value` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

INSERT INTO `test`.`alice_margatroid` (`id`, `name`, `value`) VALUES ('1', 'hoge', 'HOGE');
INSERT INTO `test`.`alice_margatroid` (`id`, `name`, `value`) VALUES ('2', 'fuga', 'FUGA');
INSERT INTO `test`.`alice_margatroid` (`id`, `name`, `value`) VALUES ('3', 'piyo', 'PIYO');


CREATE TABLE `lily_white` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `value` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

INSERT INTO `test`.`lily_white` (`id`, `value`) VALUES ('1', 'hoge');


CREATE TABLE `merlin_prismriver` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

CREATE TABLE `lunasa_prismriver` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `merlin_prismriver_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `lunasa_prismriver_fk_idx` (`merlin_prismriver_id`),
  CONSTRAINT `lunasa_prismriver_fk` FOREIGN KEY (`merlin_prismriver_id`) REFERENCES `merlin_prismriver` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

CREATE TABLE `lyrica_prismriver` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `lunasa_prismriver_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `lyrica_prismriver_fk_idx` (`lunasa_prismriver_id`),
  CONSTRAINT `lyrica_prismriver_fk` FOREIGN KEY (`lunasa_prismriver_id`) REFERENCES `lunasa_prismriver` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;


INSERT INTO `test`.`merlin_prismriver` (`id`) VALUES ('1');
INSERT INTO `test`.`merlin_prismriver` (`id`) VALUES ('2');
INSERT INTO `test`.`merlin_prismriver` (`id`) VALUES ('3');
INSERT INTO `test`.`lunasa_prismriver` (`id`, `merlin_prismriver_id`) VALUES ('1', '1');
INSERT INTO `test`.`lunasa_prismriver` (`id`, `merlin_prismriver_id`) VALUES ('2', '2');
INSERT INTO `test`.`lunasa_prismriver` (`id`, `merlin_prismriver_id`) VALUES ('3', '3');
INSERT INTO `test`.`lyrica_prismriver` (`id`, `lunasa_prismriver_id`) VALUES ('1', '1');
INSERT INTO `test`.`lyrica_prismriver` (`id`, `lunasa_prismriver_id`) VALUES ('2', '1');
INSERT INTO `test`.`lyrica_prismriver` (`id`, `lunasa_prismriver_id`) VALUES ('3', '1');
INSERT INTO `test`.`lyrica_prismriver` (`id`, `lunasa_prismriver_id`) VALUES ('4', '2');
INSERT INTO `test`.`lyrica_prismriver` (`id`, `lunasa_prismriver_id`) VALUES ('5', '2');
INSERT INTO `test`.`lyrica_prismriver` (`id`, `lunasa_prismriver_id`) VALUES ('6', '3');


CREATE TABLE `konpaku_youmu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `amount` int(11) DEFAULT NULL,
  `value` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

CREATE TABLE `konpaku_youmu_list` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `konpaku_youmu_id` int(11) NOT NULL,
  `value` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `konpaku_youmu_list_fk_idx` (`konpaku_youmu_id`),
  CONSTRAINT `konpaku_youmu_list_fk` FOREIGN KEY (`konpaku_youmu_id`) REFERENCES `konpaku_youmu` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

INSERT INTO `test`.`konpaku_youmu` (`id`, `amount`, `value`) VALUES ('1', '10', 'tokyo');
INSERT INTO `test`.`konpaku_youmu` (`id`, `amount`, `value`) VALUES ('2', '20', 'osaka');
INSERT INTO `test`.`konpaku_youmu` (`id`, `amount`, `value`) VALUES ('3', '30', 'nagoya');
INSERT INTO `test`.`konpaku_youmu` (`id`, `amount`) VALUES ('4', '40');
INSERT INTO `test`.`konpaku_youmu_list` (`konpaku_youmu_id`, `value`) VALUES ('1', 'hoge');
INSERT INTO `test`.`konpaku_youmu_list` (`konpaku_youmu_id`, `value`) VALUES ('1', 'fuga');
INSERT INTO `test`.`konpaku_youmu_list` (`konpaku_youmu_id`, `value`) VALUES ('1', 'piyo');
INSERT INTO `test`.`konpaku_youmu_list` (`konpaku_youmu_id`, `value`) VALUES ('2', 'fizz');
INSERT INTO `test`.`konpaku_youmu_list` (`konpaku_youmu_id`, `value`) VALUES ('2', 'buzz');

CREATE TABLE `saigyoji_yuyuko` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `number` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

INSERT INTO `test`.`saigyoji_yuyuko` (`id`, `number`) VALUES ('1', '10');
INSERT INTO `test`.`saigyoji_yuyuko` (`id`, `number`) VALUES ('2', '9');
INSERT INTO `test`.`saigyoji_yuyuko` (`id`, `number`) VALUES ('3', '8');
INSERT INTO `test`.`saigyoji_yuyuko` (`id`, `number`) VALUES ('4', '7');
INSERT INTO `test`.`saigyoji_yuyuko` (`id`, `number`) VALUES ('5', '6');


CREATE TABLE `yakumo_ran` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

INSERT INTO `test`.`yakumo_ran` (`id`, `date`) VALUES ('1', '2014-01-01');
INSERT INTO `test`.`yakumo_ran` (`id`, `date`) VALUES ('2', '2015-01-01');
INSERT INTO `test`.`yakumo_ran` (`id`, `date`) VALUES ('3', '2016-01-01');


CREATE TABLE `yakumo_yukari` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `string` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

INSERT INTO `test`.`yakumo_yukari` (`id`, `string`) VALUES ('1', 'hoge');
INSERT INTO `test`.`yakumo_yukari` (`id`, `string`) VALUES ('2', '  fuga  ');
INSERT INTO `test`.`yakumo_yukari` (`id`, `string`) VALUES ('3', '**piyo**');
INSERT INTO `test`.`yakumo_yukari` (`id`, `string`) VALUES ('4', '123456');
INSERT INTO `test`.`yakumo_yukari` (`id`, `string`) VALUES ('5', 'fizzBUZZ');
INSERT INTO `test`.`yakumo_yukari` (`id`, `string`) VALUES ('6', 'abcdefg');


CREATE TABLE `ibuki_suika` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `number` decimal(5,2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;


CREATE TABLE `ibuki_suika_list` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ibuki_suika_id` int(11) NOT NULL,
  `order` int(11) NOT NULL,
  `value` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `ibuki_suika_list_fk_idx` (`ibuki_suika_id`),
  CONSTRAINT `ibuki_suika_list_fk` FOREIGN KEY (`ibuki_suika_id`) REFERENCES `ibuki_suika` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;


INSERT INTO `test`.`ibuki_suika` (`id`, `number`) VALUES ('1', '-10.2');
INSERT INTO `test`.`ibuki_suika` (`id`, `number`) VALUES ('2', '25');
INSERT INTO `test`.`ibuki_suika` (`id`, `number`) VALUES ('3', '7');
INSERT INTO `test`.`ibuki_suika` (`id`, `number`) VALUES ('4', '0');
INSERT INTO `test`.`ibuki_suika_list` (`ibuki_suika_id`, `order`, `value`) VALUES ('4', 0, 'hoge');
INSERT INTO `test`.`ibuki_suika_list` (`ibuki_suika_id`, `order`, `value`) VALUES ('4', 1, 'fuga');
INSERT INTO `test`.`ibuki_suika_list` (`ibuki_suika_id`, `order`, `value`) VALUES ('4', 2, 'piyo');


CREATE TABLE `wriggle_nightbug` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

CREATE TABLE `mystia_lorelei` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `wriggle_nightbug_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `mystia_lorelei_fk_idx` (`wriggle_nightbug_id`),
  CONSTRAINT `mystia_lorelei_fk` FOREIGN KEY (`wriggle_nightbug_id`) REFERENCES `wriggle_nightbug` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

INSERT INTO `test`.`wriggle_nightbug` (`id`) VALUES ('1');
INSERT INTO `test`.`wriggle_nightbug` (`id`) VALUES ('2');
INSERT INTO `test`.`wriggle_nightbug` (`id`) VALUES ('3');
INSERT INTO `test`.`mystia_lorelei` (`id`, `wriggle_nightbug_id`) VALUES ('1', '1');
INSERT INTO `test`.`mystia_lorelei` (`id`, `wriggle_nightbug_id`) VALUES ('2', '1');
INSERT INTO `test`.`mystia_lorelei` (`id`, `wriggle_nightbug_id`) VALUES ('3', '1');
INSERT INTO `test`.`mystia_lorelei` (`id`, `wriggle_nightbug_id`) VALUES ('4', '2');
INSERT INTO `test`.`mystia_lorelei` (`id`, `wriggle_nightbug_id`) VALUES ('5', '2');

CREATE TABLE `kamishirasawa_keine` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

INSERT INTO `test`.`kamishirasawa_keine` (`id`) VALUES ('1');

CREATE TABLE `inaba_tewi` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dtype` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

CREATE TABLE `reisen_udongein_inaba` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `inaba_tewi_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `reisen_udongein_inaba_fk_idx` (`inaba_tewi_id`),
  CONSTRAINT `reisen_udongein_inaba_fk` FOREIGN KEY (`inaba_tewi_id`) REFERENCES `inaba_tewi` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;


INSERT INTO `test`.`inaba_tewi` (`id`, `dtype`) VALUES ('1', 'ParentInabaTewi');
INSERT INTO `test`.`inaba_tewi` (`id`, `dtype`) VALUES ('2', 'ChildInabaTewi');
INSERT INTO `test`.`reisen_udongein_inaba` (`id`, `inaba_tewi_id`) VALUES ('1', '1');
INSERT INTO `test`.`reisen_udongein_inaba` (`id`, `inaba_tewi_id`) VALUES ('2', '2');


CREATE TABLE `yagokoro_eirin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `value` varchar(45) DEFAULT NULL,
  `number` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;


INSERT INTO `test`.`yagokoro_eirin` (`id`, `value`, `number`) VALUES ('1', 'hoge', '100');
INSERT INTO `test`.`yagokoro_eirin` (`id`, `value`, `number`) VALUES ('2', 'hoge', '200');
INSERT INTO `test`.`yagokoro_eirin` (`id`, `value`, `number`) VALUES ('3', 'hoge', '200');
INSERT INTO `test`.`yagokoro_eirin` (`id`, `value`, `number`) VALUES ('4', 'fuga', '300');
INSERT INTO `test`.`yagokoro_eirin` (`id`, `value`, `number`) VALUES ('5', 'fuga', '300');
INSERT INTO `test`.`yagokoro_eirin` (`id`, `value`, `number`) VALUES ('6', 'piyo', '300');

CREATE TABLE `houraisan_kaguya` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `string` varchar(45) DEFAULT NULL,
  `number` decimal(3,1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

INSERT INTO `test`.`houraisan_kaguya` (`string`, `number`) VALUES ('aaa', '10.5');
INSERT INTO `test`.`houraisan_kaguya` (`string`, `number`) VALUES ('bbb', '22');
INSERT INTO `test`.`houraisan_kaguya` (`string`, `number`) VALUES ('ccc', '31.5');
INSERT INTO `test`.`houraisan_kaguya` (`string`, `number`) VALUES ('ddd', '40');

CREATE TABLE `fujiwarano_mokou` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

INSERT INTO `test`.`fujiwarano_mokou` (`id`) VALUES ('1');
INSERT INTO `test`.`fujiwarano_mokou` (`id`) VALUES ('2');
INSERT INTO `test`.`fujiwarano_mokou` (`id`) VALUES ('3');

CREATE TABLE `shameimaru_aya` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `number` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

INSERT INTO `test`.`shameimaru_aya` (`id`, `number`) VALUES ('1', '15');
INSERT INTO `test`.`shameimaru_aya` (`id`, `number`) VALUES ('2', '30');
INSERT INTO `test`.`shameimaru_aya` (`id`, `number`) VALUES ('3', '21');

CREATE TABLE `kazami_yuka` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `code` varchar(45) DEFAULT NULL,
  `value` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

INSERT INTO `test`.`kazami_yuka` (`id`, `code`, `value`) VALUES ('1', 'AAA', 'alpha');
INSERT INTO `test`.`kazami_yuka` (`id`, `code`, `value`) VALUES ('2', 'CCC', 'beta');
INSERT INTO `test`.`kazami_yuka` (`id`, `code`, `value`) VALUES ('3', 'CCC', 'gamma');


CREATE TABLE `medicine_melancholy` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `code` varchar(45) DEFAULT NULL,
  `value` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;


INSERT INTO `test`.`medicine_melancholy` (`id`, `code`, `value`) VALUES ('1', 'AAA', 'hoge');
INSERT INTO `test`.`medicine_melancholy` (`id`, `code`, `value`) VALUES ('2', 'BBB', 'fuga');
INSERT INTO `test`.`medicine_melancholy` (`id`, `code`, `value`) VALUES ('3', 'CCC', 'piyo');

CREATE TABLE `shiki_eiki` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `value` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

INSERT INTO `test`.`shiki_eiki` (`id`, `value`) VALUES ('1', 'hoge');
INSERT INTO `test`.`shiki_eiki` (`id`, `value`) VALUES ('2', 'fuga');
INSERT INTO `test`.`shiki_eiki` (`id`, `value`) VALUES ('3', 'piyo');

CREATE TABLE `onoduka_komachi` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `shiki_eiki_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `onoduka_komachi_fk_idx` (`shiki_eiki_id`),
  CONSTRAINT `onoduka_komachi_fk` FOREIGN KEY (`shiki_eiki_id`) REFERENCES `shiki_eiki` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

INSERT INTO `test`.`onoduka_komachi` (`id`, `shiki_eiki_id`) VALUES ('1', '1');
INSERT INTO `test`.`onoduka_komachi` (`id`, `shiki_eiki_id`) VALUES ('2', '2');
INSERT INTO `test`.`onoduka_komachi` (`id`, `shiki_eiki_id`) VALUES ('3', '3');

CREATE TABLE `aki_shizuha` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `value` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

INSERT INTO `test`.`aki_shizuha` (`id`, `value`) VALUES ('1', 'hoge');
INSERT INTO `test`.`aki_shizuha` (`id`, `value`) VALUES ('2', 'fuga');
INSERT INTO `test`.`aki_shizuha` (`id`, `value`) VALUES ('3', 'piyo');

CREATE TABLE `aki_minoriko` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `number` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

INSERT INTO `test`.`aki_minoriko` (`id`, `number`) VALUES ('1', '100');
INSERT INTO `test`.`aki_minoriko` (`id`, `number`) VALUES ('2', '100');
INSERT INTO `test`.`aki_minoriko` (`id`, `number`) VALUES ('3', '100');
INSERT INTO `test`.`aki_minoriko` (`id`, `number`) VALUES ('4', '100');
INSERT INTO `test`.`aki_minoriko` (`id`, `number`) VALUES ('5', '200');
INSERT INTO `test`.`aki_minoriko` (`id`, `number`) VALUES ('6', '200');
INSERT INTO `test`.`aki_minoriko` (`id`, `number`) VALUES ('7', '200');
INSERT INTO `test`.`aki_minoriko` (`id`, `number`) VALUES ('8', '300');


CREATE TABLE `kagiyama_hina` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `number` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

INSERT INTO `test`.`kagiyama_hina` (`id`, `number`) VALUES ('1', '111');
INSERT INTO `test`.`kagiyama_hina` (`id`, `number`) VALUES ('2', '222');
INSERT INTO `test`.`kagiyama_hina` (`id`, `number`) VALUES ('3', '333');
INSERT INTO `test`.`kagiyama_hina` (`id`, `number`) VALUES ('4', '111');
INSERT INTO `test`.`kagiyama_hina` (`id`, `number`) VALUES ('5', '222');

CREATE TABLE `kawashiro_nitori` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `value` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

INSERT INTO `test`.`kawashiro_nitori` (`id`, `value`) VALUES ('1', 'hoge');
INSERT INTO `test`.`kawashiro_nitori` (`id`, `value`) VALUES ('2', 'fuga');
INSERT INTO `test`.`kawashiro_nitori` (`id`, `value`) VALUES ('3', 'hoge');
INSERT INTO `test`.`kawashiro_nitori` (`id`, `value`) VALUES ('4', 'piyo');
INSERT INTO `test`.`kawashiro_nitori` (`id`, `value`) VALUES ('5', 'piyo');


CREATE TABLE `inubashiri_momiji` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `number` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

INSERT INTO `test`.`inubashiri_momiji` (`id`, `number`) VALUES ('1', '111');
INSERT INTO `test`.`inubashiri_momiji` (`id`, `number`) VALUES ('2', '222');
INSERT INTO `test`.`inubashiri_momiji` (`id`, `number`) VALUES ('3', '333');
INSERT INTO `test`.`inubashiri_momiji` (`id`, `number`) VALUES ('4', '444');

CREATE TABLE `kochiya_sanae` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `number` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

INSERT INTO `test`.`kochiya_sanae` (`id`, `number`) VALUES ('1', '100');
INSERT INTO `test`.`kochiya_sanae` (`id`, `number`) VALUES ('2', '111');
INSERT INTO `test`.`kochiya_sanae` (`id`, `number`) VALUES ('3', '200');
INSERT INTO `test`.`kochiya_sanae` (`id`, `number`) VALUES ('4', '222');
INSERT INTO `test`.`kochiya_sanae` (`id`, `number`) VALUES ('5', '300');


CREATE TABLE `yasaka_kanako` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `value` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

INSERT INTO `test`.`yasaka_kanako` (`id`, `value`) VALUES ('1', 'hoge');
INSERT INTO `test`.`yasaka_kanako` (`id`, `value`) VALUES ('2', 'fuga');
INSERT INTO `test`.`yasaka_kanako` (`id`, `value`) VALUES ('3', 'piyo');

CREATE TABLE `moriya_suwako` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `number` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

INSERT INTO `test`.`moriya_suwako` (`id`, `number`) VALUES ('1', '111');
INSERT INTO `test`.`moriya_suwako` (`id`, `number`) VALUES ('2', '222');
INSERT INTO `test`.`moriya_suwako` (`id`, `number`) VALUES ('3', '333');

CREATE TABLE `native_query_test` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `value` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

INSERT INTO `test`.`native_query_test` (`id`, `value`) VALUES ('1', 'hoge');
INSERT INTO `test`.`native_query_test` (`id`, `value`) VALUES ('2', 'fuga');
INSERT INTO `test`.`native_query_test` (`id`, `value`) VALUES ('3', 'piyo');

CREATE TABLE `nagae_iku` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `value` varchar(45) DEFAULT NULL,
  `ignore` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

INSERT INTO `test`.`nagae_iku` (`id`, `value`, `ignore`) VALUES ('1', 'hoge', 'xxx');
INSERT INTO `test`.`nagae_iku` (`id`, `value`, `ignore`) VALUES ('2', 'fuga', 'yyy');
INSERT INTO `test`.`nagae_iku` (`id`, `value`, `ignore`) VALUES ('3', 'piyo', 'zzz');


CREATE PROCEDURE `test`.`sample_stored_procedure` (IN intParam INTEGER, IN stringParam VARCHAR(64), OUT outParam VARCHAR(64))
BEGIN
  SET outParam = CONCAT(intParam, ' : ', stringParam);
END

CREATE TABLE `hinanai_tenshi` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `number` decimal(10,4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

INSERT INTO `test`.`hinanai_tenshi` (`id`, `number`) VALUES ('1', '123456');
INSERT INTO `test`.`hinanai_tenshi` (`id`, `number`) VALUES ('2', '345.123');
INSERT INTO `test`.`hinanai_tenshi` (`id`, `number`) VALUES ('3', '56789.1234');

