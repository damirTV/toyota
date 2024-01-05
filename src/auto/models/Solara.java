package auto.models;

import auto.components.Fridge;
import auto.types.Cabriolet;

public class Solara extends Cabriolet {
    private Fridge fridge;

    public Solara () {
        super();
    }

    public void setFridge(Fridge fridge) {
        this.fridge = fridge;
        fridge.setInstalled(true);
    }


    public String enableFridge() {
        if (!fridge.isWork()) {
            fridge.setWork(true);
            return "Охлаждение включено";
        } else {
            return "Охлаждение уже включено";
        }
    }


    public String disableFridge() {
        if (fridge.isWork())
        {
            fridge.setWork(false);
            return "Охлаждение выключено";
        } else {
            return "Охлаждение уже выключено";
        }
    }
}
