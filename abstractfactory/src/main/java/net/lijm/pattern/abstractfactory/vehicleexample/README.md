# Vehicle example

This UML class diagram documents code that implements the Abstract Factory design pattern. The code defines factories that produce related vehicle objects (Cars and Bikes) of different types (Economy and Luxury).

## Classes

1. **AbstractFactoryPatternExample**: This class likely contains the main function where the program starts and interacts with the factories.
2. **Car** (interface): This interface defines the common behavior of all Car objects (presumably `drive()`).
3. **Bike** (interface): This interface defines the common behavior of all Bike objects (presumably `ride()`).
4. **EconomyCar**: This concrete class implements the `Car` interface and represents an Economy type car.
5. **LuxuryCar**: This concrete class implements the `Car` interface and represents a Luxury type car.
6. **EconomyVehicleFactory**: This concrete class implements the `VehicleFactory` interface and creates Economy type vehicles (`EconomyCar` and `MountainBike`).
7. **LuxuryVehicleFactory**: This concrete class implements the `VehicleFactory` interface and creates Luxury type vehicles (`LuxuryCar` and `RoadBike`).
8. **MountainBike**: This concrete class implements the `Bike` interface and represents a Mountain type bike.
9. **RoadBike**: This concrete class implements the `Bike` interface and represents a Road type bike.
10. **VehicleFactory** (interface): This interface defines the methods (`createCar()` and `createBike()`) for creating `Car` and `Bike` objects, promoting code that uses factories without depending on specific concrete factory implementations.

## Relationships

1. **AbstractFactoryPatternExample** depends on concrete factories (`EconomyVehicleFactory` and `LuxuryVehicleFactory`) through a dashed arrow with the label "«create»". This signifies that the main program likely retrieves vehicle objects by calling the create* methods of these factories.
2. Inheritance is shown with a solid black arrow pointing upwards (e.g., `EconomyCar` inherits from `Car`).
3. Interface implementation is shown with a dashed green arrow pointing to the interface (e.g., `EconomyCar` implements Car).
4. The `create*` methods of concrete factories (`EconomyVehicleFactory` and `LuxuryVehicleFactory`) have dashed arrows pointing to the concrete objects they create (e.g., `EconomyVehicleFactory` creates `EconomyCar`).

Overall, this UML diagram illustrates how the Abstract Factory pattern allows for creating families of related objects (Cars and Bikes) with different variations (Economy and Luxury) through dedicated factories.

![vehicleexample.plantuml](./vehicleexample.plantuml)
