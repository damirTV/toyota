package auto.sales;

public class Record {
    private String nameManager;
    private String modelCar;
    private double priceSale;
    private double priceCost;
    private double profit;

    public Record(String nameManager, String modelCar, double priceSale, double priceCost) {
        this.nameManager = nameManager;
        this.modelCar = modelCar;
        this.priceSale = priceSale;
        this.priceCost = priceCost;
        this.profit = priceSale - priceCost;
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

    public double getProfit() {
        return profit;
    }
}

