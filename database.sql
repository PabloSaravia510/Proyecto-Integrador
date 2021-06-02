DROP DATABASE if exists `db_proyecto_dawii`;
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
key FK_DET_SEC_ALU_COD_SEC_ID (COD_SEC),
key FK_DET_SEC_ALU_COD_ALU_ID (COD_ALU)
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

ALTER TABLE tb_carrera
	ADD CONSTRAINT CHK_EST_REG_CAR CHECK (EST_REG IN ('ACTIVO','INACTIVO'));

ALTER TABLE tb_alumno
	ADD	CONSTRAINT FK_ALU_COD_CAR_ID FOREIGN KEY (COD_CAR) REFERENCES tb_carrera (COD_CAR),
	ADD	CONSTRAINT FK_ALU_COD_ROL_ID FOREIGN KEY (COD_ROL) REFERENCES tb_rol (COD_ROL),
	ADD CONSTRAINT CHK_PASS_ALU CHECK (char_length(PASS_ALU) > 2 and char_length(PASS_ALU) < 16),
	ADD CONSTRAINT CHK_EST_REG_ALU CHECK (EST_REG IN ('ACTIVO', 'RETIRADO', 'SUSPENDIDO', 'INACTIVO')),
	ADD CONSTRAINT UNQ_USU_ALU UNIQUE (USU_ALU),
	ALTER CEL_ALU SET DEFAULT 'NO';    
    
ALTER TABLE tb_profesor 
	ADD CONSTRAINT CHK_PASS_PRO CHECK (char_length(PASS_PRO) > 2 and char_length(PASS_PRO) < 16),
	ADD	CONSTRAINT FK_PRO_COD_ROL_ID FOREIGN KEY (COD_ROL) REFERENCES tb_rol (COD_ROL),
	ADD CONSTRAINT CHK_EST_REG_PRO CHECK (EST_REG IN ('ACTIVO', 'RETIRADO', 'SUSPENDIDO')),
	ADD CONSTRAINT UNQ_USU_PRO UNIQUE (USU_PRO),
	ALTER CEL_PRO SET DEFAULT 'NO';
	 

ALTER TABLE tb_seccion
	ADD	CONSTRAINT FK_SEC_COD_PRO_ID FOREIGN KEY (COD_PRO) REFERENCES tb_profesor (COD_PRO),
    ADD	CONSTRAINT FK_SEC_COD_HOR_ID FOREIGN KEY (COD_HOR) REFERENCES tb_horario (COD_HOR),
	ADD CONSTRAINT CHK_LFAL_SEC CHECK (char_length(LFAL_SEC) < 4),
	ADD CONSTRAINT CHK_LCLA_SEC CHECK (char_length(LCLA_SEC) < 15),
	ADD CONSTRAINT CHK_EST_REG_SEC CHECK (EST_REG IN ('ACTIVO','INACTIVO')),
	ALTER NOTA_1 SET DEFAULT 0,
	ALTER NOTA_2 SET DEFAULT 0;
   
    
    
ALTER TABLE tb_clase
	ADD	CONSTRAINT FK_CLA_COD_SEC_ID FOREIGN KEY (COD_SEC) REFERENCES tb_seccion (COD_SEC),
	ADD CONSTRAINT CHK_EST_REG_CLA CHECK (EST_REG IN ('ACTIVO', 'INACTIVO'));
    
    
    
ALTER TABLE tb_asistencia
	ADD	CONSTRAINT FK_ASI_COD_ALU_ID FOREIGN KEY (COD_ALU) REFERENCES tb_alumno (COD_ALU),
    ADD	CONSTRAINT FK_ASI_COD_CLA_ID FOREIGN KEY (COD_CLA) REFERENCES tb_clase (COD_CLA),
	ADD CONSTRAINT CHK_EST_REG_ASIS CHECK (EST_REG IN ('ASISTIDO', 'INASISTIDO'));
    
