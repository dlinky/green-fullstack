package MonsterLab;
import java.util.*;

public class MonsterLabDbApp {
    public static Scanner scanner = new Scanner(System.in);
    static final String MENU = """
                ==========================
                     몬스터 연구소 v2.0
                ==========================
                1. 모든 도감 보기
                2. 몬스터 클래스 설명
                0. 종료
                
                원하는 메뉴를 선택하세요 :
                """;

    static void main() {
        boolean running = true;
        while (running) {

            String choice = showMenu();

            switch (choice) {
                case "1": showAllMonsters(); break;
                case "2": showMonsterClassGuide(); break;
                case "0": running = false; System.out.println("연구소를 종료합니다."); return;
                default: System.out.println("메뉴 번호를 확인해 주세요."); continue;
            }

            System.out.println("메뉴로 돌아가려면 Enter를 입력하세요.");
            scanner.nextLine();
        }

    }
    static String showMenu() {
        System.out.print(MENU);
        return scanner.nextLine().trim();
    }

    static void clearConsole() {System.out.println("\n".repeat(80));}
    static void showAllMonsters() {
        clearConsole();
        System.out.println("""
                [모든 도감 보기]
                """);
    }
    static void showMonsterClassGuide() {
        clearConsole();
        System.out.println("""
                [몬스터 클래스 설명]
                """);
    }
}
