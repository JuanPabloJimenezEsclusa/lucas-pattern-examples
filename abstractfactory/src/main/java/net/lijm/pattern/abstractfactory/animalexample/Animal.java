package net.lijm.pattern.abstractfactory.animalexample;

abstract class Animal {
  AnimalType type;
  AnimalEra era;
  String name;

  Animal(AnimalType type, AnimalEra era, String name) {
    this.type = type;
    this.era = era;
    this.name = name;
  }

  abstract void create();
}
