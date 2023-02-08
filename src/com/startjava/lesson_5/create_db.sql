DROP DATABASE IF EXISTS jaegers;
CREATE DATABASE jaegers;

\c jaegers;

DROP TABLE IF EXISTS jaegers;
CREATE TABLE jaegers(
    id 	      SERIAL  PRIMARY KEY,
    modelName TEXT    NOT NULL,
    MARK      CHAR(8) NOT NULL,
    height    REAL    NOT NULL,
    weight    REAL    NOT NULL,
    status    TEXT    NOT NULL,
    origin    TEXT    NOT NULL,
    launch    DATE    NOT NULL,
    kaijuKill INTEGER NOT NULL
);

\i init_db.sql
\i queries.sql
