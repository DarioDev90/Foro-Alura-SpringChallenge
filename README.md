# Challenge ONE | Back End | Foro Alura

<p align="center" >
     <img width="200" heigth="200" src="https://user-images.githubusercontent.com/91544872/209678377-70b50b21-33de-424c-bed8-6a71ef3406ff.png">
</p>

En este desafío, vamos a implementar a nivel de back end (CRUD) el proceso de un foro, y para eso crearemos una API REST usando Spring.

Nuestra API va a centrarse específicamente en los tópicos, y debe permitir a los usuarios:

- Crear un nuevo tópico
- Mostrar todos los tópicos creados
- Mostrar un tópico específico
- Actualizar un tópico
- Eliminar un tópico
- Documentación con Swagger
- Generar un token usando JWT
- Autenticación con JWT

### Definición de foro

Un foro es una comunidad en línea que facilita la comunicación y el intercambio de conocimientos entre usuarios interesados en temas específicos.

### ⬇️ Repositorio Base Alura

https://github.com/alura-challenges/challenge-one-foro-alura

# 📃 Challenge ONE - API REST - Spring 1

### 🔹Diagrama de base de datos:

Link: https://github.com/DarioDev90/Foro-Alura-SpringChallenge/tree/main/src/main/resources/db/migration
![diagrama_foro_api](src/imgRepository/Diagrama-Entidad-Relacion.png)

### 🔹Registro de un nuevo tópico

&emsp; La API debe tener un endpoint para el registro de nuevos tópicos y debe aceptar solicitudes POST para el URI /topicos.

```bash
[ POST ] http://localhost:8080/topicos
```

```json
{
  "titulo": "IONIC 5",
  "mensaje": "Consulta de ionic 5 conexión con Myqsl",
  "status": "NO_RESPONDIDO",
  "usuario": {
    "id": "1"
  },
  "curso": {
    "id": "1"
  }
}
```

![](src/imgRepository/Registrar-Topico.jpeg)

### 🔹Mostrar todos los tópicos

&emsp; La API debe tener un endpoint para la lista de todos los tópicos y debe aceptar solicitudes GET para el URI /topicos.

```bash
[ GET ] http://localhost:8080/topicos?size=10
```

![](src/imgRepository/Listado-Topicos.jpeg)

### 🔹Detallando un tópico

&emsp; La API debe tener un endpoint para la lista de todos los tópicos y debe aceptar solicitudes GET para el URI /topicos/{id}.

```bash
[ GET ] http://localhost:8080/topicos/3
```

![](src/imgRepository/Obtener-Datos-Topico.jpeg)

### 🔹Actualizar un tópico

&emsp; La API debe tener un endpoint para el registro de nuevos tópicos y debe aceptar solicitudes PUT para el URI /topicos/{id}.

```bash
[ PUT ] http://localhost:8080/topicos
```

```json
{
  "id": 3,
  "titulo": "PHP 7",
  "mensaje": "Consulta de PHP 7 Conexión con mysql"
}
```

![](src/imgRepository/Actualizar-Topico.jpeg)

### 🔹Eliminar un tópico

&emsp; La API debe tener un endpoint para la eliminación de tópicos y debe aceptar requisiciones DELETE para el URI /topicos/{id}.

```bash
[ DELETE ] http://localhost:8080/topicos/3
```

![](src/imgRepository/Eliminar-Topico.jpeg)

# 📃 Challenge ONE - API REST - Spring 2

### 🔹Documentación con Swagger

&emsp; Swagger es una herramienta extremadamente ventajosa para tu API, ya que ofrece una interfaz fácil amigable y accesible, así como una forma de documentación automática, generada simultáneamente con el desarrollo de la API.

```bash
[ URL ] http://localhost:8080/login](http://localhost:8080/swagger-ui/index.html#/
```

![](src/imgRepository/SpringDoc-ForoApi.jpeg)

### 🔹Generar un token usando JWT

&emsp; Para agregar mayor seguridad a tu aplicación, una opción muy ventajosa es requerir tokens para la autenticación.

```bash
[ POST ] http://localhost:8080/login
```

```json
{
  "email": "user@email.com",
  "password": "123456"
}
```

![](src/imgRepository/Crear-Token-User.jpeg)

### 🔹Autenticación con JWT

&emsp; Una vez que se genera el token con JWT, será necesario usarlo para autenticar el proceso de registros, eliminación, actualización.

```json
{
  "jwTtoken": "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1c2VyQGVtYWlsLmNvbSIsImlzcyI6ImZvcm8gYXBpIiwiaWQiOjEsImV4cCI6MTY5NTUyNzMyMX0.-cKDRhNqzEKqg694sYGJ0l6e0CChS7dv3muGN2i1FhE"
}
```

### &emsp; Endpoints

---

| Endpoint      | Método | Acceso            | Descripción                       |
| ------------- | ------ | ----------------- | --------------------------------- |
| /login        | POST   | Público           | Genera par de tokens              |
| /topicos      | GET    | Público           | Mostrar todos los tópicos creados |
| /topicos/{id} | GET    | Público           | Mostrar un tópico específico      |
| /topicos      | POST   | Privado/Protegido | Crear un nuevo tópico             |
| /topicos      | PUT    | Privado/Protegido | Actualizar un tópico              |
| /topicos/{id} | DELETE | Privado/Protegido | Eliminar un tópico                |

---

![](src/imgRepository/Authentication-User.jpeg)

## 📚 Tecnologías

- [OpenJDK JDK 17](https://openjdk.org/projects/jdk/17/)
- [IntelliJ IDEA Community Edition](https://www.jetbrains.com/idea/download/#section=linux)
- [Spring Boot 3.0.6](https://docs.spring.io/spring-boot/docs/3.0.6/reference/html/)
- [Spring Initializr](https://start.spring.io)
- [MySQL 8.0.30](https://dev.mysql.com/downloads/mysql/)
- [MySQL Workbench](https://www.mysql.com/products/workbench/)
- [Insomnia](https://insomnia.rest/)
- [Lombok](https://www.baeldung.com/intro-to-project-lombok)
- [Flyway](https://www.baeldung.com/database-migrations-with-flyway)
- [Swagger](https://www.baeldung.com/spring-rest-openapi-documentation)
- [JWT](https://jwt.io/)

## 📝 Dependencias utilizadas

Link: https://github.com/DarioDev90/Foro-Alura-SpringChallenge/blob/main/pom.xml
![](src/imgRepository/Dependencias-Proyecto.png)

---

## 📝 Estructura del proyecto

Link: https://github.com/DarioDev90/Foro-Alura-SpringChallenge/tree/main/src/main/java/org/dariodev/foro/api
![](src/imgRepository/Estructura-Proyecto.png)

## 📝 Commits realizados:

Link: https://github.com/DarioDev90/Foro-Alura-SpringChallenge/commits/main

---

![insignia](https://github.com/chriscarsam/foro-alura/assets/28877424/fb51f5ba-3c89-4800-bd2d-697fb138e24f) DarioDev
