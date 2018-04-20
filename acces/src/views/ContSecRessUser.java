package views;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class ContSecRessUser extends ActiveView {

	@FXML
	private MyEmployeeList embeddedEmployeeList;

	@FXML
	private Button modifyEmployee;

	@FXML
	private CheckBox badgeInactive;

	@FXML
	private Button linkBadge;

	@FXML
	private DatePicker badgeBlockedDate;

	@FXML
	private TitledPane employeeInfo;

	@FXML
	private TextField employeeID;

	@FXML
	private MyBadgesList embeddedBadgesList;

	@FXML
	private ImageView popUpAlarm;

	@FXML
	private ImageView serviceActiv;

	@FXML
	private Button cancelEmployee;

	@FXML
	private Label timeRunning;

	@FXML
	private TableView<?> assoBadgeEmployee;

	@FXML
	private CheckBox badgeActive;

	@FXML
	private AnchorPane badgeInfo;

	@FXML
	private DatePicker fireDate;

	@FXML
	private ComboBox<?> employeeProfile;

	@FXML
	private Label NbRessources;

	@FXML
	private DatePicker badgeCreateDate;

	@FXML
	private Button modifyBadge;

	@FXML
	private DatePicker badgeActiveDate;

	@FXML
	private TextField employeeName;

	@FXML
	private DatePicker hireDate;

	@FXML
	private CheckBox badgeBlocked;

	@FXML
	private TextField badgeID;

	@FXML
	private ChoiceBox<?> badgeAssoEmployee;

	@FXML
	private Label NbEmployee;

	@FXML
	private Button addBadge;

	@FXML
	private TextField employeeFirstname;

	@FXML
	private Button addEmployee;

}
