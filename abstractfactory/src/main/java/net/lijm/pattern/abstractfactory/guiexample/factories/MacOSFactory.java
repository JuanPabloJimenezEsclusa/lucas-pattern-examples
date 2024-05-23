package net.lijm.pattern.abstractfactory.guiexample.factories;

import net.lijm.pattern.abstractfactory.guiexample.buttons.Button;
import net.lijm.pattern.abstractfactory.guiexample.buttons.MacOSButton;
import net.lijm.pattern.abstractfactory.guiexample.checkboxes.Checkbox;
import net.lijm.pattern.abstractfactory.guiexample.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {
  @Override
  public Button createButton() {
    return new MacOSButton();
  }

  @Override
  public Checkbox createCheckbox() {
    return new MacOSCheckbox();
  }
}
