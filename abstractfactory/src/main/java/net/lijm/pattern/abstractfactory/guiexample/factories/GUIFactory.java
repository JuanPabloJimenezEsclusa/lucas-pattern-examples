package net.lijm.pattern.abstractfactory.guiexample.factories;

import net.lijm.pattern.abstractfactory.guiexample.buttons.Button;
import net.lijm.pattern.abstractfactory.guiexample.checkboxes.Checkbox;

public interface GUIFactory {
  Button createButton();
  Checkbox createCheckbox();
}
