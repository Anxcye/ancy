create table t_article
(
    id          int auto_increment comment 'primary key'
        primary key,
    title       varchar(300)      not null comment 'title of artical',
    content     longtext          not null comment 'content of artical',
    is_delete   tinyint default 0 not null comment 'is deleted. 0: no; 1: yes',
    creat_time  datetime          not null comment 'creat time',
    update_time datetime          not null comment 'update time'
)
    comment 'artical table';

INSERT INTO t_article (title, content, is_delete, creat_time, update_time) VALUES ('Hello World', 'Hello World', 0, now(), now());
