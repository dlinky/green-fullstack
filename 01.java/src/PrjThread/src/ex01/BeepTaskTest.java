package ex01;

import java.awt.*;

public class BeepTaskTest {
    public static void main() throws InterruptedException {
        for(int i=0; i<5; i++){
            System.out.println("탕");
        }
        Thread.sleep(500);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for(int i=0; i<5; i++){
            toolkit.beep();
            Thread.sleep(100);
        }
    }
}
