package pl.karabola;

import java.sql.*;



public class DbConnector {

    private static String URL = "jdbc:mysql://192.168.99.100:3306/books";
    private static String USER = "root";
    private static String PASSWORD = "secret";
    private static String DRIVER = "com.mysql.cj.jdbc.Driver";


    public static void main(String[] args) {


        try {
            //get a connection to database

            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Połączono");

            //create a statement
            Statement statement = connection.createStatement();

            //execute SQL query -> SELECT
            /*ResultSet resultSet = statement.executeQuery("select*from books.Books, books.Authors");

            //proces the result set
            while (resultSet.next()) {
                System.out.println(resultSet.getString("Title")+", "+resultSet.getString("name")+" "+resultSet.getString("surname" ));
            }*/
            //execute SQL query-> Insert
            /*String sql="insert into books.Books"
                    +"(Title, AuthorId, LocationId)"
                    +"values ('Słoneczko', '3', '1')";

            statement.executeUpdate(sql);
            System.out.println("Insert complete.");*/

            //execute SQL query-> Update
            String sql ="update books.Books"
                    +" where Title='Lalka'"
                    +" set LocationId='3'";

            statement.executeUpdate(sql);

            System.out.println("Update completed");

            //execute SQL query-> Delete
            /*String sql="Delete from books.Books where Title='Pan Tadeusz'";
            int rowsAffected=statement.executeUpdate(sql);
            System.out.println("Delete completed");*/


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
