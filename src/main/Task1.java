import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введи первое число:");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println("Введите второе число:");
        int b = scan.nextInt();
        int sum = a+b;
        System.out.println("Сума ваших чисел: " + sum + ".");
    }
}
