CREATE SCHEMA IF NOT EXISTS example_db;

CREATE TABLE IF NOT EXISTS example_db.book (
  id INT auto_increment,
  genre VARCHAR NOT NULL
)
