package net.lijm.pattern.abstractfactory.concertexample.factory;

import net.lijm.pattern.abstractfactory.concertexample.GenreConcertType;

import java.util.logging.Logger;

public class ConcertAbstractFactory {
  private static final Logger logger = Logger.getLogger(ConcertAbstractFactory.class.getName());

  public void createConcert() {
    GenreConcertType genreType = getConfiguration();

    switch (genreType) {
      case CLASSICAL -> {
        var concertClassicalFactory = new ConcertClassicalFactory();
        concertClassicalFactory.createInstruments();
        concertClassicalFactory.createEquipments();
      }
      case POPULAR -> {
        var concertPopularFactory = new ConcertPopularFactory();
        concertPopularFactory.createInstruments();
        concertPopularFactory.createEquipments();
      }
      case ROCK -> {
        var concertRockFactory = new ConcertRockFactory();
        concertRockFactory.createInstruments();
        concertRockFactory.createEquipments();
      }
    }
  }

  private GenreConcertType getConfiguration() {
    String genre = System.getProperty("genre-type",  GenreConcertType.CLASSICAL.name()).toUpperCase();
    logger.info(() -> "Concert genre is: " + genre);
    return GenreConcertType.valueOf(genre);
  }
}
