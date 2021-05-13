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
            int[] midPointsX = new int[4];
            int[] midPointsY = new int[4];
            
            for (int i = 0; i <= 2; i++)
            {
                midPointsX[i] =  (xPos[i] + xPos[i+1]) / 2;
                midPointsY[i] =  (yPos[i] + yPos[i+1]) / 2;
            }
            /*the reason why this code is having issues is because when it draws the last point,
            it defaults to zero because that place is empty. the for loop above doesn't fill it.
            this means the last place to draw is 0 for x and 0 for y
            */
           
            //draw the tri
            page.drawPolyline (midPointsX, midPointsY, xPos.length);
            
            //get new coordinates for the 3 new shapes
            int[] tri1x = {  xPos[0],midPointsX[0],midPointsX[2],xPos[0]  };
            int[] tri1y = {  yPos[0],midPointsY[0],midPointsY[2],yPos[0]  };
            
            int[] tri2x = {  midPointsX[0],xPos[1],midPointsX[1],midPointsX[0]    };
            int[] tri2y = {  midPointsY[0],yPos[1],midPointsY[1],midPointsY[0]    };
            
            int[] tri3x = {  midPointsX[2], midPointsX[1], xPos[2], midPointsX[2]   };
            int[] tri3y = {  midPointsY[2], midPointsY[1], yPos[2], midPointsY[2]   };
            
            //call the 3 new triangles
            Triangle(tri1x,tri1y,page);
            Triangle(tri2x,tri2y,page);
            Triangle(tri3x,tri3y,page);


        }



   }//end of Triangle

}
