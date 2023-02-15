package main.abstractfactory;

import main.abstractcomponents.battery.Battery;
import main.abstractcomponents.cpu.CPU;
import main.abstractcomponents.display.Display;

public abstract class AbstractFactory {

    public abstract Battery createBattery();

    public abstract CPU createCPU();

    public abstract Display createDisplay();
}
