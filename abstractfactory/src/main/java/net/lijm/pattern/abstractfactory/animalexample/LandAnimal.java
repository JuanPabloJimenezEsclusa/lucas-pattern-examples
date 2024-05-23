package net.lijm.pattern.abstractfactory.animalexample;

class LandAnimal extends Animal {

  LandAnimal(AnimalEra era, String name) {
    super(AnimalType.LAND, era, name);
    create();
  }

  @Override
  void create() {
    System.out.println("Animal! type: " + type + "  era: " + era.name() + " name: " + name);
  }
}
