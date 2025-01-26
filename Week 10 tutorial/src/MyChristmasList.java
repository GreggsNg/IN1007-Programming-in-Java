import java.util.ArrayList;

public class MyChristmasList {

    private ArrayList<ChristmasGift> myList;

    public MyChristmasList(){
        myList = new ArrayList<>();
    }

    public void addGift(ChristmasGift gift){
        this.myList.add(gift);
    }
    public ArrayList<ChristmasGift> getMyList() {
        return myList;
    }
    public void setMylist(ArrayList<ChristmasGift> myList){
        this.myList = myList;
    }
}
