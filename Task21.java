import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();

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
        System.out.println("Сумма чисел: " + sum);
        int difference = a - b;
        System.out.println("Разность чисел: " + difference);
        int multiplication = a * b;
        System.out.println("Произведение чисел: " + multiplication);

        if (b != 0) {
            double division = (double) a / b;
            System.out.printf("Деление чисел: %.2f%n", division);
        } else {
            System.out.println("Делить на ноль нельзя");
        }
}
}
