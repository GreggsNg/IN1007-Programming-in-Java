public class Main {
    public static void main(String[] args) {

        W7_Student s1 = new W7_Student();
        W7_Student s2 = new W7_Student();


        Film f = new Film("titanic", 1996, 2);

        System.out.println(f.getSoldTickets());

        f.sellTickets(4);

        System.out.println(f.getSoldTickets());


        s1.setStudid(1);
        s1.setStudentName("Jame");

        s2.setStudid(2);
        s2.setStudentName("Bob");


        System.out.println(s1.getStudentName());
        System.out.println(s2.getStudentName());

    }
}
