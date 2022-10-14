package company2;

public abstract class Human {
    private int hand = 1;
    int leg;
    public static int eyes = 1;
    final int mouth = 2;
    final int bricks =3;

    public Human () {

    }
    public Human (int hand) {
        this.hand = hand;
    }

    static {
        eyes = 14;
    }

    public Human (int a, int b) {
        this.hand = a;
        this.leg = b;
    }

    public void showHumanHandCount(){
        System.out.println(this.hand);
    }
    public static void showEyesCount() {
        System.out.println("human eyes count" + eyes);
    }

    public static void changeEyesCount() {
        eyes = 75;
    }
    public void changeHandCount(int a) {
        this.hand = 75;
    }

    public void changeHandCount(int a, int b) {
        this.hand = a;
    }
    public void changeHandCount(int a, int b, int c) {
        this.hand = a;
    }

    public void changeLegCount(int a) {
        this.leg = a;
    }
}






