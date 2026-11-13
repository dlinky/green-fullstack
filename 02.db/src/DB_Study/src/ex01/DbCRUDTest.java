package ex01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbCRUDTest {
    static void main() {
        int id = 0; // 테스트용 케이스 id

        // CREATE = INSERT
        String sql = """
                INSERT INTO monsters (name, grade, level_no, exp, element)
                VALUES (?, ?, ?, ?, ?)
                """;

        try (Connection connection = DbConfig.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            statement.setString(1, "꼬마유령");
            statement.setString(2, "희귀");
            statement.setInt(3, 15);
            statement.setInt(4, 900);
            statement.setString(5, "어둠");

            int result = statement.executeUpdate();
            try (ResultSet rs = statement.getGeneratedKeys()) {
                if (rs.next()) id = rs.getInt(1);
            }
            System.out.println(result + "건이 등록되었습니다. id = "+id);
        } catch (Exception e) {
            System.out.println("오류 내용 : " + e.getMessage());
        }

        // READ = SELECT
        sql = "SELECT * FROM monsters WHERE id = ?";
        try (Connection connection = DbConfig.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    Monster monster = new Monster(
                            resultSet.getInt("id"),
                            resultSet.getString("name"),
                            resultSet.getString("grade"),
                            resultSet.getInt("level_no"),
                            resultSet.getInt("exp"),
                            resultSet.getString("element")
                    );
                    System.out.println("방금 만든 몬스터의 정보를 조회합니다.\n"+monster.getInfo());
                }
            }
        } catch (Exception e) {
            System.out.println("오류 내용 : " + e.getMessage());
        }

        // UPDATE
        sql = "UPDATE monsters SET level_no = ? WHERE id = ?";

        try (Connection connection = DbConfig.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, 12);
            statement.setInt(2, id);
            int result = statement.executeUpdate();
            System.out.println(result + "건이 수정되었습니다.");
        } catch (Exception e) {
            System.out.println("오류 내용 : " + e.getMessage());
        }

        // DELETE
        sql = "DELETE FROM monsters WHERE id = ?";
        try (Connection connection = DbConfig.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            int result = statement.executeUpdate();
            System.out.println(result + "건이 삭제되었습니다.");
        } catch (Exception e) {
            System.out.println("오류 내용 : " + e.getMessage());
        }


    }
}
