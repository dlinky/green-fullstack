package MonsterLab;
import java.util.*;

public class MonsterLabApp {
    public static final Scanner scanner = new Scanner(System.in);

    // 몬스터 목록
    private static final List<Monster> monsters = List.of(
            new MonsterLab.Monster("슬라임", "일반", 3, 100, "물"),
            new MonsterLab.Monster("불꽃이", "희귀", 8, 350, "불"),
            new MonsterLab.Monster("버섯돌이", "일반", 5, 180, "풀"),
            new MonsterLab.Monster("꼬마드래곤", "전설", 20, 1500, "불"),
            new MonsterLab.Monster("얼음토끼", "희귀", 12, 700, "얼음"),
            new MonsterLab.Monster("돌멩이", "일반", 2, 80, "땅")
    );

    static void main() {
        System.out.println("""
                ========================================
                       🐻 나만의 몬스터 연구소 CH06
                ========================================
                """);

        boolean running = true;
        while (running) {
            printMenu();
            System.out.print("메뉴 번호를 입력해 주세요: ");
            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    clearConsole();
                    showMonsterList();
                    break;
                case "2":
                    clearConsole();
                    showMonsterClassGuide();
                    break;
                case "3":
                    clearConsole();
                    showStreamList();
                    break;
                case "4":
                    clearConsole();
                    showStrongMonsters();
                    break;
                case "5":
                    clearConsole();
                    showRareMonsters();
                    break;
                case "6":
                    clearConsole();
                    showNameLabels();
                    break;
                case "7":
                    showSortedNames();
                    break;
                case "8":
                    showStatistics();
                    break;
                case "0":
                    running = false;
                    System.out.println("연구소를 종료합니다.");
                    break;
                default:
                    System.out.println("메뉴 번호를 다시 확인해 주세요.");
            }

            if (running) {
                System.out.print("\n메뉴로 돌아가려면 Enter를 눌러 주세요.");
                scanner.nextLine();
                clearConsole();
            }
        }
        scanner.close();
    }

    private static void showMonsterClassGuide() {
        System.out.println("""
                
                [Monster 클래스 알아보기]
                Monster는 몬스터 한 마리를 만들기 위한 설계도입니다.
                필드 : name, grade, level, exp, element
                생성자 : new Monster(이름, 등급, 레벨, 경험치, 속성
                Getter : getName(), getGrade(), getLevel(), getExp(), getElement()
                
                [설계도로 만든 객체 예시]
                이름 | 등급 | 레벨 | 경험치 | 속성
                ------------------------------""");
        System.out.println(monsters.getFirst().getInfo());
        System.out.println("\n추가로 체력, 공격력, 방어력, 특수 기술을 넣어 확장할 수 있습니다.");
    }

    private static void showMonsterList() {
        System.out.println("""
                
                [전체 몬스터 도감]
                이름 | 등급 | 레벨 | 경험치 | 속성
                ------------------------------""");
        for (Monster monster : monsters) {
            System.out.println(monster.getInfo());
        }
        System.out.printf("총 %d마리\n", monsters.size());
    }

    private static void printMenu() {
        System.out.println("""
                --------------- 연구소 메뉴 ---------------
                1. 몬스터 도감 보기
                2. 몬스터 클래스 알아보기
                3. 몬스터 한 마리씩 관찰하기
                4. 강한 몬스터 찾기
                5. 희귀 몬스터 찾기
                6. 몬스터 이름표 만들기
                7. 이름순 도감 보기
                8. 연구 통계 보기
                0. 연구소 종료
                ------------------------------------------""");
    }

    private static void clearConsole() {
        for (int i=0; i<80; i++) {
            System.out.println();
        }
    }

    private static void showStreamList() {
        System.out.println("\n[Stream으로 몬스터 관찰]");
        monsters.stream().forEach(monster -> System.out.println(monster.getName()));
    }

    private static void showStrongMonsters() {
        System.out.println("\n[레벨 10 이상 몬스터]");
        monsters.stream().filter(monster -> monster.getLevel()>=10).forEach(monster -> System.out.println(monster.getName()));
    }

    private static void showRareMonsters() {
        System.out.println("\n[희귀 몬스터]");
        monsters.stream().filter(monster -> monster.getGrade().equals("희귀")).forEach(monster -> System.out.println(monster.getName()));
    }

    private static void showNameLabels() {
        System.out.println("\n[몬스터 이름표]");
        monsters.stream().map(monster -> "몬스터: "+monster.getName()).forEach(label -> System.out.println(label));
    }

    private static void showSortedNames() {
        System.out.println("\n[이름순 도감]");
        monsters.stream().map(monster -> monster.getName())
                .sorted().forEach(name -> System.out.println(name));
    }

    private static void showStatistics() {
        long totalCount = monsters.stream().count();
        long rareCount = monsters.stream().filter(monster -> monster.getGrade().equals("희귀")).count();
        int totalExp = monsters.stream().mapToInt(monster -> monster.getExp()).sum();

        System.out.printf("""
                
                [연구 통계]
                전체 몬스터 : %d마리
                희귀 몬스터 : %d마리
                총 경험치 : %d
                """, totalCount, rareCount, totalExp);
    }
}
