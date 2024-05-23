# Animal example

This UML class diagram illustrates the Abstract Factory pattern applied to creating animals from different eras (Mesozoic and Cenozoic) and categories (Land and Sky).

## Components

* **Classes**
  1. **AbstractFactoryRunner:** A class likely containing the `main()` function to run the animal creation simulation.
  2. **Animal:** An abstract base class representing all animals.
  3. **AnimalAbstractFactory:** An abstract factory class declaring methods for creating animals (`createAnimal()`) and retrieving the era from configuration (`getFromConfiguration()`).
  4. **AnimalEra (enumeration):** An enumeration representing the different geological eras (Mesozoic and Cenozoic).
  5. **AnimalType (enumeration):** An enumeration representing the different animal categories (Land and Sky).
  6. **CenozoicAnimalFactory, MesozoicAnimalFactory (extend EraAnimalFactory):** Concrete factory classes implementing `EraAnimalFactory` and specializing in creating animals from their respective eras (Cenozoic and Mesozoic). They also have methods for creating specific land and sky animals.
  7. **EraAnimalFactory (interface):** Defines methods for creating land and sky animals (`makeLandAnimal()`, `makeSkyAnimal()`). This interface promotes code that depends on factories rather than specific animal classes.
  8. **LandAnimal (extends Animal):** A concrete class representing land animals.
  9. **SkyAnimal (extends Animal):** A concrete class representing sky animals.

* **Relationships**
  1. Inheritance is shown with solid black arrows (e.g., `LandAnimal` inherits from `Animal`).
  2. Interface implementation is shown with dashed green arrows (e.g., `CenozoicAnimalFactory` implements `EraAnimalFactory`).
  3. Concrete factories use dashed arrows to indicate creation of specific animals (e.g., `CenozoicAnimalFactory` creates `LandAnimal` and `SkyAnimal`).
  4. The `AnimalAbstractFactory` creates concrete factories (dashed arrows with `"«create»"`).
  5. `AbstractFactoryRunner` interacts with the abstract factory to potentially create animals (dashed arrow).
  6. Usage dependencies are shown with plain arrows (e.g., `Animal` has usage dependencies on `AnimalEra` and `AnimalType`).

## Benefits

1. **Decouples animal creation from specific eras and types:** The core logic doesn't need to know about specific animal implementations for each era and category. It relies on the `EraAnimalFactory` interface.
2. **Flexibility for different animal eras and types:** You can easily add new factories for additional eras or animal types without modifying the core animal creation logic.

## Learning Points

1. This code demonstrates the Abstract Factory pattern for creating animals based on era and category.
2. Interfaces define core functionalities (`makeLandAnimal()`, `makeSkyAnimal()`), while concrete factories implement them for specific eras.
3. Factory classes encapsulate the logic of creating era-specific land and sky animals.
4. This approach promotes loose coupling and easier extensibility for the animal creation simulation.

![animalexample.plantuml](./animalexample.plantuml)
