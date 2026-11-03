package ex01;

public class ArrayTest01 {
    static void main() {
        String[] ives = new String[] {"이서", "가을", "안유진", "장원영", "리즈", "레이"};
        for (int i=0; i<ives.length; i++) {
            System.out.println(ives[i]);
        }
        System.out.println(ives[6]);
    }
}
