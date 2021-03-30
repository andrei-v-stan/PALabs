package paint.panels;

import javax.swing.*;
import javax.swing.border.EmptyBorder;


public class ConfigPanel extends JPanel {

    final MainFrame frame;
    JLabel labelSides, labelSizes, labelShapes, labelColors, labelSpace, labelSizeSpace;
    JSpinner fieldSides, fieldSizes;
    JComboBox comboShapes, comboColors;

    public ConfigPanel(MainFrame frame) {
        this.frame = frame;
        init();
    }

    private void init() {

        labelSides = new JLabel("Number of sides : ");
        fieldSides = new JSpinner(new SpinnerNumberModel(3, 3, 250, 1));
        fieldSides.setValue(3);
        labelSpace = new JLabel("");
        labelSpace.setBorder(new EmptyBorder(0, 0, 0, 30));
        labelSizes = new JLabel("Size : ");
        fieldSizes = new JSpinner(new SpinnerNumberModel(0, 0, 250, 1));
        fieldSizes.setValue(0);
        labelSizeSpace = new JLabel("(0 for Random)");
        labelSizeSpace.setBorder(new EmptyBorder(0, 0, 0, 30));
        labelShapes = new JLabel("Shape : ");
        String[] shapes = {"Regular Polygon", "Irregular Polygon", "Line", "Circle", "Oval", "Free Draw"};
        comboShapes = new JComboBox<>(shapes);
        comboShapes.setBorder(new EmptyBorder(0, 0, 0, 30));
        labelColors = new JLabel("Color : ");
        String[] colors = {"Random", "Black", "Gray", "White", "Red", "Orange", "Yellow", "Green", "Cyan", "Blue", "Magenta"};
        comboColors = new JComboBox<>(colors);
        comboColors.setBorder(new EmptyBorder(0, 0, 0, 30));

        add(labelShapes);
        add(comboShapes);
        add(labelSides);
        add(fieldSides);
        add(labelSpace);
        add(labelSizes);
        add(fieldSizes);
        add(labelSizeSpace);
        add(labelColors);
        add(comboColors);

    }

    public void noSize() {
        removeAll();
        add(labelShapes);
        add(comboShapes);
        add(labelSpace);
        add(labelSizes);
        add(fieldSizes);
        add(labelSizeSpace);
        add(labelColors);
        add(comboColors);
    }

    public void withSize() {
        removeAll();
        add(labelShapes);
        add(comboShapes);
        add(labelSides);
        add(fieldSides);
        add(labelSpace);
        add(labelSizes);
        add(fieldSizes);
        add(labelSizeSpace);
        add(labelColors);
        add(comboColors);
    }

}

