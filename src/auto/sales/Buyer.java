package auto.sales;

import auto.types.Car;

public class Buyer {
    private double money;
    private Car car;

    public Buyer(double money) {
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
        money = money - car.getPrice();
    }
}
