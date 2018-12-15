create or replace trigger viewtrigger
instead of insert on Proview

begin
insert into customer values(:new.cid,:new.cname,:new.clocation,10);

insert into project values(projseq.nextval,:new.projectdesc,:new.cid);
end;
/

create or replace trigger viewtrigger1
instead of delete on Proview

begin

delete project where custid=:old.cid;
delete customer where cid=:old.cid;



end;
/

create or replace trigger viewtrigger2
instead of update on Proview

begin
update customer set cname= :new.cname where cid=:old.cid;

update project set projectdesc = :new.projectdesc where custid=:old.cid;

end;
/