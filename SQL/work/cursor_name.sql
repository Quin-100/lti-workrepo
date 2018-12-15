<<outer>>
declare 

a number := 5;
begin
dbms_output.put_line('a in outer :'||a);
  <<inner>>
  declare
  a number := 20;
  begin
  a:= 10;   
  dbms_output.put_line('a from outer in inner :'||outer.a);  
  dbms_output.put_line('a from inner in inner :'||inner.a); 

  end inner;





end outer;


/