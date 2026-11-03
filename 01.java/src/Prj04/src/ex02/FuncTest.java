package ex02;

import java.util.Scanner;
/*
입력
번호 이름 국어 영어 수학
num, name, kor, eng, mat
1,안유진,90,80,70
2,카리나,100,90,90
3,장원영,100,100,100
4,닝닝,79,80,0
출력
번호 이름    총점 평균
num, name,   tot, avg
3    장원영  300  100
*/
public class FuncTest {
    // Field 전역변수
    // 입력
    private static int num;
    private static String name;
    private static int kor;
    private static int eng;
    private static int mat;

    // 출력
    private static int tot;
    private static double avg;

    // Methods
    // main
    static void main() {
        input();
        process();
        output();
        System.out.println("end ....");
    }

    private static void input() {
        // 키보드 준비
        Scanner in = new Scanner(System.in);
        System.out.println("번호,이름,국어,영어,수학");
        String line = in.nextLine();
        String[] li = line.split(",");
        num = Integer.parseInt(li[0].trim());
        name = li[1].trim();
        kor = Integer.parseInt(li[2].trim());
        eng = Integer.parseInt(li[3].trim());
        mat = Integer.parseInt(li[4].trim());
    }

    private static void process() {
        // 총점
        tot = kor + eng + mat;
        avg = (int) (tot * 100 + 0.5) / 100.0;
    }

    private static void output() {
        System.out.println("번호 이름 총점 평균");
        System.out.printf("%s %s %d %10.3f", num, name, tot, avg);
    }
}
