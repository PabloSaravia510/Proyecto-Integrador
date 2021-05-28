DROP DATABASE `db_proyecto_dawii`;
CREATE database `db_proyecto_dawii`;
use `db_proyecto_dawii`;

-------------------------------------------------------------------------------------------------------------
/*CREATE TABLAS*/

drop table if exists `tb_carrera`;
create table `tb_carrera`(
COD_CAR int (8) not null auto_increment primary key,
DES_CAR varchar(250) not null,
EST_REG varchar(25) not null
);


drop table if exists `tb_rol`;
create table `tb_rol`(
COD_ROL int (8) not null auto_increment primary key,
DES_ROL varchar(250) not null
);


drop table if exists `tb_alumno`;
create table `tb_alumno`(
COD_ALU int (8) not null auto_increment primary key,
NOM_ALU varchar(150) not null,
APE_ALU varchar(150) not null,
USU_ALU char(10) not null,
PASS_ALU char(16) not null,
COD_CAR int(8) not null,
EDAD_ALU int not null,
CEL_ALU char(9) not null,
DIR_ALU varchar(250) not null,
COD_ROL int (8)  not null,
EST_REG varchar(25) not null
);


drop table if exists `tb_profesor`;
create table `tb_profesor`(
COD_PRO int (8) not null auto_increment primary key,
NOM_PRO varchar(150) not null,
APE_PRO varchar(150) not null,
USU_PRO char(10) not null,
PASS_PRO char(16) not null,
EDAD_PRO int not null,
CEL_PRO char(9) not null,
DIR_PRO varchar(250) not null,
COD_ROL int (8)  not null,
EST_REG varchar(25) not null

);


drop table if exists `tb_horario`;
create table `tb_horario`(
COD_HOR int(8) not null auto_increment primary key,
DES_HOR datetime not null
);


drop table if exists `tb_seccion`;
create table `tb_seccion`(
COD_SEC int(8)  not null auto_increment primary key,
DES_SEC char(4) not null,
DES_CURS varchar(50) not null,
NOTA_1 int(2) not null,
NOTA_2 int(2) not null,
COD_PRO int(8) not null,
COD_HOR int(8) not null,
LFAL_SEC int(2) not null,
LCLA_SEC int(2) not null,
EST_REG varchar(25) not null
);


drop table if exists `tb_det_sec_alu`;
create table `tb_det_sec_alu`(
COD_SEC int(8) not null,
COD_ALU int(8) not null,
primary key (COD_SEC,COD_ALU)
);


drop table if exists `tb_clase`;
create table `tb_clase`(
COD_CLA int(8) not null auto_increment primary key,
COD_SEC int(8)  not null,
EST_REG varchar(25) not null
);


drop table if exists `tb_asistencia`;
create table `tb_asistencia`(
COD_ASI int (8) not null auto_increment primary key,
COD_ALU int(8) not null,
COD_CLA int(8) not null,
EST_REG varchar(25) not null
);


drop table if exists `tb_geolocalizacion`;
create table `tb_geolocalizacion`(
COD_GEO int(8)  not null auto_increment primary key,
COR_GEO char(4) not null,
COD_ALU int(8) not null
);



drop table if exists `tb_administrador`;
create table `tb_administrador`(
COD_ADMIN int (8) not null auto_increment primary key,
NOM_ADMIN varchar(150) not null,
APE_ADMIN varchar(150) not null,
USU_ADMIN char(10) not null,
PASS_ADMIN char(16) not null,
COD_ROL int (8)  not null,
EST_REG varchar(25) not null
);



drop table if exists `tb_QR`;
create table `tb_QR`(
COD_QR int(8)  not null auto_increment primary key,
DES_QR varchar(50) not null,
FEC_QR datetime not null
);


-------------------------------------------------------------------------------------------------------------
/*ALTER CONSTRAINT */

ALTER TABLE tb_alumno
	ADD	CONSTRAINT FK_ALU_COD_CAR_ID FOREIGN KEY (COD_CAR) REFERENCES tb_carrera (COD_CAR),
	ADD	CONSTRAINT FK_ALU_COD_ROL_ID FOREIGN KEY (COD_ROL) REFERENCES tb_rol (COD_ROL),
	ADD CONSTRAINT CHK_PASS_ALU CHECK (char_length(PASS_ALU) > 2 and char_length(PASS_ALU) < 16),
	ADD CONSTRAINT CHK_EST_REG CHECK (EST_REG IN ('A', 'R', 'S', 'I')),
	ADD CONSTRAINT UNQ_USU_ALU UNIQUE (USU_ALU),
	ALTER CEL_ALU SET DEFAULT 'NO';    
    
