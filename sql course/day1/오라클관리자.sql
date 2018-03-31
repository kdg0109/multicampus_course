alter user hr account unlock;
alter user hr identified by hr;

create user sqltest identified by sqltest;
grant connect, resource to sqltest;

create user work identified by work;
grant connect, resource to work;

create user jdbctest identified by jdbctest;
grant connect, resource to jdbctest;

select * from all_users;