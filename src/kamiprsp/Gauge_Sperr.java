package kamiprsp;

import eu.hansolo.medusa.Gauge;
import eu.hansolo.medusa.skins.LevelSkin;
import javafx.scene.paint.Color;

/**
 * @class: Gauge_Sperr
 * @author: Simon Sperr
 * @date: 22.10.2020
 */

public class Gauge_Sperr extends GaugeBase{

    @Override
    public void redraw() {
        this.getChildren().clear();

        Gauge gauge = new Gauge();
        gauge.setSkin(new LevelSkin(gauge));
        gauge.setUnit("%");
        gauge.setTitle("Sperr Gauge");
        gauge.setMaxHeight(this.height);
        gauge.setMaxWidth(this.width);
        gauge.setValue(this.value);
        gauge.setAnimated(true);
        gauge.setAutoScale(true);
        gauge.setBarColor(Color.YELLOW);
        gauge.setValueColor(Color.BLACK);
        gauge.setUnitColor(Color.BLACK);

        this.getChildren().add(gauge);
    }
}
