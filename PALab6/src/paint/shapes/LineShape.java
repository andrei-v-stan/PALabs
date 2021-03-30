package paint.shapes;

import java.awt.geom.Rectangle2D;

public class LineShape extends Rectangle2D.Double {
    public LineShape(double coordonateX, double coordonateY, double radius) {
        super(coordonateX, coordonateY, radius * 2, radius / 75);
    }
}

