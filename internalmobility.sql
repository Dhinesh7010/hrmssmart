-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 04, 2023 at 01:01 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `internalmobility`
--

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `id` int(11) NOT NULL,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`id`, `first_name`, `last_name`, `email`) VALUES
(1, 'rubin', 'kumar', 'errubinkumar@gmail.com'),
(2, 'arjun', 'b', 'arjun@gmail.com'),
(3, 'naveen', 'kumar', 'naveenkumar@gmail.com'),
(5, NULL, NULL, NULL),
(6, NULL, NULL, NULL),
(7, NULL, NULL, NULL),
(8, 'vijay', 'k', 'vijay@gmail.com'),
(9, 'ariya', 'v', 'ariya@gmail.com'),
(10, 'arul', 'k', 'arul@gmail.com'),
(11, 'rubin', 'k', 'errubinkumar@gmail.com'),
(12, 'ramu', 'es', 'ramu@gmail.com'),
(13, 'meganar', 'tech', 'meganartech@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `newopening`
--

CREATE TABLE `newopening` (
  `id` int(11) NOT NULL,
  `job_title` varchar(255) DEFAULT NULL,
  `job_description` varchar(20) DEFAULT NULL,
  `qualification` varchar(25) DEFAULT NULL,
  `skill_set` varchar(25) DEFAULT NULL,
  `opening` varchar(25) DEFAULT NULL,
  `location` varchar(25) DEFAULT NULL,
  `department` varchar(25) DEFAULT NULL,
  `shift` varchar(25) DEFAULT NULL,
  `certification` varchar(25) DEFAULT NULL,
  `resume` varchar(25) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `newopening`
--

INSERT INTO `newopening` (`id`, `job_title`, `job_description`, `qualification`, `skill_set`, `opening`, `location`, `department`, `shift`, `certification`, `resume`) VALUES
(13, 'qwsqsq', 'sqdsqsw', 'qdsqsq', 'sqsqw', '1', 'sqsq', 'swqswq', '1', 'swqw', 'sqsww'),
(12, 'sqsq', 'dwdwd', 'dwdw', 'dwdqs', '1', 'dsd', 'dwdw', '1', 'dwdw', 'dwdd'),
(11, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `newopening`
--
ALTER TABLE `newopening`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `employee`
--
ALTER TABLE `employee`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `newopening`
--
ALTER TABLE `newopening`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
