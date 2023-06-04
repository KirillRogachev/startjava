\echo вывести таблицу
SELECT * 
  FROM Jaegers;

\echo отобразить только не уничтоженных роботов
SELECT modelName, status 
  FROM Jaegers 
 WHERE status != 'Destroyed';

\echo отобразить роботов нескольких серий: Mark-1 и Mark-4
SELECT modelName, mark 
  FROM Jaegers 
 WHERE mark IN ('Mark-1', 'Mark-4');

\echo отобразить всех роботов, кроме Mark-1 и Mark-4
SELECT modelName, mark 
  FROM Jaegers 
 WHERE mark NOT IN ('Mark-1', 'Mark-4');

\echo отсортировать таблицу по убыванию по столбцу mark
SELECT * 
  FROM Jaegers 
 ORDER BY mark DESC;

\echo отобразить информацию о самом старом роботе
SELECT * 
  FROM Jaegers 
 WHERE launch = (SELECT MIN(launch) 
		   FROM Jaegers);

\echo отобразить роботов, которые уничтожили больше всех kaiju
SELECT * 
  FROM Jaegers 
 WHERE kaijuKill = (SELECT MAX(kaijuKill) 
		      FROM Jaegers);

\echo отобразить средний вес роботов
SELECT AVG(weight) 
  FROM Jaegers;

\echo увеличить на единицу количество уничтоженных kaiju у роботов, которые до сих пор не разрушены
UPDATE Jaegers 
   SET kaijuKill = kaijuKill + 1
 WHERE status != 'Destroyed';

\echo /*удалить уничтоженных роботов*/
DELETE 
  FROM Jaegers 
 WHERE status = 'Destroyed';