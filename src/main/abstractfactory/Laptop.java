package main.abstractfactory;

import main.abstractcomponents.battery.Battery;
import main.abstractcomponents.battery.LaptopBattery;
import main.abstractcomponents.cpu.CPU;
import main.abstractcomponents.cpu.LaptopCPU;
import main.abstractcomponents.display.Display;
import main.abstractcomponents.display.LaptopDisplay;

public class Laptop extends AbstractFactory{
    @Override
    public Battery createBattery() {
        return new LaptopBattery();
    }

    @Override
    public CPU createCPU() {
        return new LaptopCPU();
    }

    @Override
    public Display createDisplay() {
        return new LaptopDisplay();
    }
}