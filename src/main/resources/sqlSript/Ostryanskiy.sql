Create USER ostryanskiyHW IDENTIFIED BY asdf;
GRANT CONNECT , RESOURCE TO ostryanskiyHW;

CREATE TABLE Production (
      prod_id number(10) not null,
      prod_name varchar(25) not null,
      prod_des varchar(255) not null,
      prod_number number(10),
        primary key (prod_id)
   );