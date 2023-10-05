drop table railes;

CREATE TABLE `railes`.`trenes` (
  `id_tren` INT NOT NULL,
  `modelo_tren` VARCHAR(45) NOT NULL,
  `mercancia` VARCHAR(45) NULL,
  `vagones` INT NOT NULL,
  PRIMARY KEY (`id_tren`));

insert into trenes values
(1, 'S-253', 'Madera', 3),
(2, 'S-251', 'Carbón', 8),
(3, 'AVLO', 'Pasajeros', 12),
(4, 'Transcantábrico', 'Turistas', 7),
(5, 'S-730 (Dual)', 'Pasajeros', 8);
