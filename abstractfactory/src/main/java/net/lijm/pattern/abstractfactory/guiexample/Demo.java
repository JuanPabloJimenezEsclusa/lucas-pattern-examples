package net.lijm.pattern.abstractfactory.guiexample;

import net.lijm.pattern.abstractfactory.guiexample.app.Application;
import net.lijm.pattern.abstractfactory.guiexample.factories.GUIFactory;
import net.lijm.pattern.abstractfactory.guiexample.factories.LinuxFactory;
import net.lijm.pattern.abstractfactory.guiexample.factories.MacOSFactory;
import net.lijm.pattern.abstractfactory.guiexample.factories.WindowsFactory;

// https://refactoring.guru/es/design-patterns/abstract-factory/java/example#example-0
class Demo {

  /**
   * Application picks the factory type and creates it in run time (usually at
   * initialization stage), depending on the configuration or environment
   * variables.
   */
  private static Application configureApplication() {
    String osName = System.getProperty("os.name").toLowerCase();

    GUIFactory factory = switch (osName) {
      case "linux" -> new LinuxFactory();
      case "mac" -> new MacOSFactory();
      default -> new WindowsFactory();
    };

    return new Application(factory);
  }

  public static void main(String[] args) {
    Application app = configureApplication();
    app.paint();
  }
}
