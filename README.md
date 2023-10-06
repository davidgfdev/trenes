# Microservicio de Trenes

REST de una lista de trenes.

Gestión de dependencias con Maven.




## Deployment

Para desplegar este proyecto:

    1. Crear una nueva Base de Datos de nombre "railes".

    2. Ejecutar el script sql "data.sql" en main/resources.

    3. Cambiar el user y el password en application.properties.

    4. Instalar dependencias de Maven.

```bash
  mvn clean install
```

    5. Asegurarse de que el puerto 9000 está libre.

    6. Ejecutar el Main del proyecto.

## Casos de Uso

### Obtener todos los trenes que tengan tantos vagones como entre los números especificados.

METHOD: GET, RUTA: **trenes/{minVagones}/{maxVagones}**

### Actualizar el número de vagones de un tren.

METHOD: PUT, RUTA: **tren/{idTren}/{vagones}**

### Eliminar un tren.

METHOD: DELETE, RUTA: **tren/{idTren}**

### Obtener todos los trenes.

METHOD: GET, RUTA: **trenes**
