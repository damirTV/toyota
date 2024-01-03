package auto.sales;

import auto.components.Color;
import auto.components.Transmission;
import auto.manufacture.Conveyer;
import auto.manufacture.Storage;
import auto.models.Camry;
import auto.models.Dyna;
import auto.models.Hiance;
import auto.models.Solara;
import auto.types.Car;

public class Manager {
    private Storage storage;
    private Conveyer conveyer;
    private String name;

    public Manager(Storage storage, Conveyer conveyer, String name) {
        this.storage = storage;
        this.conveyer = conveyer;
        this.name = name;
    }

    public Car saleCar(Buyer buyer) {
        double maxPrice = buyer.getMoney();
        switch (carForSale(maxPrice)) {
            case ("camry"):
                Camry camry = storage.findCamry();
                if (camry != null) {
                    return camry;
                } else {
                    storage.addCamry(conveyer.createCamry(Color.BLACK, Transmission.AUTOMATIC, Price.CAMRY.getPriceFromProduction()));
                    camry = storage.findCamry();
                    return camry;
                }
            case ("solara"):
                Solara solara = storage.findSolara();
                if (solara != null) {
                    return solara;
                } else {
                    storage.addSolara(conveyer.createSolara(Color.BLACK, Transmission.AUTOMATIC, Price.SOLARA.getPriceFromProduction()));
                    solara = storage.findSolara();
                    return solara;
                }
            case ("hiance"):
                Hiance hiance = storage.findHiance();
                if (hiance != null) {
                    return hiance;
                } else {
                    storage.addHiance(conveyer.createHiance(Color.BLACK, Transmission.AUTOMATIC, Price.HIANCE.getPriceFromProduction()));
                    hiance = storage.findHiance();
                    return hiance;
                }
            case ("dyna"):
                Dyna dyna = storage.findDyna();
                if (dyna != null) {
                    return dyna;
                } else {
                    storage.addDyna(conveyer.createDyna(Color.BLACK, Transmission.AUTOMATIC, Price.DYNA.getPriceFromProduction()));
                    dyna = storage.findDyna();
                    return dyna;
                }
            case (""):
                return null;
        }
        return null;
    }

    public String carForSale(double maxPrice) {
        if (maxPrice >= Price.CAMRY.getPriceFromStorage() && maxPrice < Price.SOLARA.getPriceFromStorage()) {
            return Price.CAMRY.getModel();
        } else if (maxPrice >= Price.SOLARA.getPriceFromStorage() && maxPrice < Price.HIANCE.getPriceFromStorage()) {
            return Price.SOLARA.getModel();
        } else if (maxPrice >= Price.HIANCE.getPriceFromStorage() && maxPrice < Price.DYNA.getPriceFromStorage()) {
            return Price.HIANCE.getModel();
        } else if (maxPrice >= Price.DYNA.getPriceFromStorage()) {
            return Price.DYNA.getModel();
        } else {
            return "";
        }
    }
}
