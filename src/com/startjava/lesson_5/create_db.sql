DROP TABLE IF EXISTS Jaegers;

CREATE DATABASE jaegers;

\c jaegers;

CREATE TABLE Jaegers (
    id        SERIAL PRIMARY KEY,
    modelName TEXT,
    mark      CHAR(8),
    height    INTEGER,
    weight    INTEGER,
    status    CHAR(16),
    origin    TEXT,
    launch    CHAR(4),
    kaijuKill INTEGER
);

\ir init_db.sql;
\ir queries.sql;