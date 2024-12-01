public class Exercise2 {

    public static int calcArithmeticMean(int a,int b ){
        return (a+b)/2;
    }
    public static double calcGeometricMean(int a, int b){
        return Math.sqrt(a*b);
    }
    public static void main(String[] args) {
        int a = 17;
        int b = 43;
        double ArithmeticMean =  calcArithmeticMean(a,b);
        double GeometricMean = calcGeometricMean(a,b);
        System.out.println(ArithmeticMean > GeometricMean);
    }

}
