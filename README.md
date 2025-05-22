# 🍽️ Food Ordering System

A sophisticated desktop application built with Java and JavaFX that provides a seamless food ordering experience. This system implements a robust Object-Oriented architecture with a focus on user experience and system reliability.

## ✨ Features
- User authentication and profile management
- Interactive menu with real-time updates
- Shopping cart functionality
- Order processing and tracking
- Secure payment integration
- Admin dashboard for menu management
- Order history and status tracking

## 🛠️ Technical Stack
- **Language:** Java 23
- **UI Framework:** JavaFX 17.0.6
- **Build Tool:** Maven
- **Testing:** JUnit 5
- **Architecture Pattern:** MVC (Model-View-Controller)

## 🏗️ System Architecture

### Core Components

#### 1. Model Layer
```java
// Item.java - Represents menu items
public class Item {
    private String name;
    private int quantity;
    private double price;
    private String description;
    private String path;
    // Getters, setters, and business logic
}

// User.java - Manages user data
public class User {
    private String Fname;
    private String Lname;
    private String email;
    private String password;
    // Authentication and profile management
}
```

#### 2. Controller Layer
- `SystemController`: Manages business logic and data flow
- `OrderController`: Handles order processing
- `UserController`: Manages user authentication
- `MenuController`: Controls menu display and updates

#### 3. View Layer
- JavaFX FXML-based UI components
- Responsive design elements
- Custom styled controls


4. **Run the Application**
   ```bash
   mvn javafx:run
   ```

## 📁 Project Structurefood-ordering-system/
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ └── com/example/gui/
│ │ │ ├── controllers/
│ │ │ ├── models/
│ │ │ └── views/
│ │ └── resources/
│ │ ├── fxml/
│ │ ├── css/
│ │ └── images/
│ └── test/
│ └── java/
└── pom.xml

