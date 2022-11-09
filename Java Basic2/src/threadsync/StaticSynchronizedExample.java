package threadsync;

class IncrementSynchronizedBlockStatic {
    private static int increValue=0;
    synchronized static void printValue(int n) {
            for(int i=0;i<5;i++){
            System.out.println(n*i);
//                System.out.println(increValue++);
                try {
                    Thread.sleep(400);
                }catch(InterruptedException ex ) {

                }
            }
    }
}


class Thread1Static extends Thread {

    public void run () {
        IncrementSynchronizedBlockStatic.printValue(5);
    }
}

class Thread2Static extends Thread {

    public void run () {
        IncrementSynchronizedBlockStatic.printValue(10);
    }
}

class Thread3Static extends Thread {

    public void run () {
        IncrementSynchronizedBlockStatic.printValue(50);
    }
}

class Thread4Static extends Thread {

    public void run () {
        IncrementSynchronizedBlockStatic.printValue(100);
    }
}


public class StaticSynchronizedExample {

    public static void main(String args[]) {
        Thread1Static st1 = new Thread1Static();
        Thread2Static st2 = new Thread2Static();
        Thread3Static st3 = new Thread3Static();
        Thread4Static st4 = new Thread4Static();

        st1.start();
        st2.start();
        st3.start();
        st4.start();
    }


}
