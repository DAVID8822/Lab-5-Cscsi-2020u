package csci2020u.lab05;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class StudInfoController {
    @FXML
    private TableView tabView;
    @FXML
    private TableColumn fName;
    @FXML
    private TableColumn lName;
    @FXML
    private TableColumn addressColumn;

    @FXML
    public void initialize() {
        fName.setCellValueFactory(new PropertyValueFactory<>("First name"));
        lName.setCellValueFactory(new PropertyValueFactory<>("Last name"));
        addressColumn.setCellValueFactory(new PropertyValueFactory<>("First name"));
    }
}


