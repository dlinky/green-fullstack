package ex01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DbSelectWhereTest {
    static void main() {
        String sql = "SELECT * FROM monsters WHERE grade = ?";
        List<Monster> monsters = new ArrayList<>();

        try (Connection connection = DbConfig.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
                 statement.setString(1, "희귀");

                 try (ResultSet resultSet = statement.executeQuery()){
                    while (resultSet.next()) {
                        System.out.println(resultSet.getString("name"));
                    }
                 }
        } catch (Exception e) {
            System.out.println("오류 내용 : " + e.getMessage());
        }
    }
}
