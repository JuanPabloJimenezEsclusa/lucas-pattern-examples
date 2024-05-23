package net.lijm.pattern.abstractfactory.guiexample.factories;

import net.lijm.pattern.abstractfactory.guiexample.buttons.Button;
import net.lijm.pattern.abstractfactory.guiexample.buttons.LinuxButton;
import net.lijm.pattern.abstractfactory.guiexample.checkboxes.Checkbox;
import net.lijm.pattern.abstractfactory.guiexample.checkboxes.LinuxCheckbox;

public class LinuxFactory implements GUIFactory {
  @Override
  public Button createButton() {
    return new LinuxButton();
  }

  @Override
  public Checkbox createCheckbox() {
    return new LinuxCheckbox();
  }
}