ALTER TABLE tb_administrador 
	ADD	CONSTRAINT FK_ADMIN_COD_ROL_ID FOREIGN KEY (COD_ROL) REFERENCES tb_rol (COD_ROL),
	ADD CONSTRAINT CHK_PASS_ADMIN CHECK (char_length(PASS_ADMIN) > 2 and char_length(PASS_ADMIN) < 16),
	ADD CONSTRAINT CHK_EST_REG_ADMIN CHECK (EST_REG IN ('ACTIVO', 'INACTIVO')),
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
R = RETIRADO 
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


USE `db_proyecto_dawii`;
DROP procedure IF EXISTS `SP_listarHorario`;
DELIMITER $$
USE `db_proyecto_dawii`$$
CREATE PROCEDURE `SP_listarHorario` ()
BEGIN
	select * from tb_horario;
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
    join tb_rol r on p.cod_rol=r.cod_rol;
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
		est_reg = 'SUSPENDIDO'
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
    join tb_rol r on al.cod_rol=r.cod_rol;
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

/*-------------------------------------------------------------------------------------*/

USE `db_proyecto_dawii`;
DROP procedure IF EXISTS `SP_saveSeccion`;
DELIMITER $$
USE `db_proyecto_dawii`$$
CREATE PROCEDURE `SP_saveSeccion` (seccion char(4),curso varchar(50) ,nota1 int(2),nota2 int(2),codpro int(8),codhora int(8),lfal int(2),lcla int(2),estado varchar(25)) 
BEGIN
	insert into tb_seccion 
    values (null,seccion,curso,nota1,nota2,codpro,codhora,lfal,lcla,estado);
END$$
DELIMITER ;


USE `db_proyecto_dawii`;
DROP procedure IF EXISTS `SP_updateSeccion`;
DELIMITER $$
USE `db_proyecto_dawii`$$
CREATE PROCEDURE `SP_updateSeccion`(cod int(8),seccion char(4),curso varchar(50) ,nota1 int(2),nota2 int(2),codpro int(8),codhora int(8),lfal int(2),lcla int(2),estado varchar(25)) 
BEGIN
	update tb_seccion 
    set
		des_sec = seccion,
        des_curs = curso,
        nota_1 = nota1,
        nota_2 = nota2,
        cod_pro = codpro,
        cod_hor = codhora,
        lfal_sec = lfal,
        lcla_sec = lcla,
        est_reg = estado
    where cod_sec = cod;
END$$
DELIMITER ;


USE `db_proyecto_dawii`;
DROP procedure IF EXISTS `SP_findSeccion`;
DELIMITER $$
USE `db_proyecto_dawii`$$
CREATE PROCEDURE `SP_findSeccion` (cod int(8))
BEGIN
	select * from tb_seccion where cod_sec = cod;
END$$
DELIMITER ;


USE `db_proyecto_dawii`;
DROP procedure IF EXISTS `SP_deleteSeccion`;
DELIMITER $$
USE `db_proyecto_dawii`$$
CREATE PROCEDURE `SP_deleteSeccion` (cod int(8))
BEGIN
	update tb_seccion
    set
		est_reg = 'INACTIVO'
	where cod_sec = cod;
END$$
DELIMITER ;



USE `db_proyecto_dawii`;
DROP procedure IF EXISTS `SP_listarSeccion`;
DELIMITER $$
USE `db_proyecto_dawii`$$
CREATE PROCEDURE `SP_listarSeccion` ()
BEGIN
	select s.cod_sec, s.des_sec,s.des_curs,s.nota_1,s.nota_2,s.cod_pro,p.nom_pro,s.cod_hor,h.des_hor,s.lfal_sec,s.lcla_sec,s.est_reg
    from tb_seccion s
    join tb_profesor p on s.cod_pro = p.cod_pro
    join tb_horario h on s.cod_hor = h.cod_hor;
END$$
DELIMITER ;



USE `db_proyecto_dawii`;
DROP procedure IF EXISTS `SP_listarSeccionxProfesor`;
DELIMITER $$
USE `db_proyecto_dawii`$$
CREATE PROCEDURE `SP_listarSeccionxProfesor` (cod int(8))
BEGIN
		select s.cod_sec, s.des_sec,s.des_curs,s.nota_1,s.nota_2,s.cod_pro,p.nom_pro,s.cod_hor,h.des_hor,s.lfal_sec,s.lcla_sec,s.est_reg
    from tb_seccion s
    join tb_profesor p on s.cod_pro = p.cod_pro
    join tb_horario h on s.cod_hor = h.cod_hor
    where s.cod_sec = cod;
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


