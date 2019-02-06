import java.sql.*;

public class testDb {

    private static Connection connection;
    private static Statement statement;

    public static void main(String[] args) throws SQLException {
        try {
            Connection();
            add();
            Discon();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void Connection() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/aleksandr");
        statement = connection.createStatement();
    }

    public static void Discon() throws SQLException {
        connection.close();
    }

    public static void add() throws SQLException{
        connection.setAutoCommit(false);
        for (int i = 0;i < 10000;i++){
            statement.executeUpdate("Insert into products (id,prodid,title,cost) values " +
                    "('"+(i+1)+"','"+(i+1)+"','product "+(i+1)+"','"+(i+1)*10+"')");
        }

        connection.setAutoCommit(true);
    }

}
