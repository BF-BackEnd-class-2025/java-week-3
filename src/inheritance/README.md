# 🏎 Inheritance in Java

**Inheritance** is one of the pillars of OOP.  
It allows a class (**child/subclass**) to reuse and extend the properties and methods of another class (**parent/superclass**).

👉 Example: A **Car** is a type of **Vehicle**.

---

## ✨ Why Inheritance?
- ✅ Reuse code (avoid duplication)
- ✅ Represent **IS-A** relationships
- ✅ Override methods (polymorphism)
- ✅ Easier code extension

---

## ✅ Example – Vehicle, Car, Bike

```java
package week3.inheritance;

// Superclass
public class Vehicle 
{
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void drive() {
        System.out.println(brand + " is driving...");
    }
}

// Subclass
public class Car extends Vehicle
{
    private int doors;

    public Car(String brand, int doors) {
        super(brand); // Call Vehicle constructor
        this.doors = doors;
    }

    @Override
    public void drive() {
        System.out.println(brand + " car with " + doors + " doors is driving...");
    }
}
```

### 🔎 Explanation:
- `Vehicle` is the **superclass** with a `drive()` method.
- `Car` **extends** `Vehicle`, inheriting its properties and methods.
- `Car` **overrides** the `drive()` method to provide specific behavior.
- You can create more subclasses like `Bike` that also extend `Vehicle`.

---

## 🎯 Learning Outcomes

By the end of this section, you will be able to:

- Use `extends` to create subclasses
- Share properties and behavior across related classes
- Override methods to customize behavior
- Understand **IS-A** relationships
- Combine inheritance with **polymorphism** using lists of parent types

---


* **Modern Java (9-17)**

    * Records for immutable data carriers (Java 16)
    * Sealed classes with `sealed` / `permits` / `non-sealed` (Java 17)
    * Pattern matching with `instanceof` (Java 16+)
    * Immutable collections with `List.of` and `Map.of` (Java 9)

