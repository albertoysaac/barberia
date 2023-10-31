create table clientes(
    email varchar(60) not null,
    password varchar(20) not null,
    nombre varchar(60) not null,
    apellido varchar(60) not null,
    fecha_nacimiento date,
    telefono varchar(60) not null,
    genero varchar(15),
    estado varchar(60) not null,
    calle varchar(30) not null,
    alcaldia varchar(20) not null,
    ciudad varchar(20) not null,
    codigo_postal varchar(6) not null,
    primary key(email)
);