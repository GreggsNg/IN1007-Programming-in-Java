public class Exercise4 {

    public static int product (int n){
        if (n ==0){
            return 0;
        }
        else if (n < 0){
            return -1;
        }
        else if (n==1 ) {
            return 1;
        }else{
            return n*product(n-1);
        }

    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(product(n));

    }
}
