import auto.exceptions.CountyFactoryNotEqualException;
import auto.sales.Office;

public class Runner {
    public static void main(String[] args) {
        try {
            double[] buyers = new double[] {10000, 12000, 15000, 22000, 11000, 13000, 8000, 30000};
            Office office = new Office();
            System.out.println(office.workingDay(buyers));
        } catch (CountyFactoryNotEqualException e) {
            System.out.println(e.getMessage());
        }
    }
}