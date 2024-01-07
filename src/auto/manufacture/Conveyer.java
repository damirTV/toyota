package auto.manufacture;

import auto.components.Color;
import auto.components.Transmission;
import auto.exceptions.CountyFactoryNotEqualException;
import auto.models.Camry;
import auto.models.Dyna;
import auto.models.Hiance;
import auto.models.Solara;
import auto.sales.Price;

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
        int diameter = 17; // Диаметер колес у Camry
        camry.setWheels(factory.createWheel(diameter), factory.createWheel(diameter),
                factory.createWheel(diameter), factory.createWheel(diameter));
        camry.setColor(factory.createColor(color));
        camry.setElectric(factory.createElectric());
        camry.setEngine(factory.createEngine());
        camry.setFuelTank(factory.createFuelTank());
        camry.setLights(factory.createLights());
        camry.setTransmission(factory.createTransmission(transmission));
        camry.setCruiseControl(factory.createCruiseControl());
        camry.setUsb(factory.createUsb());
        camry.setPrice(price);
        camry.setCountry(country);
        camry.setModel(Price.CAMRY.getModel());
        return camry;
    }

    public Solara createSolara(Color color, Transmission transmission, double price) {
        Solara solara = new Solara();
        int diameter = 16; // Диаметер колес у Solara
        solara.setWheels(factory.createWheel(diameter), factory.createWheel(diameter),
                factory.createWheel(diameter), factory.createWheel(diameter));
        solara.setColor(factory.createColor(color));
        solara.setElectric(factory.createElectric());
        solara.setEngine(factory.createEngine());
        solara.setFuelTank(factory.createFuelTank());
        solara.setLights(factory.createLights());
        solara.setTransmission(factory.createTransmission(transmission));
        solara.setFridge(factory.createFidge());
        solara.setCruiseControl(factory.createCruiseControl());
        solara.setRoof(factory.createRoof());
        solara.setPrice(price);
        solara.setCountry(country);
        solara.setModel(Price.SOLARA.getModel());
        return solara;
    }

    public Hiance createHiance(Color color, Transmission transmission, double price) {
        Hiance hiance = new Hiance();
        int diameter = 20; // Диаметер колес у Hiance
        hiance.setWheels(factory.createWheel(diameter), factory.createWheel(diameter),
                factory.createWheel(diameter), factory.createWheel(diameter));
        hiance.setColor(factory.createColor(color));
        hiance.setElectric(factory.createElectric());
        hiance.setEngine(factory.createEngine());
        hiance.setFuelTank(factory.createFuelTank());
        hiance.setLights(factory.createLights());
        hiance.setTransmission(factory.createTransmission(transmission));
        hiance.setSpareWheel(factory.createWheel(diameter));
        hiance.setLoadCapacity(1000);
        hiance.setPrice(price);
        hiance.setCountry(country);
        hiance.setModel(Price.HIANCE.getModel());
        return hiance;
    }

    public Dyna createDyna(Color color, Transmission transmission, double price) {
        Dyna dyna = new Dyna();
        int diameter = 20; // Диаметер колес у Dyna
        dyna.setWheels(factory.createWheel(diameter), factory.createWheel(diameter),
                factory.createWheel(diameter), factory.createWheel(diameter));
        dyna.setColor(factory.createColor(color));
        dyna.setElectric(factory.createElectric());
        dyna.setEngine(factory.createEngine());
        dyna.setFuelTank(factory.createFuelTank());
        dyna.setLights(factory.createLights());
        dyna.setTransmission(factory.createTransmission(transmission));
        dyna.setPowerSocket(factory.createPowerSocket());
        dyna.setLoadCapacity(2000);
        dyna.setPrice(price);
        dyna.setCountry(country);
        dyna.setModel(Price.DYNA.getModel());
        return dyna;
    }
}
