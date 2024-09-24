package CH12;

public class Seller {
    private int money;
    private int count;
    private int price;

    public Seller(int money, int count, int price) {
        this.money = money;
        this.count = count;
        this.price = price;
    }


    public int receive(int money){
        this.money+=money;
        int returnCount = money/price;
        this.count -= returnCount;
        return returnCount;
    }
    @Override
    public String toString() {
        return "Seller[" + "money=" + money + ", count=" + count + ", price=" + price + ']';}

}
