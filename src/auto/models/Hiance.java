package auto.models;

import auto.components.Wheel;
import auto.types.Wagon;

public class Hiance extends Wagon {
    private Wheel spareWheel;
    public Hiance() {
        super(20);
        this.spareWheel = new Wheel(20);
    }
}
