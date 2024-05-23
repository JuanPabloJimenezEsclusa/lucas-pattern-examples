package net.lijm.pattern.abstractfactory.concertexample.factory;

import net.lijm.pattern.abstractfactory.concertexample.equipment.ClassicalEquipment;
import net.lijm.pattern.abstractfactory.concertexample.equipment.Equipment;
import net.lijm.pattern.abstractfactory.concertexample.instrument.*;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class ConcertClassicalFactory implements ConcertFactory {

  @Override
  public List<Instrument> createInstruments() {
    return Stream.of(createPercussionInstruments(), createWindInstruments(), createStringedInstruments(), createElectronicInstruments())
      .flatMap(Collection::stream)
      .collect(Collectors.toList());
  }

  @Override
  public List<Equipment> createEquipments() {
    return List.of(
      new ClassicalEquipment("Microphone", true),
      new ClassicalEquipment("Speakers", true),
      new ClassicalEquipment("Tall Boom", false),
      new ClassicalEquipment("Roundbase Straight", false));
  }

  private List<Instrument> createPercussionInstruments() {
    return List.of(
      new PercussionInstrument("Triangule"),
      new PercussionInstrument("Xylophone"),
      new PercussionInstrument("Vibraphone"));
  }

  private List<Instrument> createWindInstruments() {
    return List.of(
      new WindInstrument("Alto horn"),
      new WindInstrument("Baritone horn"),
      new WindInstrument("French horn"));
  }

  private List<Instrument> createStringedInstruments() {
    return List.of(
      new StringedInstrument("Classical guitar"),
      new StringedInstrument("Bass guitar"),
      new StringedInstrument("Alto viol"));
  }

  private List<Instrument> createElectronicInstruments() {
    return List.of(
      new ElectronicInstrument("Keyboard"),
      new ElectronicInstrument("Digital piano"));
  }
}
