public class Main {
    public static void main(String[] args) {
        ChristmasGift g1 = new ChristmasGift("Socks", "Ann", 11);
        ChristmasGift g2 = new ChristmasGift("Hat", "bob", 15);
        ChristmasGift g3 = new ChristmasGift("gloves", "Ali", 17);

        MyChristmasList xmasList = new MyChristmasList();
        xmasList.addGift(g1);
        xmasList.addGift(g2);
        xmasList.addGift(g3);
    }

    public static void printRecients(MyChristmasList myChristmasList) {
        for(ChristmasGift gift : myChristmasList.getMyList()){
            System.out.println(gift.getRecipient());

        }
    }

    public static ChristmasGift getmostExpensive(MyChristmasList myChristmasList) {
        if (myChristmasList.getMyList().isEmpty()) {
            return null;
        }
        ChristmasGift mostExpensive = myChristmasList.getMyList().get(0);
        for (int i = 1; i < myChristmasList.getMyList().size(); i++) {
            if (myChristmasList.getMyList().get(i).getprice() > mostExpensive.getprice()){
                mostExpensive = myChristmasList.getMyList().get(i);
            }
        }
    }
}
