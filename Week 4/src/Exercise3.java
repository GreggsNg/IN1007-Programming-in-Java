import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        do {
            System.out.print("Enter an integer: ");
            num = scanner.nextInt();
        } while (num >= 0);

        System.out.println("You entered a negative number, program terminated.");


    }
}