ALTER TABLE tb_profesor 
	ADD CONSTRAINT CHK_PASS_PRO CHECK (char_length(PASS_PRO) > 2 and char_length(PASS_PRO) < 16),
	ADD	CONSTRAINT FK_PRO_COD_ROL_ID FOREIGN KEY (COD_ROL) REFERENCES tb_rol (COD_ROL),
	ADD CONSTRAINT CHK_EST_REG CHECK (EST_REG IN ('A', 'R', 'S')),
	ADD CONSTRAINT UNQ_USU_PRO UNIQUE (USU_PRO),
	ALTER CEL_PRO SET DEFAULT 'NO';
	 

ALTER TABLE tb_seccion
	ADD	CONSTRAINT FK_SEC_COD_PRO_ID FOREIGN KEY (COD_PRO) REFERENCES tb_profesor (COD_PRO),
    ADD	CONSTRAINT FK_SEC_COD_HOR_ID FOREIGN KEY (COD_HOR) REFERENCES tb_horario (COD_HOR),
	ADD CONSTRAINT CHK_LFAL_SEC CHECK (char_length(LFAL_SEC) < 4),
	ADD CONSTRAINT CHK_LCLA_SEC CHECK (char_length(LCLA_SEC) < 15),
	ADD CONSTRAINT CHK_EST_REG CHECK (EST_REG IN ('A','I')),
	ALTER NOTA_1 SET DEFAULT 0,
	ALTER NOTA_2 SET DEFAULT 0;
   
    
    
ALTER TABLE tb_clase
	ADD	CONSTRAINT FK_CLA_COD_SEC_ID FOREIGN KEY (COD_SEC) REFERENCES tb_seccion (COD_SEC),
	ADD CONSTRAINT CHK_EST_REG CHECK (EST_REG IN ('A', 'I'));
    
    
    
ALTER TABLE tb_asistencia
	ADD	CONSTRAINT FK_ASI_COD_ALU_ID FOREIGN KEY (COD_ALU) REFERENCES tb_alumno (COD_ALU),
    ADD	CONSTRAINT FK_ASI_COD_CLA_ID FOREIGN KEY (COD_CLA) REFERENCES tb_clase (COD_CLA),
	ADD CONSTRAINT CHK_EST_REG CHECK (EST_REG IN ('A', 'I'));
    
ALTER TABLE tb_administrador 
	ADD	CONSTRAINT FK_ADMIN_COD_ROL_ID FOREIGN KEY (COD_ROL) REFERENCES tb_rol (COD_ROL),
	ADD CONSTRAINT CHK_PASS_ADMIN CHECK (char_length(PASS_ADMIN) > 2 and char_length(PASS_ADMIN) < 16),
	ADD CONSTRAINT CHK_EST_REG CHECK (EST_REG IN ('A', 'I')),
	ADD CONSTRAINT UNQ_USU_ADMIN UNIQUE (USU_ADMIN);
	 
    
ALTER TABLE tb_geolocalizacion
	ADD	CONSTRAINT FK_GEO_COD_ALU_ID FOREIGN KEY (COD_ALU) REFERENCES tb_alumno (COD_ALU);
    
ALTER TABLE tb_det_sec_alu
	ADD	CONSTRAINT FK_DET_SEC_ALU_COD_SEC_ID FOREIGN KEY (COD_SEC) REFERENCES tb_seccion (COD_SEC),
    ADD	CONSTRAINT FK_DET_SEC_ALU_COD_ALU_ID FOREIGN KEY (COD_ALU) REFERENCES tb_alumno (COD_ALU);   


/*ROL_USU 			
1 = Administrador 
2 = Docente
3 = Estudiante
*/


/* EST_REG
A = ACTIVO 
I = INACTIVO 
R = RETIRARO 
S = SUSPENDIDO  



tb_asistencia
EST_REG
A = ASISTIDO 
I = INASISTIDO 
*/

-------------------------------------------------------------------------------------------------------------



/*STORE PROCEDURE*/
USE `db_proyecto_dawii`;
DROP procedure IF EXISTS `SP_listarRol`;
DELIMITER $$
USE `db_proyecto_dawii`$$
CREATE PROCEDURE `SP_listarRol` ()
BEGIN
	select * from tb_rol;
END$$
DELIMITER ;



USE `db_proyecto_dawii`;
DROP procedure IF EXISTS `SP_listarCarrera`;
DELIMITER $$
USE `db_proyecto_dawii`$$
CREATE PROCEDURE `SP_listarCarrera` ()
BEGIN
	select * from tb_carrera;
END$$
DELIMITER ;




