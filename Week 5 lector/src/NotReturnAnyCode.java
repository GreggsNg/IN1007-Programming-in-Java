public class NotReturnAnyCode {

    public static void doSomething(int value) {
        int runningSum = 0;
        for(int i=value; i>0; i--){
            runningSum += i;
        }
        System.out.println(runningSum);
    }
    public static void main(String[] args) {
        doSomething(5);
    }
}
