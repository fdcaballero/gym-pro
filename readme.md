# GYM-PRO

## Requisitos

- Java 17 o superior
- Gradle
- Docker y Docker Compose
- Base de datos configurada (ver variables de entorno)


## CONFIGURACION

Variables de entorno requeridas en el sistema

```markdown
PASSWORD_DB
DB_NAME
USER_DB
PORT_DB
HOST_DB
SERVER_PORT
EMAIL
PASSWORD_EMAIL
SMS_API_PASSWORD
SMS_API_USERNAME
SMS_API_BASE_URL
CLIENT_ID
CLIENT_ID_SECRET
REFRESH_TOKEN
ACCESS_TOKEN
MAIL_HOST
MAIL_PORT
```


## Variables de entorno

Configura las siguientes variables en un archivo `.env` o en tu sistema:
### Docker

Usar este comando para levantar la base de datos y demas servicios asociados.

```
docker compose --env-file my-env-file.env up -d
```

## Compilar y ejecutar el proyecto

1. Instala las dependencias y compila el proyecto:

```./gradlew clean build```

2. Ejecuta la aplicación:
```
./gradlew bootRun
```


La aplicación estará disponible en el puerto configurado en la variable `SERVER_PORT`.

El la documentación con swagger se encuentra en la ruta ``/swagger-ui/index.html#/``
 