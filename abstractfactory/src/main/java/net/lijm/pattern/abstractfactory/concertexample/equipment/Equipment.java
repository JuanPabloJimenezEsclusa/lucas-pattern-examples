package net.lijm.pattern.abstractfactory.concertexample.equipment;

import net.lijm.pattern.abstractfactory.concertexample.GenreConcertType;

import java.util.logging.Logger;

public abstract class Equipment {
  protected static final Logger logger = Logger.getLogger(Equipment.class.getName());

  GenreConcertType type;
  String name;
  boolean required;

  Equipment(GenreConcertType type, String name, boolean required) {
    this.type = type;
    this.name = name;
    this.required = required;
  }

  @Override
  public String toString() {
    return this.getClass().getSimpleName() + "{name='" + name + "', required=" + required + "}";
  }

  abstract void use();
}
