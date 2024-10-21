import java.util.Scanner;

public class MyName {
    public static void main(String[] args) {

        int CurYear, BirthYear;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String Name = sc.nextLine();
        System.out.print("Your current year: ");
        CurYear = sc.nextInt();
        System.out.print("Your birthday year: ");
        BirthYear = sc.nextInt();


        int u = CurYear - BirthYear;

        System.out.println("Your current age is: " + u );
    }
}
