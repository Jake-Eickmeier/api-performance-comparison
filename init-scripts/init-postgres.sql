\c apiperformancecomparison;

CREATE TABLE profile (
    id INT PRIMARY KEY,
    first_name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255)
);

INSERT INTO profile (id, first_name, last_name) VALUES (1, 'Jim', 'Jones');
INSERT INTO profile (id, first_name, last_name) VALUES (2, 'Bob', 'Brown');
