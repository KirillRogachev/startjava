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
	launch    TEXT,
	kaijuKill INTEGER);