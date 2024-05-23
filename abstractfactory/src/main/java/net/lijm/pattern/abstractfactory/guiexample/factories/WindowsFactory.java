package net.lijm.pattern.abstractfactory.guiexample.factories;

import net.lijm.pattern.abstractfactory.guiexample.buttons.Button;
import net.lijm.pattern.abstractfactory.guiexample.buttons.WindowsButton;
import net.lijm.pattern.abstractfactory.guiexample.checkboxes.Checkbox;
import net.lijm.pattern.abstractfactory.guiexample.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
  @Override
  public Button createButton() {
    return new WindowsButton();
  }

  @Override
  public Checkbox createCheckbox() {
    return new WindowsCheckbox();
  }
}
