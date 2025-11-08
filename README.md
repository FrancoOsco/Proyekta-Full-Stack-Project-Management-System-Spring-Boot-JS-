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
├───main
│   ├───java
│   │   └───com
│   │       └───curso
│   │           └───marcos_de_desarroll_web
│   │               └───springboot
│   │                   └───web
│   │                       └───springboot_web
│   │                           │   SpringbootWebApplication.java
│   │                           │   
│   │                           ├───config
│   │                           │       SecurityConfig.java
│   │                           │       
│   │                           ├───controller
│   │                           │       ProjectController.java
│   │                           │       UsuarioController.java
│   │                           │       
│   │                           ├───model
│   │                           │       Project.java
│   │                           │       Usuario.java
│   │                           │       
│   │                           ├───repository
│   │                           │       ProjectRepository.java
│   │                           │       UsuarioRepository.java
│   │                           │       
│   │                           └───service
│   │                                   CustomUserDetailsService.java
│   │                                   ProjectService.java
│   │                                   UsuarioService.java
│   │                                   
│   └───resources
│       │   application.properties
│       │   
│       ├───static
│       │   ├───css
│       │   │       bootstrap.min.css
│       │   │       style.css
│       │   │       
│       │   ├───img
│       │   │       about.jpg
│       │   │       blog-1.jpg
│       │   │       blog-2.jpg
│       │   │       favicon.png
│       │   │       google.png
│       │   │       hero.jpg
│       │   │       imagen-equipo.jpg
│       │   │       login-name.jpg
│       │   │       microsoft.jpg
│       │   │       offer.jpg
│       │   │       product-1.png
│       │   │       product-2.png
│       │   │       product-3.png
│       │   │       product-4.png
│       │   │       team-1.jpg
│       │   │       team-2.jpg
│       │   │       team-3.jpg
│       │   │       team-4.jpg
│       │   │       team-5.jpg
│       │   │       testimonial-1.jpg
│       │   │       testimonial-2.jpg
│       │   │       testimonial.jpg
│       │   │       user.jpg
│       │   │       
│       │   ├───js
│       │   │       advertencia-ingresar.js
│       │   │       bloquear.js
│       │   │       consumir.js
│       │   │       enviar-info.js
│       │   │       generar-codigo.js
│       │   │       logica-tablero.js
│       │   │       main.js
│       │   │       mensajes-login.js
│       │   │       recuperacion-contraseña.js
│       │   │       seleccionar-proyecto.js
│       │   │       toasts.js
│       │   │       
│       │   ├───lib
│       │   │   ├───easing
│       │   │   │       easing.js
│       │   │   │       easing.min.js
│       │   │   │       
│       │   │   ├───flaticon
│       │   │   │   │   backup.txt
│       │   │   │   │   
│       │   │   │   ├───font
│       │   │   │   │       flaticon.css
│       │   │   │   │       Flaticon.eot
│       │   │   │   │       flaticon.html
│       │   │   │   │       Flaticon.svg
│       │   │   │   │       Flaticon.ttf
│       │   │   │   │       Flaticon.woff
│       │   │   │   │       Flaticon.woff2
│       │   │   │   │       _flaticon.scss
│       │   │   │   │       
│       │   │   │   └───license
│       │   │   │           license.pdf
│       │   │   │           
│       │   │   ├───owlcarousel
│       │   │   │   │   LICENSE
│       │   │   │   │   owl.carousel.js
│       │   │   │   │   owl.carousel.min.js
│       │   │   │   │   
│       │   │   │   └───assets
│       │   │   │           ajax-loader.gif
│       │   │   │           owl.carousel.css
│       │   │   │           owl.carousel.min.css
│       │   │   │           owl.theme.default.css
│       │   │   │           owl.theme.default.min.css
│       │   │   │           owl.theme.green.css
│       │   │   │           owl.theme.green.min.css
│       │   │   │           owl.video.play.png
│       │   │   │           
│       │   │   └───waypoints
│       │   │           links.php
│       │   │           waypoints.min.js
│       │   │           
│       │   └───scss
│       └───templates
│               home.html
│               login.html
│               proyecto.html
│               registro.html
│               tablero.html
│               
└───test
    └───java
        └───com
            └───curso
                └───marcos_de_desarroll_web
                    └───springboot
                        └───web
                            └───springboot_web
                                    SpringbootWebApplicationTests.java

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
