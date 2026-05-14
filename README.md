#  ClientFlow API

REST API built with Spring Boot for client management, featuring CRUD operations, pagination, validation, and exception handling.

---

#  Tech Stack

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Maven
- Lombok
- Bean Validation

---
#  Features

- Full CRUD operations
- Paginated client listing
- Bean Validation
- Global exception handling
- DTO pattern
- Layered architecture
- H2 in-memory database
- JPA/Hibernate integration
- Clean code structure

---

#  Project Structure

```txt
src/main/java/com/clientflow/api
├── controllers
│   └── handlers
├── dto
├── entities
├── repositories
├── services
│   └── exceptions
```

---

#  Request Flow

```txt
HTTP Request
    ↓
Controller
    ↓
Service
    ↓
Repository
    ↓
H2 Database
    ↓
Repository
    ↓
Service
    ↓
Controller
    ↓
HTTP Response
```

---

#  Client Entity

| Field | Type |
|---|---|
| id | Long |
| name | String |
| cpf | String |
| income | Double |
| birthDate | LocalDate |
| children | Integer |

---

#  API Endpoints

| Method | Endpoint | Description |
|---|---|---|
| GET | `/clients` | Paginated client list |
| GET | `/clients/{id}` | Find client by id |
| POST | `/clients` | Insert new client |
| PUT | `/clients/{id}` | Update client |
| DELETE | `/clients/{id}` | Delete client |

---

#  Pagination Example

```http
GET /clients?page=0&size=5&sort=name
```

---

#  Insert Client

## Request

```json
{
  "name": "Maria Silva",
  "cpf": "12345678901",
  "income": 6500.0,
  "birthDate": "1994-07-20",
  "children": 2
}
```

---

#  Response Example

```json
{
  "id": 1,
  "name": "Maria Silva",
  "cpf": "12345678901",
  "income": 6500.0,
  "birthDate": "1994-07-20",
  "children": 2
}
```

---

# Validation Rules
| Field | Rule                           |
|---|--------------------------------|
| name | Required                       |
| cpf | Required                       |
| income | Required and positive   |
| birthDate | Required and past date |
| children | Required                       |

---

#  Error Handling

## 404 - Resource Not Found

```json
{
  "timestamp": "2025-05-14T20:00:00Z",
  "status": 404,
  "error": "Recurso não encontrado",
  "path": "/clients/99"
}
```

---

## 422 - Validation Error

```json
{
  "timestamp": "2025-05-14T20:00:00Z",
  "status": 422,
  "error": "Dados inválidos",
  "path": "/clients",
  "errors": [
    {
      "fieldName": "name",
      "message": "Campo requerido"
    }
  ]
}
```

---

#  Running the Project

## Clone repository

```bash
git clone https://github.com/your-user/clientflow-api.git
```

---

## Enter project folder

```bash
cd clientflow-api
```

---

## Run application

```bash
./mvnw spring-boot:run
```

---

#  H2 Database Console

## Access

```txt
http://localhost:8080/h2-console
```

---

## JDBC URL

```txt
jdbc:h2:mem:testdb
```

---

## Username

```txt
sa
```

---

## Password

```txt
leave empty
```

---

#  Concepts Applied

- RESTful API design
- DTO pattern
- Layered architecture
- Dependency Injection
- Exception handling
- Bean Validation
- Pagination with Spring Data
- JPA/Hibernate mapping

---
