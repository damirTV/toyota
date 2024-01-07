package auto.types;

import auto.components.Roof;

/**
 * Создается абстрактный класс Cabriolet, т.к. нельзя создать машину "кабриолет",
 * всегда создается только конкретная модель кабриолета
 */
public abstract class Cabriolet extends PassengerCar {
    private Roof roof;

    public Cabriolet() {
        super();
    }

    public void setRoof(Roof roof) {
        this.roof = roof;
        roof.setInstalled(true);
    }

    @Override
    public void upRoof() {
        if (!roof.isUp()) {
            roof.setUp(true);
            System.out.println("Крыша поднята");
        } else {
            System.out.println("Крыша уже поднята");
        }
    }

    @Override
    public void downRoof() {
        if (roof.isUp()) {
            roof.setUp(false);
            System.out.println("Крыша опущена");
        } else {
            System.out.println("Крыша уже опущена");
        }
    }
}
