package paint.panels;

import javax.swing.*;
import java.awt.*;
import javax.imageio.ImageIO;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;


public class ControlPanel extends JPanel {

    final MainFrame frame;
    JButton buttonSave = new JButton("Save");
    JButton buttonLoad = new JButton("Load");
    JButton buttonUndo = new JButton("Undo");
    JButton buttonDelete = new JButton("Delete");
    JButton buttonClear = new JButton("Clear");
    JButton buttonOutline = new JButton("Outline History");
    JButton buttonHistory = new JButton("Show History");
    JButton buttonClearLayer = new JButton("Clear All");
    JButton buttonExit = new JButton("Exit");


    public ControlPanel(MainFrame frame) {
        this.frame = frame;
        init();
    }

    private void init() {
        setLayout(new GridLayout(1, 7));

        add(buttonSave);
        add(buttonLoad);
        add(buttonUndo);
        add(buttonDelete);
        add(buttonOutline);
        add(buttonClear);
        add(buttonHistory);
        add(buttonClearLayer);
        add(buttonExit);


        buttonSave.addActionListener(this::save);
        buttonLoad.addActionListener(this::load);
        buttonUndo.addActionListener(this::undo);
        buttonDelete.addActionListener(this::delete);
        buttonOutline.addActionListener(this::outline);
        buttonHistory.addActionListener(this::history);
        buttonClear.addActionListener(this::clear);
        buttonClearLayer.addActionListener(this::clearLayer);
        buttonExit.addActionListener(this::exit);
    }


    private void save(ActionEvent e) {
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        jfc.setDialogTitle("Save the image");
        jfc.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Save the image", "png", "img");
        jfc.addChoosableFileFilter(filter);
        try {
            int returnValue = jfc.showSaveDialog(null);
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                File selectedFile = jfc.getSelectedFile();
                ImageIO.write(frame.canvas.image, "PNG", new File(selectedFile.getAbsolutePath()));
            }
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }

