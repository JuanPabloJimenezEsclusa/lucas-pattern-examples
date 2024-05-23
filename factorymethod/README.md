# Factory Method Pattern

The Factory Method pattern is a creational design pattern that provides an interface for creating objects, but allows subclasses to decide which class to instantiate. In other words, it allows the creation of objects without having to specify the exact class of object that will be created.

## Main components

1. **Creator**: This is an abstract class or interface that defines the factory method, which is responsible for creating objects.
2. **Concrete Creator**: This is a subclass of the Creator that implements the factory method to create a specific type of product.
3. **Product**: This is an abstract class or interface that defines the common interface for the objects created by the factory method.
4. **Concrete Product**: This is a subclass of the Product that represents a specific type of product.

## Key benefits

1. **Loose Coupling**: The Creator class is decoupled from the Concrete Product classes, making the code more flexible and easier to maintain.
2. **Extensibility**: New Concrete Product classes can be added without modifying the existing Creator class, making the code more extensible.
3. **Testability**: The Factory Method pattern makes it easier to test the Creator class in isolation, as the Concrete Product classes can be mocked or stubbed.
4. **Flexibility**: The Factory Method pattern allows you to create objects without specifying the exact class of the object that will be created, making the code more flexible.

## Examples

- [APP example](./src/main/java/net/lijm/pattern/factorymethod/appexample/)
  ![appexample.drawio.svg](./src/main/java/net/lijm/pattern/factorymethod/appexample/appexample.drawio.svg)

- [Car Bike example](./src/main/java/net/lijm/pattern/factorymethod/carbikeexample)
  ![carbikeexample.drawio.svg](src/main/java/net/lijm/pattern/factorymethod/carbikeexample/carbikeexample.drawio.svg)
