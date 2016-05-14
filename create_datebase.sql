CREATE database blog;
use blog;

CREATE TABLE `user` (
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO user VALUES ("hello","123456");

CREATE TABLE `archive_table` (
  `archive` varchar(20) NOT NULL,
  PRIMARY KEY (`archive`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO archive_table VALUES ("a");
INSERT INTO archive_table VALUES ("b");
INSERT INTO archive_table VALUES ("c");

CREATE TABLE `article` (
  `title` varchar(20) NOT NULL,
  `archive` varchar(20) DEFAULT NULL,
  `content` text,
  `datetime` date DEFAULT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`),
  KEY `article_archive_table_archive_fk` (`archive`),
  CONSTRAINT `article_archive_table_archive_fk` FOREIGN KEY (`archive`) REFERENCES `archive_table` (`archive`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

INSERT INTO article(archive,title,content,datetime) VALUES ("a","timu","neirong","2016-05-07");

CREATE TABLE `comment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `comment` text NOT NULL,
  `post` int(11) DEFAULT NULL,
  `datetime` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `comment_article_id_fk` (`post`),
  CONSTRAINT `comment_article_id_fk` FOREIGN KEY (`post`) REFERENCES `article` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;