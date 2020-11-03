package kamiprsp;

import eu.hansolo.medusa.*;
import javafx.scene.paint.Color;

/**
 * @class: Gauge_Mitterwallner
 * @author: Tobias Mitterwallner
 * @date: 22.10.2020
 */

public class Gauge_Mitterwallner extends GaugeBase
{
    @Override
    public void redraw() {
        this.getChildren().clear();
        Gauge gauge = GaugeBuilder.create()
            .borderPaint(Color.BLACK)
            .foregroundBaseColor(Color.BLACK)
            .prefSize(400, 400)
            .startAngle(290)
            .angleRange(220)
            .minValue(0)
            .maxValue(4000)
            .valueVisible(false)
            .minorTickMarksVisible(false)
            .majorTickMarkType(TickMarkType.BOX)
            .mediumTickMarkType(TickMarkType.BOX)
            .unit("\n\n\n\n\n\n\nMitterwallner Gauge")
            .title("RPM\nx100")
            .needleShape(Gauge.NeedleShape.ROUND)
            .needleSize(Gauge.NeedleSize.THICK)
            .needleColor(Color.rgb(234, 67, 38))
            .knobColor(Gauge.DARK_COLOR)
            .customTickLabelsEnabled(true)
            .customTickLabelFontSize(40)
            .customTickLabels("0", "", "10", "", "20", "", "30", "", "40")
            .animated(true)
            .value(this.value)
            .maxHeight(height)
            .maxWidth(width)
            .build();

        this.getChildren().add(gauge);
    }
}
