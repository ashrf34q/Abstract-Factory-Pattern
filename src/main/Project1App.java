package main;

import main.abstractfactory.AbstractFactory;
import main.abstractfactory.Tablet;

public class Project1App {

    public static void main(String[] args) {
        AbstractFactory tablet = Tablet.getInstance();

        AbstractFactory tablet2 = Tablet.getInstance();

        AbstractFactory tablet3 = Tablet.getInstance();
    }
}
