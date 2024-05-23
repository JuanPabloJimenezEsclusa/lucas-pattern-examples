package net.lijm.pattern.abstractfactory.concertexample;

import net.lijm.pattern.abstractfactory.concertexample.factory.ConcertAbstractFactory;

import java.io.IOException;
import java.util.Objects;
import java.util.logging.LogManager;

// Book: Design Patterns: Elements of Reusable Object-Oriented Software

class ConcertRunner {
  public static void main(String[] args) throws IOException {
    LogManager.getLogManager()
      .readConfiguration(Objects
        .requireNonNull(ConcertRunner.class.getClassLoader().getResource("logging.properties"))
        .openStream());
    System.setProperty("genre-type", "ROCK"); // see: GenreConcertType.java

    new ConcertAbstractFactory().createConcert();
  }
}
