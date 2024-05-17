create table tasks (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    task VARCHAR(150) NOT NULL,
    status VARCHAR(100) NOT NULL,
    create_date DATE NOT NULL
);