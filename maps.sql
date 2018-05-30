-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Client :  127.0.0.1
-- Généré le :  Mer 30 Mai 2018 à 08:58
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
(1, 'Map1', 'vide vide vide vide vide vide vide vide bone hbone hbone bone vide vide vide vide vide vide vide vide x\r\nvide vide vide vide vide vide vide vide vbone vide lorann vbone vide vide vide vide vide vide vide vide x \r\nbone hbone hbone hbone hbone hbone bone vide vbone vide vide bone hbone hbone hbone hbone hbone hbone bone vide x\r\nvbone monster4 vide vide vide vide bone hbone bone vide vide vide vide purse vide vide vide monster2 vbone vide x \r\nvbone vide vide vide crystalb vide vide vide vide vide vide bone hbone bone hbone bone bone hbone bone vide x\r\nvbone vide vide vide vide vide bone hbone bone vide vide vbone vide vbone vide vbone vbone vide vbone vide x \r\nvbone purse vide vide vide vide vbone vide vbone vide vide bone hbone bone hbone bone bone hbone bone vide x\r\nvbone vide purse vide vide vide vbone vide vbone vide vide bone hbone bone hbone bone bone hbone bone vide x\r\nvbone purse vide vide vide vide vbone vide vbone vide vide vbone vide vbone vide vbone vbone vide vbone vide x\r\nvbone vide purse bone hbone hbone bone hbone bone vide vide bone hbone bone hbone bone bone hbone bone bone x\r\nvbone vide vide vide vide vide vide vide vide vide vide vide vide vide vide vide monster3 vide gatec vbone x \r\nbone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone hbone bone x ');

--
-- Index pour les tables exportées
--

--
-- Index pour la table `maps`
--
ALTER TABLE `maps`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `maps`
--
ALTER TABLE `maps`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
