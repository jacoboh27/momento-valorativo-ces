
CREATE DATABASE IF NOT EXISTS examen_valorativo_ces;
USE examen_valorativo_ces;



CREATE TABLE IF NOT EXISTS user (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL
);



INSERT INTO user (name, email, password) VALUES
    ('Juan Pérez', 'juan.perez@gmail.com', 'juan123'),
    ('María López', 'maria.lopez@gmail.com', 'maria456'),
    ('Carlos Rodríguez', 'carlos.rodriguez@gmail.com', 'carlos789'),
    ('Ana Gómez', 'ana.gomez@gmail.com', 'ana321'),
    ('Luis Hernández', 'luis.hernandez@gmail.com', 'luis654'),
    ('Laura García', 'laura.garcia@gmail.com', 'laura987'),
    ('Pedro Ramírez', 'pedro.ramirez@gmail.com', 'pedro123'),
    ('Sofía Martínez', 'sofia.martinez@gmail.com', 'sofia456');