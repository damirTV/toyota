package auto.manufacture;

import auto.components.Color;
import auto.components.Transmission;
import auto.exceptions.CountyFactoryNotEqualException;
import auto.models.Camry;
import auto.models.Dyna;
import auto.models.Hiance;
import auto.models.Solara;
import auto.sales.Price;
import auto.types.Car;

public class Conveyer {
    private final Factory factory;
    private final Country country;

    public Conveyer(Factory factory, Country country) throws CountyFactoryNotEqualException {
        if (factory.getCountry() == country) {
            this.country = country;
            this.factory = factory;
        } else {
            throw new CountyFactoryNotEqualException("Ошибка: Страна фабрики ("
                    + factory.getCountry() + ") и конвейера (" + country + ") не совпадают");
        }
    }

    public Camry createCamry(Color color, Transmission transmission, double price) {
        Camry camry = new Camry();
        createCommonComponents(camry, 17, color, transmission, price);
        camry.setCruiseControl(factory.createCruiseControl());
        camry.setUsb(factory.createUsb());
        camry.setModel(Price.CAMRY.getModel());
        return camry;
    }

    public Solara createSolara(Color color, Transmission transmission, double price) {
        Solara solara = new Solara();
        createCommonComponents(solara, 16, color, transmission, price);
        solara.setFridge(factory.createFidge());
        solara.setCruiseControl(factory.createCruiseControl());
        solara.setRoof(factory.createRoof());
        solara.setModel(Price.SOLARA.getModel());
        return solara;
    }

    public Hiance createHiance(Color color, Transmission transmission, double price) {
        Hiance hiance = new Hiance();
        createCommonComponents(hiance, 20, color, transmission, price);
        hiance.setSpareWheel(factory.createWheel(20));
        hiance.setLoadCapacity(1000);
        hiance.setModel(Price.HIANCE.getModel());
        return hiance;
    }

    public Dyna createDyna(Color color, Transmission transmission, double price) {
        Dyna dyna = new Dyna();
        createCommonComponents(dyna, 20, color, transmission, price);
        dyna.setPowerSocket(factory.createPowerSocket());
        dyna.setLoadCapacity(2000);
        dyna.setModel(Price.DYNA.getModel());
        return dyna;
    }

    private void createCommonComponents(Car car, int diameter, Color color,
                                        Transmission transmission, double price) {
        car.setWheels(factory.createWheel(diameter), factory.createWheel(diameter),
                factory.createWheel(diameter), factory.createWheel(diameter));
        car.setColor(factory.createColor(color));
        car.setElectric(factory.createElectric());
        car.setEngine(factory.createEngine());
        car.setFuelTank(factory.createFuelTank());
        car.setLights(factory.createLights());
        car.setTransmission(factory.createTransmission(transmission));
        car.setPrice(price);
        car.setCountry(country);
    }
}
