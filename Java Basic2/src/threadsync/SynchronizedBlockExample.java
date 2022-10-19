package threadsync;


class IncrementSynchronizedBlock {
    private int increValue=0;
    void printValue(int n) {
        synchronized (this) {
            for(int i=0;i<5;i++){
//            System.out.println(n*i);
                System.out.println(increValue++);
                try {
                    Thread.sleep(400);
                }catch(InterruptedException ex ) {

                }
            }
        }
    }
}

class Thread1SynchronizedBlock extends Thread {
    IncrementSynchronizedBlock incre;

    public Thread1SynchronizedBlock(IncrementSynchronizedBlock inc){
        this.incre = inc;
    }

    public void run () {
        incre.printValue(5);
    }
}

class Thread2SynchronizedBlock extends Thread {
    IncrementSynchronizedBlock incre;

    public Thread2SynchronizedBlock(IncrementSynchronizedBlock inc){
        this.incre = inc;
    }
    public void run () {
        incre.printValue(100);
    }
}

public class SynchronizedBlockExample {

    public static void main(String args[]) {
        IncrementSynchronizedBlock singleObject = new IncrementSynchronizedBlock();
        Thread1SynchronizedBlock tr1 = new Thread1SynchronizedBlock(singleObject);
        Thread2SynchronizedBlock tr2 = new Thread2SynchronizedBlock(singleObject);

        tr1.start();
        tr2.start();
    }
}