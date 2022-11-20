CREATE TABLE authorities (
                             id SERIAL PRIMARY KEY,
                             customer_id int NOT NULL,
                             name varchar(50) NOT NULL,
                             CONSTRAINT authorities_ibfk_1 FOREIGN KEY (customer_id) REFERENCES customer (customer_id)
);

INSERT INTO authorities (customer_id, name)
VALUES (1, 'ROLE_USER');

INSERT INTO authorities (customer_id, name)
VALUES (1, 'ROLE_ADMIN');