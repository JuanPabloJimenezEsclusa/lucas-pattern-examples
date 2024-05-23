package net.lijm.pattern.abstractfactory.animalexample;

// https://www.baeldung.com/java-abstract-factory-pattern
// https://github.com/eugenp/tutorials/tree/master/patterns-modules/design-patterns-creational/src/main/java/com/baeldung/creational/abstractfactory2
class AbstractFactoryRunner {
  public static void main(String[] args) {
    System.setProperty("animal-era", "MESOZOIC"); // MESOZOIC or CENOZOIC

    new AnimalAbstractFactory().createAnimal(AnimalType.SKY);
  }
}
