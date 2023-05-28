-- вывести таблицу
SELECT * FROM Jaegers;

-- отобразить только не уничтоженных роботов
SELECT modelName, status 
  FROM Jaegers 
 WHERE status != 'Destroyed';

-- отобразить роботов нескольких серий: Mark-1 и Mark-4
SELECT modelName, mark 
  FROM Jaegers 
 WHERE mark IN ('Mark-1', 'Mark-4');

-- отобразить всех роботов, кроме Mark-1 и Mark-4
SELECT modelName, mark 
  FROM Jaegers 
 WHERE mark NOT IN ('Mark-1', 'Mark-4');

-- отсортировать таблицу по убыванию по столбцу mark
SELECT * 
  FROM Jaegers 
 ORDER BY mark DESC;

-- отобразить информацию о самом старом роботе
SELECT * 
  FROM Jaegers 
 WHERE launch = (SELECT MIN(launch) FROM Jaegers);

-- отобразить роботов, которые уничтожили больше всех kaiju
SELECT * 
  FROM Jaegers 
 WHERE kaijuKill = (SELECT MAX(kaijuKill) FROM Jaegers);

-- отобразить средний вес роботов
SELECT AVG(weight) 
  FROM Jaegers;

-- увеличить на единицу количество уничтоженных kaiju у роботов, которые до сих пор не разрушены
UPDATE Jaegers 
   SET kaijuKill = (kaijuKill + 1) 
 WHERE status != 'Destroyed';

-- удалить уничтоженных роботов
DELETE 
  FROM Jaegers 
 WHERE status = 'Destroyed';