CREATE TABLE `sample_table` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `value` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `test`.`sample_table` (`value`) VALUES ('hoge');
INSERT INTO `test`.`sample_table` (`value`) VALUES ('fuga');
INSERT INTO `test`.`sample_table` (`value`) VALUES ('piyo');


CREATE TABLE `reimu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `test`.`reimu` (`id`) VALUES ('1');
INSERT INTO `test`.`reimu` (`id`) VALUES ('2');
INSERT INTO `test`.`reimu` (`id`) VALUES ('3');

CREATE TABLE `kirisame_marisa` (
  `id_column` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id_column`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `test`.`kirisame_marisa` (`id_column`) VALUES ('1');
INSERT INTO `test`.`kirisame_marisa` (`id_column`) VALUES ('2');
INSERT INTO `test`.`kirisame_marisa` (`id_column`) VALUES ('3');

CREATE TABLE `singyoku` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `value` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*
-- for oracle
CREATE TABLE yuugen_magan (
    ID NUMBER(10),
    VALUE VARCHAR2(128),
    PRIMARY KEY(ID)
);

CREATE SEQUENCE yuugen_magan_seq;
-- */

CREATE TABLE `elis` (
  `id` int(11) NOT NULL,
  `value` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `seq_generator` (
  `table_name` varchar(128) NOT NULL,
  `sequence_number` int(11) NOT NULL,
  PRIMARY KEY (`table_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `test`.`seq_generator` (`table_name`, `sequence_number`) VALUES ('elis', '0');

CREATE TABLE `sariel` (
  `key1` int(11) NOT NULL AUTO_INCREMENT,
  `key2` varchar(32) NOT NULL,
  `value` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`key1`,`key2`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `mima` (
  `key1` int(11) NOT NULL AUTO_INCREMENT,
  `key2` varchar(45) NOT NULL,
  `value` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`key1`,`key2`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `kikuri` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date` date DEFAULT NULL,
  `time` time DEFAULT NULL,
  `datetime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `konngara` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `value` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `genji` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `enum_value` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `rika` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `enum_value` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `meira` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `meira_list_value` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `meira_id` int(11) NOT NULL,
  `value` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `meira_fk_idx` (`meira_id`),
  CONSTRAINT `meira_fk` FOREIGN KEY (`meira_id`) REFERENCES `meira` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


INSERT INTO `test`.`meira` (`id`) VALUES ('1');
INSERT INTO `test`.`meira` (`id`) VALUES ('2');
INSERT INTO `test`.`meira` (`id`) VALUES ('3');

INSERT INTO `test`.`meira_list_value` (`meira_id`, `value`) VALUES ('1', 'hoge');
INSERT INTO `test`.`meira_list_value` (`meira_id`, `value`) VALUES ('1', 'fuga');
INSERT INTO `test`.`meira_list_value` (`meira_id`, `value`) VALUES ('1', 'piyo');
INSERT INTO `test`.`meira_list_value` (`meira_id`, `value`) VALUES ('2', 'fizz');
INSERT INTO `test`.`meira_list_value` (`meira_id`, `value`) VALUES ('2', 'buzz');



CREATE TABLE `eren` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `eren_map_value` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `eren_id` int(11) NOT NULL,
  `key` varchar(45) NOT NULL,
  `value` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `eren_map_velu_fk_idx` (`eren_id`),
  CONSTRAINT `eren_map_velu_fk` FOREIGN KEY (`eren_id`) REFERENCES `eren` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `test`.`eren` (`id`) VALUES ('1');
INSERT INTO `test`.`eren` (`id`) VALUES ('2');

INSERT INTO `test`.`eren_map_value` (`eren_id`, `key`, `value`) VALUES ('1', 'hoge', 'HOGE');
INSERT INTO `test`.`eren_map_value` (`eren_id`, `key`, `value`) VALUES ('1', 'fuga', 'FUGA');
INSERT INTO `test`.`eren_map_value` (`eren_id`, `key`, `value`) VALUES ('1', 'piyo', 'PIYO');
INSERT INTO `test`.`eren_map_value` (`eren_id`, `key`, `value`) VALUES ('2', 'fizz', 'FIZZ');
INSERT INTO `test`.`eren_map_value` (`eren_id`, `key`, `value`) VALUES ('2', 'buzz', 'BUZZ');



CREATE TABLE `kotohime` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `value` varchar(45) DEFAULT NULL,
  `embedded_value` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `test`.`kotohime` (`id`, `value`, `embedded_value`) VALUES ('1', 'hoge', 'HOGE');
INSERT INTO `test`.`kotohime` (`id`, `value`, `embedded_value`) VALUES ('2', 'fuga', 'FUGA');
INSERT INTO `test`.`kotohime` (`id`, `value`, `embedded_value`) VALUES ('3', 'piyo', 'PIYO');


CREATE TABLE `kana_anaberaru` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;


CREATE TABLE `kana_anaberaru_list_value` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `kana_anaberaru_id` int(11) NOT NULL,
  `embedded_value` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `kana_anaberaru_list_value_fk_idx` (`kana_anaberaru_id`),
  CONSTRAINT `kana_anaberaru_list_value_fk` FOREIGN KEY (`kana_anaberaru_id`) REFERENCES `kana_anaberaru` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

INSERT INTO `test`.`kana_anaberaru` (`id`) VALUES ('1');
INSERT INTO `test`.`kana_anaberaru` (`id`) VALUES ('2');
INSERT INTO `test`.`kana_anaberaru` (`id`) VALUES ('3');
INSERT INTO `test`.`kana_anaberaru_list_value` (`id`, `kana_anaberaru_id`, `embedded_value`) VALUES ('1', '1', 'hoge');
INSERT INTO `test`.`kana_anaberaru_list_value` (`id`, `kana_anaberaru_id`, `embedded_value`) VALUES ('2', '1', 'fuga');
INSERT INTO `test`.`kana_anaberaru_list_value` (`id`, `kana_anaberaru_id`, `embedded_value`) VALUES ('3', '1', 'piyo');
INSERT INTO `test`.`kana_anaberaru_list_value` (`id`, `kana_anaberaru_id`, `embedded_value`) VALUES ('4', '2', 'fizz');
INSERT INTO `test`.`kana_anaberaru_list_value` (`id`, `kana_anaberaru_id`, `embedded_value`) VALUES ('5', '2', 'buzz');

CREATE TABLE `asakura_rikako` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;


CREATE TABLE `asakura_rikako_map_values` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `asakura_rikako_id` int(11) NOT NULL,
  `embedded_key` varchar(45) NOT NULL,
  `embedded_value` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `asakura_rikako_map_values_fk_idx` (`asakura_rikako_id`),
  CONSTRAINT `asakura_rikako_map_values_fk` FOREIGN KEY (`asakura_rikako_id`) REFERENCES `asakura_rikako` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;


INSERT INTO `test`.`asakura_rikako` (`id`) VALUES ('1');
INSERT INTO `test`.`asakura_rikako` (`id`) VALUES ('2');
INSERT INTO `test`.`asakura_rikako` (`id`) VALUES ('3');

INSERT INTO `test`.`asakura_rikako_map_values` (`asakura_rikako_id`, `embedded_key`, `embedded_value`) VALUES ('1', 'hoge', 'HOGE');
INSERT INTO `test`.`asakura_rikako_map_values` (`asakura_rikako_id`, `embedded_key`, `embedded_value`) VALUES ('1', 'fuga', 'FUGA');
INSERT INTO `test`.`asakura_rikako_map_values` (`asakura_rikako_id`, `embedded_key`, `embedded_value`) VALUES ('1', 'piyo', 'PIYO');
INSERT INTO `test`.`asakura_rikako_map_values` (`asakura_rikako_id`, `embedded_key`, `embedded_value`) VALUES ('2', 'fizz', 'FIZZ');
INSERT INTO `test`.`asakura_rikako_map_values` (`asakura_rikako_id`, `embedded_key`, `embedded_value`) VALUES ('2', 'buzz', 'BUZZ');



CREATE TABLE `kitashirakawa_chiyuri` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `okazaki_yumemi_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `kitashirakawa_chiyuri_fk_idx` (`okazaki_yumemi_id`),
  CONSTRAINT `kitashirakawa_chiyuri_fk` FOREIGN KEY (`okazaki_yumemi_id`) REFERENCES `okazaki_yumemi` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;




CREATE TABLE `okazaki_yumemi` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;


INSERT INTO `test`.`okazaki_yumemi` (`id`) VALUES ('1');
INSERT INTO `test`.`okazaki_yumemi` (`id`) VALUES ('2');
INSERT INTO `test`.`okazaki_yumemi` (`id`) VALUES ('3');
INSERT INTO `test`.`kitashirakawa_chiyuri` (`id`, `okazaki_yumemi_id`) VALUES ('1', '1');
INSERT INTO `test`.`kitashirakawa_chiyuri` (`id`, `okazaki_yumemi_id`) VALUES ('2', '2');
INSERT INTO `test`.`kitashirakawa_chiyuri` (`id`, `okazaki_yumemi_id`) VALUES ('3', '3');



CREATE TABLE `kurumi` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

CREATE TABLE `orange` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `kurumi_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `orange_fk_idx` (`kurumi_id`),
  CONSTRAINT `orange_fk` FOREIGN KEY (`kurumi_id`) REFERENCES `kurumi` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;





INSERT INTO `test`.`kurumi` (`id`) VALUES ('1');
INSERT INTO `test`.`kurumi` (`id`) VALUES ('2');
INSERT INTO `test`.`kurumi` (`id`) VALUES ('3');

INSERT INTO `test`.`orange` (`id`, `kurumi_id`) VALUES ('1', '1');
INSERT INTO `test`.`orange` (`id`, `kurumi_id`) VALUES ('2', '2');
INSERT INTO `test`.`orange` (`id`, `kurumi_id`) VALUES ('3', '3');







CREATE TABLE `elliy` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;


CREATE TABLE `yuuka` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;


CREATE TABLE `elliy_yuuka` (
  `elliy_id` int(11) NOT NULL,
  `yuuka_id` int(11) NOT NULL,
  PRIMARY KEY (`elliy_id`,`yuuka_id`),
  KEY `elliy_yuuka_fk1_idx` (`elliy_id`),
  KEY `elliy_yuuka_fk2_idx` (`yuuka_id`),
  CONSTRAINT `elliy_yuuka_fk1` FOREIGN KEY (`elliy_id`) REFERENCES `elliy` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `elliy_yuuka_fk2` FOREIGN KEY (`yuuka_id`) REFERENCES `yuuka` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


INSERT INTO `test`.`elliy` (`id`) VALUES ('1');
INSERT INTO `test`.`elliy` (`id`) VALUES ('2');
INSERT INTO `test`.`elliy` (`id`) VALUES ('3');


INSERT INTO `test`.`yuuka` (`id`) VALUES ('1');
INSERT INTO `test`.`yuuka` (`id`) VALUES ('2');
INSERT INTO `test`.`yuuka` (`id`) VALUES ('3');
INSERT INTO `test`.`yuuka` (`id`) VALUES ('4');
INSERT INTO `test`.`yuuka` (`id`) VALUES ('5');
INSERT INTO `test`.`yuuka` (`id`) VALUES ('6');
INSERT INTO `test`.`yuuka` (`id`) VALUES ('7');
INSERT INTO `test`.`yuuka` (`id`) VALUES ('8');


INSERT INTO `test`.`elliy_yuuka` (`elliy_id`, `yuuka_id`) VALUES ('1', '1');
INSERT INTO `test`.`elliy_yuuka` (`elliy_id`, `yuuka_id`) VALUES ('1', '2');
INSERT INTO `test`.`elliy_yuuka` (`elliy_id`, `yuuka_id`) VALUES ('1', '3');
INSERT INTO `test`.`elliy_yuuka` (`elliy_id`, `yuuka_id`) VALUES ('1', '4');
INSERT INTO `test`.`elliy_yuuka` (`elliy_id`, `yuuka_id`) VALUES ('2', '5');
INSERT INTO `test`.`elliy_yuuka` (`elliy_id`, `yuuka_id`) VALUES ('2', '6');
INSERT INTO `test`.`elliy_yuuka` (`elliy_id`, `yuuka_id`) VALUES ('2', '7');
INSERT INTO `test`.`elliy_yuuka` (`elliy_id`, `yuuka_id`) VALUES ('3', '8');




CREATE TABLE `mugetsu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;



CREATE TABLE `gengetsu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `mugetsu_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `gengetsu_fk_idx` (`mugetsu_id`),
  CONSTRAINT `gengetsu_fk` FOREIGN KEY (`mugetsu_id`) REFERENCES `mugetsu` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

INSERT INTO `test`.`mugetsu` (`id`) VALUES ('1');
INSERT INTO `test`.`mugetsu` (`id`) VALUES ('2');
INSERT INTO `test`.`mugetsu` (`id`) VALUES ('3');

INSERT INTO `test`.`gengetsu` (`mugetsu_id`) VALUES ('1');
INSERT INTO `test`.`gengetsu` (`mugetsu_id`) VALUES ('1');
INSERT INTO `test`.`gengetsu` (`mugetsu_id`) VALUES ('1');
INSERT INTO `test`.`gengetsu` (`mugetsu_id`) VALUES ('2');
INSERT INTO `test`.`gengetsu` (`mugetsu_id`) VALUES ('2');
INSERT INTO `test`.`gengetsu` (`mugetsu_id`) VALUES ('3');





CREATE TABLE `sara` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

CREATE TABLE `luize` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;




CREATE TABLE `sara_luize` (
  `sara_id` int(11) NOT NULL,
  `luize_id` int(11) NOT NULL,
  PRIMARY KEY (`sara_id`,`luize_id`),
  KEY `sara_luize_fk1_idx` (`sara_id`),
  KEY `sara_luize_fk2_idx` (`luize_id`),
  CONSTRAINT `sara_luize_fk1` FOREIGN KEY (`sara_id`) REFERENCES `sara` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `sara_luize_fk2` FOREIGN KEY (`luize_id`) REFERENCES `luize` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;




INSERT INTO `test`.`sara` (`id`) VALUES ('1');
INSERT INTO `test`.`sara` (`id`) VALUES ('2');
INSERT INTO `test`.`sara` (`id`) VALUES ('3');

INSERT INTO `test`.`luize` (`id`) VALUES ('1');
INSERT INTO `test`.`luize` (`id`) VALUES ('2');
INSERT INTO `test`.`luize` (`id`) VALUES ('3');
INSERT INTO `test`.`luize` (`id`) VALUES ('4');
INSERT INTO `test`.`luize` (`id`) VALUES ('5');

INSERT INTO `test`.`sara_luize` (`sara_id`, `luize_id`) VALUES ('1', '1');
INSERT INTO `test`.`sara_luize` (`sara_id`, `luize_id`) VALUES ('1', '2');
INSERT INTO `test`.`sara_luize` (`sara_id`, `luize_id`) VALUES ('1', '3');
INSERT INTO `test`.`sara_luize` (`sara_id`, `luize_id`) VALUES ('2', '4');
INSERT INTO `test`.`sara_luize` (`sara_id`, `luize_id`) VALUES ('2', '5');





CREATE TABLE `yuki` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

CREATE TABLE `mai` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `yuki_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `mai_fk_idx` (`yuki_id`),
  CONSTRAINT `mai_fk` FOREIGN KEY (`yuki_id`) REFERENCES `yuki` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;






INSERT INTO `test`.`yuki` (`id`) VALUES ('1');
INSERT INTO `test`.`yuki` (`id`) VALUES ('2');
INSERT INTO `test`.`yuki` (`id`) VALUES ('3');

INSERT INTO `test`.`mai` (`id`, `yuki_id`) VALUES ('1', '1');
INSERT INTO `test`.`mai` (`id`, `yuki_id`) VALUES ('2', '1');
INSERT INTO `test`.`mai` (`id`, `yuki_id`) VALUES ('3', '1');
INSERT INTO `test`.`mai` (`id`, `yuki_id`) VALUES ('4', '2');
INSERT INTO `test`.`mai` (`id`, `yuki_id`) VALUES ('5', '2');



CREATE TABLE `alice` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;





CREATE TABLE `yumeko` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;




CREATE TABLE `alice_yumeko` (
  `alice_id` int(11) NOT NULL,
  `yumeko_id` int(11) NOT NULL,
  PRIMARY KEY (`alice_id`,`yumeko_id`),
  KEY `alice_yumeko_fk1_idx` (`alice_id`),
  KEY `alice_yumeko_fk2_idx` (`yumeko_id`),
  CONSTRAINT `alice_yumeko_fk1` FOREIGN KEY (`alice_id`) REFERENCES `alice` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `alice_yumeko_fk2` FOREIGN KEY (`yumeko_id`) REFERENCES `yumeko` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



INSERT INTO `test`.`alice` (`id`) VALUES ('1');
INSERT INTO `test`.`alice` (`id`) VALUES ('2');
INSERT INTO `test`.`alice` (`id`) VALUES ('3');

INSERT INTO `test`.`yumeko` (`id`) VALUES ('1');
INSERT INTO `test`.`yumeko` (`id`) VALUES ('2');
INSERT INTO `test`.`yumeko` (`id`) VALUES ('3');

INSERT INTO `test`.`alice_yumeko` (`alice_id`, `yumeko_id`) VALUES ('1', '1');
INSERT INTO `test`.`alice_yumeko` (`alice_id`, `yumeko_id`) VALUES ('1', '2');
INSERT INTO `test`.`alice_yumeko` (`alice_id`, `yumeko_id`) VALUES ('1', '3');
INSERT INTO `test`.`alice_yumeko` (`alice_id`, `yumeko_id`) VALUES ('2', '1');
INSERT INTO `test`.`alice_yumeko` (`alice_id`, `yumeko_id`) VALUES ('2', '2');
INSERT INTO `test`.`alice_yumeko` (`alice_id`, `yumeko_id`) VALUES ('3', '3');




CREATE TABLE `shinki` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;


CREATE TABLE `shinki_list` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `shinki_id` int(11) NOT NULL,
  `order` int(11) NOT NULL,
  `value` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `shinki_list_fk_idx` (`shinki_id`),
  CONSTRAINT `shinki_list_fk` FOREIGN KEY (`shinki_id`) REFERENCES `shinki` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;


INSERT INTO `test`.`shinki` (`id`) VALUES ('1');
INSERT INTO `test`.`shinki` (`id`) VALUES ('2');
INSERT INTO `test`.`shinki` (`id`) VALUES ('3');

INSERT INTO `test`.`shinki_list` (`shinki_id`, `order`, `value`) VALUES ('1', '1', 'piyo');
INSERT INTO `test`.`shinki_list` (`shinki_id`, `order`, `value`) VALUES ('1', '2', 'fuga');
INSERT INTO `test`.`shinki_list` (`shinki_id`, `order`, `value`) VALUES ('1', '3', 'hoge');
INSERT INTO `test`.`shinki_list` (`shinki_id`, `order`, `value`) VALUES ('2', '1', 'buzz');
INSERT INTO `test`.`shinki_list` (`shinki_id`, `order`, `value`) VALUES ('2', '2', 'fizz');




CREATE TABLE `rumia` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dtype` varchar(45) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `value` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;




CREATE TABLE `parent_cirno` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `dtype` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;




CREATE TABLE `child_cirno` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `value` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `child_cirno_fk_idx` (`id`),
  CONSTRAINT `child_cirno_fk` FOREIGN KEY (`id`) REFERENCES `parent_cirno` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;



CREATE TABLE `daiyousei` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `entity_type` int(11) NOT NULL,
  `value` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;



CREATE TABLE `parent_hong_meiling` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;




CREATE TABLE `child_hong_meiling` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `value` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;



CREATE TABLE `koakuma` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `value` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;



CREATE TABLE `patchouli_knowledge` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `blob_value` blob,
  `clob_value` longtext,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;



CREATE TABLE `izayoi_sakuya` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;




CREATE TABLE `frandre_scarlet` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `izayoi_sakuya_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `frandre_scarlet_fk_idx` (`izayoi_sakuya_id`),
  CONSTRAINT `frandre_scarlet_fk` FOREIGN KEY (`izayoi_sakuya_id`) REFERENCES `izayoi_sakuya` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;




CREATE TABLE `remilia_scarlet` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `izayoi_sakuya_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `remilia_scarlet_fk_idx` (`izayoi_sakuya_id`),
  CONSTRAINT `remilia_scarlet_fk` FOREIGN KEY (`izayoi_sakuya_id`) REFERENCES `izayoi_sakuya` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;


INSERT INTO `test`.`izayoi_sakuya` (`id`) VALUES ('1');
INSERT INTO `test`.`izayoi_sakuya` (`id`) VALUES ('2');
INSERT INTO `test`.`izayoi_sakuya` (`id`) VALUES ('3');
INSERT INTO `test`.`frandre_scarlet` (`id`, `izayoi_sakuya_id`) VALUES ('1', '1');
INSERT INTO `test`.`frandre_scarlet` (`id`, `izayoi_sakuya_id`) VALUES ('2', '1');
INSERT INTO `test`.`frandre_scarlet` (`id`, `izayoi_sakuya_id`) VALUES ('3', '1');
INSERT INTO `test`.`frandre_scarlet` (`id`, `izayoi_sakuya_id`) VALUES ('4', '2');
INSERT INTO `test`.`frandre_scarlet` (`id`, `izayoi_sakuya_id`) VALUES ('5', '2');
INSERT INTO `test`.`frandre_scarlet` (`id`, `izayoi_sakuya_id`) VALUES ('6', '3');
INSERT INTO `test`.`frandre_scarlet` (`id`, `izayoi_sakuya_id`) VALUES ('7', '3');
INSERT INTO `test`.`remilia_scarlet` (`id`, `izayoi_sakuya_id`) VALUES ('1', '1');
INSERT INTO `test`.`remilia_scarlet` (`id`, `izayoi_sakuya_id`) VALUES ('2', '1');
INSERT INTO `test`.`remilia_scarlet` (`id`, `izayoi_sakuya_id`) VALUES ('3', '1');
INSERT INTO `test`.`remilia_scarlet` (`id`, `izayoi_sakuya_id`) VALUES ('4', '2');
INSERT INTO `test`.`remilia_scarlet` (`id`, `izayoi_sakuya_id`) VALUES ('5', '2');
INSERT INTO `test`.`remilia_scarlet` (`id`, `izayoi_sakuya_id`) VALUES ('6', '3');
INSERT INTO `test`.`remilia_scarlet` (`id`, `izayoi_sakuya_id`) VALUES ('7', '3');


CREATE TABLE `letty_whiterock` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `value` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

INSERT INTO `test`.`letty_whiterock` (`id`, `value`) VALUES ('1', '1');
INSERT INTO `test`.`letty_whiterock` (`id`, `value`) VALUES ('2', '0');
INSERT INTO `test`.`letty_whiterock` (`id`, `value`) VALUES ('3', '1');


CREATE TABLE `optimistick_lock_entity` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `value` varchar(45) DEFAULT NULL,
  `version` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

INSERT INTO `test`.`optimistick_lock_entity` (`id`, `value`, `version`) VALUES ('1', 'hoge', '0');
INSERT INTO `test`.`optimistick_lock_entity` (`id`, `value`, `version`) VALUES ('2', 'fuga', '0');
INSERT INTO `test`.`optimistick_lock_entity` (`id`, `value`, `version`) VALUES ('3', 'piyo', '0');


CREATE TABLE `pessimistic_lock_entity` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `value` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;



INSERT INTO `test`.`pessimistic_lock_entity` (`id`, `value`) VALUES ('1', 'hoge');
INSERT INTO `test`.`pessimistic_lock_entity` (`id`, `value`) VALUES ('2', 'fuga');
INSERT INTO `test`.`pessimistic_lock_entity` (`id`, `value`) VALUES ('3', 'piyo');

