package views;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import loging.SecRessRole;

public class ActiveView {

	@FXML
	private MyMenuBar embeddedMyMenuBar=new MyMenuBar(this);
	private Stage primaryStage;
	private ActiveView state;
	private SecRessRole userRight;
	private FXMLLoader loader;

	public ActiveView(Stage _primaryStage, SecRessRole _userRight) {
		this.primaryStage = _primaryStage;
		userRight = _userRight;
		if (loader == null)
			loader = new FXMLLoader();
		if (state == null)
			state = this.setState("SecRess-Logs.fxml");
		primaryStage.show();
	}
	
	public ActiveView() {
	}

	public ActiveView getState() {
		return state;
	}

	public ActiveView setState(String state) {
		try {
			loader.setLocation(getClass().getResource(state));
			Parent root = loader.load();	
			primaryStage.setScene(new Scene(root));
		} catch (IOException e) {
			e.printStackTrace();
		}
		this.state = loader.getController();
		return this.state;
	}

	public SecRessRole getUserRight() {
		return userRight;
	}

	public void setUserRight(SecRessRole userRight) {
		this.userRight = userRight;
	}

	public FXMLLoader getLoader() {
		return loader;
	}

	public void setLoader(FXMLLoader loader) {
		this.loader = loader;
	}

	public Stage getPrimaryStage() {
		return primaryStage;
	}

}
