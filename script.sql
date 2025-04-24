--CREAR ESPACIO DE TRABAJO
CREATE USER proyecto_tienda IDENTIFIED BY cenfo22;
GRANT CONNECT, RESOURCE TO proyecto_tienda;

GRANT ALL PRIVILEGES TO proyecto_tienda;



-- EXTRA
SELECT * FROM Usuario WHERE email = 'jdoe2@email.com';


--CONECTARSE
ALTER SESSION SET CURRENT_SCHEMA = proyecto_tienda;

--CREAR TABLAS

-- Tabla Usuario:
CREATE TABLE Usuario (
    username VARCHAR2(50) PRIMARY KEY,
    nombreCompleto VARCHAR2(100),
    cedulaIdentidad VARCHAR2(20),
    fechaNacimiento DATE,
    email VARCHAR2(100),
    contraseña VARCHAR2(100),
    rol VARCHAR2(50)
);

ALTER TABLE Usuario
RENAME COLUMN contraseña TO contrasena;


-- Tabla Administrador:
CREATE TABLE Administrador (
    username VARCHAR2(50) PRIMARY KEY,
    CONSTRAINT fk_administrador FOREIGN KEY (username) REFERENCES Usuario (username)
);

-- Tabla Comprador:
CREATE TABLE Comprador (
    username VARCHAR2(50) PRIMARY KEY,
    fechaRegistro DATE,
    CONSTRAINT fk_comprador FOREIGN KEY (username) REFERENCES Usuario (username)
);

-- PROCEDIMIENTOS ALMACENADOS

-- Crear el procedimiento para insertar un Usuario:
CREATE OR REPLACE PROCEDURE insertar_usuario (
    p_username IN VARCHAR2,
    p_nombreCompleto IN VARCHAR2,
    p_cedulaIdentidad IN VARCHAR2,
    p_fechaNacimiento IN DATE,
    p_email IN VARCHAR2,
    p_contrasena IN VARCHAR2,
    p_rol IN VARCHAR2 -- 'Administrador' o 'Comprador'
) AS
BEGIN
    -- Realizamos la inserción de manera más sencilla
    INSERT INTO Usuario 
    (username, nombreCompleto, cedulaIdentidad, fechaNacimiento, email, contrasena, rol)
    VALUES 
    (p_username, p_nombreCompleto, p_cedulaIdentidad, p_fechaNacimiento, p_email, p_contrasena, p_rol);
    
    -- Confirmamos los cambios
    COMMIT;
END insertar_usuario;
/

-- Procedimiento para insertar Administrador:
CREATE OR REPLACE PROCEDURE insertar_administrador (
    p_username IN VARCHAR2
) AS
BEGIN
    INSERT INTO Administrador (username)
    VALUES (p_username);
    COMMIT;
END insertar_administrador;
/

-- Procedimiento para insertar un Comprador:
CREATE OR REPLACE PROCEDURE insertar_comprador (
    p_username IN VARCHAR2,
    p_fechaRegistro IN DATE
) AS
BEGIN
    INSERT INTO Comprador (username, fechaRegistro)
    VALUES (p_username, p_fechaRegistro);
    COMMIT;
END insertar_comprador;
/

-- Procedimiento para iniciar sesión (autenticación):
CREATE OR REPLACE PROCEDURE iniciar_sesion (
    p_email IN VARCHAR2,
    p_contrasena IN VARCHAR2
) AS
    v_username VARCHAR2(50);
    v_rol VARCHAR2(50);
BEGIN
    -- Verificamos las credenciales en la tabla Usuario
    SELECT username, rol
    INTO v_username, v_rol
    FROM Usuario
    WHERE email = p_email AND contrasena = p_contrasena;

    -- Si se encuentra el usuario, se muestra el rol (Administrador o Comprador)
    DBMS_OUTPUT.PUT_LINE('Usuario autenticado. Rol: ' || v_rol);
    
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('Credenciales incorrectas.');
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Error: ' || SQLERRM);
END iniciar_sesion;
/

-- Procedimiento para cambiar la contraseña de un usuario:
CREATE OR REPLACE PROCEDURE cambiar_contrasena (
    p_username IN VARCHAR2,
    p_nueva_contrasena IN VARCHAR2
) AS
BEGIN
    UPDATE Usuario
    SET contrasena = p_nueva_contrasena
    WHERE username = p_username;
    COMMIT;
END cambiar_contrasena;
/
