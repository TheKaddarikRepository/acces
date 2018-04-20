package views;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;

public class ContSecRessLogs extends ActiveView {

	@FXML
	private DatePicker logEndDate;

	@FXML
	private ComboBox<?> resourceLog;

	@FXML
	private TableView<?> logsList;

	@FXML
	private DatePicker logStartDate;

	@FXML
	private Label runningTime;

	@FXML
	private Button logFilter;

	@FXML
	private ImageView popUpAlarm;

	@FXML
	private ComboBox<?> employeeLog;

	@FXML
	private ImageView serviceActiv;

	@FXML
	private Label NbEmployee;

	@FXML
	private Label NbRessources;

	@FXML
	void filterResults(ActionEvent event) {

	}
}
