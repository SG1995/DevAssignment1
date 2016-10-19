package sample;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;
import java.util.Observable;

import static java.lang.Integer.getInteger;
import static java.lang.Integer.parseInt;

public class Controller
{

    Stage stage;
    AddEmployeeModel model;

    public void AddEmployeeView(ActionEvent actionEvent) throws IOException
    {
        try{
            //load the fxml in fxmlloader.
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AddEmployeeView.fxml"));
            //Place fxml in Parent.
            Parent root1 = (Parent) fxmlLoader.load();
            //Create Stage and (might) edit stage attributes
            stage = new Stage();
            stage.setTitle("AddEmployee");
            // pick parent to set on stage and show.
            stage.setScene(new Scene(root1));
            stage.show();



        } catch (Exception e){
            e.printStackTrace();
        }

    }

    public void ModifyEmployeeView(ActionEvent actionEvent)
    {
        try{
            //load the fxml in fxmlloader.
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ModifyEmployeeView.fxml"));
            //Place fxml in Parent.
            Parent root1 = (Parent) fxmlLoader.load();
            //Create Stage and (might) edit stage attributes
            stage = new Stage();
            stage.setTitle("ModifyEmployee");
            // pick parent to set on stage and show.
            stage.setScene(new Scene(root1));
            stage.show();



        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void AddProjectView(ActionEvent actionEvent)
    {
        try{
            //load the fxml in fxmlloader.
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AddProjectView.fxml"));
            //Place fxml in Parent.
            Parent root1 = (Parent) fxmlLoader.load();
            //Create Stage and (might) edit stage attributes
            stage = new Stage();
            stage.setTitle("AddProject");
            // pick parent to set on stage and show.
            stage.setScene(new Scene(root1));
            stage.show();


        } catch (Exception e){
            e.printStackTrace();
        }
    }





    @FXML private TextField BSN;
    @FXML private TextField Name;
    @FXML private TextField Surname;

    @FXML private TextField Country;
    @FXML private TextField Postal_Code;
    @FXML private TextField Street_Name;
    @FXML private TextField House_Number;
    @FXML private TextField City;
    @FXML private TextField Course;
    @FXML private TextField School;
    @FXML private TextField Level;
    @FXML private TextField Building_Name;



    public void onClick(ActionEvent actionEvent)
    {

        int BSN = parseInt(this.BSN.getText());
        String Name = this.Name.getText();
        String Surname = this.Surname.getText();
        String Building_Name = this.Building_Name.getText();
        String Country = this.Country.getText();
        String Postal_Code = this.Postal_Code.getText();
        String Street_Name = this.Street_Name.getText();
        String House_Number = this.House_Number.getText();
        String City = this.City.getText();
        String Course = this.Course.getText();
        String School = this.School.getText();
        String Level = this.Level.getText();


        model = new AddEmployeeModel();
        model.connect();
        model.AddEmployeeDBTest(BSN, Name, Surname, Building_Name, Country, Postal_Code, Street_Name, House_Number, City, Course, School, Level);
        System.out.println("Done");
    }

    @FXML private TextField P_ID;
    @FXML private TextField Budget;
    @FXML private TextField Total_Amount_Of_Allocated_Hours;
    @FXML private TextField Building_Name;

    public void OnAddProjectClick(ActionEvent actionEvent)
    {
        int P_ID = parseInt(this.P_ID.getText());
        float Budget = Float.parseFloat(this.Budget.getText());
        float Total_Amount_Of_Allocated_Hours = Float.parseFloat(this.Total_Amount_Of_Allocated_Hours.getText());
        String Building_Name = this.Building_Name.getText();


    }

}
