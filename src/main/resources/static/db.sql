CREATE TABLE tutor 
(
    id BIGINT NOT NULL,
    nombres character varying(200) NOT NULL,
	 apellidos character varying(200) NOT NULL,
    calle_numero character varying(150) NULL,
    ciudad character varying(100) NULL,
    region character varying(100) NULL,
    correo character varying(100) NULL,
    telefono character varying(50) NULL,
    descripcion character varying(300) NULL,
	 foto character varying(300) NULL,
   CONSTRAINT tutor_pkey PRIMARY KEY (id)
);

CREATE TABLE dbo.reserva
(
    id bigint NOT NULL,
     fecha_reserva DATE,
    hora_inicio_reserva TIMESTAMP,
    hora_fin_reserva TIMESTAMP,
    id_ninera BIGINT not null,
    id_tutor BIGINT not null,
	valor_total int null,
    PRIMARY KEY (id)
);

CREATE TABLE dbo.ninera (
    id BIGINT NOT NULL,
    nombre VARCHAR(200) NOT NULL,
    calle_numero VARCHAR(150) null,
    ciudad VARCHAR(100) null,
    region VARCHAR(100) null,
    fecha_nacimiento DATE null,
    estado_civil varchar(50) null,
    estudios varchar(200) null,
    valor_hora int null,
    correo VARCHAR(100) null,
    telefono VARCHAR(50) null,
    descripcion VARCHAR(300) null,
	 foto VARCHAR(300) NULL,
 PRIMARY KEY (id)
);

CREATE TABLE disponibilidad (
    id BIGINT NOT NULL,
	id_ninera BIGINT not null,
    fecha DATE null,
   PRIMARY KEY (id)
);
CREATE TABLE disponibilidad_horario (
    id BIGINT NOT NULL,
	id_disponibilidad BIGINT not null,
    hora VARCHAR(50) NULL,
    PRIMARY KEY (id)
);
CREATE TABLE recomendaciones (
    id BIGINT NOT NULL,
	id_ninera BIGINT not null,
	id_tutor BIGINT not null,
	calificacion BIGINT not null,
	comentarios VARCHAR(800) NULL,
    fecha DATE NULL,
    PRIMARY KEY (id)
);




CREATE SEQUENCE dbo.seq_tutor
    INCREMENT 1
    START 1;