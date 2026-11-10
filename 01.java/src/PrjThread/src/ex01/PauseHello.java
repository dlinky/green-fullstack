package ex01;

public class PauseHello {
    public static void main(String[] args) throws InterruptedException {
        System.out.print("안녕하세요!\n");
        Thread.sleep(500);
        System.out.println("다시 만났어요");
    }
}
