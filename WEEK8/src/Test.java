public class Test {
    public static void main(String[] args) {
        Singer singer = new Singer("Greg",18);

        if (singer.isAdult()){
            System.out.println("Adult");
        } else{
            System.out.println("Child");
        }
    System.out.println(singer.getName());

    }
}
