import java.util.Scanner;
public class Age {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" what is your current age ?  ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("Your age is over/equal to 18 ");
        } else{
            System.out.println("Your age is below 18 ");
        }



    }

}
