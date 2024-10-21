import java.util.Scanner;

public class Comparation_int {

    public static void main(String [] args) {

        int n1,n2,n3;
        Scanner er = new Scanner(System.in);
        System.out.println("first number " );
        n1 = er.nextInt();
        System.out.println("Second number " );
        n2 = er.nextInt();
        System.out.println("Third number " );
        n3 = er.nextInt();

        System.out.println(n1<n2 && n2<n3);




    }

}
