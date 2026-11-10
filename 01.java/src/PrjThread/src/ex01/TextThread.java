package ex01;

class TextThread extends Thread {
    public void run() {
        for (int i=0; i<5; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
