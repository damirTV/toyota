package auto.models;

import auto.components.Usb;
import auto.types.PassengerCar;

public class Camry extends PassengerCar {
    private Usb usb;

    public Camry() {
        super();
    }

    public void setUsb(Usb usb) {
        this.usb = usb;
        usb.setInstalled(true);
    }


    public String enableMusic() {
        if (!usb.isWork()) {
            usb.setWork(true);
            return "Музыка включена";
        } else {
            return "Порт уже используется";
        }
    }


    public String disableMusic() {
        if (usb.isWork())
        {
            usb.setWork(false);
            return "Музыка выключена";
        } else {
            return "Порт не используется";
        }
    }
}
