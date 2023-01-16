import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Start {

    public static void main(String[] args) {

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb", "root", "Inazumaeleven1#");

            Statement statement = connection.createStatement();

            statement.executeUpdate("create table students(" +
                    "student_id int(10) primary key auto_increment not null," +
                    "last_name varchar(30)," +
                    "first_name varchar(30))");

            System.out.println("Tabella creata correttamente");

            statement.executeUpdate("insert into students(last_name,first_name) values ('Setaro','Marco')");
            statement.executeUpdate("insert into students(last_name,first_name) values ('Cioffo','Michele')");
            statement.executeUpdate("insert into students(last_name,first_name) values ('Pollina','Alessio')");
            statement.executeUpdate("insert into students(last_name,first_name) values ('Coman','Maria')");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
