package kamiprsp;

import eu.hansolo.medusa.Gauge;
import eu.hansolo.medusa.skins.LevelSkin;

/**
 * @class: Gauge_Sperr
 * @author: Simon Sperr
 * @date: 22.10.2020
 */

public class Gauge_Sperr extends GaugeBase{

    private int width = 100;
    private int height = 100;
    private int value = 0;


    @Override
    public void redraw() {
        Gauge gauge = new Gauge();
        gauge.setSkin(new LevelSkin(gauge));
        gauge.setUnit("%");
        gauge.setTitle("Sperr Gauge");
        gauge.setMaxHeight(this.height);
        gauge.setMaxWidth(this.width);
        gauge.setValue(this.value);
        
        this.getChildren().add(gauge);
    }
}
