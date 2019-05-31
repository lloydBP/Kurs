package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseHandler extends Configs {

    Connection con;

    public Connection getDbConnection()
            throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql//" + dbHost + ":"
                + dbPort + "/" + dbName;

        Class.forName("com.mysql.jdbc.Driver");

        Properties properties = new Properties();
        properties.setProperty("user",dbUser);
        properties.setProperty("password",dbPass);
        properties.setProperty("useUnicode","true");
        properties.setProperty("characterEncoding","cp1251");
        con = DriverManager.getConnection(url,properties);

        return con;
    }
}
