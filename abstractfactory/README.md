# Abstract Factory Pattern

The Abstract Factory pattern is a creational design pattern that provides an interface for creating families of related or dependent objects without specifying their concrete classes.

## Key Components

1. Abstract Factory: Declares an interface for operations that create abstract objects.
2. Concrete Factory: Implements the operations to create concrete objects.
3. Abstract Item: Declares an interface for a type of object.
4. Concrete Item: Defines a item object to be created by the corresponding concrete factory.
5. Client: Uses the interfaces declared by the `AbstractFactory` and `AbstractItem` classes.

## How it Works

1. The client uses the `AbstractFactory` interface to create a set of related items without knowing their concrete classes.
2. The `ConcreteFactory` implements the `AbstractFactory` interface to create a family of related items.
3. The `ConcreteItem` classes implement the `AbstractItem` interface and are created by the corresponding `ConcreteFactory`.
4. The client uses the `AbstractItem` interface to work with the items created by the `ConcreteFactory`, without knowing their concrete classes.

## Benefits

1. Abstraction: The client code is decoupled from the concrete implementation of items, allowing for easier maintenance and extensibility.
2. Flexibility: New types of items can be added easily by creating new concrete factories and items, without affecting the existing client code.
3. Consistency: The client is guaranteed to receive a family of related items, ensuring consistency in the application.

## Examples

Here are some examples of the pattern:

- [Animal example](./src/main/java/net/lijm/pattern/abstractfactory/animalexample/)
  ![animalexample.drawio.svg](./src/main/java/net/lijm/pattern/abstractfactory/animalexample/animalexample.drawio.svg)

- [Concert example](./src/main/java/net/lijm/pattern/abstractfactory/concertexample/)
  ![concertexample.drawio.svg](./src/main/java/net/lijm/pattern/abstractfactory/concertexample/concertexample.drawio.svg)

- [GUI example](./src/main/java/net/lijm/pattern/abstractfactory/guiexample/)
  ![guiexample.drawio.svg](./src/main/java/net/lijm/pattern/abstractfactory/guiexample/guiexample.drawio.svg)

- [Vehicle example](./src/main/java/net/lijm/pattern/abstractfactory/vehicleexample/)
  ![vehicleexample.drawio.svg](./src/main/java/net/lijm/pattern/abstractfactory/vehicleexample/vehicleexample.drawio.svg)
