package net.lijm.pattern.abstractfactory.concertexample.instrument;

import net.lijm.pattern.abstractfactory.concertexample.InstrumentType;

public class PercussionInstrument extends Instrument {

  public PercussionInstrument(String name) {
    super(InstrumentType.PERCUSSION, name);
    play();
  }

  @Override
  void play() {
    logger.info(this::toString);
  }
}
