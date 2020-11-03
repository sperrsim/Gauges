package kamiprsp;

import eu.hansolo.medusa.Gauge;
import eu.hansolo.medusa.skins.SpaceXSkin;
import javafx.scene.paint.Color;

/**
 * @class: Gauge_Kalkhofer
 * @author: Elias Kalkhofer
 * @date: 22.10.2020
 */

public class Gauge_Kalkhofer extends GaugeBase{

    @Override
    public void redraw() {
        this.getChildren().clear();

        Gauge gaugeK = new Gauge();
        gaugeK.setTitle("Kalkhofer Gauge");
        gaugeK.setSkin(new SpaceXSkin(gaugeK));
        gaugeK.setUnit("km/h");

        gaugeK.setMaxWidth(width);
        gaugeK.setMaxHeight(height);
        gaugeK.setValue(value);
        gaugeK.setAutoScale(true);

        gaugeK.setBarColor(Color.PURPLE);

        this.getChildren().add(gaugeK);
    }
}
