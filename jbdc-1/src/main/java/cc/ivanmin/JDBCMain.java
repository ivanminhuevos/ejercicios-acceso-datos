package cc.ivanmin;

import java.sql.*;

public class JDBCMain {
    private static <T extends AutoCloseable> void dispose(T o) {
        try {
            if (o != null) {
                o.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println("Hola!!!");

        Connection conn = null;
        Statement statement = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306", "root", "root");
            statement = conn.createStatement();
            statement.executeUpdate("DROP DATABASE IF EXISTS bank;");
            statement.executeUpdate("CREATE DATABASE bank;");
            statement.executeUpdate("USE bank;");
            statement.executeUpdate("""
            CREATE TABLE cuentas (
            id INT AUTO_INCREMENT NOT NULL,
            codigo VARCHAR(45),
            saldo INT,
            
            CONSTRAINT pk_id PRIMARY KEY(id)
            );""");

            statement.executeUpdate("""
            INSERT INTO cuentas(codigo, saldo) VALUES
            ("codigo1", 2500),
            ("codigo2", 5120),
            ("codigo3", 1234),
            ("codigo9", 2121);
            """);

        } catch(SQLException e) {
            e.printStackTrace();
        } finally {
            dispose(conn);
            dispose(statement);
        }
    }
}
