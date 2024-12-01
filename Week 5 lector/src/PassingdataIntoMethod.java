public class PassingdataIntoMethod {


    public static int factorial(int Last){
        int beg = 1;
        while(Last > 0) {
            beg = beg * Last;
            Last--;

        }
        return beg;
    }
    public static int Factorial(int[] result){
        int fact = 1;
        while(result[0] > 0){
            fact = fact * result[0];
            result[0] --;
        }
        // result = new int[] {1,2,3,4};
        return fact;
    }
    public static void main(String[] args) {
        int[] result = {5,10,20};
        //int result = factorial(numbers);
        System.out.println("factorial of " + result[0] + "is: " + Factorial(result));
    }
}
