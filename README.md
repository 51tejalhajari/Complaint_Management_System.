# Complaint Management System

A simple **Complaint Management System** built using **Spring Boot, Java, Thymeleaf, and H2 Database**.  
This project allows users to submit complaints and enables viewing and resolving complaints through a web interface.

---

# Features

- Add new complaints
- View list of complaints
- Update complaint status (Resolve)
- In-memory H2 database integration
- Simple MVC architecture using Spring Boot

---

# Tech Stack

- **Backend:** Java, Spring Boot
- **Frontend:** HTML, Thymeleaf
- **Database:** H2 (In-memory)
- **ORM:** Spring Data JPA
- **Build Tool:** Maven
- **Server:** Embedded Tomcat

---

## 📂 Project Structure
src/main/java/com/cms/complaint
│
├── controller
│ └── ComplaintController.java
│
├── service
│ └── ComplaintService.java
│
├── repository
│ └── ComplaintRepository.java
│
├── model
│ └── Complaint.java
│
└── ComplaintManagementApplication.java
src/main/resources
│
├── templates
│ ├── add-complaint.html
│ └── complaints.html
│
└── application.properties
