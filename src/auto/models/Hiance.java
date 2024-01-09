package auto.models;

import auto.components.Wheel;
import auto.types.Wagon;

public class Hiance extends Wagon {

    public Hiance() {
        super();
    }

    public void setSpareWheel(Wheel spareWheel) {
        spareWheel.setWork(true);
    }

    @Override
    public void enablePower() {
    }

    @Override
    public void disablePower() {
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
