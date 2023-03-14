CREATE TABLE personnage(
    id SERIAL PRIMARY KEY ,
    genre VARCHAR(2),
    personnage VARCHAR(50)
);

CREATE TABLE lieu(
    id SERIAL PRIMARY KEY ,
    lieu VARCHAR(50),
    longitude DOUBLE PRECISION,
    latitude DOUBLE PRECISION
);

CREATE TABLE scene(
    id SERIAL PRIMARY KEY ,
    titre VARCHAR(50),
    description VARCHAR(100),
    duree DOUBLE PRECISION,
    interval1 TIME,
    interval2 TIME,
    priorite INT
);

CREATE TABLE personnageScene(
    id SERIAL PRIMARY KEY ,
    idscene INT NOT NULL ,
    idpersonnage INT NOT NULL ,
    FOREIGN KEY (idscene) REFERENCES scene(id),
    FOREIGN KEY (idpersonnage) REFERENCES personnage(id)
);

CREATE TABLE lieuscene(
    id SERIAL PRIMARY KEY ,
    idscene INT NOT NULL ,
    idlieu INT NOT NULL ,
    FOREIGN KEY (idscene) REFERENCES scene(id),
    FOREIGN KEY (idlieu) REFERENCES lieu(id)
);

CREATE TABLE planning(
    id SERIAL PRIMARY KEY ,
    idscene INT NOT NULL ,
    debtournage TIMESTAMP,
    fintournage TIMESTAMP,
    etat INT,
    reporte INT,
    FOREIGN KEY (idscene) REFERENCES scene(id)
);
