\echo display table
SELECT * 
  FROM Jaegers;

\echo display only non-destroyed robots 
SELECT modelName, status 
  FROM Jaegers 
 WHERE status != 'Destroyed';

\echo display only robots of series Mark-1 и Mark-4
SELECT modelName, mark 
  FROM Jaegers 
 WHERE mark IN ('Mark-1', 'Mark-4');

\echo display only robots of all series except Mark-1 и Mark-4
SELECT modelName, mark 
  FROM Jaegers 
 WHERE mark NOT IN ('Mark-1', 'Mark-4');

\echo sort table by column mark in descending order
SELECT * 
  FROM Jaegers 
 ORDER BY mark DESC;

\echo find the oldest robot
SELECT * 
  FROM Jaegers 
 WHERE launch = 
       (SELECT MIN(launch) 
          FROM Jaegers);

\echo display the robots that have destroyed the most kaiju
SELECT * 
  FROM Jaegers 
 WHERE kaijuKill = 
       (SELECT MAX(kaijuKill) 
          FROM Jaegers);

\echo display the average weight of robots
SELECT AVG(weight) 
  FROM Jaegers;

\echo increase by one the number of destroyed kaiju robots that have not yet been destroyed
UPDATE Jaegers 
   SET kaijuKill = kaijuKill + 1
 WHERE status != 'Destroyed';

\echo delete destroyed robots
DELETE 
  FROM Jaegers 
 WHERE status = 'Destroyed';