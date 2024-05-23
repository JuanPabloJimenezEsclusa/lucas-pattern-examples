package net.lijm.pattern.abstractfactory.concertexample.equipment;

import net.lijm.pattern.abstractfactory.concertexample.GenreConcertType;

public class PopularEquipment extends Equipment {

  public PopularEquipment(String name, boolean required) {
    super(GenreConcertType.POPULAR, name, required);
    use();
  }

  @Override
  void use() {
    logger.info(this::toString);
  }
}
