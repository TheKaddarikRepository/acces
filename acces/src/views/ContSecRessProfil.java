package views;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TreeTableView;
import javafx.scene.image.ImageView;

public class ContSecRessProfil extends ActiveView {

	@FXML
	private Button profilSupp;

	@FXML
	private TreeTableView<?> profilList;

	@FXML
	private ComboBox<?> profileCombo;

	@FXML
	private ComboBox<?> resourceGroupCombo;

	@FXML
	private ComboBox<?> scheduleCombo;

	@FXML
	private Label runningTime;

	@FXML
	private ImageView popUpAlarm;

	@FXML
	private ImageView serviceActiv;

	@FXML
	private Button profilModify;

	@FXML
	private Label NbEmployee;

	@FXML
	private Button profilAdd;

	@FXML
	private Label NbRessources;

	@FXML
	void addProfil(ActionEvent event) {

	}

	@FXML
	void suppProfil(ActionEvent event) {

	}

	@FXML
	void modifyProfil(ActionEvent event) {

	}
}
