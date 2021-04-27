import java.awt.*;
import javax.swing.JPanel;
import java.awt.geom.Line2D;
import java.awt.geom.*;

public class SierpinskiGasket extends JPanel
{
    private final int PANEL_WIDTH = 400;
    private final int PANEL_HEIGHT = 400;

    private final double SQ = Math.sqrt(3.0) / 6;

    private final int TOPX = 200, TOPY = 20;
    private final int LEFTX = 60, LEFTY = 300;
    private final int RIGHTX = 340, RIGHTY = 300;


/*
   //x is accross and y is down
   point 1 - Right  A
   point 2 - Left   B
   point 3 - Top    C
   point 4 draws back to point 1 to complete triangle

    private int[] xPos = {360, 40, 200, 360};
    private int[] yPos = {300, 300, 20, 300};
*/
    private int[] xPos = {720, 80, 400, 720};
    private int[] yPos = {600, 600, 40, 600};
    int bicect;


   //-----------------------------------------------------------------
   //  Sets up the basic applet environment.
   //-----------------------------------------------------------------
   public SierpinskiGasket()
    {
        
        setBackground (Color.black);
        setPreferredSize (new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
    }
    //-----------------------------------------------------------------
    //  Performs the initial calls to the drawCircle method.
    //-----------------------------------------------------------------
    @Override
    public void paintComponent (Graphics page)
    {
        super.paintComponent (page);
       
        page.setColor (Color.red);
        page.drawPolyline (xPos, yPos, xPos.length);

        Triangle(xPos,yPos,page);
       
    }

  

   /** Draws a triangle  in the middle of the 3 x,y points provided
        finds the midpoints of triangles line segments
        uses midpoint to draw a triangle inside of the points provided

   @param array of 4 points a -> b -> c -> a

   */

   public void Triangle(int[] xPos, int[] yPos, Graphics page)
   {
       int dxsquared = (int)Math.pow(xPos[0] - xPos[1],2);
       int dysquared = (int)Math.pow(yPos[0] - yPos[1],2);
       int distance = (int)Math.sqrt(dxsquared + dysquared);



        if (distance > 10)
        {
            //find midpoints and draw triangle
            //int ABMidx = (xPos[0]
            //int ABMidy = (
            
            //draw the tri
            
            
            
            //call the 3 new triangles
           


        }



   }//end of Triangle

}
