// hacker_rank_sql_practice.hacker_rank_sql_practice

// Query the NAME field for all American cities in the CITY table 
// with populations larger than 120000. The CountryCode for America 
// is USA.

SELECT NAME 
FROM 
CITY 
WHERE COUNTRYCODE='USA' and POPULATION > 120000;


// Query all columns (attributes) for every row in the CITY table.

SELECT *
FROM CITY;


// Query all columns for a city in CITY with the ID 1661.

SELECT *
FROM CITY
WHERE ID='1661';


