package company2;

public class ConstructorChainingSuperClass extends Human{
    int hand = 15;

    public ConstructorChainingSuperClass (int a) {
        super(14, a);
    }

    public void getHandCount() {
        super.showHumanHandCount();
    }
}
