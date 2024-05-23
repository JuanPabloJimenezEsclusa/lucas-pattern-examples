package net.lijm.pattern.abstractfactory.concertexample.instrument;

import net.lijm.pattern.abstractfactory.concertexample.InstrumentType;

public class WindInstrument extends Instrument {

  public WindInstrument(String name) {
    super(InstrumentType.WIND, name);
    play();
  }

  @Override
  void play() {
    logger.info(this::toString);
  }
}
