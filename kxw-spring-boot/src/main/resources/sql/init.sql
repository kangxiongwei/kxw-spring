create database if not exists kxw_spring;

create table if not exists user(
    id INT primary key auto_increment,
    name varchar(64) not null comment '用户名',
    password varchar(128) not null comment '密码',
    icon varchar(128) comment '头像'
) default charset = UTF8;

create table if not exists role (
    id int primary key auto_increment,
    name varchar(32) not null comment '角色名称',
    role varchar(32) not null comment '角色'
);