----------------------------------------------------------------

INSERT INTO `db_proyecto_dawii`.`tb_horario` (`COD_HOR`, `DES_HOR`) VALUES ('1', '2021-03-11 13:05');
INSERT INTO `db_proyecto_dawii`.`tb_horario` (`COD_HOR`, `DES_HOR`) VALUES ('2', '2021-03-11 15:05');
INSERT INTO `db_proyecto_dawii`.`tb_horario` (`COD_HOR`, `DES_HOR`) VALUES ('3', '2021-03-11 18:05');

<<<<<<< HEAD

INSERT INTO `db_proyecto_dawii`.`tb_seccion` (`COD_SEC`,`DES_SEC`, `DES_CURS`, `NOTA_1`, `NOTA_2`, `COD_PRO`, `COD_HOR`, `LFAL_SEC`, `LCLA_SEC`, `EST_REG`) VALUES (1,'T4BB', 'Lenguaje de Programacion', '16', '18', '1', '1', '3', '14', 'ACTIVO');
INSERT INTO `db_proyecto_dawii`.`tb_seccion` (`COD_SEC`,`DES_SEC`, `DES_CURS`, `NOTA_1`, `NOTA_2`, `COD_PRO`, `COD_HOR`, `LFAL_SEC`, `LCLA_SEC`, `EST_REG`) VALUES (2,'T4DB', 'Gestion de proyecto', '15', '19', '2', '2', '3', '7', 'ACTIVO');



-- LOG IN STORE PROCEDURE --
DROP PROCEDURE IF exists `SP_InicioSesion`;
DELIMITER $$
CREATE PROCEDURE `SP_InicioSesion`(usuario char(10), passw char(10), coderol int(1))
BEGIN
	IF coderol = 1 THEN 
			SELECT a.NOM_ADMIN, a.APE_ADMIN, r.DES_ROL FROM tb_administrador a INNER JOIN tb_rol r ON a.COD_ROL = r.COD_ROL
												WHERE a.USU_ADMIN = usuario AND a.PASS_ADMIN = passw;
	ELSEIF coderol = 2 THEN
			SELECT p.NOM_PRO, p.APE_PRO, r.DES_ROL FROM tb_profesor p INNER JOIN tb_rol r ON p.COD_ROL = r.COD_ROL 
										WHERE p.USU_PRO = usuario AND p.PASS_PRO = passw;
	ELSE
			SELECT  a.NOM_ALU, a.APE_ALU, r.DES_ROL FROM tb_alumno a INNER JOIN tb_rol r ON a.COD_ROL = r.COD_ROL 
																WHERE a.USU_ALU = usuario AND a.PASS_ALU = passw;
	END IF;
END$$
DELIMITER ;


call SP_InicioSesion('mperez','123',1); -- administrador
call SP_InicioSesion('csolit','123',2); -- docente
call SP_InicioSesion('jperez','123',3); -- estudiante
=======

INSERT INTO `db_proyecto_dawii`.`tb_seccion` (`COD_SEC`,`DES_SEC`, `DES_CURS`, `NOTA_1`, `NOTA_2`, `COD_PRO`, `COD_HOR`, `LFAL_SEC`, `LCLA_SEC`, `EST_REG`) VALUES (1,'T4BB', 'Lenguaje de Programacion', '16', '18', '1', '1', '3', '14', 'ACTIVO');
INSERT INTO `db_proyecto_dawii`.`tb_seccion` (`COD_SEC`,`DES_SEC`, `DES_CURS`, `NOTA_1`, `NOTA_2`, `COD_PRO`, `COD_HOR`, `LFAL_SEC`, `LCLA_SEC`, `EST_REG`) VALUES (2,'T4DB', 'Gestion de proyecto', '15', '19', '2', '2', '3', '7', 'ACTIVO');
>>>>>>> 8b334e187cbd239c84df43e5cda908398d73c634

use db_proyecto_dawii;
select   * from tb_alumno;
select   * from tb_profesor;
select   * from tb_administrador;
select * from tb_rol;