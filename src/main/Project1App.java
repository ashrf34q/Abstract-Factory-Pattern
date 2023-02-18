package main;

import main.abstractfactory.AbstractFactory;
import main.abstractfactory.Laptop;
import main.abstractfactory.Phone;
import main.abstractfactory.Tablet;
import main.client.Client;

import java.io.*;

public class Project1App {

    public static void main(String[] args) throws IOException {

        String fileName = "C:\\Users\\makki\\OneDrive\\Desktop\\Abstract-Factory-pattern\\src\\main\\input.txt";
        BufferedReader reader;
        reader = new BufferedReader(new FileReader(fileName));

        try {
            String line = reader.readLine();

            while(line != null){

                switch (line) {
                    case "Phone" -> {
                        AbstractFactory phone = Phone.getInstance();
                        Client client = new Client(phone);
                        client.run();
                    }
                    case "Laptop" -> {
                        AbstractFactory laptop = Laptop.getInstance();
                        Client client1 = new Client(laptop);
                        client1.run();
                    }
                    case "Tablet" -> {
                        AbstractFactory tablet = Tablet.getInstance();
                        Client client2 = new Client(tablet);
                        client2.run();
                    }
                    default -> {
                    }
                }

                System.out.println();
                line = reader.readLine();
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            reader.close();

        }
    }
}
