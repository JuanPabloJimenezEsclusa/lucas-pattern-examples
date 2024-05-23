package net.lijm.pattern.abstractfactory.concertexample.instrument;

import net.lijm.pattern.abstractfactory.concertexample.InstrumentType;

import java.util.logging.Logger;

public abstract class Instrument {
  protected static final Logger logger = Logger.getLogger(Instrument.class.getName());

  InstrumentType type;
  String name;

  Instrument(InstrumentType type, String name) {
    this.type = type;
    this.name = name;
  }

  @Override
  public String toString() {
    return this.getClass().getSimpleName() + "{name='" + name + "'}";
  }

  abstract void play();
}
