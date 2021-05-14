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
            //create more readable variables for later use
            int Ax = xPos[0];
            int Ay = yPos[0];
            
            int Bx = xPos[1];
            int By = yPos[1];
            
            int Cx = xPos[2];
            int Cy = yPos[2];
            
            //find midpoints and draw triangle
            int mpABx = (xPos[0] + xPos[1]) / 2;
            int mpABy = (yPos[0] + yPos[1]) / 2;
            
            int mpBCx = (xPos[1] + xPos[2]) / 2;
            int mpBCy = (yPos[1] + yPos[2]) / 2;
            
            int mpCAx = (xPos[2] + xPos[3]) / 2;
            int mpCAy = (yPos[2] + yPos[3]) / 2;
            
            //create optional offset that will create cool effects (last drawing position)
            int offsetX = mpABx;   //500;
            int offsetY = mpABy;   //500; 
            
            
            
            int[] midPointsX = {mpABx, mpBCx, mpCAx, offsetX};
            int[] midPointsY = {mpABy, mpBCy, mpCAy, offsetY};

           
            //draw the tri
            page.drawPolyline (midPointsX, midPointsY, xPos.length);
            
            //get new coordinates for the 3 new shapes
            int[] tri1x = {Ax, mpABx, mpCAx, Ax};
            int[] tri1y = {Ay, mpABy, mpCAy, Ay};
            
            int[] tri2x = {mpABx, Bx, mpBCx, mpABx};
            int[] tri2y = {mpABy, By, mpBCy, mpABy};
            
            int[] tri3x = {mpCAx, mpBCx, Cx, mpCAx};
            int[] tri3y = {mpCAy, mpBCy, Cy, mpCAy};
            
            //call the 3 new triangles
            Triangle(tri1x,tri1y,page);
            Triangle(tri2x,tri2y,page);
            Triangle(tri3x,tri3y,page);


        }



   }//end of Triangle

}