/*-----------------------------------------------------------*/

USE `db_proyecto_dawii`;
DROP procedure IF EXISTS `SP_listarDocentes`;
DELIMITER $$
USE `db_proyecto_dawii`$$
CREATE PROCEDURE `SP_listarDocentes` ()
BEGIN
	select p.cod_pro,p.nom_pro,p.ape_pro,p.usu_pro,p.pass_pro,p.edad_pro,p.cel_pro,p.dir_pro,p.cod_rol,r.des_rol,p.est_reg 
    from tb_profesor p 
    join tb_rol r on p.cod_rol=r.cod_rol
    where p.est_reg = 'ACTIVO';
END$$
DELIMITER ;




USE `db_proyecto_dawii`;
DROP procedure IF EXISTS `SP_deleteDocente`;
DELIMITER $$
USE `db_proyecto_dawii`$$
CREATE PROCEDURE `SP_deleteDocente` (codigo int)
BEGIN

	UPDATE tb_profesor
    set 
		est_reg = 'INACTIVO'
    where cod_pro = codigo;
END$$
DELIMITER ;





USE `db_proyecto_dawii`;
DROP procedure IF EXISTS `SP_saveDocente`;
DELIMITER $$
USE `db_proyecto_dawii`$$
CREATE PROCEDURE `SP_saveDocente` (nom varchar(150), ape varchar(150), usu char(10), pass char(16), edad int(11), cel char(9), dir varchar(250), rol int(8), estado varchar(25) )
BEGIN
	insert into tb_profesor 
    values (null,nom,ape,usu,pass,edad,cel,dir,rol, estado);
END$$
DELIMITER ;



USE `db_proyecto_dawii`;
DROP procedure IF EXISTS `SP_updateDocente`;
DELIMITER $$
USE `db_proyecto_dawii`$$
CREATE PROCEDURE `SP_updateDocente` (cod int(8), nom varchar(150), ape varchar(150), usu char(10), pass char(16), edad int(11), cel char(9), dir varchar(250), rol int(8), estado varchar(25) )
BEGIN
	update tb_profesor
    set
		nom_pro = nom,
        ape_pro = ape,
        usu_pro = usu,
        pass_pro = pass,
        edad_pro = edad,
        cel_pro = cel,
        dir_pro = dir,
        cod_rol = rol,
        est_reg = estado
    where cod_pro = cod;
END$$
DELIMITER ;


USE `db_proyecto_dawii`;
DROP procedure IF EXISTS `SP_findDocente`;
DELIMITER $$
USE `db_proyecto_dawii`$$
CREATE PROCEDURE `SP_findDocente` (cod int(8))
BEGIN
	select p.cod_pro,p.nom_pro,p.ape_pro,p.usu_pro,p.pass_pro,p.edad_pro,p.cel_pro,p.dir_pro,p.cod_rol,r.des_rol,p.est_reg from tb_profesor p
    join tb_rol r on p.cod_rol = r.cod_rol
    where p.cod_pro = cod;
END$$
DELIMITER ;



/*-----------------------------------------------------------*/


USE `db_proyecto_dawii`;
DROP procedure IF EXISTS `SP_listarAlu`;
DELIMITER $$
USE `db_proyecto_dawii`$$
CREATE PROCEDURE `SP_listarAlu` ()
BEGIN
	select al.cod_alu,al.nom_alu,al.ape_alu,al.usu_alu,al.pass_alu,al.cod_car,c.des_car,al.edad_alu,al.cel_alu,al.dir_alu,al.cod_rol,r.des_rol,al.est_reg
    from tb_alumno al 
    join tb_carrera c on al.cod_car=c.cod_car
    join tb_rol r on al.cod_rol=r.cod_rol
    where al.est_reg = 'ACTIVO';
END$$
DELIMITER ;






USE `db_proyecto_dawii`;
DROP procedure IF EXISTS `SP_deleteAlu`;
DELIMITER $$
USE `db_proyecto_dawii`$$
CREATE PROCEDURE `SP_deleteAlu` (codigo int)
BEGIN
	UPDATE tb_alumno
    set 
		est_reg = 'INACTIVO'
    where cod_alu = codigo;
END$$
DELIMITER ;



USE `db_proyecto_dawii`;
DROP procedure IF EXISTS `SP_saveAlu`;
DELIMITER $$
USE `db_proyecto_dawii`$$
CREATE PROCEDURE `SP_saveAlu` (nom varchar(150), ape varchar(150), usu char(10), pass char(16), carrera int(8), edad int(11), cel char(9), dir varchar(250), rol int(8), estado varchar(25) )
BEGIN
	insert into tb_alumno  
    values(null,nom,ape,usu,pass,carrera,edad,cel,dir,rol,estado);
