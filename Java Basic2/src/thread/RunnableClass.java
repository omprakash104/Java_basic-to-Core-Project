package thread;

public class RunnableClass{

    public static void main(String arg[]) {
        RunnableThread1 rr1 = new RunnableThread1();
        RunnableThread2 rr2 = new RunnableThread2();

        // anonymous class use
        Thread tt1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello");

            }}
        );

        Runnable r2434 = () ->
        {
            System.out.println("hello");
        };

        // lambda use
        Thread tt12 = new Thread(r2434);

        Thread tt2 = new Thread(rr2);

        tt1.start();
        tt2.start();
        tt12.start();

    }
}
