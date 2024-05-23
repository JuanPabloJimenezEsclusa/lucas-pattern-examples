package net.lijm.pattern.abstractfactory.animalexample;

class CenozoicAnimalFactory implements EraAnimalFactory {
  @Override
  public LandAnimal makeLandAnimal() {
    return new LandAnimal(AnimalEra.CENOZOIC, "Megalodon");
  }

  @Override
  public SkyAnimal makeSkyAnimal() {
    return new SkyAnimal(AnimalEra.CENOZOIC, "Kelenken");
  }

  public Animal createAnimal(AnimalType type) {
    return switch (type) {
      case LAND -> makeLandAnimal();
      case SKY -> makeSkyAnimal();
    };
  }
}
