public class Buyer {
    private Shop shopToGo;
    private int[] articlesToBuy;

    //Constructor
    public Buyer(Shop shopToGo, int[] articlesToBuy) {
        this.shopToGo = shopToGo;
        this.articlesToBuy = articlesToBuy;
    }

    //Getters and Setters
    public Shop getShopToGo() {
        return shopToGo;
    }

    public int[] getArticlesToBuy() {
        return articlesToBuy;
    }

}
