# ☕ Week 3 – OOP Deep Dive + Collections

This week we move beyond Java basics into **core Object-Oriented Programming (OOP)** principles and the **Java Collections Framework**.
By mastering these concepts, you’ll be ready to build real-world applications using clean, reusable, and organized code.

---

## 🔒 Encapsulation

* Protects the internal state of objects by hiding fields (`private`).
* Provides controlled access using getters and setters.
* Prevents invalid data through validation.

---

## 🏎 Inheritance

* Allows classes to **reuse code** from other classes.
* Defines an **IS-A relationship** (Car IS-A Vehicle).
* Uses `extends` keyword.

---

## 🐾 Polymorphism

* **Method Overloading**: Same name, different parameters.
* **Method Overriding**: Subclass changes parent behavior.
* Enables treating objects of different types in a uniform way.

---

## 📖 Constructors & Static

* **Constructors** initialize objects.
* Types:

    * Default constructor
    * Parameterized constructor
    * Constructor chaining (`this(...)`)
* **Static fields/methods** belong to the class, not an instance.

---

## 🚗 Composition

* Defines a **HAS-A relationship**.
* A class contains objects of other classes.
* More flexible than inheritance.

---

## 📚 Collections

Java provides built-in **data structures** for managing groups of objects.

* **List / ArrayList** → ordered, allows duplicates
* **Set / HashSet** → unique elements only
* **Map / HashMap** → key-value pairs

---

## 📖 Mini Project 

Pulls everything together:

* **Encapsulation** → protect book details & member info
* **Inheritance** → `StudentMember` and `TeacherMember` extend `Member`
* **Polymorphism** → treat all members as `Member`
* **Composition** → `Library HAS-A List<Book>`
* **Collections** → manage books & members

---

## 🎯 Learning Outcomes

By the end of Week 3 you will:

* ✅ Apply OOP principles in practical scenarios
* ✅ Differentiate between **IS-A** and **HAS-A** relationships
* ✅ Write constructors and static methods correctly
* ✅ Use Java Collections (`List`, `Set`, `Map`) effectively
* ✅ Model immutable data using collection factories
* ✅ Apply sealed classes and pattern matching in OOP hierarchies
* ✅ Build a real-world **Library Management System**

---
