package ex05;

import java.util.List;
import java.util.Scanner;

/** CH05: 이전 단계의 기능을 유지하면서 새 기능을 더한 프로그램입니다. */
public class MonsterLabApp {
    private static final Scanner scanner = new Scanner(System.in);

    // 모든 몬스터는 Monster 클래스의 설계도로 만들어집니다.
    private static final List<Monster> monsters = List.of(
            new Monster("슬라임", "일반", 3, 100, "물"),
            new Monster("불꽃이", "희귀", 8, 350, "불"),
            new Monster("버섯돌이", "일반", 5, 180, "풀"),
            new Monster("꼬마드래곤", "전설", 20, 1500, "불"),
            new Monster("얼음토끼", "희귀", 12, 700, "얼음"),
            new Monster("돌멩이", "일반", 2, 80, "땅")
    );

    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("       🐻 나만의 몬스터 연구소 CH05");
        System.out.println("========================================");
        System.out.println("처음이셔도 괜찮습니다. 메뉴를 하나씩 선택해 보세요.");

        boolean running = true;
        while (running) {
            printMenu();
            System.out.print("메뉴 번호를 입력해 주세요: ");
            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    showMonsterList();
                    break;
                case "2":
                    showMonsterClassGuide();
                    break;
                case "3":
                    showStreamList();
                    break;
                case "4":
                    showStrongMonsters();
                    break;
                case "5":
                    showRareMonsters();
                    break;
                case "6":
                    showNameLabels();
                    break;
                case "7":
                    showSortedNames();
                    break;
                case "0":
                    running = false;
                    System.out.println("연구소를 종료합니다. 오늘도 수고하셨습니다!");
                    break;
                default:
                    System.out.println("메뉴 번호를 다시 확인해 주세요.");
            }

            if (running) {
                System.out.println();
                System.out.print("메뉴로 돌아가려면 Enter를 눌러 주세요...");
                scanner.nextLine();
            }
        }
        scanner.close();
    }

    private static void printMenu() {
        System.out.println("\n--------------- 연구소 메뉴 ---------------");
        System.out.println("1. 몬스터 도감 보기");
        System.out.println("2. 몬스터 클래스 알아보기");
        System.out.println("3. 몬스터 한 마리씩 관찰하기");
        System.out.println("4. 강한 몬스터 찾기");
        System.out.println("5. 희귀 몬스터 찾기");
        System.out.println("6. 몬스터 이름표 만들기");
        System.out.println("7. 이름순 도감 보기");
        System.out.println("0. 연구소 종료");
        System.out.println("------------------------------------------");
    }

    private static void showMonsterList() {
        System.out.println("\n[전체 몬스터 도감]");
        // Stream을 시작하고 forEach로 몬스터를 한 마리씩 출력합니다.
        monsters.stream()
                .forEach(monster -> System.out.println(monster.getInfo()));
        System.out.println("현재 몬스터는 " + monsters.size() + "마리입니다.");
    }
    private static void showMonsterClassGuide() {
        System.out.println("\n[Monster 클래스 알아보기]");
        System.out.println("Monster는 몬스터 한 마리를 만들기 위한 설계도입니다.");
        System.out.println("필드: name(이름), grade(등급), level(레벨), exp(경험치), element(속성)");
        System.out.println("생성자: new Monster(이름, 등급, 레벨, 경험치, 속성)");
        System.out.println("Getter: getName(), getGrade(), getLevel(), getExp(), getElement()");
        System.out.println("\n[설계도로 만든 객체 예시]");
        System.out.println(monsters.get(0).getInfo());
        System.out.println("\n추가로 체력, 공격력, 방어력, 특수 기술을 넣어 확장할 수 있습니다.");
    }
    private static void showStreamList() {
        System.out.println("\n[Stream으로 몬스터 관찰]");
        monsters.stream()
                .forEach(monster -> System.out.println(monster.getName()));
    }
    private static void showStrongMonsters() {
        System.out.println("\n[레벨 10 이상 몬스터]");
        monsters.stream()
                .filter(monster -> monster.getLevel() >= 10)
                .forEach(monster -> System.out.println(monster.getName()));
    }

    private static void showRareMonsters() {
        System.out.println("\n[희귀 몬스터]");
        monsters.stream()
                .filter(monster -> monster.getGrade().equals("희귀"))
                .forEach(monster -> System.out.println(monster.getName()));
    }
    private static void showNameLabels() {
        System.out.println("\n[몬스터 이름표]");
        monsters.stream()
                .map(monster -> "몬스터: " + monster.getName())
                .forEach(label -> System.out.println(label));
    }
    private static void showSortedNames() {
        System.out.println("\n[이름순 도감]");
        monsters.stream()
                .map(monster -> monster.getName())
                .sorted()
                .forEach(name -> System.out.println(name));
    }
}
