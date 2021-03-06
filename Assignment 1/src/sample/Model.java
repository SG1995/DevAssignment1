package sample;
import javafx.collections.ObservableList;
import javafx.scene.control.TextArea;

import java.rmi.server.ExportException;
import java.sql.*;
import java.math.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Stef on 17/10/2016.
 */
public class Model
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

    public void AddProject(int P_ID, float Budget, float Total_Amount_Of_Allocated_Hours, String Building_Name)
    {
        try
        {
            Statement statement = conn.createStatement();
            try
            {
                String ProjectQuery = "INSERT INTO Project(P_ID, Budget, Total_Amount_Of_Allocated_Hours, Building_Name) " +
                                      "VALUES(" + P_ID + ", " + Budget + ", " + Total_Amount_Of_Allocated_Hours + ", " + "'" + Building_Name + "'" + ");";
                statement.execute(ProjectQuery);
                conn.close();
            } catch (Exception e)
            {
                e.printStackTrace();
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public ArrayList SearchPersonal(int BSN1)
    {
        try
        {
            Statement statement = conn.createStatement();
            try
            {
                sql = "SELECT Name, Surname, Building_Name FROM Employee WHERE BSN = " + BSN1 + ";";
                resultSet = statement.executeQuery(sql);
                //FOR SOME REASON BEGINS INDEX AT -1 #Angryface
                resultSet.next();
                ArrayList lijst = new ArrayList();
                lijst.add (resultSet.getString(1));
                lijst.add (resultSet.getString(2));
                lijst.add (resultSet.getString(3));

                conn.close();
                return lijst;

            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    public ArrayList SearchAddress(int BSN2)
    {
        try
        {
            Statement statement = conn.createStatement();
            try
            {
                sql = "SELECT a.Country, a.Postal_Code, a.Street_Name, a.House_Number, a.City " +
                        "FROM Address a, E_Address e " +
                        "WHERE a.Country = e.Country AND a.Postal_Code = e.Postal_Code AND e.BSN = " + BSN2 + ";";
                resultSet = statement.executeQuery(sql);
                // for some reason default index is -1...
                resultSet.next();
                ArrayList lijst = new ArrayList();
                lijst.add (resultSet.getString(1));
                lijst.add (resultSet.getString(2));
                lijst.add (resultSet.getString(3));
                lijst.add (resultSet.getString(4));
                lijst.add (resultSet.getString(5));
                conn.close();
                return lijst;
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    public ArrayList SearchDegree(int DegreeBSN)
    {
        try
        {
            Statement statement = conn.createStatement();
            try
            {
                sql = "SELECT Course, School, Level FROM E_Degree WHERE BSN = " + DegreeBSN + ";";
                resultSet = statement.executeQuery(sql);
                resultSet.next();
                ArrayList lijst = new ArrayList();
                lijst.add (resultSet.getString(1));
                lijst.add (resultSet.getString(2));
                lijst.add (resultSet.getString(3));
                conn.close();
                return lijst;

            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    public ArrayList SearchProject(int P_ID)
    {
        try
        {
            Statement statement = conn.createStatement();
            try
            {
                String SearchProjectQuery = "SELECT Budget, Total_Amount_Of_Allocated_Hours, Building_Name" +
                        "             FROM Project" +
                        "             WHERE P_ID = " + P_ID + ";";
                resultSet = statement.executeQuery(SearchProjectQuery);
                resultSet.next();
                ArrayList arrayList = new ArrayList();
                arrayList.add(resultSet.getString(1));
                arrayList.add(resultSet.getString(2));
                arrayList.add(resultSet.getString(3));
                conn.close();
                return arrayList;
            } catch (Exception e)
            {
                e.printStackTrace();
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    public ArrayList ViewRent() {
        try {
            Statement statement = conn.createStatement();
            try {
                String ViewRentQuery = "SELECT p.P_ID, p.Total_Amount_Of_Allocated_Hours, p.Building_Name, p.Budget, h.Monthly_Rent FROM Project p, Headquarters h WHERE p.Building_Name = h.Building_Name AND h.Monthly_Rent > (p.Budget * 0.10);";
                resultSet = statement.executeQuery(ViewRentQuery);
                resultSet.next();
                ArrayList arrayList = new ArrayList();
                arrayList.add(resultSet.getString(1));
                arrayList.add(resultSet.getString(2));
                arrayList.add(resultSet.getString(3));
                arrayList.add(resultSet.getString(4));
                arrayList.add(resultSet.getString(5));
                conn.close();
                return arrayList;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    public void ModifyProject(int P_ID, float Budget, float Total_Amount_Of_Allocated_Hours, String Building_Name)
    {
        try
        {
            Statement statement = conn.createStatement();
            try
            {
                String ModifyProjectQuery = "UPDATE Project Set Budget = " + Budget + ", Total_Amount_Of_Allocated_Hours = " + Total_Amount_Of_Allocated_Hours + ", Building_Name = " + "'" + Building_Name + "'" +
                        "                    WHERE P_ID = " + P_ID + ";";
                statement.execute(ModifyProjectQuery);
                System.out.println("Done");
                conn.close();
            }catch (Exception e)
            {
                e.printStackTrace();
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public void DeleteProject(int P_ID)
    {
        try
        {
            Statement statement = conn.createStatement();
            try
            {
                String DeleteProjectQuery = "DELETE FROM Project WHERE P_ID = " + P_ID + ";";
                statement.execute(DeleteProjectQuery);
                System.out.println("Done");
                conn.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void ModifyEmployee(int BSN1, String Name1, String Surname1, String Building_Name1)
    {
        try
        {
            Statement statement = conn.createStatement();
            try
            {
                String eUpdate = "UPDATE Employee SET Name = '" + Name1 + "', Surname = '" + Surname1 + "', Building_name = '" + Building_Name1
                            + "' WHERE BSN = " + BSN1 + ";";
                statement.execute(eUpdate);
                System.out.println("Done");
                conn.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    public void ModifyAddress(String oldCountry, String oldPostal, String Country2, String Postal_Code2, String Street_Name2, String House_Number2, String City2)
    {
        try
        {
            Statement statement = conn.createStatement();
            try
            {

                String eUpdate = "UPDATE Address SET Country = '" + Country2 + "', Postal_Code = '" + Postal_Code2 + "', Street_Name = '" + Street_Name2 + "', House_Number = '" + House_Number2
                        + "', City = '" + City2 + "' WHERE Country = '" + oldCountry + "' AND Postal_Code = '" + oldPostal + "';";
                statement.execute(eUpdate);
                System.out.println("Done");
                conn.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
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

    public void ModifyDegree(String oldCourse, String oldSchool, String oldLevel, String DegreeCourse, String DegreeSchool, String DegreeLevel)
    {
        try
        {
            Statement statement = conn.createStatement();
            try
            {
                String DegreeUpdate = "UPDATE Degree SET Course = '" + DegreeCourse + "', School = '" + DegreeSchool + "', Level = '"
                                        + DegreeLevel + "' WHERE Course = '" + oldCourse + "' AND School = '" + oldSchool + "' AND Level = '"
                                        + oldLevel + "';";
                statement.execute(DegreeUpdate);
                System.out.println("Done");
                conn.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void DeleteEmployee(int deleteBSN)
    {
        try
        {
            Statement statement = conn.createStatement();
            try
            {
               String DeleteBSN = "DELETE FROM Employee WHERE BSN = " + deleteBSN + ";";
                statement.execute(DeleteBSN);
                System.out.println("Done");
                conn.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public ArrayList FillComboBox()
    {
        try
        {
            Statement statement = conn.createStatement();
            try
            {
                String FindProjects = "SELECT P_ID FROM Project;";
                resultSet = statement.executeQuery(FindProjects);
                ArrayList list = new ArrayList();


                while(resultSet.next())
                {

                  list.add(resultSet.getString(1));
                }
                conn.close();
                return list;
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    public void AddEmployeeToProject(int BSN3, String Position, String Description, float Hourly_Fee, String P_ID)
    {
        try
        {
            Statement statement = conn.createStatement();
            try
            {
                String E_Position = "INSERT INTO E_Position VALUES (" + BSN3 + ", '" + Position + "',"+ Hourly_Fee+ " );";
                String Pos_Description = "INSERT INTO Pos_Description VALUES (" + BSN3 + ", '" + Position + "', '"+ Description+ "');";
                String Proj_Pos = "INSERT INTO Proj_Pos VALUES (" + BSN3 + ", '" + Position + "',"+ P_ID + " );";
                statement.execute(E_Position);
                statement.execute(Pos_Description);
                statement.execute(Proj_Pos);
                System.out.println("Done");
                conn.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
