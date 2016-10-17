package sample;
import java.sql.*;
import java.math.*;
/**
 * Created by Stef on 17/10/2016.
 */
public class Model
{
    Connection conn;
    String sql;
    ResultSet resultSet;
    public void connect()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://sql7.freesqldatabase.com:3306/sql7140142", "sql7140142", "v5V23vnGlj");

            //conn.close();
        }
        catch (Exception e)
        {
            System.out.println("DeineMutti");
        }
    }
    public void insertTest()
    {
        try
        {
            Statement statement = conn.createStatement();
            try
            {
                sql = "SELECT * FROM Degree";
                resultSet = statement.executeQuery(sql);
                while(resultSet.next())
                {
                    String Course = resultSet.getString("Course");
                    String School = resultSet.getString("School");
                    String Level = resultSet.getString("Level");
                    System.out.println(Course);
                    System.out.println(School);
                    System.out.println(Level);
                }



                conn.close();


            } catch (Exception e)
            {
                e.printStackTrace();
            }

        } catch (SQLException e)
        {
            e.printStackTrace();
        }

    }
}
