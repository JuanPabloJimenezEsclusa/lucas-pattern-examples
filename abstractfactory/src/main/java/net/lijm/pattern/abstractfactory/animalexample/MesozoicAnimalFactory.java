package net.lijm.pattern.abstractfactory.animalexample;

class MesozoicAnimalFactory implements EraAnimalFactory {
  @Override
  public LandAnimal makeLandAnimal() {
    return new LandAnimal(AnimalEra.MESOZOIC, "Protosuchus");
  }

  @Override
  public SkyAnimal makeSkyAnimal() {
    return new SkyAnimal(AnimalEra.MESOZOIC, "Pteranodon");
  }

  public Animal createAnimal(AnimalType type) {
    return switch (type) {
      case LAND -> makeLandAnimal();
      case SKY -> makeSkyAnimal();
    };
  }
}
