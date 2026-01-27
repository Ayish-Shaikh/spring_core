# Spring Core

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)

A demonstration project showcasing core Spring Framework concepts, focusing on **Dependency Injection**, **Loose Coupling**, and **Tight Coupling** patterns in Java applications.

## 📋 Table of Contents

- [About](#about)
- [Project Structure](#project-structure)
- [Technologies Used](#technologies-used)
- [Key Concepts](#key-concepts)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Running the Application](#running-the-application)
- [Package Descriptions](#package-descriptions)
- [Author](#author)
- [License](#license)

## 🎯 About

This project is designed to help developers understand fundamental Spring Framework concepts through practical examples. It demonstrates:

- The difference between **Tight Coupling** and **Loose Coupling**
- How Spring's **Dependency Injection** promotes loose coupling
- Configuration using **XML-based** ApplicationContext
- Real-world examples comparing coupled vs decoupled architectures

## 📁 Project Structure

```
spring_core/
├── .idea/                          # IntelliJ IDEA configuration files
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       ├── ayish.spring_core/      # Core Spring examples
│   │   │       ├── example.demo/           # Demo examples
│   │   │       ├── LooseCoupling/          # Loose coupling examples
│   │   │       └── TightCoupling/          # Tight coupling examples
│   │   └── resources/
│   │       ├── archetype-resources/
│   │       ├── META-INF/
│   │       │   └── maven/
│   │       └── ApplicationBeanContext.xml  # Spring Bean Configuration
│   └── test/                       # Test files
├── target/                         # Compiled output
├── .gitignore
├── pom.xml                         # Maven configuration
└── README.md
```

## 🛠️ Technologies Used

| Technology | Version | Purpose |
|------------|---------|---------|
| **Java** | 8+ | Core programming language |
| **Spring Framework** | 5.x/6.x | Dependency Injection & IoC Container |
| **Maven** | 3.6+ | Build automation and dependency management |
| **IntelliJ IDEA** | - | IDE for development |

## 💡 Key Concepts

### Tight Coupling
In tight coupling, classes are directly dependent on concrete implementations. Changes in one class require changes in dependent classes.

**Example:**
```java
// Classes directly instantiate their dependencies
public class UserService {
    private UserRepository repository = new UserRepository();
    // If UserRepository changes, UserService must change
}
```

### Loose Coupling
In loose coupling, classes depend on abstractions (interfaces) rather than concrete implementations. This makes the code more flexible and maintainable.

**Example:**
```java
// Classes depend on interfaces
public class UserService {
    private IUserRepository repository;
    
    // Dependency is injected, not created
    public UserService(IUserRepository repository) {
        this.repository = repository;
    }
}
```

### Spring IoC Container
Spring's Inversion of Control (IoC) container manages object creation and dependency injection through the `ApplicationContext`, configured via XML or annotations.

## ✅ Prerequisites

Before running this project, ensure you have:

- **JDK 8 or higher** installed
- **Maven 3.6+** installed
- **IntelliJ IDEA** (recommended) or any Java IDE
- **Git** (for cloning the repository)

## 📥 Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/Ayish-Shaikh/spring_core.git
   ```

2. **Navigate to the project directory**
   ```bash
   cd spring_core
   ```

3. **Import as Maven project**
   - Open IntelliJ IDEA
   - Select **File → Open**
   - Choose the `pom.xml` file
   - Import as a Maven project

4. **Build the project**
   ```bash
   mvn clean install
   ```

## 🚀 Running the Application

### Using IntelliJ IDEA

1. Open the project in IntelliJ IDEA
2. Navigate to the main class (typically in `com.ayish.spring_core` package)
3. Right-click on the main class
4. Select **Run 'MainClass.main()'**

### Using Maven

```bash
mvn exec:java -Dexec.mainClass="com.ayish.spring_core.MainClass"
```

### Using Command Line

```bash
# Compile
javac -cp target/classes src/main/java/com/ayish/spring_core/*.java

# Run
java -cp target/classes com.ayish.spring_core.MainClass
```

## 📦 Package Descriptions

### `com.ayish.spring_core`
Contains core Spring configuration and main application classes demonstrating Spring IoC container usage.

### `com.example.demo`
Includes demo examples and utility classes for understanding Spring concepts.

### `LooseCoupling`
Demonstrates **loose coupling** principles where:
- Dependencies are injected via constructors or setters
- Classes depend on interfaces, not concrete implementations
- Spring manages object lifecycle and dependencies

### `TightCoupling`
Shows **tight coupling** anti-patterns where:
- Objects create their own dependencies
- Hard-coded dependencies make testing difficult
- Changes ripple through the codebase

### `resources/ApplicationBeanContext.xml`
XML configuration file that defines Spring beans and their dependencies. This file:
- Declares beans managed by Spring IoC container
- Configures dependency injection
- Sets up application context

## 📝 Learning Objectives

After exploring this project, you will understand:

1. ✅ The problems with tight coupling
2. ✅ Benefits of loose coupling and dependency injection
3. ✅ How to configure Spring beans using XML
4. ✅ How Spring's IoC container manages dependencies
5. ✅ Best practices for designing maintainable Java applications

## 🤝 Contributing

Contributions are welcome! To contribute:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 👨‍💻 Author

**Ayish Shaikh**

- GitHub: [@Ayish-Shaikh](https://github.com/Ayish-Shaikh)
- Repository: [spring_core](https://github.com/Ayish-Shaikh/spring_core)

## 📄 License

This project is open source and available under the [MIT License](LICENSE).

---

## 📚 Additional Resources

- [Spring Framework Documentation](https://spring.io/projects/spring-framework)
- [Spring Core Concepts](https://docs.spring.io/spring-framework/docs/current/reference/html/core.html)
- [Dependency Injection Explained](https://www.martinfowler.com/articles/injection.html)
- [Maven Documentation](https://maven.apache.org/guides/)

## 🙏 Acknowledgments

- Spring Framework Community
- Java Community

---

**⭐ If you find this project helpful, please consider giving it a star!**
