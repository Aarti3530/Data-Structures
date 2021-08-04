SELECT DISTINCT city FROM station WHERE city REGEXP "^[aeiou].*";

for first and last word sholed ne vowel

SELECT DISTINCT CITY FROM STATION
WHERE CITY REGEXP '^[aeiou].*[aeiou]$';
