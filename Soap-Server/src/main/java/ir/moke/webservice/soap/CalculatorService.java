package ir.moke.webservice.soap;

/**
 * Created by Mahdi Sheikh Hosseini on 9/28/16.
 */
public class CalculatorService {
    public CalculatorService() {
        System.out.println("Run Calculator Service");
    }

    public int sum(int... numbers) {
        int result = 0;
        for (int i : numbers) {
            result += i;
        }
        return result;
    }

    public int minus(int... numbers) {
        int result = 0;
        for (int i : numbers) {
            result -= i;
        }
        return result;
    }
}
