package company2;

public class Human {
    int hand;
    int leg;
    static int eyes = 1;
    final int mouth = 2;

    public Human () {

    }

    public Human (int a, int b) {
        this.hand = a;
        this.leg = b;
    }

    public void showHumanHandCount() {
        System.out.println(this.hand);
    }
    public static void increaseEyesCount () {
        eyes++;
    }
    public void changeHandCount(int a) {
        this.hand = a;
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






