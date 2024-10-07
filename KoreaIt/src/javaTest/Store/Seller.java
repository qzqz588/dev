package javaTest.Store;

public class Seller {
    private int money;
    private int count;
    private int price;

    public Seller(int money,int count,int price) {
        this.money = money;
        this.count = count;
        this.price = price;
    }

    public int recevie(int money){
        this.money += money;
        int returnCount = money/price;
        this.count -= returnCount;
        return returnCount;
    }

    @Override
    public String toString() {
        return "Seller2{" + "money=" + money + ", count=" + count + ", price=" + price + '}';}
}

