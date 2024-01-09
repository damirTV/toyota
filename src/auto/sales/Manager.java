package auto.sales;

import auto.components.Color;
import auto.components.Transmission;
import auto.exceptions.NoFreePlaceForCar;
import auto.manufacture.Conveyer;
import auto.manufacture.Storage;
import auto.models.Camry;
import auto.models.Dyna;
import auto.models.Hiance;
import auto.models.Solara;
import auto.types.Car;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Manager {
    private final Storage storage;
    private final Conveyer conveyer;
    private final String name;

    public Manager(Storage storage, Conveyer conveyer, String name) {
        this.storage = storage;
        this.conveyer = conveyer;
        this.name = name;
    }

    public Car saleCar(Buyer buyer) throws NoFreePlaceForCar {
        double maxPrice = buyer.getMoney();
        switch (carForSale(maxPrice)) {
            case ("Camry"):
                Camry camry = storage.findCamry();
                if (camry != null) {
                    addReport(name, Price.CAMRY.getModel(), camry.getPrice(),
                            Price.CAMRY.getPriceCost());
                } else {
                    storage.addCamry(conveyer.createCamry(Color.BLACK, Transmission.AUTOMATIC,
                            Price.CAMRY.getPriceFromProduction()));
                    camry = storage.findCamry();
                    addReport(name, Price.CAMRY.getModel(), camry.getPrice(),
                            Price.CAMRY.getPriceCost());
                }
                return camry;
            case ("Solara"):
                Solara solara = storage.findSolara();
                if (solara != null) {
                    addReport(name, Price.SOLARA.getModel(), solara.getPrice(),
                            Price.SOLARA.getPriceCost());
                } else {
                    storage.addSolara(conveyer.createSolara(Color.BLACK, Transmission.AUTOMATIC,
                            Price.SOLARA.getPriceFromProduction()));
                    solara = storage.findSolara();
                    addReport(name, Price.SOLARA.getModel(), solara.getPrice(),
                            Price.SOLARA.getPriceCost());
                }
                return solara;
            case ("Hiance"):
                Hiance hiance = storage.findHiance();
                if (hiance != null) {
                    addReport(name, Price.HIANCE.getModel(), hiance.getPrice(),
                            Price.HIANCE.getPriceCost());
                } else {
                    storage.addHiance(conveyer.createHiance(Color.BLACK, Transmission.AUTOMATIC,
                            Price.HIANCE.getPriceFromProduction()));
                    hiance = storage.findHiance();
                    addReport(name, Price.HIANCE.getModel(), hiance.getPrice(),
                            Price.HIANCE.getPriceCost());
                }
                return hiance;
            case ("Dyna"):
                Dyna dyna = storage.findDyna();
                if (dyna != null) {
                    addReport(name, Price.DYNA.getModel(), dyna.getPrice(),
                            Price.DYNA.getPriceCost());
                } else {
                    storage.addDyna(conveyer.createDyna(Color.BLACK, Transmission.AUTOMATIC,
                            Price.DYNA.getPriceFromProduction()));
                    dyna = storage.findDyna();
                    addReport(name, Price.DYNA.getModel(), dyna.getPrice(),
                            Price.DYNA.getPriceCost());
                }
                return dyna;
            default:
                return null;
        }
    }

    private void addReport(String name, String model, double price, double priceCost) {
        Report reports = new Report();
        reports.addReport(new Record(name, model, price, priceCost));
    }

    private String carForSale(double maxPrice) {
        if (maxPrice >= Price.CAMRY.getPriceFromStorage() && maxPrice
                < Price.SOLARA.getPriceFromStorage()) {
            return Price.CAMRY.getModel();
        } else if (maxPrice >= Price.SOLARA.getPriceFromStorage() && maxPrice
                < Price.HIANCE.getPriceFromStorage()) {
            return Price.SOLARA.getModel();
        } else if (maxPrice >= Price.HIANCE.getPriceFromStorage() && maxPrice
                < Price.DYNA.getPriceFromStorage()) {
            return Price.HIANCE.getModel();
        } else if (maxPrice >= Price.DYNA.getPriceFromStorage()) {
            return Price.DYNA.getModel();
        } else {
            return Price.NULL.getModel();
        }
    }

    public String getName() {
        return name;
    }

    public void report(String name) throws IOException {
        double allRevenue = 0;
        double allCost = 0;
        double allProfit = 0;
        String buffer;
        Report report = new Report();
        int lengthReport = report.getCounter();

        File reportFile = new File("report.tx");
        reportFile.createNewFile();
        FileOutputStream outputStream = new FileOutputStream(reportFile);
        outputStream.write(("Имя менеджера: " + name + "\n").getBytes());
        for (int i = 0; i < lengthReport; i++) {
            buffer = "Модель: " + report.getReports()[i].getModelCar() + " - Продажа: "
                    + report.getReports()[i].getPriceSale() + " - Себестоимость: "
                    + report.getReports()[i].getPriceCost();
            outputStream.write(buffer.getBytes());
            allRevenue += report.getReports()[i].getPriceSale();
            allCost += report.getReports()[i].getPriceCost();
            allProfit = allProfit + (allRevenue - allCost);
            outputStream.write("\n".getBytes());
        }
        allProfit = allRevenue - allCost;
        buffer = "Итог: доходы " + allRevenue + ", расходы " + allCost + ", прибыль " + allProfit;
        outputStream.write(buffer.getBytes());
        outputStream.close();
    }
}
