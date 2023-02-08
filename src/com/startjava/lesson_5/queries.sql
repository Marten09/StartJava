\echo '-- выведете всю таблицу'
SELECT * 
  FROM jaegers;

\echo '-- отобразите только не уничтоженных роботов'
SELECT * 
  FROM jaegers 
 WHERE status = 'live';

\echo '-- отобразите роботов нескольких серий: Mark-1 и Mark-4'
SELECT * 
  FROM jaegers 
 WHERE mark IN ('Mark - 1', 'Mark - 4');

\echo '-- отобразите всех роботов, кроме Mark-1 и Mark-4'
SELECT * 
  FROM jaegers 
 WHERE mark NOT IN ('Mark - 1', 'Mark - 4');

\echo '-- отсортируйте таблицу по убыванию по столбцу mark'
SELECT * 
  FROM jaegers 
 ORDER BY mark DESC;

\echo '-- отобразите информацию о самом старом роботе'
SELECT * 
  FROM jaegers 
 WHERE launch = (SELECT MIN(launch) FROM jaegers);

\echo '-- отобразите роботов, которые уничтожили больше всех kaiju'
SELECT * 
  FROM jaegers 
 WHERE kaijuKill = (SELECT MAX(kaijuKill) FROM jaegers);

\echo '-- отобразите средний вес роботов'
SELECT AVG(weight) 
  FROM jaegers;

\echo '-- увеличьте на единицу количество уничтоженных kaiju у роботов, которые до сих пор не разрушены'
UPDATE jaegers 
   SET kaijuKill = kaijuKill + 1 
 WHERE status = 'live';

\echo '-- удалите уничтоженных роботов'
DELETE 
  FROM jaegers 
 WHERE status = 'destroyed';
