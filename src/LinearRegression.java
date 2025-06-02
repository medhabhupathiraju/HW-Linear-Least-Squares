// LinearRegression.java
public class LinearRegression {

    // Calculates the slope (m) using the least squares method.
    public static double calcM(double[][] data) {
        int n = data.length; // Number of data points
        double sumX = 0;
        double sumY = 0;
        double sumXY = 0;
        double sumX2 = 0;

        for (int i = 0; i < n; i++) {
            double x = data[i][0]; // Temperature
            double y = data[i][1]; // Sales

            sumX += x;
            sumY += y;
            sumXY += x * y;
            sumX2 += x * x;
        }

        // Least Squares Formula for slope (m)
        double numerator = (n * sumXY) - (sumX * sumY);
        double denominator = (n * sumX2) - (sumX * sumX);

        if (denominator == 0) {
            return Double.NaN; // Handle the case of a vertical line
        }

        return numerator / denominator;
    }

    // Calculates the y-intercept (b) using the least squares method.
    public static double calcB(double[][] data) {
        int n = data.length; // Number of data points
        double sumX = 0;
        double sumY = 0;

        for (int i = 0; i < n; i++) {
            double x = data[i][0]; // Temperature
            double y = data[i][1]; // Sales

            sumX += x;
            sumY += y;
        }

        double m = calcM(data); // Get the slope from the calcM method

        // Least Squares Formula for y-intercept (b)
        return (sumY / n) - (m * (sumX / n));
    }
}