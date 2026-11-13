package ex01;

import java.sql.Connection;

public class DbConnectionTest {
    static void main() {
        try (Connection connection = DbConfig.getConnection()){
            System.out.println("연결 성공");
            System.out.println("연결된 DB : " + connection.getCatalog());
        } catch (Exception e) {
            System.out.println("MySQL 연결 실패");
            System.out.println("오류 내용 : " + e.getMessage());
        }
    }
}
