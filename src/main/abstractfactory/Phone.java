package main.abstractfactory;

import main.abstractcomponents.battery.Battery;
import main.abstractcomponents.battery.PhoneBattery;
import main.abstractcomponents.cpu.CPU;
import main.abstractcomponents.cpu.PhoneCPU;
import main.abstractcomponents.display.Display;
import main.abstractcomponents.display.PhoneDisplay;

public class Phone extends AbstractFactory{

    private Phone() {}

    private static Phone Phone;

    private static int objectCounter = 0;

    public static Phone getInstance() {
        if(objectCounter < 2) {
            Phone = new Phone();
            objectCounter++;

            System.out.println("Phone created");
        }
        else {
            System.out.println("Error. Can't instantiate more than two!");
        }
        return Phone;
    }
    @Override
    public Battery createBattery() {
        return new PhoneBattery();
    }

    @Override
    public CPU createCPU() {
        return new PhoneCPU();
    }

    @Override
    public Display createDisplay() {
        return new PhoneDisplay();
    }
}
