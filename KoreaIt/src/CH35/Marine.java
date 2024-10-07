package CH35;

public class Marine extends Unit{
    int damageVal;
    private Gun myGun;

    Marine() {
        myGun = new Gun();
        this.hp = 200;
    }

    public void setMyGun(Gun gun) {
        this.myGun=gun;
    }

    @Override
    void move() {

    }

    @Override
    void underAttack(int damage) {

    }

    void attack(Unit unit) {
    }

    private record Gun() {
    }
}
