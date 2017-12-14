-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 14-Dez-2017 às 21:30
-- Versão do servidor: 10.1.28-MariaDB
-- PHP Version: 7.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `empresa`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `clientes`
--

CREATE TABLE `clientes` (
  `id` int(11) NOT NULL,
  `nome` varchar(45) NOT NULL,
  `sobrenome` varchar(45) NOT NULL,
  `endereco` varchar(45) NOT NULL,
  `codigo` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `clientes`
--

INSERT INTO `clientes` (`id`, `nome`, `sobrenome`, `endereco`, `codigo`) VALUES
(1, 'Derik', 'Gonçalves', 'Longe', 1),
(3, 'paty', 'fagundes', 'santiago ', 0),
(4, 'Celia', 'Goncalves', 'longe', 1),
(5, 'Teste', 'testeee', 'muiyo loone', 1),
(6, '', '', '', 0),
(7, 'teste2', 'testeeee', 'aaa', 0),
(8, 'aa', 'aaaa', 'rr', 0),
(9, 'Patricia', 'Fagundes', 'Santiago Dantas', 0),
(10, 'testepolimor', 'polim', 'po', 0),
(11, 'testepol', 'poli', 'po', 0),
(12, 'teste', 'func', 'teste', 0),
(13, 'teste', 'poli', 'po', 0),
(14, 'Roger', 'Matias', 'muito longe', 0);

-- --------------------------------------------------------

--
-- Estrutura da tabela `funcionarios`
--

CREATE TABLE `funcionarios` (
  `id` int(11) NOT NULL,
  `nome` varchar(45) NOT NULL,
  `sobrenome` varchar(45) NOT NULL,
  `endereco` varchar(45) NOT NULL,
  `codigo` int(2) NOT NULL,
  `salario` decimal(20,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `funcionarios`
--

INSERT INTO `funcionarios` (`id`, `nome`, `sobrenome`, `endereco`, `codigo`, `salario`) VALUES
(1, 'Joca', 'Martins', 'Muito Lonfe', 0, '3'),
(2, 'Joca', 'rudi', 'Muito Longe', 0, '5'),
(3, 'Megan', 'Fox', 'Muito Lonfe', 0, '6'),
(4, 'Lili', 'Roll', 'Muito Longe', 0, '5'),
(5, 'Juca', 'Jaca', 'Muito Lonfe', 0, '5000'),
(6, 'derik', 'moura', 'pertinho', 1, '1500'),
(7, 'Roger', 'Dravans', 'Longe', 1, '2300'),
(8, 'Fabiola', 'Borges', 'Marcilio', 1, '8700');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `funcionarios`
--
ALTER TABLE `funcionarios`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `clientes`
--
ALTER TABLE `clientes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `funcionarios`
--
ALTER TABLE `funcionarios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
