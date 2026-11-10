package ex02;

import java.awt.*;

class BeepTask implements Runnable {
    @Override
    public void run() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        for (var i=0; i<3; i++) {
            System.out.println("삑");
            toolkit.beep();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                System.out.println("소리 중단");
                return;
            }
        }
    }
}

class NumberTask implements Runnable {
    @Override
    public void run() {
        for (var i=0; i<10; i++) {
            System.out.println(i);
        }
    }
}

class BeepTaskThread {
    static void main() {
        Runnable task1 = new BeepTask();
        Thread thread1 = new Thread(task1);
        Runnable task2 = new NumberTask();
        Thread thread2 = new Thread(task2);
        thread1.start();
        thread2.start();
    }
}



public class ShowTask {
}
