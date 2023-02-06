DROP DATABASE jaegers;

CREATE DATABASE jaegers;

\c jaegers;

CREATE TABLE jaegers(
	id SERIAL PRIMARY KEY,
	modelName TEXT,
	MARK CHAR(8),
	height REAL,
	weight REAL,
	status TEXT,
	origin TEXT,
	launch DATE,
	kaijuKill INTEGER
);
\i  init_db.sql
\i queries.sql
