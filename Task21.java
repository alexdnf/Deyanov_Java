import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {

      
        int a = 4;
        int b = 7;

        // Сравнение чисел
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        // Арифметические операции

        int sum = a + b;
        System.out.println("Summ: " + sum);
        int difference = a - b;
        System.out.println("Raznost': " + difference);
        int multiplication = a * b;
        System.out.println("Proizvedenie: " + multiplication);

        if (b != 0) {
            double division = (double) a / b;
            System.out.printf("Delenie: %.2f%n", division);
        } else {
            System.out.println("No No No");
        }
}
}
