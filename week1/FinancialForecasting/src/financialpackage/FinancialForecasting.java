package financialpackage;

public class FinancialForecasting {

    // Recursive method to calculate future value
    public static double calculateFutureValue(double initialValue, double growthRate, int periods) {
        // Base case: no more periods left, return the initial value
        if (periods == 0) {
            return initialValue;
        }
        // Recursive case: calculate the future value for the next period
        return calculateFutureValue(initialValue * (1 + growthRate), growthRate, periods - 1);
    }

    public static void main(String[] args) {
        double initialValue = 1000.0; // Starting amount
        double growthRate = 0.05;     // 5% growth rate
        int periods = 10;             // Forecast for 10 periods

        double futureValue = calculateFutureValue(initialValue, growthRate, periods);
        System.out.printf("Future Value after %d periods: %.2f%n", periods, futureValue);
    }
}
