package auto.sales;

public enum Price {
    CAMRY ("camry", 10000, 11000),
    SOLARA ("solara",12000, 13000),
    HIANCE ("hiance", 15000, 16000),
    DYNA ("dyna", 22000, 23000);

    private String model;
    private final double priceFromStorage;
    private final double priceFromProduction;

    Price(String model, double priceCurrent, double priceFromProduction) {
        this.model = model;
        this.priceFromStorage = priceCurrent;
        this.priceFromProduction = priceFromProduction;
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
}
