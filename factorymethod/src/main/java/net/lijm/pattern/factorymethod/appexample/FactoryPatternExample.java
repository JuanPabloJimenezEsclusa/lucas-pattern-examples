package net.lijm.pattern.factorymethod.appexample;

import java.io.IOException;
import java.util.Objects;
import java.util.logging.LogManager;
import java.util.logging.Logger;

// Abstract Product A
interface Vehicle {
  void drive();
}

// Concrete Product A1
class Car implements Vehicle {
  private static final Logger logger = Logger.getLogger(Car.class.getName());

  @Override
  public void drive() {
    logger.info("Driving Car");
  }
}

// Concrete Product A2
class Bike implements Vehicle {
  private static final Logger logger = Logger.getLogger(Bike.class.getName());

  @Override
  public void drive() {
    logger.info("Riding Bike");
  }
}

// Factory
interface VehicleFactory {
  Vehicle createVehicle();
}

// Concrete Factory 1
class CarFactory implements VehicleFactory {
  @Override
  public Vehicle createVehicle() {
    return new Car();
  }
}

// Concrete Factory 2
class BikeFactory implements VehicleFactory {
  @Override
  public Vehicle createVehicle() {
    return new Bike();
  }
}

enum VehicleType {
  CAR, BIKE
}

// Client
class VehicleApp implements Vehicle {
  private final Vehicle vehicle;

  public VehicleApp(VehicleType vehicleType) {
    VehicleFactory factory = switch (vehicleType) {
      case CAR -> new CarFactory();
      case BIKE -> new BikeFactory();
    };

    vehicle = factory.createVehicle();
  }

  @Override
  public void drive() {
    vehicle.drive();
  }
}

class FactoryMethodExample {
  public static void main(String[] args) throws IOException {
    LogManager.getLogManager()
      .readConfiguration(Objects
        .requireNonNull(VehicleApp.class.getClassLoader().getResource("logging.properties"))
        .openStream());

    new VehicleApp(VehicleType.CAR).drive();
    new VehicleApp(VehicleType.BIKE).drive();
  }
}
