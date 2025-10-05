# GYM-PRO

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

### Docker

Usar este comando para levantar la base de datos y demas servicios asociados.

```
docker compose --env-file my-env-file.env up -d
```

### Descripcion:

Este es 