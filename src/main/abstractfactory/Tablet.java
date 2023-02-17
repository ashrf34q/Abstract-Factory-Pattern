package main.abstractfactory;

import main.abstractcomponents.battery.Battery;
import main.abstractcomponents.battery.TabletBattery;
import main.abstractcomponents.cpu.CPU;
import main.abstractcomponents.cpu.TabletCPU;
import main.abstractcomponents.display.Display;
import main.abstractcomponents.display.TabletDisplay;

public class Tablet extends AbstractFactory {

    private Tablet() {}

    private static Tablet Tablet;

    private static int objectCounter = 0;

    public static Tablet getInstance() {
        if(objectCounter < 2) {
            Tablet = new Tablet();
            objectCounter++;
//            System.out.println("Success!");
        }
        else {
            System.out.println("Error. Can't instantiate more than two!");
        }
        return Tablet;
    }
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