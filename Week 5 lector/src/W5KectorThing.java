import java.util.Scanner;
public class W5KectorThing {


    public static int factorial(int Last){
        int beg = 1;
        while(Last > 0) {
            beg = beg * Last;
            Last--;

        }
        return beg;
    }
    public static void main(String[] args) {

        //Scanner in = new Scanner(System.in);
        //System.out.println("tell me a number  an i will factorial the number to factorial of 8  ");
        //int Last = in.nextInt();
        int Last = 5;
        int result = factorial(Last);
        System.out.println("The factorial of " + Last + " is " + result);

    }

//    public static ForLooped (int ForNumber){
//            for (int i = 1; i <= Last; i++) {
//            beg = beg * i;
//            System.out.println(beg);
//
//        }
//        return ForNumber;
//    }
}


