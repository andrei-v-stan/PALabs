package paint.panels;

import paint.shapes.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;


public class DrawingPanel extends JPanel {

    final MainFrame frame;
    final static int W = 1200, H = 650;
    BufferedImage image;
    Graphics2D graphics;
    Point dot1 = null, dot2 = null;
    private Map<Shape, Color> colored = new LinkedHashMap<Shape, Color>();

    public DrawingPanel(MainFrame frame) {
        this.frame = frame;
        createOffscreenImage();
        init();
    }

    private void createOffscreenImage() {
        image = new BufferedImage(W, H, BufferedImage.TYPE_INT_ARGB);
        graphics = image.createGraphics();
        graphics.setColor(Color.WHITE);
        graphics.fillRect(0, 0, W, H);
    }

    private void init() {
        setPreferredSize(new Dimension(W, H));
        setBorder(BorderFactory.createEtchedBorder());
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                drawShape(e.getX(), e.getY());
                repaint();
            }
        });
    }

    private void drawShape(int x, int y) {
        Random rand = new Random();
        int radius;
        int sides = (int) frame.configPanel.fieldSides.getValue();
        Color rgba;

        if (frame.configPanel.comboColors.getSelectedIndex() == 0) {
            rgba = new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255));
            graphics.setColor(rgba);
        } else if (frame.configPanel.comboColors.getSelectedIndex() == 1) {
            graphics.setColor(Color.black);
            rgba = Color.black;
        } else if (frame.configPanel.comboColors.getSelectedIndex() == 2) {
            graphics.setColor(Color.gray);
            rgba = Color.gray;
        } else if (frame.configPanel.comboColors.getSelectedIndex() == 3) {
            graphics.setColor(Color.white);
            rgba = Color.white;
        } else if (frame.configPanel.comboColors.getSelectedIndex() == 4) {
            graphics.setColor(Color.red);
            rgba = Color.red;
        } else if (frame.configPanel.comboColors.getSelectedIndex() == 5) {
            graphics.setColor(Color.orange);
            rgba = Color.orange;
        } else if (frame.configPanel.comboColors.getSelectedIndex() == 6) {
            graphics.setColor(Color.yellow);
            rgba = Color.yellow;
        } else if (frame.configPanel.comboColors.getSelectedIndex() == 7) {
            graphics.setColor(Color.green);
            rgba = Color.green;
        } else if (frame.configPanel.comboColors.getSelectedIndex() == 8) {
            graphics.setColor(Color.cyan);
            rgba = Color.cyan;
        } else if (frame.configPanel.comboColors.getSelectedIndex() == 9) {
            graphics.setColor(Color.blue);
            rgba = Color.blue;
        } else if (frame.configPanel.comboColors.getSelectedIndex() == 10) {
            graphics.setColor(Color.magenta);
            rgba = Color.magenta;
        } else {
            graphics.setColor(Color.pink);
            rgba = Color.pink;
        }

        if ((int) frame.configPanel.fieldSizes.getValue() == 0) {
            radius = rand.nextInt(250);
        } else {
            radius = (int) frame.configPanel.fieldSizes.getValue();
        }

        if (frame.configPanel.comboShapes.getSelectedIndex() == 0) {
            frame.configPanel.repaint();
            Shape polygon = new RegularPolygon(x, y, radius, sides);
            graphics.fill(polygon);
            colored.put(polygon, rgba);
            frame.configPanel.withSize();
        } else if (frame.configPanel.comboShapes.getSelectedIndex() == 1) {
            frame.configPanel.repaint();
            Shape polygon = new IrregularPolygon(x, y, sides, radius / 1.5, radius * 1.5);
            graphics.fill(polygon);
            colored.put(polygon, rgba);
            frame.configPanel.withSize();
        } else if (frame.configPanel.comboShapes.getSelectedIndex() == 2) {
            frame.configPanel.repaint();
            Shape line = new LineShape(x, y, radius);
            graphics.fill(line);
            colored.put(line, rgba);
            frame.configPanel.noSize();
        } else if (frame.configPanel.comboShapes.getSelectedIndex() == 3) {
            frame.configPanel.repaint();
            Shape circle = new NodeShape(x, y, radius);
            graphics.fill(circle);
            colored.put(circle, rgba);
            frame.configPanel.noSize();
        } else if (frame.configPanel.comboShapes.getSelectedIndex() == 4) {
            frame.configPanel.repaint();
            Shape oval = new OvalShape(x, y, radius);
            graphics.fill(oval);
            colored.put(oval, rgba);
            frame.configPanel.noSize();
        } else {
            if (dot1 == null) {
                dot1 = new Point(x, y);
                return;
            } else if (dot2 == null) {
                dot2 = new Point(x, y);
            }
            Shape lineFree = new Line2D.Double(dot1, dot2);
            graphics.draw(lineFree);
            frame.configPanel.noSize();
        }

    }

    public Map<Shape, Color> getColored() {
        return colored;
    }

    public int getWeight() {
        return W;
    }

    public int getHeight() {
        return H;
    }

    @Override
    public void update(Graphics g) {
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.drawImage(image, 0, 0, this);
    }

}



