package auto.models;

import auto.components.PowerSocket;
import auto.types.Wagon;

public class Dyna extends Wagon {
    private PowerSocket powerSocket;

    public Dyna() {
        super();
    }

    public void setPowerSocket(PowerSocket powerSocket) {
        this.powerSocket = powerSocket;
        powerSocket.setInstalled(true);
    }

    @Override
    public void enablePower() {
        if (!powerSocket.isWork()) {
            powerSocket.setWork(true);
            System.out.println("Зарядка включена");
        } else {
            System.out.println("Зарядка уже включена");
        }
    }

    @Override
    public void disablePower() {
        if (powerSocket.isWork()) {
            powerSocket.setWork(false);
            System.out.println("Зарядка выключена");
        } else {
            System.out.println("Зарядка уже выключена");
        }
    }

    @Override
    public void enableCruiseControl() {
    }

    @Override
    public void disableCruiseControl() {
    }

    @Override
    public void upRoof() {
    }

    @Override
    public void downRoof() {
    }

    @Override
    public void enableMusic() {
    }

    @Override
    public void disableMusic() {
    }

    @Override
    public void enableFridge() {
    }

    @Override
    public void disableFridge() {
    }
}
