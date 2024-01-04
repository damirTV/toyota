import auto.exceptions.CountyFactoryNotEqualException;
import auto.sales.Office;
import java.io.IOException;

public class Runner {
    public static void main(String[] args) {
        try {
            double[] buyers = new double[] {10000, 12000, 15000, 22000, 11000, 13000, 8000, 30000};
            Office office = new Office();
            office.workingDay(buyers);
        } catch (CountyFactoryNotEqualException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}