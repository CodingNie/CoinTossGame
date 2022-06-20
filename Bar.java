package Coin;
// Name: Ning Nie
// USC NetID: nnie
// CS 455 PA1
// Spring 2022

// we included the import statements for you
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;

/**
 * Bar class
 * A labeled bar that can serve as a single bar in a bar graph.
 * The text for the label is centered under the bar.
 * 
 * NOTE: we have provided the public interface for this class. Do not change
 * the public interface. You can add private instance variables, constants,
 * and private methods to the class. You will also be completing the
 * implementation of the methods given.
 * 
 */
public class Bar {
   private int bottom;
   private int left;
   private int width;
   private int applicationHeight;
   private double scale;
   private Color color;
   private String label;
   private static final int LABEL_BUFFER = 20;


   
   /**
      Creates a labeled bar.  You give the height of the bar in application
      units (e.g., population of a particular state), and then a scale for how
      tall to display it on the screen (parameter scale).
  
      @param bottom  location of the bottom of the bar
      @param left  location of the left side of the bar
      @param width  width of the bar (in pixels)
      @param applicationHeight  height of the bar in application units
      @param scale  how many pixels per application unit
      @param color  the color of the bar
      @param label  the label under the bar
   */
   public Bar(int bottom, int left, int width, int applicationHeight, 
              double scale, Color color, String label) {
      this.bottom = bottom;
      this.left = left;
      this.width = width;
      this.applicationHeight = applicationHeight;
      this.scale = scale;
      this.color = color;
      this.label = label;
   }
   
   /**
      Draw the labeled bar.
      @param g2  the graphics context
   */
   public void draw(Graphics2D g2) {
      
      //Draw the column, including the rectangle and the color.
      int rectHeight = (int) (applicationHeight * scale);
      int rectX = left;
      int rectY = bottom - rectHeight;
      Rectangle rectangle = new Rectangle(rectX, rectY, width, rectHeight);
      g2.setColor(color);
      g2.fill(rectangle);
      
      //Get the bound of label.
      Font font = g2.getFont();
      FontRenderContext context = g2.getFontRenderContext();
      Rectangle2D labelBounds = font.getStringBounds(label, context);
      int widthOfLabel = (int) labelBounds.getWidth();
      int heightOfLabel = (int) labelBounds.getHeight();
      
      //Draw the label under the column.
      int basePointX = (int) (left + 0.5 * width - 0.5 * widthOfLabel);
      int basePointY = (int) (bottom + heightOfLabel + LABEL_BUFFER);
      g2.setColor(Color.BLACK);
      g2.drawString(label, basePointX, basePointY);
   }
}
