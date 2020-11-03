package kamiprsp;

import eu.hansolo.medusa.Gauge;
import eu.hansolo.medusa.skins.TileKpiSkin;
import javafx.scene.paint.Color;

/**
 * @class: Gauge_Mitterwallner
 * @author: Tobias Mitterwallner
 * @date: 22.10.2020
 */

public class Gauge_Mitterwallner
{
    public static Gauge e(String name, int value, int maxValue ) {
        Gauge gauge = new Gauge();
        //gauge.setSectionIconsVisible(false);
        gauge.setPrefSize(300, 300);
        gauge.setSkin(new TileKpiSkin(gauge));
        gauge.setMaxValue(100);
        gauge.setThreshold(60);
        gauge.setTitle("this is it");
        gauge.setValue(25);
        gauge.setValueColor(Color.WHITE);
        gauge.setTitleColor(Color.WHITE);
        gauge.setThresholdVisible(true);
        gauge.setThresholdColor(Color.RED);
        //gauge.setSectionIconsVisible(false);
        //gauge.setSectionsVisible(false);
        return gauge;
    }
}
