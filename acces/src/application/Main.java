package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import loging.RolesAvailable;
import loging.SecRessRole;
import views.ActiveView;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			SecRessRole role = new SecRessRole();
			role.addRole(RolesAvailable.Employer);
			ActiveView view =new ActiveView(primaryStage, role);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
