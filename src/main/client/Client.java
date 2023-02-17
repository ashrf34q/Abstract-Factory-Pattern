package main.client;

import main.abstractcomponents.battery.Battery;
import main.abstractcomponents.cpu.CPU;
import main.abstractcomponents.display.Display;
import main.abstractfactory.AbstractFactory;

public class Client {

    Battery battery;
    CPU cpu;
    Display display;

    public Client(AbstractFactory factory){
        battery = factory.createBattery();
        cpu = factory.createCPU();
        display = factory.createDisplay();
    }

    public void run() {
        battery.printOut();
        cpu.printOut();
        display.printOut();
    }
}
