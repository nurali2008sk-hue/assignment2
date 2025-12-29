A. Project Overview
Purpose and Description
The Vehicle Management System is a Java application that demonstrates 
core Object-Oriented Programming principles through a practical vehicle simulation.
The system models different vehicle types with unique behaviors while maintaining a clean, 
hierarchical structure that showcases inheritance, composition, and abstraction.

OOP Concepts Usage
Inheritance: All vehicle types (Car, Motorcycle, Truck) 
inherit common properties and behaviors from the abstract Vehicle superclass

Abstraction: The Vehicle class defines essential methods 
that must be implemented by all subclasses while hiding implementation details

Composition & Aggregation: Driver objects are associated with Vehicle
objects to model real-world relationships where vehicles have drivers

B. Class Hierarchy
Superclass: Vehicle (Abstract)
The foundation of the hierarchy containing common attributes:

brand (String) - manufacturer name

year (int) - manufacturing year

Abstract Methods:

startEngine() - Must be implemented by each vehicle type

stopEngine() - Must be implemented by each vehicle type

Concrete Method:

displayInfo() - Shows vehicle brand and year

E. Reflection
The inheritance-based design significantly simplified the system architecture by 
allowing common functionality to be centralized in the Vehicle superclass. This
eliminated code duplication and made the system more maintainable. Method 
overriding proved essential for customizing vehicle behaviors while maintaining 
a consistent interface - each vehicle type could implement engine operations in 
its unique way while adhering to the same method signatures.

Working with protected access modifiers presented initial challenges in balancing accessibility for subclasses versus encapsulation. The decision to use protected for brand and year allowed subclasses direct access while still restricting modification from unrelated classes. Default (package-private) access was intentionally avoided to keep the class relationships clear and prevent unintended couplings within the package. The most significant insight was recognizing that a well-designed inheritance hierarchy reduces complexity while increasing flexibility for future extensions.

