import auto.components.Color;
import auto.components.Transmission;
import auto.exceptions.CountyFactoryNotEqualException;
import auto.manufacture.Conveyer;
import auto.manufacture.Country;
import auto.manufacture.Factory;
import auto.manufacture.Storage;
import auto.models.Camry;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Создаем машины через конвейер");
        Factory factory = new Factory(Country.RUSSIA);
        try {
            Conveyer conveyer = new Conveyer(factory, Country.RUSSIA);
            Camry camry1 = conveyer.createCamry(Color.GREEN, Transmission.AUTOMATIC, 1000);
            System.out.println(camry1);
            Storage storage1 = new Storage(Country.RUSSIA);
            storage1.addCamry(camry1);
            System.out.println("Количество Camry на складе: " + storage1.camryQTY());
            storage1.removeCamry(Color.RED, Transmission.AUTOMATIC);
            System.out.println("Количество Camry на складе: " + storage1.camryQTY());
        } catch (CountyFactoryNotEqualException e) {
            System.out.println(e.getMessage());
        }
    }
}