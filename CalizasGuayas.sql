CREATE DATABASE  IF NOT EXISTS `calizasguayas` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `calizasguayas`;
-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: calizasguayas
-- ------------------------------------------------------
-- Server version	5.7.14-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `asociacion_descuento`
--

DROP TABLE IF EXISTS `asociacion_descuento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `asociacion_descuento` (
  `RUC_Cliente` varchar(15) NOT NULL,
  `IdDescuento` int(11) NOT NULL,
  `IdProducto` varchar(15) NOT NULL,
  KEY `fk_Asociacion Descauento_Cliente_idx` (`RUC_Cliente`),
  KEY `fk_Asociacion Descauento_Descuento1_idx` (`IdDescuento`),
  KEY `fk_Asociacion Descauento_Producto1_idx` (`IdProducto`),
  CONSTRAINT `fk_Asociacion Descauento_Cliente` FOREIGN KEY (`RUC_Cliente`) REFERENCES `cliente` (`RUC_Cliente`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Asociacion Descauento_Descuento1` FOREIGN KEY (`IdDescuento`) REFERENCES `descuento` (`IdDescuento`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Asociacion Descauento_Producto1` FOREIGN KEY (`IdProducto`) REFERENCES `producto` (`IdProducto`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `asociacion_descuento`
--

LOCK TABLES `asociacion_descuento` WRITE;
/*!40000 ALTER TABLE `asociacion_descuento` DISABLE KEYS */;
/*!40000 ALTER TABLE `asociacion_descuento` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 trigger ElimiAsoDesc before delete on asociacion_descuento
for each row begin 

delete from descuento
where IdDescuento= old.IdDescuento;
end */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cliente` (
  `RUC_Cliente` varchar(15) NOT NULL,
  `Nombre` varchar(45) NOT NULL,
  `Direccion` varchar(100) NOT NULL,
  `Telefonos` varchar(45) NOT NULL,
  `Email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`RUC_Cliente`),
  UNIQUE KEY `IdCliente_UNIQUE` (`RUC_Cliente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES ('0100093814001','JORGE MOSCOSO BUSTAMANTE','AV MANUEL DE JESUS VARGA - SANTA ROSA','032823041','@'),('0201179512001','MARCO VINICIO VARGAS MORETA','PRINCIPAL S/N FRENTE CASA BARRIAL, SAN ANTONIO DE CALAPICHA - LATACUNGA','072927339','@'),('0258963214565','Emilia','Re:zero','no existen','tampoco existen'),('0700664006001','ALFONSO ORTEGA','DIRECCION: PICHINCHA Y COLON ESQUINA','2984577','@'),('0700975378001','NILO PONTON VARGAS','DIRECCION:COLON Y 15 DE OCTUBRE','072510302','@'),('0701006751001','JOSE RIVERA LUZURIAGA','COLON Y MACHALA ESQ.','944698','@'),('0701619702001','EMPERATRIZ CAPA CORDOVA','PASAJE ENTRE VELA Y PALMERAS','072943352','@'),('0701812729001','ROMEL CORONEL M. ','SITIO LA PITAHAYA - NARANJAL','072929939','@'),('0702621970001','OLGA MARLENE ERAS ROBLES','DIRECCION: 14AVA NORTE S/N CALLEJON PEATONAL CIUDAD: MACHALA','2284010','@'),('0702982752001','VICTOR OCHOA ALEJANDRO','PUERTO PITAHAYA - ARENILLAS','072932819','@'),('0702996422001','IRMA LEONOR QUEZADA ABAD','DIRECCION:BARRIO PRIMERO DE ABRIL CIUDAD: MACHALA','0995761334','@'),('0703339317001','MARISOL RIOFRIO VIVANCO','JUNTO AL RETEN DE ARENILLAS - LA PITAHAYA','072797200','@'),('0703992933001','MAYRA QUEZADA ABAD','DIRECCION: 2° DIAGONAL VIA SANTA ROSA -CIUDAD: MACHALA','072797012','@'),('0790048830001','EXPORTADORA FAFRA S.A','CDLA. CIUDAD COLON S/N - GUAYAQUIL','072148654','@'),('0790074076001','COOPERATIVA DE PRODUCCION PESQUERA HUALTACO','JOSE ESCALANTE Y CANAL INTERNACIONAL - HUALTACO','3092185','@'),('0791728797001','ROCORMIN CIA LTDA','VIA BELLAVISTA - SANTA ROSA','2928334','@'),('0900471715001','CARLOS RIVAS MENA','ESTERO HUAYLA - MACHALA','2284010','@'),('0911451326001','IVAN RODRIGUEZ','CDLA. SAMANEZ 7 MZ 2203 V 2','072937579','@'),('0920350014001','DIGNA PAREDES VELECELA','SOLAR 26 DURAN','0988172716','@'),('0985539960','jorge','no','no','no'),('0990553793001','CALADEMAR S.A','CARLOS LUIS PLAZA DAÑIN Y AV. DEMOCRACIA - GUAYAQUIL','22','@'),('0992593016001','LUTHORCORP S.A','CARLOS LUIS PLAZA DAÑIN Y AV. DEMOCRACIA','0991082145','@'),('0992593040001','PROMUSTERRA S.A','Coop Techo para Todos, Av VicenteTrujillo Solar 4 Manzana E entre Los Rios y Tulcan','22430','@'),('0992593083001','TERRAQUIL S.A','CARLOS LUIS PLAZA DAÑIN Y AV. DEMOCRACIA - GUAYAQUIL','555','@'),('0992619384001','CIPRON C. LTDA.','SEDALANA 1704 Y JOSE MASCOTE - GUAYAQUIL','2470025','s@p'),('0992619422001','CULCAE CIA LTDA','CDLA. VILLAMIL SOLAR 1 MZ F - GUAYAQUIL','2343986','@'),('0992619457001','PROCAE C. LTDA','Coop Techo para Todos, Av VicenteTrujillo Solar 4 Manzana E entre Los Rios y Tulcan','2288437','H@H'),('1100591682001','JOSE MARIA CELI CELI','PUERTO JELI','2288437','@'),('1101793980001','JOSE RODRIGUEZ SALGADO  ','NAPOLEON MERA Y SAN MARTIN','072943238','@'),('1105810939001','ARIANA PAOLA CASTRO ELIZALDE','ESMERALDAS S/N Y AZUAY - HUALTACO','072148667','@'),('1307010809001','JENNY VELEZ','BALAO - NARANJAL','0994464380','@'),('15641','46415641','564464','56646',''),('1714192646001','JOSE LUIS RODRIGUEZ','NAPOLEON MERA Y SAN MARTIN','0995101150','@'),('1891725198001','AGROHERDEZ EL HUERTO CIA LTDA','AV. 12 DE NOVIEMBRE 09-55 Y TOMAS SEVILLA - AMBATO','0991709261','@'),('2564','664','696','96464','9797'),('5446556','54156465','3415645','5645646','565656');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 trigger ElimineClient before delete on cliente
for each row begin
delete from factura
where RUC_Cliente = old.RUC_Cliente;

delete from asociacion_descuento
where RUC_Cliente =old.RUC_Cliente;
end */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `descuento`
--

DROP TABLE IF EXISTS `descuento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `descuento` (
  `IdDescuento` int(11) NOT NULL AUTO_INCREMENT,
  `Descripcion` varchar(45) NOT NULL,
  `Porcentaje` float NOT NULL,
  PRIMARY KEY (`IdDescuento`),
  UNIQUE KEY `IdDescuento_UNIQUE` (`IdDescuento`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `descuento`
--

LOCK TABLES `descuento` WRITE;
/*!40000 ALTER TABLE `descuento` DISABLE KEYS */;
INSERT INTO `descuento` VALUES (1,'cliente frecuente',10),(2,'cliente no frecuente',0),(3,'cliente standar',5),(4,'cliente contado',12);
/*!40000 ALTER TABLE `descuento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empleados`
--

DROP TABLE IF EXISTS `empleados`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `empleados` (
  `Cedula_Empleados` varchar(15) NOT NULL,
  `Cargo` varchar(45) NOT NULL,
  `Nombre` varchar(45) NOT NULL,
  `Telefonos` varchar(45) NOT NULL,
  `pass` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Cedula_Empleados`),
  UNIQUE KEY `Cedula_Empleados_UNIQUE` (`Cedula_Empleados`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empleados`
--

LOCK TABLES `empleados` WRITE;
/*!40000 ALTER TABLE `empleados` DISABLE KEYS */;
INSERT INTO `empleados` VALUES ('0100547678','socio','Martin Diez Canseco','0999409829','123'),('0102023728','socio','Melba Cardenas','0999481925','123'),('0924193790','secretaria','Lia Alban','3841247','123'),('cali','nexus','nexus','nexus','nexus'),('ruddy','secretaria','maryc','02556','ruddy');
/*!40000 ALTER TABLE `empleados` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `factura`
--

DROP TABLE IF EXISTS `factura`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `factura` (
  `IdFactura` varchar(15) NOT NULL,
  `Fecha_Emision` date NOT NULL,
  `Fecha_Vencimiento` date NOT NULL,
  `Estado` varchar(30) NOT NULL,
  `Sacos_Vendidos` int(11) NOT NULL,
  `Precio_Unitario` float NOT NULL,
  `Precio_Total` float NOT NULL,
  `IdProducto` varchar(15) NOT NULL,
  `RUC_Cliente` varchar(15) NOT NULL,
  `Cedula_Empleados` varchar(15) NOT NULL,
  PRIMARY KEY (`IdFactura`),
  UNIQUE KEY `IdFactura_UNIQUE` (`IdFactura`),
  KEY `fk_Factura_Producto1_idx` (`IdProducto`),
  KEY `fk_Factura_Cliente1_idx` (`RUC_Cliente`),
  KEY `fk_Factura_Empleados1_idx` (`Cedula_Empleados`),
  CONSTRAINT `fk_Factura_Cliente1` FOREIGN KEY (`RUC_Cliente`) REFERENCES `cliente` (`RUC_Cliente`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Factura_Empleados1` FOREIGN KEY (`Cedula_Empleados`) REFERENCES `empleados` (`Cedula_Empleados`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Factura_Producto1` FOREIGN KEY (`IdProducto`) REFERENCES `producto` (`IdProducto`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `factura`
--

LOCK TABLES `factura` WRITE;
/*!40000 ALTER TABLE `factura` DISABLE KEYS */;
INSERT INTO `factura` VALUES ('7584','2016-07-31','2016-08-31','pagado',1500,1.66,2490,'CC001','0702996422001','0924193790');
/*!40000 ALTER TABLE `factura` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 trigger ElimiFact before delete on factura
for each row begin 
delete from pago
where IdFactura = old.IdFactura;

delete from retencion
where IdFactura = old.IdFactura;

end */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `forma_pago`
--

DROP TABLE IF EXISTS `forma_pago`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `forma_pago` (
  `Idforma_pago` int(11) NOT NULL AUTO_INCREMENT,
  `Descripcion` varchar(45) NOT NULL,
  PRIMARY KEY (`Idforma_pago`),
  UNIQUE KEY `Idforma_pago_UNIQUE` (`Idforma_pago`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `forma_pago`
--

LOCK TABLES `forma_pago` WRITE;
/*!40000 ALTER TABLE `forma_pago` DISABLE KEYS */;
INSERT INTO `forma_pago` VALUES (1,'contado'),(2,'15 dias'),(3,'30 dias'),(4,'45 dias');
/*!40000 ALTER TABLE `forma_pago` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pago`
--

DROP TABLE IF EXISTS `pago`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pago` (
  `Numero_Comprobante` varchar(15) NOT NULL,
  `Fecha_Pago` date NOT NULL,
  `Numero_Cheque` varchar(45) DEFAULT NULL,
  `Banco_Cheque` varchar(45) DEFAULT NULL,
  `Banco_Deposito` varchar(45) DEFAULT NULL,
  `Cuenta_Deposito` varchar(45) DEFAULT NULL,
  `Valor_Cancelado` float NOT NULL,
  `IdFactura` varchar(15) NOT NULL,
  `Idforma_pago` int(11) NOT NULL,
  PRIMARY KEY (`Numero_Comprobante`),
  KEY `fk_Pago_Factura1_idx` (`IdFactura`),
  KEY `fk_Pago_forma_pago1_idx` (`Idforma_pago`),
  CONSTRAINT `fk_Pago_Factura1` FOREIGN KEY (`IdFactura`) REFERENCES `factura` (`IdFactura`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Pago_forma_pago1` FOREIGN KEY (`Idforma_pago`) REFERENCES `forma_pago` (`Idforma_pago`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pago`
--

LOCK TABLES `pago` WRITE;
/*!40000 ALTER TABLE `pago` DISABLE KEYS */;
INSERT INTO `pago` VALUES ('8000520','2016-04-21','000','PACIFICO','PACIFICO','593666',148,'7584',4);
/*!40000 ALTER TABLE `pago` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `producto`
--

DROP TABLE IF EXISTS `producto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `producto` (
  `IdProducto` varchar(15) NOT NULL,
  `Stock` int(11) NOT NULL,
  `Nombre` varchar(45) NOT NULL,
  `Precio_Unitario` float NOT NULL,
  PRIMARY KEY (`IdProducto`),
  UNIQUE KEY `IdProducto_UNIQUE` (`IdProducto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `producto`
--

LOCK TABLES `producto` WRITE;
/*!40000 ALTER TABLE `producto` DISABLE KEYS */;
INSERT INTO `producto` VALUES ('CC001',5000,'Carbonato de Calcio',2),('ZEO001',300,'Zeolita',2.5);
/*!40000 ALTER TABLE `producto` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 trigger ElimiProd before delete on producto
for each row begin 

delete from asociacion_descuento
where IdProducto = old.IdProducto;

delete from factura
where IdProducto = old.IdProducto;

end */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `retencion`
--

DROP TABLE IF EXISTS `retencion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `retencion` (
  `IdRetencion` varchar(45) NOT NULL,
  `porcentaje` float NOT NULL,
  `Valor_retenido` float NOT NULL,
  `IdFactura` varchar(15) NOT NULL,
  PRIMARY KEY (`IdRetencion`),
  UNIQUE KEY `IdRetencion_UNIQUE` (`IdRetencion`),
  KEY `fk_Retencion_Factura1_idx` (`IdFactura`),
  CONSTRAINT `fk_Retencion_Factura1` FOREIGN KEY (`IdFactura`) REFERENCES `factura` (`IdFactura`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `retencion`
--

LOCK TABLES `retencion` WRITE;
/*!40000 ALTER TABLE `retencion` DISABLE KEYS */;
INSERT INTO `retencion` VALUES ('001-001-000004028',1,24.9,'7584');
/*!40000 ALTER TABLE `retencion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'calizasguayas'
--

--
-- Dumping routines for database 'calizasguayas'
--
/*!50003 DROP PROCEDURE IF EXISTS `allClients` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `allClients`()
begin 
SELECT * FROM cliente;
end ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `allCxC` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `allCxC`()
begin 
SELECT C.Nombre, F.IdFactura, F.Fecha_Emision, F.Fecha_Vencimiento, F.Sacos_Vendidos, P.Nombre, F.Precio_Total, R.Valor_retenido, F.Precio_Total - R.Valor_retenido
FROM cliente C, factura F, producto P, retencion R
WHERE c.RUC_Cliente=F.RUC_Cliente and F.IdProducto=P.IdProducto and F.IdFactura=R.IdFactura and F.Fecha_Vencimiento<=(select curdate())and F.Estado='no pagado';
end ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `allFact` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `allFact`()
begin 
SELECT * FROM factura;
end ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `allPayme` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `allPayme`()
begin 
SELECT * FROM pago;
end ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `allProduct` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `allProduct`()
begin 
SELECT * FROM producto;
end ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `allReten` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `allReten`()
begin 
SELECT * FROM retencion;
end ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `EliminarCliente` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `EliminarCliente`(in idClient varchar(45))
begin
delete from cliente
where RUC_Cliente =idClient;
end ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `EliminarFactura` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `EliminarFactura`(in idfact varchar(45))
begin
delete from factura
where IdFactura =idfact;
end ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `EliminarPago` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `EliminarPago`(in idPag varchar(45))
begin
delete from pago
where Numero_Comprobante =idPag;
end ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `EliminarProducto` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `EliminarProducto`(in idProd varchar(45))
begin
delete from producto
where IdProducto =idProd;
end ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `EliminarRetencion` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `EliminarRetencion`(in idReten varchar(45))
begin
delete from retencion
where IdRetencion =idReten;
end ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `insertClient` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `insertClient`(in ruc varchar(50), in nombre varchar(50), in direc varchar(50), in telef varchar(50), in email varchar(50))
begin 
insert into cliente values (ruc, nombre, direc, telef, email);
end ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `insertFact` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `insertFact`(in idfac varchar(50), in fechini date, in fechfin date, in estado varchar(50), in sacos int(11),in precioUni float, in precioTotal float, in idProd varchar(15), in rucclie varchar(15), in rucEmple varchar(15))
begin 
insert into factura values (idfac, fechini, fechfin, estado, sacos,precioUni, precioTotal, idProd, rucclie, rucEmple);
end ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `insertPaymeCheque` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `insertPaymeCheque`(in NumComprobante varchar(45), in fechaPago date, in numChe varchar(50), in bancoCheque varchar(50), in valorCancel float, in idFact varchar(45), in idFormaPago int(11) )
begin 
insert into pago(Numero_Comprobante, Fecha_Pago, Numero_Cheque, Banco_Cheque, Valor_Cancelado, IdFactura, Idforma_pago) values(NumComprobante,fechaPago,numChe,bancoCheque,valorCancel,idFact,idFormaPago );
end ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `insertPaymeDeposito` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `insertPaymeDeposito`(in NumComprobante varchar(45), in fechaPago date, in bancoDep varchar(50), in ctaDep varchar(50), in valorCancel float, in idFact varchar(45), in idFormaPago int(11) )
begin 
insert into pago(Numero_Comprobante, Fecha_Pago, Banco_Deposito, Cuenta_Deposito, Valor_Cancelado, IdFactura, Idforma_pago) values(NumComprobante,fechaPago,bancoDep,ctaDep,valorCancel,idFact,idFormaPago );
end ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `insertProduct` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `insertProduct`(in idProd varchar(15), in stock int(11), in nombre varchar(45), in precioUni float)
begin 
insert into producto values (idProd,stock,nombre,precioUni);
end ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `insertReten` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `insertReten`(in idRetencion varchar(45), in porcentaje float, in valorRetenido float, in idFactura varchar(15))
begin 
insert into retencion values (idRetencion, porcentaje, valorRetenido, idFactura);
end ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `ModificarCliente` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `ModificarCliente`(
in ruc varchar(45), in nombre varchar(45), in direccion varchar(45), in telef varchar(45), in mail varchar(45))
begin
update  cliente set  Nombre =nombre, Direccion = direccion, Telefonos = telef, Email = mail
where RUC_Cliente = ruc;
end ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `ModificarFactura` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `ModificarFactura`(
in idFact  varchar(45), in fechEm date, in fechVen date, in stado varchar(45),in sacosVend int(11), in precioUnt float,in precioTotal float, in idProd varchar(45), in rucClie varchar(15), in cedEmpl varchar(15))
begin
update factura set Fecha_Emision= fechEm, Fecha_Vencimiento=fechVen, Estado= stado , Sacos_Vendidos=sacosVend, Precio_Unitario= precioUnt,Precio_Total=precioTotal,IdProducto=idProd,RUC_Cliente = rucClie,Cedula_Empleados=cedEmpl
where IdFactura = idFact;
end ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `ModificarPago` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `ModificarPago`(
in numComp  varchar(45), in fechPag date, in numCheq varchar(45), in banCheq varchar(45),in banDep varchar(45), in ctaDep varchar(45),in valorCanc float, in idfact varchar(45), in idFormPag int(11)  )
begin
update pago set Fecha_Pago= fechPag, Numero_Cheque=numCheq, Banco_Cheque= banCheq, Banco_Deposito=banDep, Cuenta_Deposito= ctaDep,Valor_Cancelado=valorCanc,IdFactura=idfact,Idforma_pago = idFormPag
where Numero_Comprobante = numComp;
end ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `ModificarProducto` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `ModificarProducto`(
in idProduc varchar(45), in stok int(11), in nomb varchar(45), precio float)
begin
update producto set Stock = stok, Nombre =nomb, Precio_Unitario = precio
where IdProducto = idProduc;
end ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `ModificarRetencion` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `ModificarRetencion`(
in idReten varchar(45), in porc float, in valorRet float, in idFact varchar(15))
begin
update retencion set Porcentaje = porc, Valor_retenido= valorRet, IdFactura = idFact
where IdRetencion = idReten;
end ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-09-04 19:09:54
