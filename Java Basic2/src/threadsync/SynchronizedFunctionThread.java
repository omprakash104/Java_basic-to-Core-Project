package threadsync;




class IncrementSynchronized {
    private int increValue=0;
    synchronized void printValue(int n) {
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

class Thread1Synchronized extends Thread {
    IncrementSynchronized incre;

    public Thread1Synchronized(IncrementSynchronized inc){
        this.incre = inc;
    }

    public void run () {
        incre.printValue(5);
    }
}

class Thread2Synchronized extends Thread {
    IncrementSynchronized incre;

    public Thread2Synchronized(IncrementSynchronized inc){
        this.incre = inc;
    }
    public void run () {
        incre.printValue(100);
    }
}

public class SynchronizedFunctionThread {

    public static void main(String args[]) {
        IncrementSynchronized singleObject = new IncrementSynchronized();
        Thread1Synchronized tr1 = new Thread1Synchronized(singleObject);
        Thread2Synchronized tr2 = new Thread2Synchronized(singleObject);

        IncrementSynchronized nextObject = new IncrementSynchronized();
        Thread2Synchronized nextObjectThread = new Thread2Synchronized(nextObject);

        tr1.start();
        tr2.start();
        nextObjectThread.start();
    }
}
