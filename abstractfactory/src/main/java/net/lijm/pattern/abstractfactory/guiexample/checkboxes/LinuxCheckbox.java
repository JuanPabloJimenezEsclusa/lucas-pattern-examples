package net.lijm.pattern.abstractfactory.guiexample.checkboxes;

public class LinuxCheckbox implements Checkbox{
  @Override
  public void paint() {
    System.out.println("You have created LinuxCheckbox.");
  }
}
