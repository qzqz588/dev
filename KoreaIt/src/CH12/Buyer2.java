package CH12;

public class Buyer2 {
    private int money;
    private int count;

    public Buyer2(int money, int count) {
        this.money = money;
        this.count = count;
    }
    public void payment(Seller2 master,int money){
        this.money -= money;
        int receiveCoke = master.recevie(money);
        this.count += receiveCoke;
    }

    @Override
    public String toString() {
        return "Buyer2{" + "money=" + money + ", count=" + count + '}';}
}

