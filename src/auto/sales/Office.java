package auto.sales;

import auto.components.Color;
import auto.components.Transmission;
import auto.exceptions.CountyFactoryNotEqualException;
import auto.manufacture.Conveyer;
import auto.manufacture.Country;
import auto.manufacture.Factory;
import auto.manufacture.Storage;
import auto.types.Car;

public class Office {
    Factory factory;
    Conveyer conveyer;
    Storage storage;
    Cashier[] cashiers;

    public Office() throws CountyFactoryNotEqualException {
        Country country = Country.JAPAN; // Страна для склада, производства и сборки
        factory = new Factory(country);
        conveyer = new Conveyer(factory, country);
        storage = new Storage(country);
        cashiers = new Cashier[] {new Cashier(), new Cashier(), new Cashier()}; // Кол-во касс в офисе

        storage.addCamry(conveyer.createCamry(Color.BLACK, Transmission.AUTOMATIC, Price.CAMRY.getPriceFromStorage()));
        storage.addDyna(conveyer.createDyna(Color.BLACK, Transmission.AUTOMATIC, Price.DYNA.getPriceFromStorage()));
        storage.addHiance(conveyer.createHiance(Color.BLACK, Transmission.MECHANICS, Price.HIANCE.getPriceFromStorage()));
        storage.addSolara(conveyer.createSolara(Color.WHITE, Transmission.ROBOT, Price.SOLARA.getPriceFromStorage()));
    }

    public double workingDay(double[] buyers) {
        for (int i = 0; i < buyers.length; i++) {
            Manager manager = new Manager(storage, conveyer, "Иван");
            Buyer buyer = new Buyer(buyers[i]);
            Car car = manager.saleCar(buyer);
            if (car != null) {
                freeCashier().addRevenue(car);
            }
        }
        return freeCashier().getRevenueSummary();
    }

    public Cashier freeCashier() { //Метод для определения свободного кассира
        return switch ((int) (Math.random() * 2)) {
            case (0) -> cashiers[0];
            case (1) -> cashiers[1];
            case (2) -> cashiers[2];
            default -> null;
        };
    }
}
