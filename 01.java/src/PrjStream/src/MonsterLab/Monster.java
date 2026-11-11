package MonsterLab;

public class Monster {
    // Field : private으로 생성해서 외부 접근 차단
    private String name;
    private String grade;
    private int level;
    private int exp;
    private String element;

    // Constructor
    public Monster(String name, String grade, int level, int exp, String element) {
        this.name = name;
        this.grade = grade;
        this.level = level;
        this.exp = exp;
        this.element = element;
    }

    // Getter
    public String getName() {return name;}
    public String getGrade() {return grade;}
    public int getLevel() {return level;}
    public int getExp() {return exp;}
    public String getElement() {return element;}

    public String getInfo() {
        return "%s | %s | %d | %d | %s".formatted(name, grade, level, exp, element);
    }
}
