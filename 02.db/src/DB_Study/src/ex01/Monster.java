package ex01;

public class Monster {
    private int id;
    private String name;
    private String grade;
    private int level;
    private int exp;
    private String element;

    public Monster(int id, String name, String grade, int level, int exp, String element) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.level = level;
        this.exp = exp;
        this.element = element;
    }

    public int getId() {return id;}
    public String getName() {return name;}
    public String getGrade() {return grade;}
    public int getLevel() {return level;}
    public int getExp() {return exp;}
    public String getElement() {return element;}

    public String getInfo() {
        return "Monster{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                ", level=" + level +
                ", exp=" + exp +
                ", element='" + element + '\'' +
                '}';
    }
}
