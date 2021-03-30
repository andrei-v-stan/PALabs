package paint.shapes;

import java.awt.geom.Ellipse2D;

public class NodeShape extends Ellipse2D.Double {
    public NodeShape(double coordonateX, double coordonateY, double radius) {
        super(coordonateX - radius / 2, coordonateY - radius / 2, radius, radius);
    }
}

