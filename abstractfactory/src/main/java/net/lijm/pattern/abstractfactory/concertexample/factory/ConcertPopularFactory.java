package net.lijm.pattern.abstractfactory.concertexample.factory;

import net.lijm.pattern.abstractfactory.concertexample.equipment.Equipment;
import net.lijm.pattern.abstractfactory.concertexample.equipment.PopularEquipment;
import net.lijm.pattern.abstractfactory.concertexample.instrument.*;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class ConcertPopularFactory implements ConcertFactory {

  @Override
  public List<Instrument> createInstruments() {
    return Stream.of(createPercussionInstruments(), createWindInstruments(), createStringedInstruments(), createElectronicInstruments())
      .flatMap(Collection::stream)
      .collect(Collectors.toList());
  }

  @Override
  public List<Equipment> createEquipments() {
    return List.of(
      new PopularEquipment("Microphone", true),
      new PopularEquipment("Speakers", false),
      new PopularEquipment("Stage lighting", true));
  }

  private List<Instrument> createPercussionInstruments() {
    return List.of(
      new PercussionInstrument("Castanets"),
      new PercussionInstrument("Güiro"),
      new PercussionInstrument("Maraca"),
      new PercussionInstrument("Congo"));
  }

  private List<Instrument> createWindInstruments() {
    return List.of(
      new WindInstrument("Accordion"),
      new WindInstrument("Bassoon"),
      new WindInstrument("Harmonica"));
  }

  private List<Instrument> createStringedInstruments() {
    return List.of(
      new StringedInstrument("Banjo"),
      new StringedInstrument("Mandolin"),
      new StringedInstrument("Ukulele"));
  }

  private List<Instrument> createElectronicInstruments() {
    return List.of(
      new ElectronicInstrument("Synthesizer"));
  }
}
