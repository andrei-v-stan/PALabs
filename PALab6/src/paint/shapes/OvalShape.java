package paint.shapes;

import java.awt.geom.Ellipse2D;

public class OvalShape extends Ellipse2D.Double {
    public OvalShape(double coordonateX, double coordonateY, double radius) {
        super(coordonateX - radius / 2, coordonateY - radius / 5, radius, radius / 2);
    }
}

