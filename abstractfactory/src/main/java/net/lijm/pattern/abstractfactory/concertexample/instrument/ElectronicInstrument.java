package net.lijm.pattern.abstractfactory.concertexample.instrument;

import net.lijm.pattern.abstractfactory.concertexample.InstrumentType;

public class ElectronicInstrument extends Instrument {

  public ElectronicInstrument(String name) {
    super(InstrumentType.ELECTRONIC, name);
    play();
  }

  @Override
  void play() {
    logger.info(this::toString);
  }
}
