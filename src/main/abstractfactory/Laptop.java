package main.abstractfactory;

import main.abstractcomponents.battery.Battery;
import main.abstractcomponents.battery.LaptopBattery;
import main.abstractcomponents.cpu.CPU;
import main.abstractcomponents.cpu.LaptopCPU;
import main.abstractcomponents.display.Display;
import main.abstractcomponents.display.LaptopDisplay;

public class Laptop extends AbstractFactory{

    private Laptop() {}

    private static Laptop Laptop;

    private static int objectCounter = 0;

    public static Laptop getInstance() {
        if(objectCounter < 2) {
            Laptop = new Laptop();
            objectCounter++;

            System.out.println("Laptop created");
        }
        else {
            System.out.println("Error. Can't instantiate more than two!");
        }
        return Laptop;
    }
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