public class Exercise3 {
    public static void main(String[] args) {
        int n =5;
        System.out.println(sumtoN(n));

    }
    public static int sumtoN(int n ){
        if (n<=0){
            return 0;
        }else {
            return  n-1;
        }

    }
}
