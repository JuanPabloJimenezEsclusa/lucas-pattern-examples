# Concert example

This UML class diagram shows the Abstract Factory pattern applied to creating musical instruments and equipment for different concert genres (Classical, Popular, Rock).

## Components

* **Classes**
  1. **ClassicalEquipment (extends Equipment):** A specific equipment class used in classical concerts.
  2. **ConcertAbstractFactory:** An abstract factory class declaring a `createConcert()` method (likely with additional configuration options).
  3. **ConcertClassicalFactory, ConcertPopularFactory, ConcertRockFactory (extend ConcertFactory):** Concrete factory classes implementing `ConcertFactory` and specializing in creating instruments and equipment for their respective genres.
  4. **ConcertFactory (interface):** Defines methods for creating lists of instruments (`createInstruments()`) and equipment (`createEquipments()`) for concerts. This interface promotes code that depends on factories rather than specific instrument/equipment classes.
  5. **ConcertRunner:** A class likely containing the `main()` function to run the concert simulation.
  6. **ElectronicInstrument (extends Instrument):** A specific instrument class representing electronic instruments.
  7. **Equipment:** A base class for all concert equipment.
  8. **GenreConcertType (enumeration):** An enumeration representing the different concert genres.
  9. **Instrument:** A base class for all musical instruments.
  10. **InstrumentType (enumeration):** An enumeration representing the different instrument types.
  11. **PercussionInstrument (extends Instrument):** A specific instrument class representing percussion instruments.
  12. **PopularEquipment (extends Equipment):** A specific equipment class used in popular concerts.
  13. **RockEquipment (extends Equipment):** A specific equipment class used in rock concerts.
  14. **StringedInstrument (extends Instrument):** A specific instrument class representing stringed instruments.
  15. **WindInstrument (extends Instrument):** A specific instrument class representing wind instruments.

* **Relationships**
  1. Inheritance is shown with solid black arrows (e.g., `ClassicalEquipment` inherits from `Equipment`).
  2. Interface implementation is shown with dashed green arrows (e.g., `ConcertClassicalFactory` implements `ConcertFactory`).
  3. Concrete factories use dashed arrows to indicate creation of specific instruments/equipment (e.g., `ConcertClassicalFactory` creates `ClassicalEquipment`).
  4. The `ConcertAbstractFactory` creates concrete factories (dashed arrows with `"«create»"`).
  5. `ConcertRunner` interacts with the abstract factory to potentially create a concert (dashed arrow).
  6. Usage dependencies are shown with plain arrows (e.g., `Equipment` has a usage dependency on `GenreConcertType`).
  7. Composition is shown with a diamond shape (e.g., a `Concert` might have a composition relationship with a list of `Instruments`).

## Benefits

1. **Decouples concert simulation from specific instruments/equipment:** The core logic doesn't need to know about specific instruments or equipment for each genre. It relies on the `ConcertFactory` interface.
2. **Flexibility for different concert genres:** You can easily add new factories for additional genres without modifying the core concert simulation logic.

## Learning Points

1. This code demonstrates the Abstract Factory pattern for creating concert instruments and equipment based on genre.
2. Interfaces define core functionalities (`createInstruments()`, `createEquipments()`), while concrete factories implement them for specific genres.
3. Factory classes encapsulate the logic of creating genre-specific instruments and equipment.
4. This approach promotes loose coupling and easier extensibility for the concert simulation.

![concertexample.plantuml](./concertexample.plantuml)
