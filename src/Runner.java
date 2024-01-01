import auto.components.Color;
import auto.components.Transmission;
import auto.exceptions.CountyFactoryNotEqualException;
import auto.manufacture.Conveyer;
import auto.manufacture.Country;
import auto.manufacture.Factory;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Создаем машины через конвейер");
        Factory factory = new Factory(Country.RUSSIA);
        try {
            Conveyer conveyer = new Conveyer(factory, Country.RUSSIA);
            System.out.println(conveyer.createCamry(Color.GREEN, Transmission.AUTOMATIC, 1000).getTransmission());
        } catch (CountyFactoryNotEqualException e) {
            System.out.println(e.getMessage());
        }
    }
}