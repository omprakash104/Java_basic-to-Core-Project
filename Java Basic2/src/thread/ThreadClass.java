package thread;

public class ThreadClass {
    public static void main(String arg[]) {
        Thread1 tt1 = new Thread1();
        Thread2 tt2 = new Thread2();

        tt1.start();

        tt2.start();

        tt2.show();
    }
}
