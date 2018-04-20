package views;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TreeTableView;
import javafx.scene.image.ImageView;

public class ContSecRessStd extends ActiveView {

	@FXML
	private Label runningTime;

	@FXML
	private MyEmployeeList embeddedEmployeeList;

	@FXML
	private ImageView popUpAlarm;

	@FXML
	private ImageView serviceActiv;

	@FXML
	private Label NbEmployee;

	@FXML
	private TreeTableView<?> resourceUseList;

	@FXML
	private Label NbRessources;

}
