import java.util.Scanner;

public class DEAR_TA {
    public static void main(String[] args) {

        Scanner ty = new Scanner(System.in);
        System.out.println("what is your TA name: ");
        String TA = ty.nextLine();
        System.out.println("What is your name ");
        String yourName = ty.nextLine();
        System.out.println("Dear "+ TA + ",\n" + "I enjoy your tutorials, they are awesome" +"\n" + yourName+ ".");

    }
}
