drop table if exists t_user;

/*==============================================================*/
/* Table: t_user                                                */
/*==============================================================*/
create table t_user
(
   id                   varchar(100) not null comment 'id',
   username             varchar(100) comment '用户名(登录)',
   nickname             varchar(100) comment '昵称(显示)',
   password             varchar(100) comment '密码',
   primary key (id)
);
drop table if exists t_restaurant;

/*==============================================================*/
/* Table: t_restaurant                                          */
/*==============================================================*/
create table t_restaurant
(
   id                   varchar(100) not null comment 'id',
   name                 varchar(100) comment '餐厅名',
   `desc`               varchar(255) comment '餐厅介绍',
   address              varchar(255) comment '地址',
   phone                varchar(100) comment '电话',
   user_id              varchar(100) comment '联系人',
   primary key (id)
);

alter table t_restaurant comment '餐厅';
drop table if exists t_combo;

/*==============================================================*/
/* Table: t_combo                                               */
/*==============================================================*/
create table t_combo
(
   id                   varchar(100) not null comment 'id',
   name                 varchar(100) comment '套餐名称',
   restaurant_id        varchar(100) comment '所属餐厅',
   `desc`               varchar(100) comment '套餐描述',
   price                double comment '套餐价格',
   primary key (id)
);
drop table if exists t_food;

/*==============================================================*/
/* Table: t_food                                                */
/*==============================================================*/
create table t_food
(
   id                   varchar(100) not null comment 'id',
   name                 varchar(100) comment '菜名',
   price                double comment '价格',
   img_url              varchar(255) comment '图片地址(逗号分隔)',
   stock                int comment '库存',
   restaurant_id        varchar(100) comment '餐厅id',
   primary key (id)
);
drop table if exists t_combo_detail;

/*==============================================================*/
/* Table: t_combo_detail                                        */
/*==============================================================*/
create table t_combo_detail
(
   id                   varchar(100) not null comment 'id',
   combo_id             varchar(100) comment '套餐名',
   food_id              varchar(100) comment '菜品',
   primary key (id)
);
