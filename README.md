# 🛒 Order Management System

A Java-based Spring Boot application for managing customers, grocery items, and orders in a grocery store environment.

## 🚀 Features

- Create, read, update, and delete (CRUD) operations for:
  - Customers
  - Grocery Items
  - Orders
- RESTful APIs using Spring Boot
- Service and Repository layer architecture
- In-memory or persistent database support (H2/MySQL)
- Gradle build system

## 🛠️ Tech Stack

- Java 17+
- Spring Boot
- Spring Data JPA
- REST APIs
- Gradle
- H2 / MySQL (Optional)
- IntelliJ / VS Code

## 📁 Project Structure

src/
├── main/
│ ├── java/
│ │ └── com/grocery/order_management/
│ │ ├── model/
│ │ ├── repository/
│ │ ├── service/
│ │ └── controller/ (if applicable)
│ └── resources/
│ └── application.properties
└── test/ 


## ⚙️ Getting Started

### Prerequisites

- JDK 17 or above
- Gradle
- Git

### Steps

1. **Clone the Repository**

   ```bash
   git clone https://github.com/RahulVd/order_management.git
   cd order_management

Run the Application

bash
Copy
Edit
./gradlew bootRun
Access the API

Swagger (if added): http://localhost:8080/swagger-ui.html

APIs start at: http://localhost:8080/api/...

📬 API Endpoints (Examples)
Method	Endpoint	Description
GET	/api/customers	Get all customers
POST	/api/customers	Create a new customer
PUT	/api/customers/{id}	Update customer by ID
DELETE	/api/customers/{id}	Delete customer by ID

📌 To Do
Add Swagger for API documentation

Add integration tests

Implement authentication (optional)

Add pagination and sorting

📄 License
This project is open-source and available under the MIT License.

Built with ❤️ using Spring Boot & Java









