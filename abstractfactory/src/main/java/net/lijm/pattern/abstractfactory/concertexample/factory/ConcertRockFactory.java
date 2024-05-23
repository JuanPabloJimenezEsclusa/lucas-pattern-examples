package net.lijm.pattern.abstractfactory.concertexample.factory;

import net.lijm.pattern.abstractfactory.concertexample.equipment.Equipment;
import net.lijm.pattern.abstractfactory.concertexample.equipment.RockEquipment;
import net.lijm.pattern.abstractfactory.concertexample.instrument.*;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class ConcertRockFactory implements ConcertFactory {

  @Override
  public List<Instrument> createInstruments() {
    return Stream.of(createPercussionInstruments(), createWindInstruments(), createStringedInstruments(), createElectronicInstruments())
      .flatMap(Collection::stream)
      .collect(Collectors.toList());
  }

  @Override
  public List<Equipment> createEquipments() {
    return List.of(
      new RockEquipment("Microphone", true),
      new RockEquipment("Laser lighting", false),
      new RockEquipment("Stage lighting", false));
  }

  private List<Instrument> createPercussionInstruments() {
    return List.of(
      new PercussionInstrument("Drum Kit"));
  }

  private List<Instrument> createWindInstruments() {
    return List.of(
      new WindInstrument("Contra bass"),
      new WindInstrument("Saxophones"));
  }

  private List<Instrument> createStringedInstruments() {
    return List.of(
      new StringedInstrument("Electric guitar"));
  }

  private List<Instrument> createElectronicInstruments() {
    return List.of(
      new ElectronicInstrument("Synthesizer"));
  }
}
