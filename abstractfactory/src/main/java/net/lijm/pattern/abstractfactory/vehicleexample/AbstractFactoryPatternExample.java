package net.lijm.pattern.abstractfactory.vehicleexample;

import java.io.IOException;
import java.util.Objects;
import java.util.logging.LogManager;
import java.util.logging.Logger;

// Abstract instrument A
interface Car {
  void drive();
}

// Concrete instrument A1
class LuxuryCar implements Car {
  private static final Logger logger = Logger.getLogger(LuxuryCar.class.getName());

  @Override
  public void drive() {
    logger.info("Driving a luxury car");
  }
}

// Concrete instrument A2
class EconomyCar implements Car {
  private static final Logger logger = Logger.getLogger(EconomyCar.class.getName());

  @Override
  public void drive() {
    logger.info("Driving an economy car");
  }
}

// Abstract instrument B
interface Bike {
  void ride();
}

// Concrete instrument B1
class MountainBike implements Bike {
  private static final Logger logger = Logger.getLogger(MountainBike.class.getName());

  @Override
  public void ride() {
    logger.info("Riding a mountain bike");
  }
}

// Concrete instrument B2
class RoadBike implements Bike {
  private static final Logger logger = Logger.getLogger(RoadBike.class.getName());

  @Override
  public void ride() {
    logger.info("Riding a road bike");
  }
}

// Abstract Factory interface
interface VehicleFactory {
  Car createCar();
  Bike createBike();
}

// Concrete Factory 1
class LuxuryVehicleFactory implements VehicleFactory {
  @Override
  public Car createCar() {
    return new LuxuryCar();
  }

  @Override
  public Bike createBike() {
    return new RoadBike();
  }
}

// Concrete Factory 2
class EconomyVehicleFactory implements VehicleFactory {
  @Override
  public Car createCar() {
    return new EconomyCar();
  }

  @Override
  public Bike createBike() {
    return new MountainBike();
  }
}

// Client code
public class AbstractFactoryPatternExample {
  public static void main(String[] args) throws IOException {
    LogManager.getLogManager()
      .readConfiguration(Objects
        .requireNonNull(AbstractFactoryPatternExample.class.getClassLoader().getResource("logging.properties"))
        .openStream());

    // Creating luxury car and road bike using luxury factory
    VehicleFactory luxuryFactory = new LuxuryVehicleFactory();
    Car luxuryCar = luxuryFactory.createCar();
    Bike roadBike = luxuryFactory.createBike();

    luxuryCar.drive();
    roadBike.ride();

    // Creating economy car and mountain bike using economy factory
    VehicleFactory economyFactory = new EconomyVehicleFactory();
    Car economyCar = economyFactory.createCar();
    Bike mountainBike = economyFactory.createBike();

    economyCar.drive();
    mountainBike.ride();
  }
}
