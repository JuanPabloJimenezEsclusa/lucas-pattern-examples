package net.lijm.pattern.factorymethod.carbikeexample;

import java.io.IOException;
import java.util.Objects;
import java.util.logging.LogManager;
import java.util.logging.Logger;

// Product interface
interface Vehicle {
  void drive();
}

// Concrete instrument 1
class Car implements Vehicle {
  private static final Logger logger = Logger.getLogger(Car.class.getName());

  @Override
  public void drive() {
    logger.info("Driving a car");
  }
}

// Concrete instrument 2
class Bike implements Vehicle {
  private static final Logger logger = Logger.getLogger(Bike.class.getName());

  @Override
  public void drive() {
    logger.info("Riding a bike");
  }
}

// Factory class
class VehicleFactory {
  // Factory method to create vehicles
  public Vehicle createVehicle(String type) {
    if (type.equalsIgnoreCase("car")) {
      return new Car();
    } else if (type.equalsIgnoreCase("bike")) {
      return new Bike();
    } else {
      throw new IllegalArgumentException("Invalid vehicle type");
    }
  }
}

// Client code
public class FactoryPatternExample {
  private Vehicle vehicle;

  public static void main(String[] args) throws IOException {
    LogManager.getLogManager()
      .readConfiguration(Objects
        .requireNonNull(FactoryPatternExample.class.getClassLoader().getResource("logging.properties"))
        .openStream());

    var factory = new VehicleFactory();
    var patternExample = new FactoryPatternExample();
    patternExample.vehicle = factory.createVehicle("car");
    patternExample.vehicle.drive();

    patternExample.vehicle = factory.createVehicle("bike");
    patternExample.vehicle.drive();
  }
}
