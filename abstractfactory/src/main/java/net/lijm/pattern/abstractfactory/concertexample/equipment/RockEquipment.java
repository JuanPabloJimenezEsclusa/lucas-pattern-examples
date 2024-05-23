package net.lijm.pattern.abstractfactory.concertexample.equipment;

import net.lijm.pattern.abstractfactory.concertexample.GenreConcertType;

public class RockEquipment extends Equipment {

  public RockEquipment(String name, boolean required) {
    super(GenreConcertType.ROCK, name, required);
    use();
  }

  @Override
  void use() {
    logger.info(this::toString);
  }
}
