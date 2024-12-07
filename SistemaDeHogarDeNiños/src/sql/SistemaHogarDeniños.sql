create table Personal (
    ci varchar(50) primary key ,
    Nombre varchar(100) not null,
    Apellido varchar(100) not null ,
    sexo char(1) not null ,
    Tipo varchar(100) not null ,
    correo varchar(100) not null ,
    cel_ref varchar(100) not null ,
    Fecha_i date not null ,
    fecha_f varchar null
);

create table usuario (
    id_u int primary key ,
    username varchar(50) not null ,
    password varchar(50) not null ,
    personalci varchar(50) not null ,
    foreign key (personalci) references Personal(ci) 
);


create table Secretaria (
    cis varchar(50) primary key ,
    velocidad_t varchar(50) not null , 
    foreign key (cis) references Personal(ci)
);


create table Encargado (
    cie varchar(50) primary key , 
    foreign key (cie) references Personal(ci)
);


create table Directora  (
    cid varchar(50) primary key , 
    foreign key (cid) references Personal(ci)
);


create table adm (
    ciadm varchar(50) primary key , 
    foreign key (ciadm) references Personal(ci)
);


create table Tipo_I (
    idTI int primary key ,
    Descripcion varchar(50) not null 
);


create table Ingreso (
    idI int primary key ,
    Monto varchar(50) not null ,
    Fecha date not null ,
    Descripcion varchar(50) not null ,
    ciSecre varchar(50) not null ,
    IdTipoIngreso int not null ,
    foreign key (ciSecre) references Secretaria(cis) ,
    foreign key (IdTipoIngreso) references Tipo_I(idTI)
);


create table Tutor (
    IdT int primary key ,
    Descripcion varchar(50) not null ,
    Nombre varchar(50) not null ,
    Apellido varchar(50) not null ,
    Sexo char(1) not null ,
    Cel varchar(50) not null ,
    Direccion varchar(50) not null
);

create table niños (
    IdN int primary key ,
    Nombre varchar(50) not null ,
    Apellido varchar(50) not null ,
    Fecha_i date not null ,
    Fecha_F varchar  NULL  ,
    sexo char(1) not null ,
    edad int not null ,
    idTutor int  null ,
    ciSecre varchar(50) not null ,
    foreign key (idTutor) references Tutor(IdT) ,
    foreign key (ciSecre) references Secretaria (cis) 
);


create table area (
    idAr int primary key ,
    Descripcion varchar(50) not null 
);


create table Labor (
    idL int primary key ,
    Fecha_i date not null ,
    Fecha_F varchar null  ,
    Descripcion varchar(50) not null ,
    idarea int not null ,
    idniños int not null ,
    cienc varchar(50) not null ,
    foreign key (idarea) references area (idAr) ,
    foreign key (idniños) references  niños(IdN) ,
    foreign key (cienc) references Encargado (cie) 
);



create table Grado (
    Idg int primary key ,
    Descripcion varchar(50) not null 
);


create table UE (
    idUE int primary key ,
    Nombre varchar(50) not null ,
    Direccion varchar(50) not null ,
    cel_ref varchar(50)  NULL
);


create table Formacion (
    idF int primary key ,
    Turno varchar(50) not null ,
    idGrado int not null ,
    idUE int not null ,
    idniños int not null ,
    foreign key (idGrado) references Grado(Idg) ,
    foreign key (idUE) references UE(idUE) ,
    foreign key (idniños) references niños(IdN)
);
---holaaaa