package paint.shapes;

import java.awt.*;
import java.util.Random;

public class IrregularPolygon extends Polygon {
    public IrregularPolygon(int coordonateX, int coordonateY, int sides, double minRadius, double maxRadius) {
        Random rand = new Random();
        double angleStep = Math.PI * 2 / sides;
        double firstPoint, secondPoint;
        for (int i = 0; i < sides; ++i) {
            double targetAngle = angleStep * i;
            double angle = targetAngle + (rand.nextDouble() - 0.5) * angleStep * 0.25;
            double radius = minRadius + rand.nextDouble() * (maxRadius - minRadius);
            firstPoint = coordonateX + Math.cos(angle) * radius;
            secondPoint = coordonateY + Math.sin(angle) * radius;
            this.addPoint((int) firstPoint, (int) secondPoint);
        }
    }

}
