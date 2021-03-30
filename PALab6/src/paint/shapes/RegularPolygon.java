package paint.shapes;

import java.awt.*;

public class RegularPolygon extends Polygon {
    public RegularPolygon(int coordonateX, int coordonateY, int radius, int sides) {
        double alpha = 2 * Math.PI / sides;
        double firstPoint, secondPoint;
        for (int iterator = 0; iterator < sides; iterator++) {
            firstPoint = coordonateX + radius * Math.cos(alpha * iterator);
            secondPoint = coordonateY + radius * Math.sin(alpha * iterator);
            this.addPoint((int) firstPoint, (int) secondPoint);
        }
    }
}
