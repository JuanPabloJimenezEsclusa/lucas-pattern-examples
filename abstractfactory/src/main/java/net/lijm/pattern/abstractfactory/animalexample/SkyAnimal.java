package net.lijm.pattern.abstractfactory.animalexample;

class SkyAnimal extends Animal {

  SkyAnimal(AnimalEra era, String name) {
    super(AnimalType.SKY, era, name);
    create();
  }

  @Override
  void create() {
    System.out.println("Animal! type: " + type + "  era: " + era.name() + " name: " + name);
  }
}
