import auto.exceptions.CountyFactoryNotEqualException;
import auto.exceptions.NoFreePlaceForCar;
import auto.exceptions.StartCarException;
import auto.sales.Buyer;
import auto.sales.Office;
import auto.types.Car;
import java.io.IOException;

/**
 * Реализация проекта через добавление дополнительного класса - "Покупатель".
 * Наличие класса "Покупатель" позволяет проверить работоспособность методов у купленной машины.
 * Так как во время продажи не известно какую машину купит покупатель, то пришлось в абстрактном
 * классе "Car" создать все методы всех машин, чтобы покупатель мог их вызывать.
 */
public class Runner {
    public static void main(String[] args) {
        Buyer[] buyers = new Buyer[] {new Buyer(10000), new Buyer(12000), new Buyer(15000),
            new Buyer(22000), new Buyer(11000), new Buyer(13000), new Buyer(8000),
            new Buyer(30000)};
        try {
            Office office = new Office();
            office.workingDay(buyers);
        } catch (CountyFactoryNotEqualException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        } catch (NoFreePlaceForCar e) {
            throw new RuntimeException(e);
        }

        // Тест-драйв купленной машины
        System.out.println("\nТест-драйв купленной машины");
        Car testCar = buyers[1].getCar();
        testCar.stopDrive();
        try {
            testCar.startDrive();
        } catch (StartCarException e) {
            System.out.println(e.getMessage());
        }
        testCar.fillFuel(100);
        try {
            testCar.startDrive();
        } catch (StartCarException e) {
            System.out.println(e.getMessage());
        }

        System.out.printf("Модель машины: %s\n", testCar.getModel());
        System.out.printf("Цвет машины: %s\n", testCar.getColor());
        System.out.printf("Страна-изготовитель: %s\n", testCar.getCountry());
        testCar.disableLights();
        testCar.enableLights();
        testCar.disableMusic();
        testCar.enableMusic();
        testCar.disableMusic();
        testCar.disableCruiseControl();
        testCar.enableCruiseControl();
        testCar.disableCruiseControl();
        testCar.downRoof();
        testCar.upRoof();
        testCar.downRoof();
        testCar.disablePower();
        testCar.enablePower();
        testCar.disablePower();
        testCar.disableFridge();
        testCar.enableFridge();
        testCar.disableFridge();
    }
}