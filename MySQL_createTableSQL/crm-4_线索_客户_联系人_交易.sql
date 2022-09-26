drop table if exists tbl_clue;

drop table if exists tbl_clue_activity_relation;

drop table if exists tbl_clue_remark;

drop table if exists tbl_contacts;

drop table if exists tbl_contacts_activity_relation;

drop table if exists tbl_contacts_remark;

drop table if exists tbl_customer;

drop table if exists tbl_customer_remark;

drop table if exists tbl_tran;

drop table if exists tbl_tran_history;

drop table if exists tbl_tran_remark;

/*==============================================================*/
/* table: tbl_clue                                              */
/* description: 线索表                                           */
/*==============================================================*/
create table tbl_clue
(
    id                char(32) not null,
    fullname          varchar(255),
    appellation       varchar(255),
    owner             char(32),
    company           varchar(255),
    job               varchar(255),
    email             varchar(255),
    phone             varchar(255),
    website           varchar(255),
    mphone            varchar(255),
    state             varchar(255),
    source            varchar(255),
    create_by         varchar(255),
    create_time       char(19),
    edit_by           varchar(255),
    edit_time         char(19),
    description       varchar(255),
    contact_summary   varchar(255),
    next_contact_time char(10),
    address           varchar(255),
    primary key (id)
);

/*==============================================================*/
/* table: tbl_clue_activity_relation                            */
/* description: 线索活动关系表                                     */
/*==============================================================*/
create table tbl_clue_activity_relation
(
    id          char(32) not null,
    clue_id     char(32),
    activity_id char(32),
    primary key (id)
);

/*==============================================================*/
/* Table: tbl_clue_remark                                       */
/* description: 线索备注表                                        */
/*==============================================================*/
create table tbl_clue_remark
(
    id           char(32) not null,
    note_content varchar(255),
    create_by    varchar(255),
    create_time  char(19),
    edit_by      varchar(255),
    edit_time    char(19),
    edit_flag    char(1),
    clue_id      char(32),
    primary key (id)
);

/*==============================================================*/
/* Table: tbl_contacts                                          */
/* description: 联系人表                                           */
/*==============================================================*/
create table tbl_contacts
(
    id                char(32) not null,
    owner             char(32),
    source            varchar(255),
    customer_id       char(32),
    fullname          varchar(255),
    appellation       varchar(255),
    email             varchar(255),
    mphone            varchar(255),
    job               varchar(255),
    create_by         varchar(255),
    create_time       char(19),
    edit_by           varchar(255),
    edit_time         char(19),
    description       varchar(255),
    contact_summary   varchar(255),
    next_contact_time char(10),
    address           varchar(255),
    primary key (id)
);

/*==============================================================*/
/* Table: tbl_contacts_activity_relation                        */
/* description: 联系人活动关系表                                     */
/*==============================================================*/
create table tbl_contacts_activity_relation
(
    id          char(32) not null,
    contacts_id char(32),
    activity_id char(32),
    primary key (id)
);

/*==============================================================*/
/* Table: tbl_contacts_remark                                   */
/* description: 联系人备注表                                        */
/*==============================================================*/
create table tbl_contacts_remark
(
    id           char(32) not null,
    note_content varchar(255),
    create_by    varchar(255),
    create_time  char(19),
    edit_by      varchar(255),
    edit_time    char(19),
    edit_flag    char(1),
    contacts_id  char(32),
    primary key (id)
);

/*==============================================================*/
/* Table: tbl_customer                                          */
/* description: 客户表                                           */
/*==============================================================*/
create table tbl_customer
(
    id                char(32) not null,
    owner             char(32),
    name              varchar(255),
    website           varchar(255),
    phone             varchar(255),
    create_by         varchar(255),
    create_time       char(19),
    edit_by           varchar(255),
    edit_time         char(19),
    contact_summary   varchar(255),
    next_contact_time char(10),
    description       varchar(255),
    address           varchar(255),
    primary key (id)
);

/*==============================================================*/
/* Table: tbl_customer_remark                                   */
/* description: 客户备注表                                           */
/*==============================================================*/
create table tbl_customer_remark
(
    id           char(32) not null,
    note_content varchar(255),
    create_by    varchar(255),
    create_time  char(19),
    edit_by      varchar(255),
    edit_time    char(19),
    edit_flag    char(1),
    customer_id  char(32),
    primary key (id)
);

/*==============================================================*/
/* Table: tbl_tran                                              */
/* description: 交易表                                           */
/*==============================================================*/
create table tbl_tran
(
    id                char(32) not null,
    owner             char(32),
    money             varchar(255),
    name              varchar(255),
    expected_date     char(10),
    customer_id       char(32),
    stage             varchar(255),
    type              varchar(255),
    source            varchar(255),
    activity_id       char(32),
    contacts_id       char(32),
    create_by         varchar(255),
    create_time       char(19),
    edit_by           varchar(255),
    edit_time         char(19),
    description       varchar(255),
    contact_summary   varchar(255),
    next_contact_time char(10),
    primary key (id)
);

/*==============================================================*/
/* Table: tbl_tran_history                                      */
/* description: 历史交易表                                        */
/*==============================================================*/
create table tbl_tran_history
(
    id            char(32) not null,
    stage         varchar(255),
    money         varchar(255),
    expected_date char(10),
    create_time   char(19),
    create_by     varchar(255),
    tran_id       char(32),
    primary key (id)
);

/*==============================================================*/
/* Table: tbl_tran_remark                                       */
/* description: 交易备注表                                        */
/*==============================================================*/
create table tbl_tran_remark
(
    id           char(32) not null,
    note_content varchar(255),
    create_by    varchar(255),
    create_time  char(19),
    edit_by      varchar(255),
    edit_time    char(19),
    edit_flag    char(1),
    tran_id      char(32),
    primary key (id)
);
