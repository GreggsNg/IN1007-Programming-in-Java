import java.util.Scanner;
public class Exercise2 {
    public static void main (String[]args){
        Scanner gg = new Scanner(System.in);
        System.out.println("enter a number and i will calculate the total num ");

        int n  = gg.nextInt();
        int Sum = 0;

        for ( int i= 0; i <= n; i++){
            Sum += i;

        }
        System.out.println(" the total sum " + Sum);
    }
}
