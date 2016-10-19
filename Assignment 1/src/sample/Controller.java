package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

import static java.lang.Integer.parseInt;

public class Controller
{
    Stage stage;

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

    public void ModifyEmployeeMainView(ActionEvent actionEvent)
    {
        try{
            //load the fxml in fxmlloader.
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ModifyEmployeeMainView.fxml"));
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

    public void ModifyPersonalView(ActionEvent actionEvent)
    {
        try{
            //load the fxml in fxmlloader.
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ModifyEmployeePersonalView.fxml"));
            //Place fxml in Parent.
            Parent root2 = (Parent) fxmlLoader.load();
            //Create Stage and (might) edit stage attributes
            stage = new Stage();
            stage.setTitle("ModifyEmployeePersonal");
            // pick parent to set on stage and show.
            stage.setScene(new Scene(root2));
            stage.show();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void ModifyAddressView(ActionEvent actionEvent)
    {
        try{
            //load the fxml in fxmlloader.
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ModifyEmployeeAddressView.fxml"));
            //Place fxml in Parent.
            Parent root2 = (Parent) fxmlLoader.load();
            //Create Stage and (might) edit stage attributes
            stage = new Stage();
            stage.setTitle("ModifyEmployeeAddress");
            // pick parent to set on stage and show.
            stage.setScene(new Scene(root2));
            stage.show();
        } catch (Exception e){
            e.printStackTrace();
        }
    }



    // ABOVE THIS LINE ARE VIEWS, BELOW ARE EVENTS



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


        Model model = new Model();
        model.connect();
        model.AddEmployeeDBTest(BSN, Name, Surname, Building_Name, Country, Postal_Code, Street_Name, House_Number, City, Course, School, Level);
        System.out.println("Done");
    }

    @FXML private TextField BSN1;
    @FXML private TextField Name1;
    @FXML private TextField Surname1;
    @FXML private TextField Building_Name1;
    ArrayList lijst;

    public void SearchPersonal(ActionEvent actionEvent)
    {
        int BSN1 = parseInt(this.BSN1.getText());
        Model model = new Model();
        model.connect();
        lijst = model.SearchPersonal(BSN1);
        Name1.setText(lijst.get(0) + "");
        Surname1.setText(lijst.get(1) + "");
        Building_Name1.setText(lijst.get(2) + "");


    }

    public void ModifyEmployee(ActionEvent actionEvent)
    {
        int BSN1 = parseInt(this.BSN1.getText());
        String Name1 = this.Name1.getText();
        String Surname1 = this.Surname1.getText();
        String Building_Name1 = this.Building_Name1.getText();

        Model model = new Model();
        model.connect();
        model.ModifyEmployee(BSN1, Name1, Surname1, Building_Name1);
    }

    @FXML private TextField BSN2;
    @FXML private TextField Country2;
    @FXML private TextField Postal_Code2;
    @FXML private TextField Street_Name2;
    @FXML private TextField House_Number2;
    @FXML private TextField City2;
    public void SearchAddress(ActionEvent actionEvent)
    {
        int BSN2 = parseInt(this.BSN2.getText());
        Model model = new Model();
        model.connect();
        lijst = model.SearchAddress(BSN2);
        Country2.setText(lijst.get(0) + "");
        Postal_Code2.setText(lijst.get(1) + "");
        Street_Name2.setText(lijst.get(2) + "");
        House_Number2.setText(lijst.get(3) + "");
        City2.setText(lijst.get(4) + "");
    }

    public void ModifyAddress(ActionEvent actionEvent)
    {
        int BSN2 = parseInt(this.BSN2.getText());
        String Country2 = this.Country2.getText();
        String Postal_code2 = this.Postal_Code2.getText();
        String Street_Name2 = this.Street_Name2.getText();
        String House_Number2 = this.House_Number2.getText();
        String City2 = this.City2.getText();
        Model model = new Model();
        model.connect();
        model.ModifyAddress(BSN2, Country2, Postal_code2, Street_Name2, House_Number2,City2);
    }
}
