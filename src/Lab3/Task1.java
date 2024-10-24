package Lab3;

public class Task1 {

    public static void main(String[] args) {
        printResults(2.0, 10);   // Коректні значення
        printResults(2.0, 14);   // Максимальне значення k
        printResults(2.0, 15);   // k більше 15 - має викликати виняток
        printResults(-1.0, 10);  // Негативне z - має викликати виняток
        printResults(0.0, 5);    // Нульове z - має викликати виняток
        printResults(2.0, 0);    // Нульове k - має викликати виняток
    }


    public static double calculateSeriesSum(double z, int k) {
        if (k <= 0 || k >= 15) {
            throw new IllegalArgumentException("k має бути в діапазоні 1 ≤ k < 15");
        }
        if (z <= 0) {
            throw new IllegalArgumentException("z має бути додатнім");
        }

        double sum = 0.0;
        for (int i = 1; i <= k; i++) {
            sum += (1 / Math.sqrt(z * i)) + Math.tan((double) k / i);
        }
        return sum;
    }


    static void printResults(double z, int k) {
        System.out.print("z: " + z + " k: " + k + " результат: ");
        try {
            System.out.println(calculateSeriesSum(z, k));
        } catch (IllegalArgumentException e) {
            System.out.println("ПОМИЛКА! " + e.getMessage());
        }
    }
}
