package auto.manufacture;

import auto.components.Color;
import auto.components.Transmission;
import auto.exceptions.CountyFactoryNotEqualException;
import auto.models.Camry;
import auto.models.Dyna;
import auto.models.Hiance;
import auto.models.Solara;

public class Conveyer {
    private Factory factory;
    public Conveyer(Factory factory, Country country) throws CountyFactoryNotEqualException {
        if (factory.getCountry() == country) {
            this.factory = factory;
        } else throw new CountyFactoryNotEqualException("Ошибка: Страны фабрики и конвейера не совпадают");
        // TODO - добавить логику на вывод в ошибку какие страны не совпали

    }

    public Camry createCamry(Color color, Transmission transmission, double price) {
        Camry camry = new Camry();
        camry.setColor(factory.createColor(color));
        camry.setElectric(factory.createElectric());
        camry.setEngine(factory.createEngine());
        camry.setFuelTank(factory.createFuelTank());
        camry.setLights(factory.createLights());
        camry.setTransmission(factory.createTransmission(transmission));
        camry.setPrice(price);
        return camry;
    }

    public Solara createSolara(Color color, Transmission transmission, double price) {
        Solara solara = new Solara();
        solara.setColor(factory.createColor(color));
        solara.setElectric(factory.createElectric());
        solara.setEngine(factory.createEngine());
        solara.setFuelTank(factory.createFuelTank());
        solara.setLights(factory.createLights());
        solara.setTransmission(factory.createTransmission(transmission));
        solara.setPrice(price);
        return solara;
    }

    public Hiance createHiance(Color color, Transmission transmission, double price) {
        Hiance hiance = new Hiance();
        hiance.setColor(factory.createColor(color));
        hiance.setElectric(factory.createElectric());
        hiance.setEngine(factory.createEngine());
        hiance.setFuelTank(factory.createFuelTank());
        hiance.setLights(factory.createLights());
        hiance.setTransmission(factory.createTransmission(transmission));
        hiance.setPrice(price);
        return hiance;
    }

    public Dyna createDyna(Color color, Transmission transmission, double price) {
        Dyna dyna = new Dyna();
        dyna.setColor(factory.createColor(color));
        dyna.setElectric(factory.createElectric());
        dyna.setEngine(factory.createEngine());
        dyna.setFuelTank(factory.createFuelTank());
        dyna.setLights(factory.createLights());
        dyna.setTransmission(factory.createTransmission(transmission));
        dyna.setPrice(price);
        return dyna;
    }
}
