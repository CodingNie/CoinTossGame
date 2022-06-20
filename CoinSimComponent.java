package Coin;

// Name: Ning Nie
// USC NetID: nnie
// CS 455 PA1
// Spring 2022

import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;

   /**
      This is the simulator component,which is used to draw the three bars graph.
   */   
public class CoinSimComponent extends JComponent{
   private int numTrials;
   private int numTwoHeads;
   private int numTwoTails;
   private int numHeadTails;
   private double percentOfTwoHeads;
   private double percentOfTwoTails;
   private double percentOfHeadTails;
   public static final int BAR_WIDTH = 60;
   private static final int VERTICAL_BUFFER = 50;
   
   /**
      The constructor's input is directly from the coin toss simulator.
   */  
   public CoinSimComponent(int numTrials){
      this.numTrials = numTrials;
      CoinTossSimulator toss = new CoinTossSimulator();
      toss.run(numTrials);
      this.numTwoHeads = toss.getTwoHeads();
      this.numTwoTails = toss.getTwoTails();
      this.numHeadTails = toss.getHeadTails();
      this.numTrials = toss.getNumTrials();
      this.percentOfTwoHeads = (double) numTwoHeads / numTrials;
      this.percentOfTwoTails = (double) numTwoTails / numTrials;
      this.percentOfHeadTails = (double) numHeadTails / numTrials;
      
   }
   /**
      Override the paint component.
      Paint the three bars graph by passing the value of the toss simulator result.
   */  
   public void paintComponent(Graphics g){
      Graphics2D g2 = (Graphics2D) g;
      
      int windowWidth = getWidth();
      int windowHeight = getHeight();
      int bottom = windowHeight - VERTICAL_BUFFER;
      int barHeight = windowHeight - 2 * VERTICAL_BUFFER;
      
      // Draw the three bars graph, passing the value to each bar object.
      Bar bar1 = new Bar(bottom, (int)(0.25 * windowWidth - 0.5 * BAR_WIDTH), BAR_WIDTH, barHeight, percentOfTwoHeads, Color.RED, "Two Heads: " + numTwoHeads + " (" + Math.round(100 * percentOfTwoHeads) + "%)");
      Bar bar2 = new Bar(bottom, (int)(0.5 * windowWidth - 0.5 * BAR_WIDTH), BAR_WIDTH, barHeight, percentOfHeadTails, Color.GREEN,"A Head and a Tail: " + numHeadTails + " (" + Math.round(100 * percentOfHeadTails) + "%)" );
      Bar bar3 = new Bar(bottom, (int)(0.75 * windowWidth - 0.5 * BAR_WIDTH), BAR_WIDTH, barHeight, percentOfTwoTails, Color.BLUE, "Two Tails: " + numTwoTails + " (" + Math.round(100 * percentOfTwoTails) + "%)");
      
      bar1.draw(g2);
      bar2.draw(g2);
      bar3.draw(g2);
      
   }
}
