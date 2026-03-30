# Spring Core

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)

A hands-on Java project exploring the core concepts of the Spring Framework, built as a structured learning repository. Covers IoC, Dependency Injection (constructor & setter), Component Scanning, and Loose vs Tight Coupling — all demonstrated through practical examples.

---

## 📋 Table of Contents

- [About](#about)
- [Project Structure](#project-structure)
- [Technologies Used](#technologies-used)
- [Key Concepts](#key-concepts)
- [Concepts Covered](#concepts-covered)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Running the Application](#running-the-application)
- [Package Descriptions](#package-descriptions)
- [Learning Objectives](#learning-objectives)
- [Contributing](#contributing)
- [Author](#author)
- [License](#license)
- [Additional Resources](#additional-resources)

---

## 🎯 About

This project is designed to help developers understand fundamental Spring Framework concepts through practical examples. It demonstrates:

- The difference between **Tight Coupling** and **Loose Coupling**
- How Spring's **Dependency Injection** promotes loose coupling
- Configuration using **XML-based** and **Annotation-based** ApplicationContext
- Real-world examples comparing coupled vs decoupled architectures
- Spring Component Scanning using `@Component`, `@Autowired`, and Java-based `AppConfig`

---

## 📁 Project Structure

```
spring_core/
├── .idea/                                        # IntelliJ IDEA configuration files
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       ├── ayish.spring_core/
│   │   │       │   └── App.java                 # Root entry point
│   │   │       │
│   │   │       ├── example/
│   │   │       │   └── car.example/
│   │   │       │       ├── car.example.setter.injection/
│   │   │       │       │   ├── App.java
│   │   │       │       │   ├── Car.java
│   │   │       │       │   └── Specification.java
│   │   │       │       └── constructor.injection/
│   │   │       │           ├── App.java
│   │   │       │           ├── Car.java
│   │   │       │           └── Specification.java
│   │   │       │
│   │   │       ├── componentScan/
│   │   │       │   ├── annotation/
│   │   │       │   │   ├── App.java
│   │   │       │   │   ├── AppConfig.java
│   │   │       │   │   └── Employee.java
│   │   │       │   └── autowired.annotation/
│   │   │       │       ├── App.java
│   │   │       │       ├── AppConfig.java
│   │   │       │       ├── Employee.java
│   │   │       │       └── Manager.java
│   │   │       │
│   │   │       ├── GreetingService/
│   │   │       │   ├── AppMain.java
│   │   │       │   └── GreetingService.java
│   │   │       │
│   │   │       ├── ioc/
│   │   │       │
│   │   │       ├── LooseCoupling/
│   │   │       │   ├── AppMain.java
│   │   │       │   ├── EmailNotificationService.java
│   │   │       │   ├── NotificationService.java  # Interface
│   │   │       │   ├── SMSNotificationService.java
│   │   │       │   └── UserService.java
│   │   │       │
│   │   │       ├── TightCoupling/
│   │   │       │   ├── AppMain.java
│   │   │       │   ├── NotificationService.java
│   │   │       │   └── UserService.java
│   │   │       │
│   │   │       └── springAnnotations.com.example.componentScan/
│   │   │           ├── App.java
│   │   │           └── Employee.java
│   │   │
│   │   └── resources/
│   │       ├── archetype-resources/
│   │       ├── META-INF/
│   │       │   └── maven/
│   │       ├── applicationBeanContext.xml
│   │       ├── applicationConstructorInjection.xml
│   │       ├── applicationSetterInjection.xml
│   │       └── componentScanDemo.xml
│   │
│   └── test/                                     # Test files
├── .gitignore
├── pom.xml                                       # Maven configuration
└── README.md
```

---

## 🛠️ Technologies Used

| Technology | Version | Purpose |
|------------|---------|---------|
| **Java** | 8+ | Core programming language |
| **Spring Framework** | 5.x/6.x | Dependency Injection & IoC Container |
| **Maven** | 3.6+ | Build automation and dependency management |
| **IntelliJ IDEA** | — | IDE for development |

> **Build Tool:** This project uses **Apache Maven**. All dependencies are declared in `pom.xml`, including `spring-context` which transitively pulls in Spring Core, Beans, AOP, and Expression modules.

---

## 💡 Key Concepts

### Tight Coupling
In tight coupling, classes are directly dependent on concrete implementations. Changes in one class require changes in dependent classes.

```java
// Classes directly instantiate their dependencies
public class UserService {
    private NotificationService service = new NotificationService();
    // If NotificationService changes, UserService must change too
}
```

### Loose Coupling
In loose coupling, classes depend on abstractions (interfaces) rather than concrete implementations, making the code more flexible and maintainable.

```java
// Classes depend on interfaces
public class UserService {
    private NotificationService service;

    // Dependency is injected, not created
    public UserService(NotificationService service) {
        this.service = service;
    }
}
```

### Spring IoC Container
Spring's Inversion of Control (IoC) container manages object creation and dependency injection through the `ApplicationContext`, configured via XML or annotations.

---

## 📚 Concepts Covered

### 1. Tight Coupling vs Loose Coupling
Demonstrates the problem with tightly coupled classes and how Spring's IoC resolves it via interfaces and dependency injection.

### 2. IoC (Inversion of Control)
Shows how the Spring container manages object creation and lifecycle instead of the application code.

### 3. Dependency Injection — Setter Injection
Beans wired via setter methods, configured through `applicationSetterInjection.xml`.

### 4. Dependency Injection — Constructor Injection
Beans wired via constructors, configured through `applicationConstructorInjection.xml`.

### 5. Component Scanning
Auto-detects Spring beans using `@Component`, `@Service`, etc., configured via `componentScanDemo.xml` and Java-based `AppConfig`.

### 6. `@Autowired` Annotation
Demonstrates field, setter, and constructor-level autowiring with `@Autowired` for dependency resolution.

### 7. Greeting Service
A simple service bean demonstrating Spring bean lifecycle and IoC container usage.

---

## ✅ Prerequisites

Before running this project, ensure you have:

- **JDK 8 or higher** installed
- **Maven 3.6+** installed
- **IntelliJ IDEA** (recommended) or any Java IDE
- **Git** (for cloning the repository)

---

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

---

## 🚀 Running the Application

### Using IntelliJ IDEA

1. Open the project in IntelliJ IDEA
2. Navigate to the desired module (e.g. `LooseCoupling`, `componentScan`, etc.)
3. Right-click on the `App.java` or `AppMain.java` inside that package
4. Select **Run 'App.main()'**

### Using Maven

```bash
mvn exec:java -Dexec.mainClass="com.ayish.spring_core.App"
```

### Using Command Line

```bash
# Compile
javac -cp target/classes src/main/java/com/ayish/spring_core/*.java

# Run
java -cp target/classes com.ayish.spring_core.App
```

---

## 📦 Package Descriptions

### `com.ayish.spring_core`
Root package containing the main `App.java` entry point for the project.

### `example.car.example.setter.injection`
Demonstrates setter-based dependency injection using a `Car` and `Specification` bean, wired via `applicationSetterInjection.xml`.

### `example.car.example.constructor.injection`
Demonstrates constructor-based dependency injection using the same `Car`/`Specification` model, wired via `applicationConstructorInjection.xml`.

### `componentScan.annotation`
Shows Spring's component scanning using `@Component` and a Java-based `AppConfig` class, with an `Employee` bean.

### `componentScan.autowired.annotation`
Extends component scanning with `@Autowired` to inject a `Manager` bean into `Employee`, demonstrating annotation-driven wiring.

### `GreetingService`
A simple service bean example demonstrating Spring bean lifecycle and IoC container usage.

### `ioc`
Dedicated package for Inversion of Control demonstrations.

### `LooseCoupling`
Demonstrates loose coupling principles where:
- `NotificationService` is an interface
- `EmailNotificationService` and `SMSNotificationService` are interchangeable implementations
- `UserService` depends on the interface, not a concrete class
- Spring injects the correct implementation at runtime

### `TightCoupling`
Shows tight coupling anti-patterns where:
- `UserService` directly instantiates `NotificationService`
- Hard-coded dependencies make testing and swapping implementations difficult

### `springAnnotations.com.example.componentScan`
Demonstrates annotation-driven component scanning in a separate package to show cross-package bean detection.

### `resources/`
Contains all Spring XML configuration files:
- `applicationBeanContext.xml` — General bean definitions
- `applicationConstructorInjection.xml` — Constructor injection config
- `applicationSetterInjection.xml` — Setter injection config
- `componentScanDemo.xml` — Component scan configuration

---

## 📝 Learning Objectives

After exploring this project, you will understand:

1. ✅ The problems with tight coupling
2. ✅ Benefits of loose coupling and dependency injection
3. ✅ How to configure Spring beans using XML
4. ✅ How to use `@Component`, `@Autowired`, and Java-based config
5. ✅ How Spring's IoC container manages dependencies
6. ✅ Setter vs Constructor injection trade-offs
7. ✅ Best practices for designing maintainable Java applications

---

## 🤝 Contributing

Contributions are welcome! To contribute:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

---

## 👨‍💻 Author

**Ayish Shaikh**

- GitHub: [@Ayish-Shaikh](https://github.com/Ayish-Shaikh)
- Repository: [spring_core](https://github.com/Ayish-Shaikh/spring_core)

---



## 📚 Additional Resources

### 🌱 Spring Framework
- [Spring Framework Documentation](https://spring.io/projects/spring-framework)
- [Spring Core Concepts — IoC & DI Reference](https://docs.spring.io/spring-framework/docs/current/reference/html/core.html)
- [Spring Framework Artifacts & Module List](https://github.com/spring-projects/spring-framework/wiki/Spring-Framework-Artifacts)
- [Dependency Injection Explained — Martin Fowler](https://www.martinfowler.com/articles/injection.html)

### 📦 Maven Repository
- [Maven Central — spring-context](https://mvnrepository.com/artifact/org.springframework/spring-context) — browse all versions of `spring-context`
- [Maven Central — spring-core](https://mvnrepository.com/artifact/org.springframework/spring-core) — the foundational IoC/DI module
- [Maven Central — org.springframework (all artifacts)](https://mvnrepository.com/artifact/org.springframework) — full list of Spring modules
- [Sonatype Central — spring-context](https://central.sonatype.com/artifact/org.springframework/spring-context) — alternative search with dependency snippets
- [Maven Documentation](https://maven.apache.org/guides/) — official Maven build tool guide

### 🗂️ XML Configuration
- [Spring XML Schema-based Configuration Reference](https://docs.spring.io/spring-framework/docs/3.0.x/reference/xsd-config.html) — full guide to `<beans>`, `<context>`, `<aop>`, and other XML namespaces
- [Spring Bean XML & Annotation Config Guide](https://howtodoinjava.com/spring/spring-bean-xml-and-annotation-config/) — practical examples of XML vs annotation-based bean wiring
- [Spring ApplicationContext Container](https://www.tutorialspoint.com/spring/spring_applicationcontext_container.htm) — `ClassPathXmlApplicationContext` and `FileSystemXmlApplicationContext` usage
- [Spring ApplicationContext Deep Dive — Baeldung](https://www.baeldung.com/spring-application-context) — comprehensive guide covering XML, annotation, and Java config styles
- [XML-based Injection in Spring — GeeksforGeeks](https://www.geeksforgeeks.org/advance-java/xml-based-injection-in-spring/) — hands-on XML injection tutorial with `applicationContext.xml`


---

## 🙏 Acknowledgments

- Spring Framework Community
- Java Community

---

**⭐ If you find this project helpful, please consider giving it a star!**