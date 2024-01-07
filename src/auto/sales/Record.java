package auto.sales;

public class Record {
    private final String nameManager;
    private final String modelCar;
    private final double priceSale;
    private final double priceCost;

    public Record(String nameManager, String modelCar, double priceSale, double priceCost) {
        this.nameManager = nameManager;
        this.modelCar = modelCar;
        this.priceSale = priceSale;
        this.priceCost = priceCost;
    }

    public String getNameManager() {
        return nameManager;
    }

    public String getModelCar() {
        return modelCar;
    }

    public double getPriceSale() {
        return priceSale;
    }

    public double getPriceCost() {
        return priceCost;
    }
}

