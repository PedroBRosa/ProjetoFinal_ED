package infra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    static final String host = "jdbc:postgresql://localhost:3030/supermercado";
    static final String user = "admin";
    static final String password = "admin";

    private ConnectionFactory(){}

    public static Connection getConnection(){
        try {
            return DriverManager.getConnection(host,user,password);
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}
