package auto.types;

public class Cabriolet extends PassengerCar {
    private boolean isRoof;

    public Cabriolet(int diameter) {
        super(diameter);
    }

    public void roofUp() {
        isRoof = true;
        System.out.println("Крыша поднята");
    }

    public void roofDown() {
        isRoof = false;
        System.out.println("Крыша опущена");
    }
}
