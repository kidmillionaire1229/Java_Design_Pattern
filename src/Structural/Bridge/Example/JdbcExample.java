package Structural.Bridge.Example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * [Abstraction] - JDBC
 * DB 벤더와 상관 없이 쿼리를 요청하고 결과를 받을 수 있다.
 *
 * [Implementation] - H2 driver 클래스
 * 실제 DB에 대한 구체적인 구현은 org.h2.Driver에 있음
 */
public class JdbcExample {
    public static void main(String[] args) throws ClassNotFoundException {

        //Driver 클래스 로드
        Class.forName("org.h2.Driver");
        try (Connection conn = DriverManager.getConnection("jdbc:h2:mem:~/test", "sa","")){
            String sql = "CREATE TABLE ACCOUNT " +
                    "(id INTEGER not NULL, " +
                    " email VARCHAR(255), " +
                    " password VARCHAR(255), " +
                    " PRIMARY KEY ( id ))";
            Statement statement = conn.createStatement();
            statement.execute(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
