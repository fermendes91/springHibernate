-- Script criado para o come�o do projeto, para criar um usuario no banco de dados.
CREATE USER 'hbstudent'@'localhost' IDENTIFIED BY 'hbstudent';

ALTER USER 'hbstudent'@'localhost' IDENTIFIED WITH mysql_native_password BY 'hbstudent';