END$$
DELIMITER ;




USE `db_proyecto_dawii`;
DROP procedure IF EXISTS `SP_updateAlu`;
DELIMITER $$
USE `db_proyecto_dawii`$$
CREATE PROCEDURE `SP_updateAlu` (cod int(8), nom varchar(150), ape varchar(150), usu char(10), pass char(16), carrera int(8), edad int(11), cel char(9), dir varchar(250), rol int(8), estado varchar(25) )
BEGIN
	update tb_alumno
    set
		nom_alu = nom,
        ape_alu = ape,
        usu_alu = usu,
        pass_alu = pass,
        cod_car = carrera,
        edad_alu = edad,
        cel_alu = cel,
        dir_alu = dir,
        cod_rol = rol,
        est_reg = estado
    where cod_alu = cod;
END$$
DELIMITER ;


USE `db_proyecto_dawii`;
DROP procedure IF EXISTS `SP_findAlu`;
DELIMITER $$
USE `db_proyecto_dawii`$$
CREATE PROCEDURE `SP_findAlu` (cod int(8))
BEGIN
	select * from tb_alumno where cod_alu = cod;
END$$
DELIMITER ;




/*---------------------------------------------------------------------------------------------------------------*/
    
/*INSERT*/
insert into tb_rol values (1,'Administrador');
insert into tb_rol values (2,'Docente');
insert into tb_rol values (3,'Alumno');


INSERT INTO `db_proyecto_dawii`.`tb_carrera` (`COD_CAR`, `DES_CAR`, `EST_REG`) VALUES ('1', 'Computacion e Informatica', 'ACTIVO');
INSERT INTO `db_proyecto_dawii`.`tb_carrera` (`COD_CAR`, `DES_CAR`, `EST_REG`) VALUES ('2', 'Administracion de Empresas', 'ACTIVO');


INSERT INTO `db_proyecto_dawii`.`tb_administrador` (`COD_ADMIN`, `NOM_ADMIN`, `APE_ADMIN`, `USU_ADMIN`, `PASS_ADMIN`, `COD_ROL`, `EST_REG`) VALUES ('1', 'Manuel', 'Perez', 'mperez', '123', '1', 'ACTIVO');
INSERT INTO `db_proyecto_dawii`.`tb_administrador` (`COD_ADMIN`, `NOM_ADMIN`, `APE_ADMIN`, `USU_ADMIN`, `PASS_ADMIN`, `COD_ROL`, `EST_REG`) VALUES ('2', 'Juan', 'Balazar', 'jbalazar', '123', '1', 'ACTIVO');




INSERT INTO `db_proyecto_dawii`.`tb_alumno` (`COD_ALU`, `NOM_ALU`, `APE_ALU`, `USU_ALU`, `PASS_ALU`, `COD_CAR`, `EDAD_ALU`, `CEL_ALU`, `DIR_ALU`, `COD_ROL`, `EST_REG`) VALUES ('1', 'Juan', 'Perez', 'jperez', '123', '1', '20', '978457102', 'Av. 28 de Julio', '3', 'ACTIVO');
INSERT INTO `db_proyecto_dawii`.`tb_alumno` (`COD_ALU`, `NOM_ALU`, `APE_ALU`, `USU_ALU`, `PASS_ALU`, `COD_CAR`, `EDAD_ALU`, `CEL_ALU`, `DIR_ALU`, `COD_ROL`, `EST_REG`) VALUES ('2', 'Erick', 'Sanchez', 'esanchez', '123', '2', '24', '994102478', 'Av.Aviacion', '3', 'ACTIVO');



INSERT INTO `db_proyecto_dawii`.`tb_profesor` (`COD_PRO`, `NOM_PRO`, `APE_PRO`, `USU_PRO`, `PASS_PRO`, `EDAD_PRO`, `CEL_PRO`, `DIR_PRO`, `COD_ROL`, `EST_REG`) VALUES ('1', 'Carlos', 'Sotil', 'csolit', '123', '38', '945784578', 'Av. La Paz', '2', 'ACTIVO');
INSERT INTO `db_proyecto_dawii`.`tb_profesor` (`COD_PRO`, `NOM_PRO`, `APE_PRO`, `USU_PRO`, `PASS_PRO`, `EDAD_PRO`, `CEL_PRO`, `DIR_PRO`, `COD_ROL`, `EST_REG`) VALUES ('2', 'Cristian', 'Valdez', 'cvaldez', '123', '42', '999741247', 'Av. Brasil', '2', 'ACTIVO');




