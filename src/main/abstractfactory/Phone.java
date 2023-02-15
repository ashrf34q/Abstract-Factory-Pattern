package main.abstractfactory;

import main.abstractcomponents.battery.Battery;
import main.abstractcomponents.battery.PhoneBattery;
import main.abstractcomponents.cpu.CPU;
import main.abstractcomponents.cpu.PhoneCPU;
import main.abstractcomponents.display.Display;
import main.abstractcomponents.display.PhoneDisplay;

public class Phone extends AbstractFactory{
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
