package auto.models;

import auto.components.Wheel;
import auto.types.Wagon;

public class Hiance extends Wagon {
    private Wheel spareWheel;

    public Hiance() {
        super();
    }

    public void setSpareWheel(Wheel spareWheel) {
        this.spareWheel = spareWheel;
        spareWheel.setInstalled(true);
    }
}
