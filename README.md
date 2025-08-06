# Java EE Form Processing with Servlets and EJB

## 📌 Project Goals

This project demonstrates the integration between Java Web technologies and Enterprise Java Beans (EJB) using a simple form-processing example.

### 🎯 Learning Objectives

- Process form data sent via an HTML form to a Java Servlet.
- Understand how to integrate the EJB architecture with Java Web applications.
- Distinguish between a standard Java Bean and an Enterprise Java Bean (EJB).
- Understand the difference between **stateful** and **stateless** EJBs.
- Learn how to create and use **regular expressions** for input validation.
- Apply **EJB validation constraints** to ensure data integrity and correctness.

### 🛠️ Technologies Used

- Java EE (Jakarta EE)
- Servlets
- Enterprise Java Beans (EJB)
- JNDI
- Bean Validation (Jakarta Validation)
- GlassFish Server 11 (Jakarta EE-compatible)
- Maven

### 📂 Project Structure

- `web/`: HTML form and web resources
- `com.mycompany.formservlet/`: Handles HTTP requests and uses JNDI to access EJB
- `com.mycompany.ejb/`: Stateless EJB with validation and business logic

### ▶️ How to Run

1. Deploy the application to a Jakarta EE-compatible server (e.g., GlassFish). http://localhost:4848/
2. Access the form at: `http://localhost:8080/formServlet-1.0-SNAPSHOT/*.html`
3. Submit the form to see data processed, validated, and printed.

---

This project is intended for educational purposes and demonstrates key concepts in enterprise Java development.
