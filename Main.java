package csci2020u.lab05;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.collections.ObservableList;
import javafx.scene.control.cell.PropertyValueFactory;


public class Main extends Application{


    @Override
    public void start(Stage primaryStage){
        ObservableList<StudentRecord> marks = FXCollections.observableArrayList();

        marks.add(new StudentRecord("100100100", 75.0f, 68.0f,54.25f));
        marks.add(new StudentRecord("100100101",70.0f,69.25f, 51.5f));
        marks.add(new StudentRecord("100100102",100.0f, 97.0f, 92.5f));
        marks.add(new StudentRecord("100100103", 90.0f, 88.5f, 68.75f));
        marks.add(new StudentRecord("100100104", 72.25f, 74.75f,58.25f));
        marks.add(new StudentRecord("100100105", 85.0f, 56.0f,62.5f));
        marks.add(new StudentRecord("100100106",70.0f,66.5f, 61.75f));
        marks.add(new StudentRecord("100100107",55.0f, 47.0f, 50.5f));
        marks.add(new StudentRecord( "100100108", 40.0f, 32.5f, 27.75f));
        marks.add(new StudentRecord("100100109", 82.5f, 77.0f,74.25f));

        TableView tabView = new TableView();
        TableColumn col1 = new TableColumn("SID");
        col1.setMinWidth(100);
        col1.setCellValueFactory(new PropertyValueFactory<StudentRecord, String>("studentNumber"));
        TableColumn col2 = new TableColumn("Assignments");
        col2.setMinWidth(100);
        col2.setCellValueFactory(new PropertyValueFactory<StudentRecord, Float>("assignments"));
        TableColumn col3 = new TableColumn("Midterm");
        col3.setMinWidth(100);
        col3.setCellValueFactory(new PropertyValueFactory<StudentRecord, Float>("midterm"));
        TableColumn col4 = new TableColumn("Final Exam");
        col4.setMinWidth(100);
        col4.setCellValueFactory(new PropertyValueFactory<StudentRecord, Float>("finalexam"));
        TableColumn col5 = new TableColumn("Final Mark");
        col5.setMinWidth(100);
        col5.setCellValueFactory(new PropertyValueFactory<StudentRecord, Double>("finalmark"));
        TableColumn col6 = new TableColumn("Letter Grade");
        col6.setMinWidth(100);
        col6.setCellValueFactory(new PropertyValueFactory<StudentRecord, Character>("letterGrade"));
        tabView.setItems(marks);
        tabView.getColumns().addAll(col1,col2,col3,col4,col5,col6);
        Scene scene = new Scene(tabView,600,500);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
}