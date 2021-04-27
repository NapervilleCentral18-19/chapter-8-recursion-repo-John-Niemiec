import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SierpinskiViewer
{
    private final int WIDTH = 800;
    private final int HEIGHT = 800;

    private SierpinskiGasket drawing;

    //-----------------------------------------------------------------
    //  Sets up the components for the applet.
    //-----------------------------------------------------------------
    public SierpinskiViewer()
    {
        drawing = new SierpinskiGasket();

        JFrame frame = new JFrame();
        frame.setTitle("Sierpinski");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);
        frame.add(drawing);
        frame.setVisible(true);
    }
}