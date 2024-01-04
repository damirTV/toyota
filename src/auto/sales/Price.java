package auto.sales;

public enum Price {
    CAMRY ("Camry",10000, 11000, 5000),
    SOLARA ("Solara",12000, 13000, 8000),
    HIANCE ( "Hiance",15000, 16000, 10000),
    DYNA ( "Dyna",22000, 23000, 12000),
    NULL ("Null",0,0, 0);

    private final double priceFromStorage;
    private final double priceFromProduction;
    private final String model;
    private final double priceCost;

    Price(String model, double priceFromStorage, double priceFromProduction, double priceCost) {
        this.priceFromStorage = priceFromStorage;
        this.priceFromProduction = priceFromProduction;
        this.model = model;
        this.priceCost = priceCost;
    }

    public double getPriceFromStorage() {
        return priceFromStorage;
    }

    public double getPriceFromProduction() {
        return priceFromProduction;
    }

    public String getModel() {
        return model;
    }

    public double getPriceCost() {
        return priceCost;
    }
}
