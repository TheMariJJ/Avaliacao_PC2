-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 13-Abr-2018 às 03:35
-- Versão do servidor: 5.7.17
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `java`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbassalariado`
--

CREATE TABLE `tbassalariado` (
  `salario` float NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tbassalariado`
--

INSERT INTO `tbassalariado` (`salario`) VALUES
(1000);

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbcomissionado`
--

CREATE TABLE `tbcomissionado` (
  `totalVenda` float NOT NULL,
  `taxaComissao` float NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tbcomissionado`
--

INSERT INTO `tbcomissionado` (`totalVenda`, `taxaComissao`) VALUES
(5, 3);

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbempregado`
--

CREATE TABLE `tbempregado` (
  `nome` varchar(20) NOT NULL,
  `sobrenome` varchar(100) NOT NULL,
  `cpf` varchar(12) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tbempregado`
--

INSERT INTO `tbempregado` (`nome`, `sobrenome`, `cpf`) VALUES
('abc', 'de souza', '111111'),
('abc', 'de souza', '111111'),
('abc', 'de souza', '111111'),
('abc', 'de souza', '111111'),
('xxx', 'de lima', '555555-55');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbhorista`
--

CREATE TABLE `tbhorista` (
  `precoHora` float NOT NULL,
  `horasTrabalhadas` float NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tbhorista`
--

INSERT INTO `tbhorista` (`precoHora`, `horasTrabalhadas`) VALUES
(6, 200);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
