package ex01;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;

public class DbSelectTest {
    static void main() {
        String sql = "SELECT id, name, grade, level_no, exp, element FROM monsters";
        List<Monster> monsters = new ArrayList<>();

        try (Connection connection = DbConfig.getConnection();
             // prepareStatement() : 미리 컴파일해서 실행준비상태로 놔둠.
             PreparedStatement statement = connection.prepareStatement(sql);
             // executeQuery() : 실행하라고 요청
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) { // resultSet은 커서 방식이라 next로 한 행씩 이동함.
                Monster monster = new Monster(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("grade"),
                        resultSet.getInt("level_no"),
                        resultSet.getInt("exp"),
                        resultSet.getString("element")
                );
                monsters.add(monster);

                System.out.println(monster.getName());
            }
        } catch (Exception e) {
            System.out.println("오류 내용 : " + e.getMessage());
        }
    }
}
