package net.lijm.pattern.abstractfactory.concertexample.factory;

import net.lijm.pattern.abstractfactory.concertexample.equipment.Equipment;
import net.lijm.pattern.abstractfactory.concertexample.instrument.Instrument;

import java.util.List;

interface ConcertFactory {
  List<Instrument> createInstruments();
  List<Equipment> createEquipments();
}
