package auto.models;

import auto.components.Fridge;
import auto.types.Cabriolet;

public class Solara extends Cabriolet {
    private Fridge fridge;

    public Solara() {
        super();
    }

    public void setFridge(Fridge fridge) {
        this.fridge = fridge;
        fridge.setInstalled(true);
    }

    public void enableFridge() {
        if (!fridge.isWork()) {
            fridge.setWork(true);
            System.out.println("Охлаждение включено");
        } else {
            System.out.println("Охлаждение уже включено");
        }
    }

    public void disableFridge() {
        if (fridge.isWork()) {
            fridge.setWork(false);
            System.out.println("Охлаждение выключено");
        } else {
            System.out.println("Охлаждение уже выключено");
        }
    }

    @Override
    public void enablePower() {
    }

    @Override
    public void disablePower() {
    }

    @Override
    public void enableMusic() {
    }

    @Override
    public void disableMusic() {
    }
}
