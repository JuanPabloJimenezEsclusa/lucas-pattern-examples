package net.lijm.pattern.abstractfactory.guiexample.buttons;

public class WindowsButton implements Button{
  @Override
  public void paint() {
    System.out.println("You have created WindowsButton.");
  }
}
