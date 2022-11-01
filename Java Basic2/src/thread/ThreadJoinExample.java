package thread;

public class ThreadJoinExample implements Runnable{

    @Override
    public void run () {
        for(int i =0; i<5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }


    public static void main(String arg[]) {
        ThreadJoinExample tr1 = new ThreadJoinExample();
        ThreadJoinExample tr2 = new ThreadJoinExample();
        ThreadJoinExample tr3 = new ThreadJoinExample();

        Thread t1 = new Thread(tr1);
        Thread t2 = new Thread(tr2);
        Thread t3 = new Thread(tr3);

        t1.start();

        try {
            t1.join();

        }catch (InterruptedException ex) {

        }
        t2.start();
        t2.interrupt();
        t3.start();
    }
}