    private void load(ActionEvent e) {
        frame.canvas.image = new BufferedImage(1200, 650, BufferedImage.TYPE_INT_ARGB);
        frame.canvas.graphics = frame.canvas.image.createGraphics();
        frame.canvas.graphics.setColor(Color.WHITE);
        frame.canvas.graphics.fillRect(0, 0, 1200, 650);
        frame.canvas.repaint();
        try {
            JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
            jfc.setDialogTitle("Select an image");
            jfc.setAcceptAllFileFilterUsed(false);
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Select an image", "jpg", "png", "jpeg", "gif");
            jfc.addChoosableFileFilter(filter);
            int returnValue = jfc.showOpenDialog(null);
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                System.out.println(jfc.getSelectedFile().getPath());
                frame.canvas.image = new BufferedImage(1200, 650, BufferedImage.TYPE_INT_ARGB);
                frame.canvas.graphics = frame.canvas.image.createGraphics();
                frame.canvas.graphics.setColor(Color.WHITE);
                frame.canvas.graphics.fillRect(0, 0, 1200, 650);
                frame.canvas.repaint();
                frame.canvas.image = ImageIO.read(new File(jfc.getSelectedFile().getAbsolutePath()));
            }
        } catch (IOException ex) {
            System.err.println(ex);
        }

    }

    private void undo(ActionEvent e) {
        DrawingPanel drawingPanel = frame.canvas;
        LinkedHashMap<Shape, Color> colored = (LinkedHashMap<Shape, Color>) frame.canvas.getColored();
        Map.Entry<Shape, Color> lastElement = null;
        if (!drawingPanel.getColored().isEmpty()) {
            Iterator<Map.Entry<Shape, Color>> itr = colored.entrySet().iterator();
            while (itr.hasNext()) {
                lastElement = itr.next();
            }
            drawingPanel.getColored().remove(colored.keySet().remove(lastElement.getKey()));
            drawingPanel.image = new BufferedImage(drawingPanel.getWeight(), drawingPanel.getHeight(), BufferedImage.TYPE_INT_ARGB);
            drawingPanel.graphics = drawingPanel.image.createGraphics();
            drawingPanel.graphics.setColor(Color.WHITE);
            drawingPanel.graphics.fillRect(0, 0, drawingPanel.getWeight(), drawingPanel.getHeight());
            for (Map.Entry<Shape, Color> entry : colored.entrySet()) {
                drawingPanel.graphics.draw(entry.getKey());
                drawingPanel.graphics.setColor(entry.getValue());
                drawingPanel.graphics.fill(entry.getKey());
            }
            drawingPanel.repaint();
        }
    }

    private void delete(ActionEvent e) {
        DrawingPanel drawingPanel = frame.canvas;
        LinkedHashMap<Shape, Color> colored = (LinkedHashMap<Shape, Color>) frame.canvas.getColored();
        Map.Entry<Shape, Color> lastElement = null;
        if (!drawingPanel.getColored().isEmpty()) {
            Iterator<Map.Entry<Shape, Color>> itr = colored.entrySet().iterator();

            lastElement = itr.next();

            drawingPanel.getColored().remove(colored.keySet().remove(lastElement.getKey()));

            drawingPanel.image = new BufferedImage(drawingPanel.getWeight(), drawingPanel.getHeight(), BufferedImage.TYPE_INT_ARGB);
            drawingPanel.graphics = drawingPanel.image.createGraphics();
            drawingPanel.graphics.setColor(Color.WHITE);
            drawingPanel.graphics.fillRect(0, 0, drawingPanel.getWeight(), drawingPanel.getHeight());
            for (Map.Entry<Shape, Color> entry : colored.entrySet()) {
                drawingPanel.graphics.draw(entry.getKey());
                drawingPanel.graphics.setColor(entry.getValue());
                drawingPanel.graphics.fill(entry.getKey());
            }
            drawingPanel.repaint();
        }
    }

    private void history(ActionEvent e) {
        DrawingPanel drawingPanel = frame.canvas;
        LinkedHashMap<Shape, Color> colored = (LinkedHashMap<Shape, Color>) frame.canvas.getColored();
        Map.Entry<Shape, Color> lastElement = null;
        if (!drawingPanel.getColored().isEmpty()) {
            Iterator<Map.Entry<Shape, Color>> itr = colored.entrySet().iterator();
            drawingPanel.getColored().remove(colored.keySet());
            drawingPanel.image = new BufferedImage(drawingPanel.getWeight(), drawingPanel.getHeight(), BufferedImage.TYPE_INT_ARGB);
            drawingPanel.graphics = drawingPanel.image.createGraphics();
            drawingPanel.graphics.setColor(Color.WHITE);
            drawingPanel.graphics.fillRect(0, 0, drawingPanel.getWeight(), drawingPanel.getHeight());
            for (Map.Entry<Shape, Color> entry : colored.entrySet()) {
                drawingPanel.graphics.draw(entry.getKey());
                drawingPanel.graphics.setColor(entry.getValue());
                drawingPanel.graphics.fill(entry.getKey());
            }
            drawingPanel.repaint();
        }
    }

    private void clearLayer(ActionEvent e) {
        DrawingPanel drawingPanel = frame.canvas;
        LinkedHashMap<Shape, Color> colored = (LinkedHashMap<Shape, Color>) frame.canvas.getColored();
        Map.Entry<Shape, Color> lastElement = null;
        while (!drawingPanel.getColored().isEmpty()) {
            Iterator<Map.Entry<Shape, Color>> itr = colored.entrySet().iterator();
            while (itr.hasNext()) {
                lastElement = itr.next();
            }
            drawingPanel.getColored().remove(colored.keySet().remove(lastElement.getKey()));
            drawingPanel.image = new BufferedImage(drawingPanel.getWeight(), drawingPanel.getHeight(), BufferedImage.TYPE_INT_ARGB);
            drawingPanel.graphics = drawingPanel.image.createGraphics();
            drawingPanel.graphics.setColor(Color.WHITE);
            drawingPanel.graphics.fillRect(0, 0, drawingPanel.getWeight(), drawingPanel.getHeight());
            for (Map.Entry<Shape, Color> entry : colored.entrySet()) {
                drawingPanel.graphics.draw(entry.getKey());
                drawingPanel.graphics.setColor(entry.getValue());
                drawingPanel.graphics.fill(entry.getKey());
            }
            drawingPanel.repaint();
        }
    }

    private void outline(ActionEvent e) {
        DrawingPanel drawingPanel = frame.canvas;
        LinkedHashMap<Shape, Color> colored = (LinkedHashMap<Shape, Color>) frame.canvas.getColored();
        Map.Entry<Shape, Color> lastElement = null;
        if (!drawingPanel.getColored().isEmpty()) {
            Iterator<Map.Entry<Shape, Color>> itr = colored.entrySet().iterator();
            while (itr.hasNext()) {
                lastElement = itr.next();
            }
            for (Map.Entry<Shape, Color> entry : colored.entrySet()) {
                drawingPanel.graphics.draw(entry.getKey());
                drawingPanel.graphics.setColor(entry.getValue());
            }
            drawingPanel.repaint();
            if (!drawingPanel.getColored().isEmpty()) {
                while (itr.hasNext()) {
                    lastElement = itr.next();
                }
                for (Map.Entry<Shape, Color> entry : colored.entrySet()) {
                    drawingPanel.graphics.draw(entry.getKey());
                    drawingPanel.graphics.setColor(entry.getValue());
                }
                drawingPanel.repaint();
            }
        }

    }

    private void clear(ActionEvent e) {
        frame.canvas.image = new BufferedImage(1200, 650, BufferedImage.TYPE_INT_ARGB);
        frame.canvas.graphics = frame.canvas.image.createGraphics();
        frame.canvas.graphics.setColor(Color.WHITE);
        frame.canvas.graphics.fillRect(0, 0, 1200, 650);
        frame.canvas.repaint();
    }

    private void exit(ActionEvent e) {
        frame.dispose();
    }
}
