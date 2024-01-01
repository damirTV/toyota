package auto.models;

import auto.types.Wagon;

public class Dyna extends Wagon {
    private boolean powerSocket;

    public Dyna() {
        super(20);
        this.powerSocket = true;
    }
}
