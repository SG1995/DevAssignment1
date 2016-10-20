package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

import static java.lang.Integer.getInteger;
import static java.lang.Integer.parseInt;

public class Controller
{
    Stage stage;

    public void AddEmployeeView(ActionEvent actionEvent) throws IOException {
        try {
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


        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void ModifyEmployeeMainView(ActionEvent actionEvent) {
        try {
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


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void AddProjectView(ActionEvent actionEvent) {
        try {
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
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void ModifyProjectView(ActionEvent actionEvent)
    {
        try
        {
            //load the fxml in fxmlloader.
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ModifyProjectView.fxml"));
            //Place fxml in Parent.
            Parent root1 = (Parent) fxmlLoader.load();
            //Create Stage and (might) edit stage attributes
            stage = new Stage();
            stage.setTitle("ModifyProject");
            // pick parent to set on stage and show.
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void DeleteProjectView(ActionEvent actionEvent)
    {
        try
        {
            //load the fxml in fxmlloader.
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("DeleteProjectView.fxml"));
            //Place fxml in Parent.
            Parent root1 = (Parent) fxmlLoader.load();
            //Create Stage and (might) edit stage attributes
            stage = new Stage();
            stage.setTitle("DeleteProject");
            // pick parent to set on stage and show.
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void ModifyPersonalView(ActionEvent actionEvent) {
        try {
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
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void ModifyAddressView(ActionEvent actionEvent) {
        try {
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
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void ModifyDegreeView(ActionEvent actionEvent)
    {
        try {
            //load the fxml in fxmlloader.
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ModifyEmployeeDegreeView.fxml"));
            //Place fxml in Parent.
            Parent root2 = (Parent) fxmlLoader.load();
            //Create Stage and (might) edit stage attributes
            stage = new Stage();
            stage.setTitle("ModifyEmployeeDegree");
            // pick parent to set on stage and show.
            stage.setScene(new Scene(root2));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void DeleteEmployeeView(ActionEvent actionEvent)
    {
        try {
            //load the fxml in fxmlloader.
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("DeleteEmployeeView.fxml"));
            //Place fxml in Parent.
            Parent root2 = (Parent) fxmlLoader.load();
            //Create Stage and (might) edit stage attributes
            stage = new Stage();
            stage.setTitle("DeleteEmployee");
            // pick parent to set on stage and show.
            stage.setScene(new Scene(root2));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void EmployeeToProjectView(ActionEvent actionEvent)
    {
        try {
            //load the fxml in fxmlloader.
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("EmployeeToProjectView.fxml"));
            //Place fxml in Parent.
            Parent root2 = (Parent) fxmlLoader.load();
            //Create Stage and (might) edit stage attributes
            stage = new Stage();
            stage.setTitle("EmployeeToProject");
            // pick parent to set on stage and show.
            stage.setScene(new Scene(root2));
            stage.show();
    public void RentView(ActionEvent actionEvent)
    {
        try {
            //load the fxml in fxmlloader.
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("RentView.fxml"));
            //Place fxml in Parent.
            Parent root2 = (Parent) fxmlLoader.load();
            //Create Stage and (might) edit stage attributes
            stage = new Stage();
            stage.setTitle("View Projects That Cannot Pay Rent");
            // pick parent to set on stage and show.
            stage.setScene(new Scene(root2));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }


    public void NMVView()
    {
        try {
            //load the fxml in fxmlloader.
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("NMVView.fxml"));
            //Place fxml in Parent.
            Parent root2 = (Parent) fxmlLoader.load();
            //Create Stage and (might) edit stage attributes
            stage = new Stage();
            stage.setTitle("Error");
            // pick parent to set on stage and show.
            stage.setScene(new Scene(root2));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void DoneView()
    {
        try {
            //load the fxml in fxmlloader.
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("DoneView.fxml"));
            //Place fxml in Parent.
            Parent root2 = (Parent) fxmlLoader.load();
            //Create Stage and (might) edit stage attributes
            stage = new Stage();
            stage.setTitle("Done!");
            // pick parent to set on stage and show.
            stage.setScene(new Scene(root2));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // ABOVE THIS LINE ARE VIEWS, BELOW ARE EVENTS


    @FXML
    private TextField BSN;
    @FXML
    private TextField Name;
    @FXML
    private TextField Surname;
    @FXML
    private TextField Country;
    @FXML
    private TextField Postal_Code;
    @FXML
    private TextField Street_Name;
    @FXML
    private TextField House_Number;
    @FXML
    private TextField City;
    @FXML
    private TextField Course;
    @FXML
    private TextField School;
    @FXML
    private TextField Level;
    @FXML
    private TextField Building_Name;

    public void onClick(ActionEvent actionEvent) {

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

    //ADD PROJECT

    @FXML
    private TextField AP_P_ID;
    @FXML
    private TextField AP_Budget;
    @FXML
    private TextField AP_Total_Amount_Of_Allocated_Hours;
    @FXML
    private TextField AP_Building_Name;


    public void OnAddProjectClick(ActionEvent actionEvent)
    {
        int AP_P_ID = parseInt(this.AP_P_ID.getText());
        float AP_Budget = Float.parseFloat(this.AP_Budget.getText());
        float AP_Total_Amount_Of_Allocated_Hours = Float.parseFloat(this.AP_Total_Amount_Of_Allocated_Hours.getText());
        String AP_Building_Name = this.AP_Building_Name.getText();

        Model model = new Model();
        model.connect();
        model.AddProject(AP_P_ID, AP_Budget, AP_Total_Amount_Of_Allocated_Hours, AP_Building_Name);
        System.out.println("Done");
        DoneView();
    }


    @FXML
    private TextField BSN1;
    @FXML
    private TextField Name1;
    @FXML
    private TextField Surname1;
    @FXML
    private TextField Building_Name1;

    ArrayList lijst;

    public void ModifyEmployee(ActionEvent actionEvent) {
        int BSN1 = parseInt(this.BSN1.getText());
        String Name1 = this.Name1.getText();
        String Surname1 = this.Surname1.getText();
        String Building_Name1 = this.Building_Name1.getText();

        Model model = new Model();
        model.connect();
        model.ModifyEmployee(BSN1, Name1, Surname1, Building_Name1);
    }

    @FXML
    private TextField BSN2;
    @FXML
    private TextField Country2;
    @FXML
    private TextField Postal_Code2;
    @FXML
    private TextField Street_Name2;
    @FXML
    private TextField House_Number2;
    @FXML
    private TextField City2;

    String oldCountry;
    String oldPostal;


    public void SearchAddress(ActionEvent actionEvent) {
        int BSN2 = parseInt(this.BSN2.getText());
        Model model = new Model();
        model.connect();
        lijst = model.SearchAddress(BSN2);
        oldCountry = lijst.get(0) + "";
        oldPostal = lijst.get(1) + "";
        Country2.setText(lijst.get(0) + "");
        Postal_Code2.setText(lijst.get(1) + "");
        Street_Name2.setText(lijst.get(2) + "");
        House_Number2.setText(lijst.get(3) + "");
        City2.setText(lijst.get(4) + "");
    }

    public void ModifyAddress(ActionEvent actionEvent) {
        int BSN2 = parseInt(this.BSN2.getText());
        String Country2 = this.Country2.getText();
        String Postal_code2 = this.Postal_Code2.getText();
        String Street_Name2 = this.Street_Name2.getText();
        String House_Number2 = this.House_Number2.getText();
        String City2 = this.City2.getText();

        Model model = new Model();
        model.connect();
        model.ModifyAddress(oldCountry, oldPostal, Country2, Postal_code2, Street_Name2, House_Number2, City2);
    }

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

    @FXML private TextField DegreeBSN;
    @FXML private TextField DegreeCourse;
    @FXML private TextField DegreeSchool;
    @FXML private TextField DegreeLevel;
    String oldCourse;
    String oldSchool;
    String oldLevel;
    public void SearchDegree(ActionEvent actionEvent)
    {
        int DegreeBsn = parseInt(this.DegreeBSN.getText());
        Model model = new Model();
        model.connect();
        lijst = model.SearchDegree(DegreeBsn);
        DegreeCourse.setText(lijst.get(0) + "");
        DegreeSchool.setText(lijst.get(1) + "");
        DegreeLevel.setText(lijst.get(0) + "");
        oldCourse = lijst.get(0) + "";
        oldSchool = lijst.get(1) + "";
        oldLevel = lijst.get(2) + "";
    }


    public void ModifyDegree(ActionEvent actionEvent)
    {
        String DegreeCourse = this.DegreeCourse.getText();
        String DegreeSchool = this.DegreeSchool.getText();
        String DegreeLevel = this.DegreeLevel.getText();
        Model model = new Model();
        model.connect();
        model.ModifyDegree(oldCourse, oldSchool, oldLevel, DegreeCourse, DegreeSchool, DegreeLevel);
    }

    @FXML private TextField DeleteBSN;
    public void DeleteEmployee(ActionEvent actionEvent)
    {
        int DeleteBSN = parseInt(this.DeleteBSN.getText());
        Model model = new Model();
        model.connect();
        model.DeleteEmployee(DeleteBSN);
    }


    @FXML
    private TextField MP_P_ID;
    @FXML
    private TextField MP_Budget;
    @FXML
    private TextField MP_Total_Amount_Of_Allocated_Hours;
    @FXML
    private TextField MP_Building_Name;

    public void SearchProject(ActionEvent actionEvent)
    {
        int MP_P_ID = parseInt(this.MP_P_ID.getText());
        Model model = new Model();
        model.connect();
        ArrayList arrayList = model.SearchProject(MP_P_ID);
        MP_Budget.setText(arrayList.get(0) + "");
        MP_Total_Amount_Of_Allocated_Hours.setText(arrayList.get(1) + "");
        MP_Building_Name.setText(arrayList.get(2) + "");
    }
    public void ModifyProject (ActionEvent actionEvent)
    {
        int MP_P_ID = parseInt(this.MP_P_ID.getText());
        float MP_Budget = Float.parseFloat(this.MP_Budget.getText());
        float MP_Total_Amount_Of_Allocated_Hours = Float.parseFloat(this.MP_Total_Amount_Of_Allocated_Hours.getText());
        String MP_Building_Name = this.MP_Building_Name.getText();
        Model model = new Model();
        model.connect();
        model.ModifyProject(MP_P_ID, MP_Budget, MP_Total_Amount_Of_Allocated_Hours, MP_Building_Name);
    }

    @FXML
    private TextField DP_P_ID;
    public void DeleteProject (ActionEvent actionEvent)
    {
        int DeleteProject = parseInt(this.DP_P_ID.getText());
        Model model = new Model();
        model.connect();
        model.DeleteProject(DeleteProject);
        DoneView();
    }

    @FXML
    private ComboBox<String> ComboBox;

    public void FillComboBox(MouseEvent mouseEvent)
    {
        Model model = new Model();
        model.connect();
        ArrayList list =  model.FillComboBox();
        ObservableList<String> data = FXCollections.observableArrayList(list);
        ComboBox.setItems(data);
    }

    @FXML private TextField BSN3;
    @FXML private TextField Position;
    @FXML private TextArea Description;
    @FXML private TextField Hourly_Fee;


    public void AddEmployeeToProject(ActionEvent actionEvent)
    {
        int BSN3 = parseInt(this.BSN3.getText());
        String Position = this.Position.getText();
        String Description = this.Description.getText();
        float Hourly_Fee = Float.parseFloat(this.Hourly_Fee.getText());
        String P_ID = this.ComboBox.getValue();
        Model model = new Model();
        model.connect();
        model.AddEmployeeToProject(BSN3, Position, Description, Hourly_Fee, P_ID);
    }

    @FXML
    private TextField R_P_ID;
    @FXML
    private TextField R_Total_Amount_of_Allocated_Hours;
    @FXML
    private TextField R_Building_Name;
    @FXML
    private TextField R_Budget;
    @FXML
    private TextField R_Monthly_Rent;

    public void ViewProjectsThatCannotPayRent()
    {
        Model model = new Model();
        model.connect();
        ArrayList listOfProjects = model.ViewRent();
        try
        {
            R_P_ID.setText(listOfProjects.get(0) + "");
            R_Total_Amount_of_Allocated_Hours.setText(listOfProjects.get(1) + "");
            R_Building_Name.setText(listOfProjects.get(2) + "");
            R_Budget.setText(listOfProjects.get(3) + "");
            R_Monthly_Rent.setText(listOfProjects.get(4) + "");
        }catch (Exception e)
        {
            NMVView();
        }
    }
}


