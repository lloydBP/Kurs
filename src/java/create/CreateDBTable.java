package create;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Locale;

public class CreateDBTable {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);

        String url = "jdbc:mysql://localhost:3306/kursova?useSSL=false";
        String user = "root";
        String pass = "root";

        try (Connection conn =
                     DriverManager.getConnection(url, user,pass)) {
            Statement statement = conn.createStatement();
            /*CREATE TABLE <Имя таблицы> - позволяет нам создать ьаблицу б БД
             *   (<Имя столбца><Тип данных>|<Дополнительные параметры>)
             *
             *   обязательные для заполнения параметры:
             *   <Имя столбца><Тип данных>
             *   <Дополнительные параметры> - (NOT NULL - обозначает что поле в табл.
             *                                            не должно быть пустым)
             *
             * PRIMARY KEY - позволяет отметить ключевое поле*/
            statement.executeUpdate(
                    "CREATE TABLE HOUSES " +
                            "(ID INTEGER NOT NULL, " +
                            "DISTRICT VARCHAR(30), " +
                            "STREET VARCHAR(30), " +
                            "NUMBER VARCHAR(5)," +
                            "FLAT VARCHAR(7)," +
                            "MEMBER VARCHAR(20), " +
                            "PRIMARY KEY (ID))");
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
