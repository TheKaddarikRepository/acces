package views;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;

public class ContSecRessAbs extends ActiveView {

	@FXML
	private MyEmployeeList embeddedEmployeeList;

	@FXML
	private TextArea vacancyDesc;

	@FXML
	private DatePicker vacancyTillDate;

	@FXML
	private TableView<?> vacancyList;

	@FXML
	private ImageView popUpAlarm;

	@FXML
	private ImageView serviceActiv;

	@FXML
	private TableView<?> employeeList;

	@FXML
	private Label NbRessources;

	@FXML
	private Button vacancyNew;

	@FXML
	private DatePicker vacancyFromDate;

	@FXML
	private Label runningTime;

	@FXML
	private Button vacancyModify;

	@FXML
	private Label NbEmployee;

	@FXML
	private Button vacancyCancel;

	@FXML
	void newAbs(ActionEvent event) {

	}

	@FXML
	void chgAbs(ActionEvent event) {

	}

	@FXML
	void clearAbs(ActionEvent event) {

	}

}
