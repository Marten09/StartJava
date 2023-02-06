-- выведете всю таблицу
SELECT * FROM jaegers;
-- отобразите только не уничтоженных роботов
SELECT * FROM jaegers WHERE status = 'live';
-- отобразите роботов нескольких серий: Mark-1 и Mark-4
SELECT * FROM jaegers WHERE mark IN ('Mark - 1', 'Mark - 4');
-- отобразите всех роботов, кроме Mark-1 и Mark-4
SELECT * FROM jaegers WHERE mark NOT IN ('Mark - 1', 'Mark - 4');
-- отсортируйте таблицу по убыванию по столбцу mark
SELECT * FROM jaegers ORDER BY mark DESC;
-- отобразите информацию о самом старом роботе
SELECT * FROM jaegers WHERE launch = (SELECT MIN(launch) FROM jaegers);
-- отобразите роботов, которые уничтожили больше всех kaiju
SELECT * FROM jaegers WHERE kaijuKill = (SELECT MAX(kaijuKill) FROM jaegers);
-- отобразите средний вес роботов
SELECT AVG(weight) FROM jaegers;
-- увеличьте на единицу количество уничтоженных kaiju у роботов, которые до сих пор не разрушены
UPDATE jaegers SET kaijuKill = kaijuKill + 1 WHERE status = 'live';
-- удалите уничтоженных роботов
DELETE FROM jaegers WHERE status = 'destroyed';
