# Abstract Animals - Java OOP

This project demonstrates the use of Object-Oriented Programming (OOP) concepts in Java, focusing on abstraction, inheritance, and interfaces through the modeling of different animal species and their behaviors.

## 📁 Project Structure

```
abstract-animals/
├── src/
│   └── org/
│       └── lessons/
│           └── java/
│               ├── animals/
│               │   ├── AbstractAnimale.java
│               │   ├── Aquila.java
│               │   ├── Cane.java
│               │   ├── Delfino.java
│               │   ├── MainAnimals.java
│               │   └── Passerotto.java
│               └── animals/
│                   └── inteface/
│                       ├── Flyable.java
│                       └── Swimmable.java
├── README.md
```

## Class Overview

### `AbstractAnimale.java`
- Abstract base class representing a generic animal, with common properties (`species`, `age`) and abstract methods (`sound()`, `eat()`).

### `Cane.java`
- Represents a dog, extends `AbstractAnimale`. Implements specific behaviors for dogs.

### `Passerotto.java`
- Represents a sparrow, extends `AbstractAnimale` and implements the `Flyable` interface.

### `Aquila.java`
- Represents an eagle, extends `AbstractAnimale` and implements the `Flyable` interface.

### `Delfino.java`
- Represents a dolphin, extends `AbstractAnimale` and implements the `Swimmable` interface.

### `inteface/Flyable.java`
- Interface for animals that can fly, declares the `fly()` method.

### `inteface/Swimmable.java`
- Interface for animals that can swim, declares the `swim()` method.

### `MainAnimals.java`
- Main class to test and demonstrate the functionalities of the animal classes and interfaces.

## How It Works

- Each animal class extends the abstract class `AbstractAnimale` and provides implementations for the abstract methods `sound()` and `eat()`.
- Animals with special abilities (flying or swimming) implement the corresponding interface (`Flyable` or `Swimmable`).
- The `MainAnimals` class creates instances of each animal, invokes their behaviors, and demonstrates polymorphism by calling interface methods.

## Example Usage

```java
Cane goldenRetriever = new Cane("Golden Retriever", 5, "Ellie", "gold");
goldenRetriever.sound(); // Output: Wof-wof
goldenRetriever.eat();   // Output: The dog eat dog kibble

Passerotto passeroDomestico = new Passerotto("Passero domestico", 2, "chirrup", 6.5d, 1.1d);
passeroDomestico.sound(); // Output: Chip-chip
passeroDomestico.eat();   // Output: The bird eat seeds

Aquila aquilaReale = new Aquila("Aquila Reale", 13, 2500d, 190d, 6d);
aquilaReale.fly(); // Output: I'm flying

Delfino delfinoComune = new Delfino("Delfino Comune", 15, 25, 35d);
delfinoComune.swim(); // Output: I'm swimming
```

## Key OOP Concepts Demonstrated

- **Abstraction**: Using abstract classes and methods to define a common interface for all animals.
- **Inheritance**: Specialized animal classes inherit from the abstract base class.
- **Interfaces**: `Flyable` and `Swimmable` define additional capabilities for certain animals.
- **Polymorphism**: Methods like `makeFly()` and `makeSmiw()` in `MainAnimals` accept interface types, allowing any implementing class to be used.

## How to Run

1. Compile all Java files in the `src` directory.
2. Run the `MainAnimals` class to see the output and behavior of each animal.

---

## ⚙️ How to Compile and Run

### Compile

```bash
cd src
javac org/lessons/java/animals/AbstractAnimale.java
javac org/lessons/java/animals/Cane.java
javac org/lessons/java/animals/Passerotto.java
javac org/lessons/java/animals/Aquila.java
javac org/lessons/java/animals/Delfino.java
javac org/lessons/java/animals/inteface/Flyable.java
javac org/lessons/java/animals/inteface/Swimmable.java
javac org/lessons/java/animals/MainAnimals.java
```

### Run

```bash
java org.lessons.java.animals.MainAnimals
```

## 👨‍💻 Author

[@Mattia Zecchinato](https://github.com/MattiaZecchinato)
