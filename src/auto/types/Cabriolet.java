package auto.types;

import auto.components.Roof;

public class Cabriolet extends PassengerCar {
    private Roof roof;

    public Cabriolet() {
        super();
    }

    public void setRoof(Roof roof) {
        this.roof = roof;
        roof.setInstalled(true);
    }

    public String upRoof() {
        if (!roof.isUp()) {
            roof.setUp(true);
            return "Крыша поднята";
        } else {
            return "Крыша уже поднята";
        }
    }


    public String downRoof() {
        if (roof.isUp())
        {
            roof.setUp(false);
            return "Крыша опущена";
        } else {
            return "Крыша уже опущена";
        }
    }
}
