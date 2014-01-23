SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `mix1`
--
CREATE DATABASE IF NOT EXISTS `mix1` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `mix1`;

-- --------------------------------------------------------

--
-- Table structure for table `par`
--

CREATE TABLE IF NOT EXISTS `par` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `location` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=12 ;

--
-- Dumping data for table `par`
--

INSERT INTO `par` (`id`, `name`, `location`) VALUES
(1, 'Par 1', 1),
(2, 'Par 2', 2),
(3, 'Par 3', 3),
(4, 'Par 4', 1),
(5, 'Par 5', 2),
(6, 'Par 6', 3),
(7, 'Par 7', 1),
(8, 'par 20', 2);

-- --------------------------------------------------------

--
-- Table structure for table `wres`
--

CREATE TABLE IF NOT EXISTS `wres` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `wra` varchar(20) NOT NULL,
  `parid` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=12 ;

--
-- Dumping data for table `wres`
--

INSERT INTO `wres` (`id`, `wra`, `parid`) VALUES
(1, '10-12', 1),
(2, '12-14', 1),
(3, '10-12', 2),
(4, '10-12', 3),
(5, '12-14', 4),
(6, '14-16', 4),
(7, '14-16', 5),
(8, '11-13', 6),
(9, '21-23', 7);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
