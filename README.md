# 🎮 FreeGames Microservice

Microservicio Spring WebFlux que filtra juegos gratuitos según la **plataforma**, consumiendo la API pública de [FreeToGame](https://www.freetogame.com/api-doc).

Este proyecto forma parte de la asignatura **Programación de Servicios y Procesos**  
📚 2º DAM - San Valero (2025)

---

## 🚀 Tecnologías utilizadas

- Java 21 ☕
- Spring Boot 3 (WebFlux) 🌐
- Maven 🔧
- WebClient (cliente reactivo para llamadas HTTP)
- Jackson (serialización JSON)

---

## 📦 Estructura del proyecto
freegames-microservice/ ├── src/ │ └── main/ │ ├── java/com/svalero/ │ │ ├── Controller/GameController.java │ │ ├── Model/Game.java │ │ └── FreeGamesMicroservice.java │ └── resources/ │ └── application.properties ├── pom.xml └── README.md
---

## 📡 Endpoints disponibles

| Método | Endpoint                      | Descripción                             |
|--------|-------------------------------|-----------------------------------------|
| GET    | `/filtered-games?platform=pc` | Devuelve juegos para la plataforma dada |

🔁 Puedes usar `platform=pc` o `platform=browser`.

Ejemplo: GET http://localhost:8080/filtered-games?platform=pc

---

## 🧪 Ejemplo de respuesta JSON

```json
[
  {
    "id": 540,
    "title": "Overwatch 2",
    "platform": "PC (Windows)",
    "publisher": "Activision Blizzard",
    "category": "Shooter",
    "thumbnail": "https://www.freetogame.com/g/540/thumbnail.jpg"
  },
  ...
]

⚙️ Cómo ejecutar el microservicio
▶️ Desde consola
mvn spring-boot:run
🧪 Prueba rápida con navegador o Postman
http://localhost:8080/filtered-games?platform=pc
