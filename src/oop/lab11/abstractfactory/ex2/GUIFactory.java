package oop.lab11.abstractfactory.ex2;

import java.awt.*;

public interface GUIFactory {
    OperatingSystem createOperatingSystem();
    Button createButton();
}
