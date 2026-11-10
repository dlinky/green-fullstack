package ex01;

// NumberWorker 클래스 정의 : 숫자를 5번 출력
class NumberWorker extends Thread {
    @Override
    public void run() {
        for (int i=0; i<5; i++) {
            System.out.println(i);
        }
    }
}

// BeepWorker 클래스 정의 : 숫자를 5번 출력
class BeepWorker extends Thread {
    @Override
    public void run() {
        for (int i=0; i<5; i++) {
            System.out.println("Beep");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("숫자 작업 중단");
                return;
            }
        }
    }
}

public class twoWorkerDemo {
    static void main() {
        // 1. NumberWorker 객체 생성
        // 2. 처리흐름 시작
        NumberWorker nw = new NumberWorker();
        BeepWorker bw = new BeepWorker();
        nw.start();
        bw.start();
    }
}
