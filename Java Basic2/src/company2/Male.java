package company2;


public class Male extends Human {
    int daurasurwal;

    public Male() {
        super(14);
        leg = 123;
    }

    public Male(int a) {

    }
    public final void changeDauraSurwalCount (int b) {

        this.daurasurwal = b;
    }

//    @Override
//    public void showHumanHandCount() {
//        super.showHumanHandCount();
//    }


//    @Override
//    public void changeHandCount(int a) {
//        System.out.println("hand count in child class");
//    }
}
