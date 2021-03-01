package csci2020u.lab05;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.collections.ObservableList;
import javafx.scene.control.cell.PropertyValueFactory;


public class Main extends Application{


    @Override
    public void start(Stage primaryStage){
        TableView tabView = new TableView();
        ObservableList<StudentRecord> data = DataSource.getAllMarks();
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
        tabView.setItems(data);
        tabView.getColumns().addAll(col1,col2,col3,col4,col5,col6);
        Scene scene = new Scene(tabView,600,500);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
}