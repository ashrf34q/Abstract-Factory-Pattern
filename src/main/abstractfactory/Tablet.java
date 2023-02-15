package main.abstractfactory;

import main.abstractcomponents.battery.Battery;
import main.abstractcomponents.battery.TabletBattery;
import main.abstractcomponents.cpu.CPU;
import main.abstractcomponents.cpu.TabletCPU;
import main.abstractcomponents.display.Display;
import main.abstractcomponents.display.TabletDisplay;

public class Tablet extends AbstractFactory {
    @Override
    public Battery createBattery() {
        return new TabletBattery();
    }

    @Override
    public CPU createCPU() {
        return new TabletCPU();
    }

    @Override
    public Display createDisplay() {
        return new TabletDisplay();
    }
}