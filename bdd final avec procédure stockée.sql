-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Client :  127.0.0.1
-- Généré le :  Mar 05 Juin 2018 à 07:26
-- Version du serveur :  5.7.14
-- Version de PHP :  5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `lorann`
--

DELIMITER $$
--
-- Procédures
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `findAllExamples` ()  NO SQL
SELECT id, name
FROM example$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `findExampleById` (IN `id` INT)  NO SQL
SELECT id, name
FROM example
WHERE example.id = id$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `findExampleByName` (IN `name` VARCHAR(255))  NO SQL
SELECT id, name
FROM example
WHERE example.name = name$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `FindMapLorann` (IN `Name` INT)  NO SQL
SELECT *
From maps
WHERE maps.Name = Name$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Structure de la table `example`
--

CREATE TABLE `example` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `example`
--

INSERT INTO `example` (`id`, `name`) VALUES
(1, 'Example 1'),
(2, 'Example 2'),
(3, 'Example 3'),
(4, 'Example 4');

-- --------------------------------------------------------

--
-- Structure de la table `maps`
--

CREATE TABLE `maps` (
  `ID` int(11) NOT NULL,
  `Name` varchar(255) NOT NULL,
  `Map` longtext NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `maps`
--

INSERT INTO `maps` (`ID`, `Name`, `Map`) VALUES
(1, '1', 'vide vide vide vide vide vide vide vide bone hbone hbone bone vide vide vide vide vide vide vide vide x\r\nvide vide vide vide vide vide vide vide vbone vide lorann vbone vide vide vide vide vide vide vide vide x \r\nbone hbone hbone hbone hbone hbone bone vide vbone vide vide bone hbone hbone hbone hbone hbone hbone bone vide x\r\nvbone monster4 vide vide vide vide bone hbone bone vide vide vide vide purse vide vide vide monster2 vbone vide x \r\nvbone vide vide vide crystalb vide vide vide vide vide vide bone hbone bone hbone bone bone hbone bone vide x\r\nvbone vide vide vide vide vide bone hbone bone vide vide vbone vide vbone vide vbone vbone vide vbone vide x \r\nvbone purse vide vide vide vide vbone vide vbone vide vide bone hbone bone hbone bone bone hbone bone vide x\r\nvbone vide purse vide vide vide vbone vide vbone vide vide bone hbone bone hbone bone bone hbone bone vide x\r\nvbone purse vide vide vide vide vbone vide vbone vide vide vbone vide vbone vide vbone vbone vide vbone vide x\r\nvbone vide purse bone hbone hbone bone hbone bone vide vide bone hbone bone hbone bone bone hbone bone bone x\r\nvbone vide vide vide vide vide vide vide vide vide vide vide vide vide vide vide monster3 vide gatec vbone x \r\nbone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone bone x '),
(2, '2', 'vide vide vide vide vide vide bone hbone bone hbone hbone hbone hbone hbone hbone hbone hbone hbone bone vide x\r\nvide vide vide bone hbone hbone bone vide vbone vide vide vide vide vide vide vide vide vide bone bone x\r\nvide vide vide vbone vide vide vide vide vbone vide vide vide vide vide vide vide vide vide vide vbone x\r\nbone hbone hbone bone vide vide vide vide vbone bone bone bone purse vide vide vide vide vide vide vbone x \r\nvbone vide purse vide bone hbone hbone hbone bone hbone hbone hbone hbone hbone bone vide vide vide vide bone x\r\nvbone purse vide vide vide monster1 vide vide vide vide vide vide crystalb vide vide vide vide lorann vide gatec x\r\nvbone vide purse vide bone hbone hbone hbone bone hbone hbone hbone hbone hbone bone vide vide vide vide bone x \r\nbone hbone hbone bone vide vide vide vide vbone vide vide vide purse vide vide vide vide vide vide vbone x\r\nvide vide vide vbone vide vide vide vide vbone vide vide vide vide vide vide vide vide vide vide vbone x\r\nvide vide vide bone hbone hbone bone vide vbone vide vide vide vide vide vide vide vide vide bone bone x\r\nvide vide vide vide vide vide bone hbone bone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone bone vide x\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n'),
(3, '3', 'bone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone bone x\r\nvbone crystalb vide vide vide vide vide vide vide vide vide vide vide vide vide vide vide monster4 purse vbone x\r\nvbone vide bone hbone vide vide hbone hbone hbone bone vide vide vide vide vide bone vide vide vide vbone x\r\nvbone vide vbone vide monster3 vide vide vide purse vbone vide vide vide vide vide vbone vide vide vide vbone x\r\nvbonee vide bone hbone vide vide hbone hbone hbone bone vide vide vide vide vide vbone vide vide vide vbone x\r\nvbone vide vide vide vide vide vide vide vide vide vide bone hbone hbone hbone bone vide vide vide vbone x\r\nvbone vide vide vide vide vide vide vide vide vide vide vbone vide vide vide vide bone hbone hbone bone x\r\nvbone vide vide vide vide vide vide vide vide vide vide vbone vide vide vide bone vide vide purse vbone x\r\nvbone vide vide vide vide vide vide vide vide vide vide vbone vide vide vide vide vbone vide vide vide vbone x\r\nvbone vide bone hbone hbone hbone hbone hbone hbone hbone vide bone vide vide vide vbone vide vide vide vbone x\r\nvbone monster1 vide vide vide vide vide vide vide vide vide vide vide vide vide vbone laurann vide gatec vbone x\r\nbone  hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone bone x'),
(4, '4', 'vide vide vide vide vide vide bone hbone bone hbone hbone bone hbone hbone bone hbone hbone bone bone x\r\nvide vide vide bone hbone hbone bone bone bone vide vide vide purse vide vide vide vide vide bone bone x\r\nvide vide vide vbone vide vide vide vide vide vide vide vide vide vide vide vide vide vide vide vbone x\r\nbone hbone hbone bone purse vide vide vide vbone vide vide vide vide vide vide vide vide vide vide vbone x\r\nvbone vbone vide vide bone hbone hbone hbone bone hbone hbone hbone hbone hbone bone vide vide vide vide bone x\r\nvbone vbone vide vide vide vide vide vide purse vide vide vide monster3 vide crystalb vide vide lorann gatec x\r\nbone hbone hbone bone hbone hbone bone vide bone hbone hbone hbone hbone hbone bone vide vide vide vide vbone x\r\nvide vide vide vbone vide vide vide vide vbone vide vide vide purse vide vide vide vide crystalb vide vbone x\r\nvide vide vide bone hbone hbone bone vide vbone vide vide vide vide vide vide vide vide vide bone bone x\r\nvide vide vide vide vide vide bone hbone vide hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone bone vide x'),
(5, '5', 'vide bone hbone hbone hbone hbone hbone bone bone vide vide vide vide vide vide vide vide vide vide vide x\r\nbone vide vide vide vide vide vide crystalb bone hbone hbone bone vide vide vide vide vide vide vide vide x\r\nvbone vide bone hbone hbone hbone bone vide vide vide purse bone hbone hbone bone vide vide vide vide vide x\r\nvbone monster1 vide vide vide vide vide vide vide bone vide vide vide purse bone hbone hbone bone vide vide x\r\nvbone vide bone hbone hbone bone vide bone vide vide vide bone vide vide vide vide purse bone hbone bone x\r\nvbone monster2 vide vide vide vide vide vide vide bone vide vbone vide vide vide laurann vide vide purse vbone x\r\nvbone vide bone hbone hbone bone vide bone vide vide vide bone vide vide vide vide purse bone hbone bone x\r\nvbone monster3 vide vide vide vide vide vide vide bone vide vide vide purse bone hbone hbone bone vide vide x\r\nvbone vide bone hbone hbone hbone bone vide vide vide purse bone hbone hbone bone vide vide vide vide vide x\r\nbone gatcec vide vide vide vide vide vide bone hbone hbone bone vide vide vide vide vide vide vide vide x\r\nvide bone hbone hbone hbone hbone hbone bone bone vide vide vide vide vide vide vide vide vide vide vide x');

--
-- Index pour les tables exportées
--

--
-- Index pour la table `example`
--
ALTER TABLE `example`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `maps`
--
ALTER TABLE `maps`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `example`
--
ALTER TABLE `example`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT pour la table `maps`
--
ALTER TABLE `maps`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
