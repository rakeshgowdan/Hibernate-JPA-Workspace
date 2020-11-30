use hibernatedemo;

CREATE TABLE `users` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `fullname` varchar(45) NOT NULL,
   `email` varchar(45) NOT NULL, 
  `password` varchar(45) NOT NULL, 
  PRIMARY KEY (`user_id`)
);

