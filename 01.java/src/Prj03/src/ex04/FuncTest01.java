package ex04;

public class FuncTest01 {
    static int num;
    static String name;
    static boolean man;
    static String gender;
    static void main() {
        input();
        process();
        output();
    }

    private static void input() {
        num = 1;
        name = "미나미";
        man = false;
    }

    private static void process() {
        if(man) gender = "남자";
        else gender = "여자";
    }

    private static void output() {
        System.out.println(num);
        System.out.println(name);
        System.out.println(gender);
    }
}
