package auto.manufacture;

import auto.components.Color;
import auto.components.Transmission;
import auto.exceptions.NoFreePlaceForCar;
import auto.models.Camry;
import auto.models.Dyna;
import auto.models.Hiance;
import auto.models.Solara;

public class Storage {
    private int carsCounter; // Счетчик количества машин на складе
    private final int carsLimit = 1000; // Максимальное число машин на каждом складе
    private final Camry[] camries;
    private final Dyna[] dynas;
    private final Hiance[] hiances;
    private final Solara[] solaras;

    public Storage() {
        carsCounter = 0;
        this.camries = new Camry[carsLimit];
        this.dynas = new Dyna[carsLimit];
        this.hiances = new Hiance[carsLimit];
        this.solaras = new Solara[carsLimit];
    }

    public void addCamry(Camry camry) throws NoFreePlaceForCar {
        checkFreePlace();
        for (int i = 0; i < camries.length; i++) {
            if (camries[i] == null) {
                camries[i] = camry;
                break;
            }
        }
        carsCounter++;
    }

    public void addDyna(Dyna dyna) throws NoFreePlaceForCar {
        checkFreePlace();
        for (int i = 0; i < dynas.length; i++) {
            if (dynas[i] == null) {
                dynas[i] = dyna;
                break;
            }
        }
        carsCounter++;
    }

    public void addHiance(Hiance hiance) throws NoFreePlaceForCar {
        checkFreePlace();
        for (int i = 0; i < hiances.length; i++) {
            if (hiances[i] == null) {
                hiances[i] = hiance;
                break;
            }
        }
        carsCounter++;
    }

    public void addSolara(Solara solara) throws NoFreePlaceForCar {
        checkFreePlace();
        for (int i = 0; i < solaras.length; i++) {
            if (solaras[i] == null) {
                solaras[i] = solara;
                break;
            }
        }
        carsCounter++;
    }

    private void checkFreePlace() throws NoFreePlaceForCar {
        if (carsCounter == carsLimit) {
            throw new NoFreePlaceForCar("Ошибка: на складе закончилось место");
        }
    }

    public void removeCamry(Color color, Transmission transmission) {
        for (int i = 0; i < camries.length; i++) {
            if (camries[i] != null) {
                if (camries[i].getColor().equals(color)
                        && camries[i].getTransmission().equals(transmission)) {
                    carsCounter--;
                    camries[i] = null;
                }
            }
        }
    }

    public void removeDyna(Color color, Transmission transmission) {
        for (int i = 0; i < dynas.length; i++) {
            if (dynas[i] != null) {
                if (dynas[i].getColor().equals(color)
                        && dynas[i].getTransmission().equals(transmission)) {
                    carsCounter--;
                    dynas[i] = null;
                }
            }
        }
    }

    public void removeHiance(Color color, Transmission transmission) {
        for (int i = 0; i < hiances.length; i++) {
            if (hiances[i] != null) {
                if (hiances[i].getColor().equals(color)
                        && hiances[i].getTransmission().equals(transmission)) {
                    carsCounter--;
                    hiances[i] = null;
                }
            }
        }
    }

    public void removeSolara(Color color, Transmission transmission) {
        for (int i = 0; i < solaras.length; i++) {
            if (solaras[i] != null) {
                if (solaras[i].getColor().equals(color)
                        && solaras[i].getTransmission().equals(transmission)) {
                    carsCounter--;
                    solaras[i] = null;
                }
            }
        }
    }

    public int camryQTY() {
        int carsQTY = 0;
        for (Camry camry : camries) {
            if (camry != null) {
                carsQTY++;
            }
        }
        return carsQTY;
    }

    public int dynaQTY() {
        int carsQTY = 0;
        for (Dyna dyna : dynas) {
            if (dyna != null) {
                carsQTY++;
            }
        }
        return carsQTY;
    }

    public int hianceQTY() {
        int carsQTY = 0;
        for (Hiance hiance : hiances) {
            if (hiance != null) {
                carsQTY++;
            }
        }
        return carsQTY;
    }

    public int solaraQTY() {
        int carsQTY = 0;
        for (Solara solara : solaras) {
            if (solara != null) {
                carsQTY++;
            }
        }
        return carsQTY;
    }

    public Camry findCamry() {
        for (Camry camry : camries) {
            if (camry != null) {
                removeCamry(camry.getColor(), camry.getTransmission());
                return camry;
            }
        }
        return null;
    }

    public Dyna findDyna() {
        for (Dyna dyna : dynas) {
            if (dyna != null) {
                removeDyna(dyna.getColor(), dyna.getTransmission());
                return dyna;
            }
        }
        return null;
    }

    public Hiance findHiance() {
        for (Hiance hiance : hiances) {
            if (hiance != null) {
                removeHiance(hiance.getColor(), hiance.getTransmission());
                return hiance;
            }
        }
        return null;
    }

    public Solara findSolara() {
        for (Solara solara : solaras) {
            if (solara != null) {
                removeSolara(solara.getColor(), solara.getTransmission());
                return solara;
            }
        }
        return null;
    }
}
