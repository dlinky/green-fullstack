package ex01;

public class ArrayTest04 {
    static void main() {
        String[] bts = {"RM","제이홉","정국","지민","진","슈가","뷔" };

        helloBts(bts);
    }

    private static void helloBts(String[] bts) {
        for (int i=0; i<bts.length; i++) {
            System.out.println(bts[i]);
        }
    }
}
