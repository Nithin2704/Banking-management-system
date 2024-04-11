package bank;
import java.sql.*;
public class Connector {
    private Connection connection;
    public Statement statement;

    public Connector() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/banksystem", "root", "Nithin");
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public Connection getConnection() {
        return connection;
    }

    public Statement getStatement() {
        return statement;
    }

    public void close() {
        try {
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Connector connector = new Connector();
        try {
            ResultSet resultSet = connector.getStatement().executeQuery("SELECT * FROM some_table");
            while (resultSet.next()) {
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connector.close();
        }
    }
}
