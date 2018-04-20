package views;

import javafx.fxml.FXML;
import javafx.scene.chart.StackedAreaChart;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;

public class ContSecRessSimu  extends ActiveView {

	@FXML
    private MyBadgesList embeddedBadgesList;

    @FXML
    private ImageView popUpAlarm;

    @FXML
    private ImageView serviceActiv;

    @FXML
    private StackedAreaChart<?, ?> refusSecond;

    @FXML
    private StackedAreaChart<?, ?> bagdesPercent;

    @FXML
    private Label timeRunning;

    @FXML
    private Button stopSim;

    @FXML
    private Label NbRessources;

    @FXML
    private Button startSim;

    @FXML
    private ChoiceBox<?> sleepMili;

    @FXML
    private StackedAreaChart<?, ?> accesSecond;

    @FXML
    private Slider accelerationVirt;

    @FXML
    private Label NbEmployee;

    @FXML
    private ChoiceBox<?> resourceVirt;

    @FXML
    private StackedAreaChart<?, ?> grantedSecond;

}
