package company3;

public class StaticClass {

    public static int eyes = 1;


    static {
        eyes = 14;
    }

    public static void showEyesCount() {
        System.out.println("human eyes count" + eyes);
    }

}
