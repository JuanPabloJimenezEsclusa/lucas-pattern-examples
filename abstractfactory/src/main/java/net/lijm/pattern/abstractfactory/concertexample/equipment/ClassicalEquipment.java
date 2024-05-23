package net.lijm.pattern.abstractfactory.concertexample.equipment;

import net.lijm.pattern.abstractfactory.concertexample.GenreConcertType;

public class ClassicalEquipment extends Equipment {

  public ClassicalEquipment(String name, boolean required) {
    super(GenreConcertType.CLASSICAL, name, required);
    use();
  }

  @Override
  void use() {
    logger.info(this::toString);
  }
}
