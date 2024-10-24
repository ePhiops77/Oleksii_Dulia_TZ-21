package Lab1;

public class Main {
    // Завдання 1
    public static Double taskOne(double a, double b, double c, double d) {
        return Math.pow(4 * Math.sinh(Math.sqrt(Math.abs(a / b))) + 3 * Math.asin(c), d);
    }

    // Завдання 2
    public static Double taskTwo(double a, double b, double c, double d) {
        return (5 * c / Math.cos(a)) + Math.sqrt(Math.sinh(Math.abs(b) * c) / Math.tan(d)); // Модуль b
    }

    // Завдання 3
    public static Double taskThree(double a, double b, double c, double d) {
        return (Math.cos(b) + Math.sin(Math.sqrt(a))) / (2 * Math.log10(c) + Math.exp(d));
    }

    public static void main(String[] args) {
        // Виведення результату першого завдання
        System.out.println("Task 1 result:");
        System.out.println(taskOne(1.23, -0.34, 0.707, 2.312));

        // Виведення результату другого завдання
        System.out.println("Task 2 result:");
        System.out.println(taskTwo(-3.45, -2.34, 1.45, 0.83));

        // Виведення результату третього завдання
        System.out.println("Task 3 result:");
        System.out.println(taskThree(0.345, -2.25, 2.65, 3.99));
    }
}
