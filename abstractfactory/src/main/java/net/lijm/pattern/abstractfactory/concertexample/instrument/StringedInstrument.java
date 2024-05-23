package net.lijm.pattern.abstractfactory.concertexample.instrument;

import net.lijm.pattern.abstractfactory.concertexample.InstrumentType;

public class StringedInstrument extends Instrument {

  public StringedInstrument(String name) {
    super(InstrumentType.STRINGED, name);
    play();
  }

  @Override
  void play() {
    logger.info(this::toString);
  }
}
