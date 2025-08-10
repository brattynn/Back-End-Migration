# Travel Agency Back-End Migration
### Western Governors University – D288 Back-End Programming
**Student:** Brattynn Thompson\
**GitLab Repository:** [https://gitlab.com/wgu-gitlab-environment/student-repos/bth1352/d288-back-end-programming.git]

---

## Project Overview
This project is a Spring Boot-based back-end application developed as part of a college-level Back-End Programming course. It serves as a modernized replacement for a legacy vacation booking system, featuring RESTful APIs, JPA-based data access, input validation, and seamless integration with a prebuilt Angular front end. Built using Spring Data JPA, Lombok, and MySQL, the project emphasizes clean architecture, modular design (controllers, services, DAOs, and entities), and professional Git version control to simulate real-world development workflows.

---

## Task Notes for Parts A–K

Each section below details the changes made to fulfill the project requirements. Each task includes the file name, line number(s), and a description of the implementation.

---

### **A. Spring Initializr**
**Requirement:** Create a new Java project using Spring Initializr, with each of the following dependencies: Spring Data JPA (spring-boot starter-data-jpa), Rest Repositories (spring-boot-starter-data-rest), MySQL Driver (mysql-connector-java), Lombok\
**Note:** Since the application properties will be empty, you will need to copy over the supplied application properties.\

- **File:** `/pom.xml`
- **Lines:** 32 - 57
- **Change:** Created java project and added dependencies.


---

### **B. Git Repository**
**Requirement:** Create your subgroup and project by logging into GitLab using the web link provided and do the following: Connect your new Java project, Commit with a message and push when you complete each of the tasks listed below (parts B to F, etc.)\
**Note:** Any submissions that do not have a commit after each task will not be evaluated.\
**Note:** You may commit and push whenever you want to back up your changes, even if a task is not complete.\

Submit a copy of the git repository URL and a copy of the repository branch history retrieved from your repository, which must include the commit messages and dates.\
**Note:** Wait until you have completed all the following prompts before you create your copy of the repository branch history.\

- **File:** `N/A`
- **Change:** Connected project to GitLab. Committed with message and pushed to the Working_Branch.


---

### **C. Package Construction**
**Requirements:** Construct four new packages, one for each of the following: controllers, entities, dao, and services. The packages will need to be used for a checkout form and vacations packages list.\
**Note:** The packages should be on the same level of the hierarchy.\
**Note:** Construct a package named config and copy the RestDataConfig.java provided in the laboratory environment to the package. Modify it so that the package and imports have the correct package and import addresses. Copy the application.properties file that is provided in the laboratory environment into your application properties resource file.\

- **File:** `/src/main/java/com/d288/d288/config`
- **File:** `/src/main/java/com/d288/d288/controllers`
- **File:** `/src/main/java/com/d288/d288/dao`
- **File:** `/src/main/java/com/d288/d288/entities`
- **File:** `/src/main/java/com/d288/d288/services`
- **File:** `/src/main/resources/application.properties`
- **Change:** Created 4 new packages: controllers, entities, dao, and services. Created additional config package and added the RestDataConfig.java file. Also added information for application.properties file.


---

### **D. Entities Package**
**Requirements:** Write code for the entities package that includes entity classes and the enum designed to match the UML diagram
**Notes:** 

- **File:** `/src/main/java/com/d288/d288/entities/Cart.java`
- **File:** `/src/main/java/com/d288/d288/entities/CartItem.java`
- **File:** `/src/main/java/com/d288/d288/entities/Country.java`
- **File:** `/src/main/java/com/d288/d288/entities/Customer.java`
- **File:** `/src/main/java/com/d288/d288/entities/Division.java`
- **File:** `/src/main/java/com/d288/d288/entities/Excursion.java`
- **File:** `/src/main/java/com/d288/d288/entities/Vacation.java`
- **File:** `/src/main/java/com/d288/d288/enums/StatusType.java`
- **Change:** Implemented all entity and enumeration classes for the backend data model. Added 7 entity classes with appropriate fields, JPA annotations, and relationships (One-to-Many, Many-to-One, and Many-to-Many). Also created a StatusType enumeration with predefined order states. These changes establish the core database mapping layer for the application.\


---
### **E. Repositories Package**
**Requirements:** 
**Notes:**

- **File:** `file location`
- **Line:**
- **Change:**