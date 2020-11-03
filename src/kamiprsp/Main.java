package kamiprsp;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * @class: Main
 * @author: Simon Sperr, Elias Kalkhofer, Tobias Mitterwallner, Marcel Prielinger
 * @date: 22.10.2020
 */

public class Main extends Application
{
    Gauge_Prielinger gb = new Gauge_Prielinger();
    Gauge_Sperr gs = new Gauge_Sperr();
    Gauge_Kalkhofer gk = new Gauge_Kalkhofer();
    Gauge_Mitterwallner gm = new Gauge_Mitterwallner();
    TextField txtValue = new TextField();

    public static void main(String[] args) {
        // Launch the JavaFX application
        Application.launch(args);
    }

    @Override public void start(Stage stage) {

        EventHandler<MouseEvent> btn_handler = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {

                try {
                    int v = Integer.parseInt(txtValue.getText());
                    gb.setValue(v);
                    gs.setValue(v);
                    gk.setValue(v);
                    gm.setValue(v);
                }
                catch(Exception ex) {
                    System.out.println("Input Exception!");
                }

            }
        };

        gb.init(250, 250);
        gb.setValue(45);

        gs.init(250, 250);
        gs.setValue(45);

        gk.init(250, 250);
        gk.setValue(45);

        gm.init(250, 250);
        gm.setValue(45);

        Button btnValue = new Button();
        btnValue.setText("New Value");
        btnValue.addEventHandler(MouseEvent.MOUSE_CLICKED, btn_handler);

        GridPane gauges = new GridPane();
        gauges.add(gb, 0, 0);
        gauges.add(gs, 1, 0);
        gauges.add(gk, 0, 1);
        gauges.add(gm, 1, 1);

        VBox vBox = new VBox();
        vBox.setPadding(new Insets(10, 50, 50, 50));
        vBox.setSpacing(20);
        vBox.getChildren().addAll(gauges, txtValue, btnValue);

        //Creating a Scene
        Scene scene = new Scene(vBox);

        //Setting title to the scene
        stage.setTitle("Gauge Collection");
        //Adding the scene to the stage
        stage.setScene(scene);

        //Displaying the contents of a scene
        stage.show();
    }

}