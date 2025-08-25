# Vacation Booking Backend (Spring Boot + MySQL)

This project was completed as part of my **Back-End Programming course**. The goal was to **modernize a legacy vacation booking system** by developing a new backend with **Spring Boot** and integrating it with an existing **Angular frontend** and **MySQL database**. The project replicates real-world development tasks such as entity modeling, REST API creation, validation, and database integration.

---

## 📌 Project Overview
A travel agency’s front-end engineers encountered issues working with an outdated backend originally built in the 1990s. I was tasked with creating a **minimally viable product (MVP)** backend to replace mission-critical functionality using the **Spring Framework**.

The solution features a fully functional backend that supports:
- Customer and order management  
- Vacation package and excursion tracking  
- Checkout workflow with cart and cart items  
- RESTful endpoints for Angular integration  

---

## 🛠️ Tech Stack
- **Java 17**
- **Spring Boot** (Spring Data JPA, Spring Data REST)
- **MySQL**
- **Hibernate**
- **Lombok** (removed in later iterations, replaced with manual getters/setters for reliability)
- **IntelliJ IDEA Ultimate**

---

## 📂 Project Structure
The application is organized into well-structured packages following industry standards:

- **controllers** – REST API endpoints (`CheckoutController`)  
- **entities** – Entity classes mapped to MySQL tables (`Customer`, `Cart`, `CartItem`, `Vacation`, `Excursion`) plus an enum (`StatusType`)  
- **dao** – Repository interfaces extending `JpaRepository` with cross-origin support  
- **services** – Checkout business logic, purchase data/response objects, and order placement implementation  
- **config** – Application configuration (`RestDataConfig`, `application.properties`)  

---

## 🔑 Features Implemented
-  Initialized a Spring Boot project with required dependencies (JPA, REST, MySQL, Lombok)  
-  Created entities and enum from a provided UML diagram  
-  Built JPA repositories with cross-origin support for frontend integration  
-  Implemented checkout service with order placement, purchase data objects, and tracking number generation  
-  Added input validation to support Angular front-end requirements  
-  Developed a REST controller with POST mapping for checkout/order placement  
-  Seeded the database with **five sample customers** programmatically  
-  Successfully tested integration by placing an order for a vacation with excursions, verifying results in MySQL Workbench  

---

## ✅ Outcome
- Orders placed through the **Angular front end** were successfully persisted to the **MySQL database**.  
- Checkout workflow correctly generated tracking numbers and updated the order/cart tables.  
- Application runs without network or integration errors between frontend, backend, and database.  

---

## 📸 Demonstration
- Added customer order through Angular frontend with no network errors  
- Verified successful persistence of customer, vacation, excursion, and cart data in MySQL Workbench  

---

## 🚀 Skills Demonstrated
- Back-end development with **Spring Boot**  
- REST API design and integration with a front end  
- Object-relational mapping (ORM) using **Hibernate & JPA**  
- Input validation and error handling  
- GitLab version control with incremental commits for each task  
- Database seeding and data validation with MySQL  

---
