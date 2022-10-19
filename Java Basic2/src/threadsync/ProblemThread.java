package threadsync;

class Increment {
    private int increValue=0;
    void printValue(int n) {
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

class Thread1 extends Thread {
    Increment incre;

    public Thread1(Increment inc){
        this.incre = inc;
    }

    public void run () {
        incre.printValue(5);
    }
}

class Thread2 extends Thread {
    Increment incre;

    public Thread2(Increment inc){
        this.incre = inc;
    }
    public void run () {
        incre.printValue(100);
    }
}


public class ProblemThread {

    public static void main(String args[]) {
        Increment singleObject = new Increment();
        Thread1 tr1 = new Thread1(singleObject);
        Thread2 tr2 = new Thread2(singleObject);

        tr1.start();
        tr2.start();
    }
}
