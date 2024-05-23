package net.lijm.pattern.abstractfactory.animalexample;

class AnimalAbstractFactory {

  Animal createAnimal(AnimalType type) {
    AnimalEra era = getFromConfiguration();

    return switch (era) {
      case MESOZOIC -> new MesozoicAnimalFactory().createAnimal(type);
      case CENOZOIC -> new CenozoicAnimalFactory().createAnimal(type);
    };
  }

  AnimalEra getFromConfiguration() {
    String era = System.getProperty("animal-era",  AnimalEra.MESOZOIC.name()).toUpperCase();
    return AnimalEra.valueOf(era);
  }
}
