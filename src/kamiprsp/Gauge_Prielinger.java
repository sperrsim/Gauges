package kamiprsp;

import eu.hansolo.medusa.Gauge;
import eu.hansolo.medusa.skins.*;

/**
 * @class: Gauge_Prielinger
 * @author: Marcel Prielinger
 * @date: 22.10.2020
 */

public class Gauge_Prielinger extends GaugeBase {

    @Override
    public void redraw() {

        this.getChildren().clear();

        Gauge gauge = new Gauge();

        gauge.setValue(value);
        gauge.setMaxHeight(height);
        gauge.setMaxWidth(width);
        gauge.setSkin(new AmpSkin(gauge));
        gauge.setTitle("Prielinger Gauge");
        gauge.setUnit("km/h");

        this.getChildren().add(gauge);
    }
}
