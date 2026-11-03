package oper02;

public class Arithmatic01 {
    static void main() {
        int n1 = 3+4*2;
        System.out.println(n1);
        System.out.println( 7 / 2    );
        System.out.println( 7 / 2.0  );
        System.out.println( 0 == 0.0 );

        int n2 = 0/3;
        System.out.println(n2);

        try {
            int n3 = 3 / 0;
            System.out.println(n3);
        } catch (ArithmeticException e) {
            System.out.println("계산 예외발생: "+e);
        } catch (Exception e) {
            System.out.println("예외발생: "+e);
        } finally {
            System.out.println("예외상관없이 출력");
        }
        System.out.println("완료");
    }
}
