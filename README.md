# 🚘 Vehicle Inheritance System – Java OOP Project  

![Java](https://img.shields.io/badge/🖥_Language-Java_17-orange?logo=openjdk)
![IDE](https://img.shields.io/badge/💻_IDE-Eclipse-blue?logo=eclipse)
![Application](https://img.shields.io/badge/🚗_Application-Console-green)
![Concepts](https://img.shields.io/badge/📘_Concepts-Inheritance%2C_Polymorphism%2C_OOP-red)
![Status](https://img.shields.io/badge/✅_Status-Completed-brightgreen)
![Commit](https://img.shields.io/badge/🕒_Commit-First_Commit-yellow)

---

## 🌟 Project Highlights  

- ✅ Implemented using **Core Java (JDK 17)**  
- ✅ Strong focus on **Inheritance and Polymorphism**  
- ✅ Clear demonstration of **IS-A relationship**  
- ✅ Real-world inspired **transport and vehicle hierarchy**  
- ✅ Simple **console-based Java application**  
- ✅ Ideal for **college practicals, OOP exams, and viva preparation**

---

## 📌 Project Overview  

The **Vehicle Inheritance System** is a **Core Java console application** designed to demonstrate how **inheritance works in Object-Oriented Programming** using a real-world vehicle hierarchy.  

In real life, vehicles share common properties such as speed, fuel type, and transport behavior, while specific vehicle types like **Bus** and **Truck** have their own specialized characteristics. This project models the same concept using Java classes and inheritance.  

The project structure follows **industry-style class separation**, making it easy to understand how base classes and derived classes interact in professional Java applications.

---

## 🎯 Real-Life Context  

Inheritance is widely used in real-world software systems such as:  

- Transport management systems  
- Logistics and fleet management software  
- Automobile simulation software  
- Traffic control and vehicle monitoring systems  

**Real-life example:**  
In logistics companies like **Amazon, DHL, and Blue Dart**, software systems classify vehicles into categories such as trucks, buses, and delivery vans, all inheriting common vehicle properties.

---

## 📂 Project Structure  

```text
Vehicle-Inheritance-System
│
├── src
│   └── Vehicle
│       ├── Transport.java
│       ├── Vehicle.java
│       ├── Bus.java
│       └── Truck.java
│
├── bin
│   └── Vehicle
│       ├── Transport.class
│       ├── Vehicle.class
│       ├── Bus.class
│       └── Truck.class
│
├── .classpath
├── .project
└── .settings
```

🧠 OOP Concepts Demonstrated
---

| Concept            | Usage in Project                | Real-Life Mapping        |
| ------------------ | ------------------------------- | ------------------------ |
| 🧬 Inheritance     | Bus & Truck extend Vehicle      | Vehicle categories       |
| 🔁 Polymorphism    | Overridden methods              | Dynamic vehicle behavior |
| 🛡️ Encapsulation  | Data hidden inside classes      | Secure system design     |
| 🧱 Class Hierarchy | Transport → Vehicle → Bus/Truck | Industry architecture    |


📝 Class Responsibilities
---

🔹 Transport.java (Base Class)  
Represents general transport-level behavior  
Acts as the top-level parent class  

Industry Mapping:    
Represents abstract transport logic in large systems.  

🔹 Vehicle.java (Intermediate Class)  
Inherits from Transport  
Stores common vehicle properties  
Serves as a base for all vehicle types  

Industry Mapping:  
Similar to vehicle master records in transport software.  

🔹 Bus.java (Child Class)  
Inherits from Vehicle  
Represents passenger transport vehicles  
Implements or overrides specific behaviors  

Industry Mapping:  
Used in public and private transportation systems.  

🔹 Truck.java (Child Class)  
Inherits from Vehicle  
Represents goods transport vehicles  
Demonstrates specialization through inheritance  

Industry Mapping:  
Used in logistics and supply chain systems.  

🖥️ Sample Output (Console)
---
```
------ Vehicle Inheritance System ------
Vehicle Type : Bus
Transport    : Passenger
Status       : Operational
--------------------------------------
```
(Output may vary based on implementation logic)  

▶️ How to Run the Project
---

Clone or download the repository  
Open Eclipse IDE  
Import as Existing Java Project  

Navigate to:  
```
src → Vehicle → Vehicle.java
```
Right-click → Run As → Java Application  

---

🚀 Future Enhancements  
---
📌 Add more vehicle types (Car, Bike, Train)    
📌 Implement interfaces for transport rules  
📌 Add abstract methods in base classes  
📌 Accept user input using Scanner  
📌 Create GUI using JavaFX or Swing  
📌 Integrate with database for vehicle records  


🎓 Learning Outcomes  
---
Strong understanding of Java inheritance hierarchy  
Practical exposure to polymorphism and method overriding  
Ability to model real-world systems using OOP  
Experience with clean Java project structure  
Confidence to design scalable Java applications  
