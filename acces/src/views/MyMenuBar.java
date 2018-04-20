package views;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;

public class MyMenuBar {
	private ActiveView view;

	public MyMenuBar(ActiveView _view) {
		view = _view;
	}

	@FXML
	private MenuItem startGestion;

	@FXML
	private MenuItem stopGestion;

	@FXML
	private MenuItem quitApp;

	@FXML
	private MenuItem setRessources;

	@FXML
	private MenuItem setProfils;

	@FXML
	private MenuItem admin;

	@FXML
	private MenuItem startSim;

	@FXML
	private MenuItem hireEmployee;

	@FXML
	private MenuItem setVacancy;

	@FXML
	private MenuItem dispLogs;

	@FXML
	void lancerGestion(ActionEvent event) {
		
	}

	@FXML
	void arreterGestion(ActionEvent event) {

	}

	@FXML
	void openAdmin(ActionEvent event) {

	}

	@FXML
	void stopViews(ActionEvent event) {

	}

	@FXML
	void openUsers(ActionEvent event) {
		view.setState("SecRess-User.fxml");
	}

	@FXML
	void openProfil(ActionEvent event) {
		view.setState("SecRess-Profil.fxml");
	}

	@FXML
	void openResource(ActionEvent event) {
		view.setState("SecRess-Ress.fxml");
	}

	@FXML
	void openSimu(ActionEvent event) {
		view.setState("SecRess-Simu.fxml");
	}

	@FXML
	void openAbs(ActionEvent event) {
		view.setState("SecRess-Abs.fxml");
	}

	@FXML
	void openLogs(ActionEvent event) {
		view.setState("SecRess-Logs.fxml");
	}

}
