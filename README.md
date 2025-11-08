Proyekta – Gestor de Proyectos Web

Proyekta es una aplicación web que facilita la planificación, organización y seguimiento de proyectos. Permite crear proyectos con información clave (método de trabajo, fechas, descripción, miembros) y visualizarlos en un tablero moderno. Combina un backend robusto en Spring Boot con un frontend ligero hecho en HTML, CSS y JavaScript puro.

🚀 Características

- Creación de proyectos con código único autogenerado

- Registro de método de trabajo (Scrum, Kanban, etc.)

- Gestión de fechas de inicio y fin

- Descripción del proyecto

- Gestión de miembros del proyecto

- Panel de visualización de proyectos en un tablero moderno

- API REST con Spring Boot (controladores, servicios y repositorios separados)

- Persistencia en SQLite para desarrollo y compatible con MySQL para producción

🏗️ Tecnologías

Backend

- Java 17

- Spring Boot

- Seguridad con Spring Security

- JDBC Template para acceso a datos

- SQLite / MySQL

Frontend

- HTML5

- CSS3 y Bootstrap 5

- JavaScript puro (fetch API, manipulación del DOM)

- Librerías: Owl Carousel, Flaticon, Waypoints

📂 Estructura del proyecto
springboot-web/
 ├── src/main/java/com/curso/marcos_de_desarroll_web/springboot/web/springboot_web
 │   ├── config/             # Configuración de seguridad
 │   ├── controller/         # Controladores REST
 │   ├── model/              # Entidades (Project, Usuario)
 │   ├── repository/         # Repositorios para DB
 │   └── service/            # Lógica de negocio
 ├── src/main/resources/
 │   ├── static/
 │   │   ├── css/            # Estilos
 │   │   ├── js/             # Scripts
 │   │   ├── img/            # Imágenes
 │   │   └── lib/            # Librerías externas
 │   └── templates/          # Vistas HTML
 └── src/test/java/...       # Pruebas unitarias

🔌 API principal

- POST /api/projects – Crear un proyecto

- GET /api/projects – Listar todos los proyectos

- GET /api/projects/{id} – Consultar proyecto por ID

(Más endpoints implementados para usuarios y autenticación)

🌱 Próximas mejoras

- CRUD completo (editar y eliminar proyectos)

- Mejoras en el tablero visual (drag & drop, Kanban)

- Filtros y búsquedas avanzadas

- Autenticación y autorización de usuarios

- Exportación de proyectos (PDF/Excel)

👨‍💻 Autor

Franco Oscco
Desarrollador web con pasión por crear soluciones intuitivas y prácticas, combinando buenas prácticas de backend con una interfaz frontend ligera y funcional.
