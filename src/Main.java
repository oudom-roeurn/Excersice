import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int Num = scanner.nextInt();
        int[] numbers = new int[Num];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < Num; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Input numbers:");
        for (int i = 0; i < Num; i++) {
            System.out.print(numbers[i]);
        }
        scanner.close();
    }
}