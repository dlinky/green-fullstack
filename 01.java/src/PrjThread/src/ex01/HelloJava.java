package ex01;

public class HelloJava {
    static void main(String[] args) {
        // 싱글스레드
        System.out.println("안녕하세요!");

        // 스레드 호출
        NumThread nt = new NumThread();
        TextThread tt = new TextThread();
        nt.start();
        tt.start();
    }
}
