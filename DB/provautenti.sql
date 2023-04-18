CREATE TABLE `utenti` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) DEFAULT NOT NULL,
  `cognome` varchar(50) DEFAULT NOT NULL,
  `email` varchar(100) DEFAULT NOT NULL,
  PRIMARY KEY (`id`)
)

INSERT INTO `utenti` VALUES (1,'Paperino','Paolino','p.paperino@gmail.com'),(2,'Bugs','bunny','b.bunny@gmail.com'),(3,'Piperita','Patty','p.patty@gmail.com'),(4,'test','test','t.test@test.com');

