# Documentación de Endpoints

La siguiente documentación describe todos los endpoints disponibles en la API de gestión de inventario. Estos endpoints permiten realizar operaciones CRUD (crear, leer, actualizar, eliminar) sobre productos y obtener información relacionada con las transacciones.

## 1. **Obtener todos los productos**
   **Método**: `GET`  
   **Ruta**: `/products`

   **Descripción**: Obtiene una lista de todos los productos en el inventario.

   **Respuesta exitosa (200 OK)**:
   ```json
   {
     "status": "success",
     "data": [
       {
         "id": 1,
         "name": "Producto A",
         "description": "Descripción del producto A",
         "price": 100.0,
         "quantity": 50
       },
       {
         "id": 2,
         "name": "Producto B",
         "description": "Descripción del producto B",
         "price": 150.0,
         "quantity": 30
       }
     ]
   }
