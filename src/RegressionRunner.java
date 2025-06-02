// RegressionRunner.java
public class RegressionRunner {

    public static void main(String[] args) {
        // Ice cream sales data (Temperature, Sales)
        double[][] iceCreamData = {
                {14.2, 215},
                {16.4, 325},
                {11.9, 185},
                {15.2, 332},
                {18.5, 406},
                {22.1, 522},
                {19.4, 412},
                {25.1, 614},
                {23.4, 544},
                {18.1, 421},
                {22.6, 445},
                {17.2, 408}
        };

        // Calculate the slope (m) and y-intercept (b)
        double slope = LinearRegression.calcM(iceCreamData);
        double yIntercept = LinearRegression.calcB(iceCreamData);

        // Print the results to the console
        System.out.println("Slope (m): " + slope);
        System.out.println("Y-intercept (b): " + yIntercept);
        System.out.println("Linear Equation: y = " + slope + "x + " + yIntercept);
    }
}