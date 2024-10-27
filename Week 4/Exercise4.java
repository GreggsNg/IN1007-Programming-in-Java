import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validMonth = false;

        while (!validMonth) {
            System.out.print("Enter the name of the month: ");
            String month = scanner.nextLine().toUpperCase();

            switch (month) {
                case "JANUARY":
                    System.out.println("1");
                    validMonth = true;
                    break;
                case "FEBRUARY":
                    System.out.println("2");
                    validMonth = true;
                    break;
                case "MARCH":
                    System.out.println("3");
                    validMonth = true;
                    break;
                case "APRIL":
                    System.out.println("4");
                    validMonth = true;
                    break;
                case "MAY":
                    System.out.println("5");
                    validMonth = true;
                    break;
                case "JUNE":
                    System.out.println("6");
                    validMonth = true;
                    break;
                case "JULY":
                    System.out.println("7");
                    validMonth = true;
                    break;
                case "AUGUST":
                    System.out.println("8");
                    validMonth = true;
                    break;
                case "SEPTEMBER":
                    System.out.println("9");
                    validMonth = true;
                    break;
                case "OCTOBER":
                    System.out.println("10");
                    validMonth = true;
                    break;
                case "NOVEMBER":
                    System.out.println("11");
                    validMonth = true;
                    break;
                case "DECEMBER":
                    System.out.println("12");
                    validMonth = true;
                    break;
                default:
                    System.out.println("Invalid month name. Please try again.");
            }
        }

        scanner.close();
    }
}
