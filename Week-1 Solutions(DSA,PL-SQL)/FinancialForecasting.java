public class FinancialForecasting {

    public static double calculateFutureValue(double presentValue, double growthRate, int periods) {
        if (periods == 0) {
            return presentValue;
        }
        return calculateFutureValue(presentValue * (1 + growthRate), growthRate, periods - 1);
    }

    public static void main(String[] args) {
        double initialValue = 5000;
        double rate = 0.08;
        int years = 5;

        System.out.println("=== Financial Forecasting Tool ===");
        System.out.println("Initial Investment: $" + initialValue);
        System.out.println("Annual Growth Rate: " + (rate * 100) + "%");
        System.out.println("Forecast Period: " + years + " years");
        System.out.println("");

        double forecast = calculateFutureValue(initialValue, rate, years);
        System.out.println("Predicted Future Value: $" + String.format("%.2f", forecast));

        System.out.println("");
        System.out.println("=== Understanding Recursion ===");
        System.out.println("Recursion is a technique where a method calls itself");
        System.out.println("to solve a problem by breaking it into smaller sub-problems.");
        System.out.println("Here, we calculate future value by repeatedly applying");
        System.out.println("growth rate for each year until we reach period 0.");

        System.out.println("");
        System.out.println("=== Time Complexity Analysis ===");
        System.out.println("Time Complexity: O(n) - where n is the number of periods");
        System.out.println("The algorithm makes one recursive call per period");
        System.out.println("Space Complexity: O(n) - due to recursive call stack");

        System.out.println("");
        System.out.println("=== Optimization Techniques ===");
        System.out.println("1. Use Iterative Approach:");
        System.out.println("   for(int i=0; i<periods; i++) {");
        System.out.println("       presentValue *= (1 + growthRate);");
        System.out.println("   }");
        System.out.println("   This reduces space complexity to O(1)");
        System.out.println("");
        System.out.println("2. Use Mathematical Formula:");
        System.out.println("   FV = PV * (1 + r)^n");
        System.out.println("   This gives O(1) time complexity");
        System.out.println("");
        System.out.println("3. Use Memoization:");
        System.out.println("   Store intermediate results to avoid recalculation");
    }
}