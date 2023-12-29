package auto;

public abstract class Car {
    private String color;
    private int maxSpeed;
    private String transmission;
    private boolean isDrive;
    private double price;
    private FuelTank fuelTank;
    private Engine engine;
    private Electric electric;
    private Lights lights;
    private Wheel[] wheels;

    public Car(String color, String transmission, int diameter) {
        this.color = color;
        this.transmission = transmission;
        this.isDrive = false;
        this.wheels = new Wheel[4];
        wheels[0] = new Wheel(diameter);
        wheels[1] = new Wheel(diameter);
        wheels[2] = new Wheel(diameter);
        wheels[3] = new Wheel(diameter);
        this.engine = new Engine();
        this.fuelTank = new FuelTank(1);
        this.electric = new Electric();
        this.lights = new Lights(true);
    }

    public void startDrive() throws StartCarException {
        if (wheels[0].isWork() && wheels[1].isWork() && wheels[2].isWork() && wheels[3].isWork()
                && fuelTank.getFuelQTY() > 0 && electric.isWork() && engine.isWork()) {
            isDrive = true;
            System.out.println("Машина едет");
        } else if (fuelTank.getFuelQTY() <= 0) {
            throw new StartCarException("Ошибка: пустой бензобак");
        } else if (!electric.isWork()) {
            throw new StartCarException("Ошибка: электрика неработоспособна");
        } else if (!engine.isWork()) {
            throw new StartCarException("Ошибка: двигатель неисправен");
        } else {
            throw new StartCarException("Ошибка: проколото колесо");
        }
    }

    public void stopDrive() {
        isDrive = false;
        System.out.println("Машина остановилась");
    }

    public void lightsOn() {
        lights.on();
        System.out.println("Фары включены");
    }

    public void lightsOff() {
        lights.off();
        System.out.println("Фары выключены");
    }

    public void getLights() {
        System.out.println("Состояние фар:" + lights);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Wheel[] getWheels() {
        return wheels;
    }
}
