package company2;


public class Male extends Human {
    int daurasurwal;

    public final void changeDauraSurwalCount (int b) {
        this.daurasurwal = b;
    }

    @Override
    public void changeHandCount(int a) {
        System.out.println("hand count in child class");
    }
}
