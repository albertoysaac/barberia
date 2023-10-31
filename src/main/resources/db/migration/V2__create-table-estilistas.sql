create table estilistas(
    email varchar(60) not null,
    password varchar(20) not null,
    nombre varchar(60) not null,
    apellido varchar(60) not null,
    imagen blob,
    telefono varchar(60) not null,
    genero varchar(15),
    hora_entrada time not null,
    hora_salida time not null,
    fecha_ingreso timestamp not null,
    estado tinyint not null,
    primary key(email)
);