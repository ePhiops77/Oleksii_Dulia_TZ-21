package Lab3;

public class Task3 {

    public static void main(String[] args) {
        // Приклади виклику з різними значеннями ε
        printResults(0.1);    // Коректне значення
        printResults(0.0001);      // Коректне значення
        printResults(-0.1);      // Негативне ε - має викликати виняток
        printResults(0.0);       // Нульове ε - має викликати виняток
    }


    public static double calculateInfiniteSum(double epsilon) {
        if (epsilon <= 0) {
            throw new IllegalArgumentException("ε має бути додатнім");
        }

        double sum = 0.0;
        int i = 1;
        while (true) {
            double term = (Math.pow(-1, i + 1) * i) / ((i + 1) * (i + 2));
            if (Math.abs(term) < epsilon) {
                break;
            }
            sum += term;
            i++;
        }
        return sum;
    }


    static void printResults(double epsilon) {
        System.out.print("ε: " + epsilon + " результат: ");
        try {
            System.out.println(calculateInfiniteSum(epsilon));
        } catch (IllegalArgumentException e) {
            System.out.println("ПОМИЛКА! " + e.getMessage());
        }
    }
}

