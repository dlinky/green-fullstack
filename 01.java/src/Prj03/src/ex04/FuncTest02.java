package ex04;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class FuncTest02 {
    // 전역 data
    // 입력 : 이름 전화 성별(1,2) 생년
    // 출력 : 이름 전화 성별 나이

    // 입력
    static String name;
    static String phone;
    static String man;
    static int bYear;

    // 출력
    static String gender;
    static int age;
    static void main() {
        input();
        process();
        output();
        System.out.println("End.....");
    }

    private static void input() {
        Scanner in = new Scanner(System.in);

        System.out.println("이름:");
        name = in.nextLine();
        System.out.println("전화(010-1111-1111):");
        phone = in.nextLine();
        System.out.println("성별(1=남자,2=여자):");
        man = in.nextLine();
        System.out.println("생년(2000):");
        bYear = in.nextInt();
    }

    private static void process() {
        if (man.equals("1")) gender = "남자";
        else gender = "여자";

        age = calcAge(bYear);
    }

    private static int calcAge(int bYear) {
        LocalDate now = LocalDate.now();
        int tYear = now.getYear();

        int result = tYear - bYear;
        return result;
    }

    private static void output() {
        System.out.println("이름  전화     성별     나이");
        System.out.printf("%s %s %s %d", name, phone, gender, age);
    }

}
