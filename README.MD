# MPAZ Backend — Microservicio Pedagógico UTP (Grupo 14)

Microservicio REST desarrollado en **Spring Boot 3.3.5** para respaldar la sincronización remota y auditoría de Objetivos de Aprendizaje (OA) de la aplicación móvil **MPAZ PRO 3.º** (Escuela Escritora Marcela Paz — Duoc UC).

## Tecnologías
- **Java 17** & **Spring Boot 3.3.5**
- **Spring Web** (API RESTful `/api/avances`)
- **Spring Data JPA** + **H2 Database**

## Endpoints Principales (`/api/avances`)
- `GET /api/avances`: Lista todos los registros pedagógicos UTP.
- `POST /api/avances`: Crea un nuevo registro de avance escolar.
- `PUT /api/avances/{id}`: Actualiza y valida un avance existente.
- `DELETE /api/avances/{id}`: Elimina un registro de avance.

## Ejecución Local
```powershell
.\gradlew bootRun