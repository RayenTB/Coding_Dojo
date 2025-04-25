CREATE DATABASE savetravels;
CREATE USER 'savetravels'@'localhost' IDENTIFIED BY 'travels';
GRANT ALL PRIVILEGES ON savetravels.* TO 'savetravelsuser'@'localhost';
FLUSH PRIVILEGES;