import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {

        System.out.println("enter palindrome  ");
        String input = new Scanner(System.in).nextLine();
        int length = input.length();


        boolean isPalindrome = true;
        for (int i=0; i <length/2; i++){
            if (input.charAt(i) != input.charAt(length-i-1)){
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome ? "is palindrome" : "not palindrome");

    }


}
