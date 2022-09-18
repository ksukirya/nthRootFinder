import java.text.DecimalFormat;

public class rootFinderMethods {
    public static void main(String[] args) {
        String result1 = squareRootFinder(41, 5);
        System.out.println("The result of squareRootFinder method is: " + result1);
        String result2 = nthRootFinder(41, 3, 3);
        System.out.println("The result of nthRootFinder method is: " + result2);
    }

    public static String squareRootFinder(int number, int iterations) {
        int i = 0;
        double start = 0.0;
        double end = number;
        double mid = (start + end) / 2;
        while (i < iterations) {
            mid = (start + end) / 2;
            if (mid * mid < number){
                start = mid;
            } else
            {
                end = mid;
            }
            i++;
        }
        DecimalFormat fivepointaccuracy;
        //Decimal Format function is used from the Decimal Format class to format the number to 5 decimal places
        fivepointaccuracy = new DecimalFormat("#0.00000");
        return fivepointaccuracy.format(mid);
    }

    public static String nthRootFinder(int number, int iterations, int n) {
        int i = 0;
        double start = 0.0, end = number, mid = (start + end) / 2;/* initializing variables with values */
        while (i < iterations) {
            mid = (start + end) / 2;
            double temp = mid;
            for (int j = 1; j < n; j++)// loop for finding nth power of the number
            {
                temp = temp * mid;
            }
            if (temp < number) {
                start = mid;
            } else {
                end = mid;
            }
            i++;
        }
        DecimalFormat fivepointaccuracy;
        fivepointaccuracy = new DecimalFormat("#0.00000");/* Format for accuracy upto 5 decimal places */
        return fivepointaccuracy.format(mid);
    }

}