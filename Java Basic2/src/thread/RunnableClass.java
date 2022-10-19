package thread;

public class RunnableClass{

    public static void main(String arg[]) {
        RunnableThread1 rr1 = new RunnableThread1();
        RunnableThread2 rr2 = new RunnableThread2();

        Thread tt1 = new Thread(rr1);
        Thread tt2 = new Thread(rr2);

        tt1.start();
        tt2.start();

    }
}
