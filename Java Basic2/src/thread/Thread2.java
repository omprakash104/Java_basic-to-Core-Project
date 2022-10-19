package thread;

import company2.Human;

public class Thread2 extends Thread {

    public void show() {
        System.out.println("showing thread2 class");
    }

    public void run() {
        for(int i=0; i<5 ;i++) {
            System.out.println("showing thread2 class" + i);
        }
    }
}
