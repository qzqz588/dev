package CH13;
class SharpPencil{
    private int width;
    private int amount;
    public int getAmount(){return amount;}
    public void setAmount(int amount){this.amount=amount;}
}

class Ballpen extends SharpPencil{
    private String color;
    public String getColor(){return color;}
    public void setColor(String color) {this.color=color;}
}

class FountainPen extends Ballpen{
    public void refill(int n){
        setAmount(n);}
}

public class EX1 {
    public static void main(String[] args) {

    }
}
