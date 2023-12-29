import auto.Camry;
import auto.Car;
import auto.StartCarException;
import auto.Wheel;

import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Runner {
    public static void main(String[] args) {
        Car camry1 = new Camry("Красный", "Робот");
        try {
            camry1.startDrive();
        } catch (StartCarException e) {
            System.out.println(e.getMessage());
        }
        camry1.stopDrive();
        camry1.lightsOn();
        camry1.lightsOff();
    }
}