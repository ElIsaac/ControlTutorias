-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 26-11-2019 a las 04:51:45
-- Versión del servidor: 10.1.26-MariaDB
-- Versión de PHP: 7.1.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `proyecto-bd`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `actividades`
--

CREATE TABLE `actividades` (
  `numero` int(3) NOT NULL,
  `nombre` varchar(40) COLLATE latin1_spanish_ci NOT NULL,
  `estado` varchar(15) COLLATE latin1_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Volcado de datos para la tabla `actividades`
--

INSERT INTO `actividades` (`numero`, `nombre`, `estado`) VALUES
(1, 'pase de lista nuevo', 'Realizado'),
(85, 'ser feliz', 'Realizado');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumnos`
--

CREATE TABLE `alumnos` (
  `noDeLista` int(3) NOT NULL,
  `nombre` varchar(50) COLLATE latin1_spanish_ci DEFAULT NULL,
  `edad` int(2) DEFAULT NULL,
  `nacimiento` varchar(20) COLLATE latin1_spanish_ci DEFAULT NULL,
  `sexo` varchar(30) COLLATE latin1_spanish_ci DEFAULT NULL,
  `direccion` varchar(50) COLLATE latin1_spanish_ci DEFAULT NULL,
  `colonia` varchar(50) COLLATE latin1_spanish_ci DEFAULT NULL,
  `cp` int(5) DEFAULT NULL,
  `edoCivil` varchar(10) COLLATE latin1_spanish_ci DEFAULT NULL,
  `telefono` varchar(20) COLLATE latin1_spanish_ci DEFAULT NULL,
  `email` varchar(50) COLLATE latin1_spanish_ci DEFAULT NULL,
  `controlEscolar` varchar(20) COLLATE latin1_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Volcado de datos para la tabla `alumnos`
--

INSERT INTO `alumnos` (`noDeLista`, `nombre`, `edad`, `nacimiento`, `sexo`, `direccion`, `colonia`, `cp`, `edoCivil`, `telefono`, `email`, `controlEscolar`) VALUES
(1, 'isaac ramirez velez', 15, '2003/Agosto/1', 'masculino', 'paseos de cenzontles 7931 3a', 'paseos del alba', 32696, 'soltero', '6562436904', 'ramirezisaac.1518@gmail.com', ''),
(2, 'luis', 15, '1/Junio/2000', 'masculino', 'jhgf', 'khjmgf', 32696, 'casado', '543', 'loo@gmail.com', ''),
(3, 'andrez el primo', 18, '8/Abril/2001', 'masculino', 'revolucion 7235', 'la cocona', 32030, 'casado', '6567091513', 'primo@cudo64.com', ''),
(4, 'fierro chavez lucina', 48, '1/Enero/2000', 'femenino', 'domicilio ocnocido', 'conocida', 32667, 'soltero', '656656656', 'lufierroch2016@gmail.com', ''),
(5, 'rubi balderas', 16, '1/Enero/2000', 'Femenino', 'heroes de la revolucion', 'hgfb', 32696, 'soltero', '5655645', '456@45.com', '15974524');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `asistencia`
--

CREATE TABLE `asistencia` (
  `noDeLista` int(3) NOT NULL,
  `s1` tinyint(1) NOT NULL,
  `s2` tinyint(1) NOT NULL,
  `s3` tinyint(1) NOT NULL,
  `s4` tinyint(1) NOT NULL,
  `s5` tinyint(1) NOT NULL,
  `s6` tinyint(1) NOT NULL,
  `s7` tinyint(1) NOT NULL,
  `s8` tinyint(1) NOT NULL,
  `s9` tinyint(1) NOT NULL,
  `s10` tinyint(1) NOT NULL,
  `s11` tinyint(1) NOT NULL,
  `s12` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `asistencia`
--

INSERT INTO `asistencia` (`noDeLista`, `s1`, `s2`, `s3`, `s4`, `s5`, `s6`, `s7`, `s8`, `s9`, `s10`, `s11`, `s12`) VALUES
(1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1),
(3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materias`
--

CREATE TABLE `materias` (
  `ID` int(20) NOT NULL,
  `noDeLista` int(3) NOT NULL,
  `materia` varchar(20) COLLATE latin1_spanish_ci NOT NULL,
  `aprobada` varchar(4) COLLATE latin1_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Volcado de datos para la tabla `materias`
--

INSERT INTO `materias` (`ID`, `noDeLista`, `materia`, `aprobada`) VALUES
(1, 1, 'etica', 'no'),
(2, 1, 'kjhg', 'si'),
(3, 3, 'biologia', 'si'),
(4, 1, 'biologia', 'no');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `situaciones`
--

CREATE TABLE `situaciones` (
  `NoDeLista` int(3) NOT NULL,
  `tutor` varchar(20) NOT NULL,
  `discapacidad` varchar(3) NOT NULL,
  `discapacidadEspecifica` varchar(100) NOT NULL,
  `situacion` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `situaciones`
--

INSERT INTO `situaciones` (`NoDeLista`, `tutor`, `discapacidad`, `discapacidadEspecifica`, `situacion`) VALUES
(1, 'vive con sus padres', 'si', 'ser tan guapo', ''),
(3, 'vive con su tutor', 'si', 'sss', 'se pelea');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `actividades`
--
ALTER TABLE `actividades`
  ADD PRIMARY KEY (`numero`);

--
-- Indices de la tabla `alumnos`
--
ALTER TABLE `alumnos`
  ADD PRIMARY KEY (`noDeLista`);

--
-- Indices de la tabla `asistencia`
--
ALTER TABLE `asistencia`
  ADD PRIMARY KEY (`noDeLista`);

--
-- Indices de la tabla `materias`
--
ALTER TABLE `materias`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `situaciones`
--
ALTER TABLE `situaciones`
  ADD PRIMARY KEY (`NoDeLista`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `materias`
--
ALTER TABLE `materias`
  MODIFY `ID` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
