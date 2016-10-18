package sample;
import javafx.collections.ObservableList;

import java.sql.*;
import java.math.*;
import java.util.List;

/**
 * Created by Stef on 17/10/2016.
 */
public class AddEmployeeModel
{
    Connection conn;
    String sql;
    String Employee;
    String Address;
    String Degree;
    String E_Address;
    String E_Degree;
    ResultSet resultSet;
    public void connect()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://sql7.freesqldatabase.com:3306/sql7140142", "sql7140142", "v5V23vnGlj");


        }
        catch (Exception e)
        {
            System.out.println("DeineMutti");
        }
    }

    public void AddEmployeeDBTest(int BSN, String Name, String Surname, String Building_Name, String Country, String Postal_Code,
                                  String Street_Name, String House_Number, String City, String Course, String School, String Level)
    {


        try
        {
            Statement statement = conn.createStatement();
            try
            {
                Employee = "INSERT INTO Employee(BSN, Name, Surname, Building_Name) VALUES(" + BSN + ", " + "'" +  Name + "'" + ", " + "'"
                            + Surname + "'" + ", " + "'" + Building_Name + "'" +");";
                Address = "INSERT INTO Address(Country, Postal_Code, Street_Name, House_Number, City) VALUES (" + "'" + Country + "', '" +
                            Postal_Code + "', '" + Street_Name + "', '" + House_Number + "', '" + City + "');";
                Degree = "INSERT INTO Degree(Course, School, Level) VALUES (" + "'" + Course + "', '" + School + "', '" + Level + "');";
                E_Address = "INSERT INTO E_Address(BSN, Country, Postal_Code) VALUES (" + BSN + ", '" + Country + "', '" +
                            Postal_Code + "');";
                E_Degree = "INSERT INTO E_Degree(BSN, Course, School, Level) VALUES (" + BSN + ", '" + Course + "', '" + School + "', '" + Level + "');";

                statement.execute(Employee);
                statement.execute(Address);
                statement.execute(E_Address);
                statement.execute(Degree);
                statement.execute(E_Degree);


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
    

    
    
    

    /* public void insertTest()
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

    } */
}
