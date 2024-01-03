package auto.sales;

import auto.types.Car;

public class Cashier {
    static double revenueSummary;

    public Cashier() {
    }

    public void addRevenue(Car car) {
        revenueSummary = revenueSummary + car.getPrice();
    }

    public double getRevenueSummary() {
        return revenueSummary;
    }
}
