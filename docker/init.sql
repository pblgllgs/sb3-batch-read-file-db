CREATE DATABASE IF NOT EXISTS db_books DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

USE db_books;

SET NAMES utf8mb4;

CREATE TABLE IF NOT EXISTS book_entity (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
    author VARCHAR(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
    year INT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

INSERT INTO book_entity (title, author, year) VALUES ('El señor de los anillos', 'J.R.R. Tolkien', 1954);
INSERT INTO book_entity (title, author, year) VALUES ('Cien años de soledad', 'Gabriel García Márquez', 1967);
INSERT INTO book_entity (title, author, year) VALUES ('Harry Potter y la piedra filosofal', 'J.K. Rowling', 1997);
INSERT INTO book_entity (title, author, year) VALUES ('1984', 'George Orwell', 1949);
INSERT INTO book_entity (title, author, year) VALUES ('Orgullo y prejuicio', 'Jane Austen', 1813);
INSERT INTO book_entity (title, author, year) VALUES ('La metamorfosis', 'Franz Kafka', 1915);
INSERT INTO book_entity (title, author, year) VALUES ('Don Quijote de la Mancha', 'Miguel de Cervantes', 1605);
INSERT INTO book_entity (title, author, year) VALUES ('Crónica de una muerte anunciada', 'Gabriel García Márquez', 1981);
INSERT INTO book_entity (title, author, year) VALUES ('El principito', 'Antoine de Saint-Exupéry', 1943);
INSERT INTO book_entity (title, author, year) VALUES ('Romeo y Julieta', 'William Shakespeare', 1597);
INSERT INTO book_entity (title, author, year) VALUES ('El amor en los tiempos del cólera', 'Gabriel García Márquez', 1985);
INSERT INTO book_entity (title, author, year) VALUES ('La isla del tesoro', 'Robert Louis Stevenson', 1883);
INSERT INTO book_entity (title, author, year) VALUES ('Los miserables', 'Victor Hugo', 1862);
INSERT INTO book_entity (title, author, year) VALUES ('La divina comedia', 'Dante Alighieri', 1320);
INSERT INTO book_entity (title, author, year) VALUES ('Donde los árboles cantan', 'Laura Gallego García', 2011);
INSERT INTO book_entity (title, author, year) VALUES ('Anna Karenina', 'León Tolstói', 1877);
INSERT INTO book_entity (title, author, year) VALUES ('El alquimista', 'Paulo Coelho', 1988);
INSERT INTO book_entity (title, author, year) VALUES ('Drácula', 'Bram Stoker', 1897);
INSERT INTO book_entity (title, author, year) VALUES ('El retrato de Dorian Gray', 'Oscar Wilde', 1890);