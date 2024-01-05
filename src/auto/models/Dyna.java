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

    public String enablePower() {
        if (!powerSocket.isWork()) {
            powerSocket.setWork(true);
            return "Зарядка включена";
        } else {
            return "Зарядка уже включена";
        }
    }


    public String disablePower() {
        if (powerSocket.isWork())
        {
            powerSocket.setWork(false);
            return "Зарядка выключена";
        } else {
            return "Зарядка уже выключена";
        }
    }
}
