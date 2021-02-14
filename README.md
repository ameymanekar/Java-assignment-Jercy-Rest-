# Java-assignment-Jercy-Rest-



create database studentproject;
use studentproject;

create table STUDENT (
STUNO integer primary key auto_increment,
STUDENT_NAME varchar(50),
STUDENT_DOB varchar(50),
STUDENT_DOJ varchar(50));



create table PROJECT (
PRJ_NO integer primary key auto_increment,
PRJ_NAME varchar(50),
PRJ_DUR varchar(50),
PRJ_PLATFORM varchar(50));


create table STUDENTPROJECT (
STUNO integer ,
PRJ_NO integer ,
DESIGNATION varchar(50),
PRIMARY KEY (STUNO,PRJ_NO,DESIGNATION),
FOREIGN KEY (STUNO) REFERENCES STUDENT (STUNO),
FOREIGN KEY (PRJ_NO) REFERENCES PRoject (PRJ_NO)
)



INSERT INTO STUDENT (STUDENT_NAME, STUDENT_DOB, STUDENT_DOJ)
VALUES ('sunay','17/3/1995','20/2/2021');


