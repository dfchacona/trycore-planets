DROP TABLE IF EXISTS planets;
 
CREATE TABLE planets (
  id INT,
  planet_name VARCHAR(250) NOT NULL,
  diameter INT,
  mean_temp DOUBLE,
  number_visits INT 
);
 

insert into planets (id, planet_name,diameter,mean_temp,number_visits)values(1,'Tierra', 2000 ,30.2 , 300000);