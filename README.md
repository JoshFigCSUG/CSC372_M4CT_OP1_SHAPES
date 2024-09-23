# Shapes Project

This project provides a basic framework for representing and calculating properties of various geometric shapes using Java. It demonstrates the use of abstract classes, inheritance, and polymorphism in object-oriented programming.

## Structure

* `Shape.java`: Defines the abstract class `Shape` with abstract methods for calculating surface area and volume.
* `Sphere.java`: Represents a sphere, inheriting from `Shape` and providing concrete implementations for surface area and volume calculations.
* `Cylinder.java`: Represents a cylinder, also inheriting from `Shape` and implementing its own surface area and volume calculations.
* `Cone.java`: Represents a cone, extending `Shape` and providing specific implementations for surface area and volume.
* `ShapeArray.java`: A driver class to demonstrate the creation and usage of shape objects, storing them in an array and printing their properties.

## How to Use

1. **Compile:** Compile all the Java source files using a Java compiler (e.g., `javac`). Make sure they are organized in a package structure reflecting the `package shapes;` declaration at the top of each file.

2. **Run:** Execute the `ShapeArray` class to see the output, which will display the surface area and volume of each created shape object.

## Key Concepts

* **Abstract Classes:** The `Shape` class acts as a blueprint for other shape classes, defining a common interface but leaving the specific implementations to its subclasses.
* **Inheritance:** The `Sphere`, `Cylinder`, and `Cone` classes inherit from `Shape`, inheriting its structure and behavior while providing their own specialized implementations.
* **Polymorphism:** The `ShapeArray` class demonstrates polymorphism by treating different shape objects through a common `Shape` reference, allowing for flexibility and extensibility.

## Potential Enhancements

* Add more shape classes (e.g., cube, pyramid, etc.).
* Implement additional methods in the `Shape` class or its subclasses (e.g., to calculate perimeter, circumference, etc.).
* Create a graphical user interface to visualize the shapes and their properties.
* Introduce error handling and input validation to make the code more robust.


