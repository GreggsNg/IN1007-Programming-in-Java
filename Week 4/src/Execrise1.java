import java.util.Scanner;
public class Execrise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();



        if (num1 > num2) {
            System.out.println("greater");
        } else {
            System.out.println("smaller or equal");
        }
    }

}
