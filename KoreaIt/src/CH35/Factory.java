package CH35;

public class Factory extends Building implements ICanFly {

    AddOn addOn;
    Factory(){

    }
    void setAddOn(AddOn addOn){
        this.addOn=addOn;
    }

    @Override
    public void buildStructure() {

    }

    @Override
    public void underAttack(Unit unit) {

    }

    @Override
    public void move() {

    }

    @Override
    public void lend() {

    }

    @Override
    public void fly() {

    }
}
