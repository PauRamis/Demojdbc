import java.sql.*;

public class Main {
    private static String DB_USERNAME = "root";
    private static String DB_PASSWORD = "root";
    private static String DB_HOST = "localhost";
    private static String DB_DBNAME = "localhost";

    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://"+DB_HOST+"/"+DB_DBNAME,DB_USERNAME, DB_PASSWORD
        );

        String sql = "insert into test (text) values ('prova')";
        Statement statement = con.createStatement();
        statement.execute(sql);
        statement.close();
        con.close();
    }
}