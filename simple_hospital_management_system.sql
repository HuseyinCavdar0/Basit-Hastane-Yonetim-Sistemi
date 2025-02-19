SET SQL_SAFE_UPDATES = 0;
CREATE DATABASE simple_hospital_management_system;
USE simple_hospital_management_system;

CREATE TABLE Login(ID varchar(20), PW varchar(20));
SELECT * FROM Login;

INSERT INTO login VALUE("kullanıcı0","123");

CREATE TABLE Patient_Info(ID varchar(20), Number varchar(40), Name varchar(20), Gender varchar(20), Patient_Disease varchar(20), Room_Number varchar(20), Time varchar(100), Deposite varchar(20));
SELECT * FROM Patient_Info;

CREATE TABLE Room(Room_No varchar(20), Availability varchar(20),Price varchar(20), Room_Type varchar(100));
SELECT * FROM Room;

insert into Room values("100","Müsait","5000","G Yatak 1");
insert into Room values("101","Müsait","5000","G Yatak 2");
insert into Room values("102","Müsait","5000","G Yatak 3");
insert into Room values("103","Müsait","5000","G Yatak 4");
insert into Room values("200","Müsait","15000","Özel Oda");
insert into Room values("201","Müsait","15000","Özel Oda");
insert into Room values("202","Müsait","15000","Özel Oda");
insert into Room values("203","Müsait","15000","Özel Oda");
insert into Room values("300","Müsait","35000","Yoğun Bakım Yatak 1");
insert into Room values("301","Müsait","35000","Yoğun Bakım Yatak 2");
insert into Room values("302","Müsait","35000","Yoğun Bakım Yatak 3");
insert into Room values("303","Müsait","35000","Yoğun Bakım Yatak 4");


CREATE TABLE Department(Department varchar(100), Phone_No varchar(20));
select * from Department;

INSERT INTO Department VALUES ("Cerrahi Bölümü", "0123456789");
INSERT INTO Department VALUES ("Dahiliye Bölümü", "9876543210");
INSERT INTO Department VALUES ("Kardiyoloji Bölümü", "1122334455");
INSERT INTO Department VALUES ("Nöroloji Bölümü", "5566778899");


CREATE TABLE Employee_Info(Name varchar(20), Age varchar(20), Phone_Number varchar(20), Salary varchar(20), Gmail varchar(30), Kimlik_No varchar(20));
SELECT * FROM Employee_Info;

insert into Employee_Info values("Doktor1","30","5632165435","100000","bendoktor@gmail.com","1231564515");
insert into Employee_Info values("Doktor2","31","5652165435","100005","doktor@gmail.com","1231554515");

create TABLE Ambulance(Name varchar(20), Gender varchar(20),Car_Name varchar(20), AvailablityAmbulance varchar(20), Location varchar(20));
insert into Ambulance values("Hasta1", "Erkek","Amb112","Müsait","Alan 3");
select * from Ambulance;
