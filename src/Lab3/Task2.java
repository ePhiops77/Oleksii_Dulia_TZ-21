package Lab3;

public class Task2 {

    public static void main(String[] args) {
        printResults(1, 1);
        printResults(1, 2);
        printResults(2, 3);
        printResults(3, 4);
        printResults(10, 5);
        printResults(10, 6);
        printResults(-1, 3);   // Негативне t - має викликати виняток
        printResults(0, 2);    // Нульове t - має викликати виняток
    }

    // Метод для обчислення значення функції
    public static double calculateFunction(int t, int l) {
        if (t <= 0 || l <= 0) {  // Перевірка на коректність значень t і l
            throw new IllegalArgumentException("Невірні параметри: t = " + t + ", l = " + l);
        }

        double sum = 0.0;  // Ініціалізація змінної для суми
        for (int i = 1; i <= t; i++) {
            if (l % 2 != 0) {  // Непарні значення l
                sum += Math.sqrt(t * i) / l;
            } else {  // Парні значення l
                sum += (double) l / Math.sqrt(t);
            }
        }
        return sum;  // Повернення результату
    }

    // Метод для виведення результату роботи calculateFunction
    static void printResults(int t, int l) {
        System.out.print("t: " + t + " l: " + l + " результат: ");
        try {
            // Спроба обчислити та вивести результат
            System.out.println(calculateFunction(t, l));
        } catch (IllegalArgumentException e) {
            // Обробка виключення у разі некоректних значень
            System.out.println("ПОМИЛКА! " + e.getMessage());
        }
    }
}
