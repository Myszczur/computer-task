create table computer(
    id LONG not null auto_increment primary key unique,
    accounting_date date,
    name            varchar(50),
    pln_cost        numeric(19, 2),
    usd_cost        numeric(19, 2),
    data_rate       date
);