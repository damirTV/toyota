package auto.manufacture;

import auto.components.Color;
import auto.components.Transmission;
import auto.models.Camry;
import auto.models.Dyna;
import auto.models.Hiance;
import auto.models.Solara;

public class Storage {
    private int carsCounter; // Счетчик количества машин на складе
    private final int CARS_LIMIT = 1000; // Максимальное число машин на каждом складе
    private Camry[] camries;
    private Dyna[] dynas;
    private Hiance[] hiances;
    private Solara[] solaras;
    private Country country;

    public Storage(Country country) {
        this.country = country;
        carsCounter = 0;
        this.camries = new Camry[CARS_LIMIT];
        this.dynas = new Dyna[CARS_LIMIT];
        this.hiances = new Hiance[CARS_LIMIT];
        this.solaras = new Solara[CARS_LIMIT];
    }

    public void addCamry(Camry camry) {
        if (carsCounter == CARS_LIMIT ) {
            System.out.println("На складе закончилось место"); // TODO - реализовать через exception
        } else {
            for (int i = 0; i < camries.length; i++) {
                if (camries[i] == null) {
                    camries[i] = camry;
                    break;
                }
            }
            carsCounter++;
        }
    }

    public void addDyna(Dyna dyna) {
        if (carsCounter == CARS_LIMIT ) {
            System.out.println("На складе закончилось место"); // TODO - реализовать через exception
        } else {
            for (int i = 0; i < dynas.length; i++) {
                if (dynas[i] == null) {
                    dynas[i] = dyna;
                    break;
                }
            }
            carsCounter++;
        }
    }

    public void addHiance(Hiance hiance) {
        if (carsCounter == CARS_LIMIT ) {
            System.out.println("На складе закончилось место"); // TODO - реализовать через exception
        } else {
            for (int i = 0; i < hiances.length; i++) {
                if (hiances[i] == null) {
                    hiances[i] = hiance;
                    break;
                }
            }
            carsCounter++;
        }
    }

    public void addSolara(Solara solara) {
        if (carsCounter == CARS_LIMIT ) {
            System.out.println("На складе закончилось место"); // TODO - реализовать через exception
        } else {
            for (int i = 0; i < solaras.length; i++) {
                if (solaras[i] == null) {
                    solaras[i] = solara;
                    break;
                }
            }
            carsCounter++;
        }
    }

    public Camry removeCamry(Color color, Transmission transmission) {
        for (int i = 0; i < camries.length; i++) {
            if (camries[i] != null) {
                if (camries[i].getColor().equals(color) && camries[i].getTransmission().equals(transmission)) {
                    carsCounter--;
                    Camry camryClone = camries[i];
                    camries[i] = null;
                    return camryClone;
                }
            }
        }
        return null;
    }

    public Dyna removeDyna(Color color, Transmission transmission) {
        for (int i = 0; i < dynas.length; i++) {
            if (dynas[i] != null) {
                if (dynas[i].getColor().equals(color) && dynas[i].getTransmission().equals(transmission)) {
                    carsCounter--;
                    Dyna dynaClone = dynas[i];
                    dynas[i] = null;
                    return dynaClone;
                }
            }
        }
        return null;
    }

    public Hiance removeHiance(Color color, Transmission transmission) {
        for (int i = 0; i < hiances.length; i++) {
            if (hiances[i] != null) {
                if (hiances[i].getColor().equals(color) && hiances[i].getTransmission().equals(transmission)) {
                    carsCounter--;
                    Hiance hianceClone = hiances[i];
                    hiances[i] = null;
                    return hianceClone;
                }
            }
        }
        return null;
    }

    public Solara removeSolara(Color color, Transmission transmission) {
        for (int i = 0; i < solaras.length; i++) {
            if (solaras[i] != null) {
                if (solaras[i].getColor().equals(color) && solaras[i].getTransmission().equals(transmission)) {
                    carsCounter--;
                    Solara solaraClone = solaras[i];
                    solaras[i] = null;
                    return solaraClone;
                }
            }
        }
        return null;
    }

    public int camryQTY() {
        int carsQTY = 0;
        for (int i = 0; i < camries.length;i++) {
            if (camries[i] != null) {
                carsQTY++;
            }
        }
        return carsQTY;
    }

    public int dynaQTY() {
        int carsQTY = 0;
        for (int i = 0; i < dynas.length;i++) {
            if (dynas[i] != null) {
                carsQTY++;
            }
        }
        return carsQTY;
    }

    public int hianceQTY() {
        int carsQTY = 0;
        for (int i = 0; i < hiances.length;i++) {
            if (hiances[i] != null) {
                carsQTY++;
            }
        }
        return carsQTY;
    }

    public int solaraQTY() {
        int carsQTY = 0;
        for (int i = 0; i < solaras.length;i++) {
            if (solaras[i] != null) {
                carsQTY++;
            }
        }
        return carsQTY;
    }
}
