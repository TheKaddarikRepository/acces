package views;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeTableView;
import javafx.scene.image.ImageView;

public class ContSecRessRess  extends ActiveView {

	@FXML
    private RadioButton resourceActive;

    @FXML
    private Button resourceSupp;

    @FXML
    private ImageView popUpAlarm;

    @FXML
    private ImageView serviceActiv;

    @FXML
    private DatePicker resourceCreateDate;

    @FXML
    private Label NbRessources;

    @FXML
    private TreeTableView<?> resourceList;

    @FXML
    private Button resourceAdd;

    @FXML
    private Label runningTime;

    @FXML
    private RadioButton resourceBlocked;

    @FXML
    private TextField resourceDesc;

    @FXML
    private Label NbEmployee;

    @FXML
    private ComboBox<?> resourceGroupe;

    @FXML
    private TextField resourceAddress;

    @FXML
    private Button resourceModify;

    @FXML
    private ComboBox<?> resourceType;

}
