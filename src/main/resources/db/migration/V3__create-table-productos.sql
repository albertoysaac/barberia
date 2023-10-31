create table productos(
    sku varchar(60) not null,
    nombre varchar(20) not null,
    descripcion_corta varchar(60) not null,
    descripcion_larga varchar(500) not null,
    categoria varchar(20) not null,
    marca varchar(30) not null,
    imagen blob,
    stock int not null,
    precio double not null,
    destacado bit not null,
    primary key (sku)
);