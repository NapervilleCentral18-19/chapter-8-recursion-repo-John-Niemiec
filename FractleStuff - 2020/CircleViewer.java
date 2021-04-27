import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CircleViewer
{
    private final int WIDTH = 1200;
    private final int HEIGHT = 800;

    private CirclePanel drawing;
    
    //-----------------------------------------------------------------
    //  Sets up the components for the applet.
    //-----------------------------------------------------------------
    public CircleViewer()
    {
        drawing = new CirclePanel();

        JFrame frame = new JFrame();
        frame.setTitle("Circle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);
        frame.add(drawing);
        frame.setVisible(true);
    }
}
