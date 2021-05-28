/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isak.ahlberg
 */
import java.awt.Graphics;
import java.awt.Color;
public class priorityGraphics {
    private int radius = 10;
    private int priority;
    private int x = 0;
    private int y = 0;
    
    public priorityGraphics(int priority){
        this.priority = priority;
    }
    // sets the priority, used by GraphArea.
    public void setpriority(int priority){
        this.priority = priority;
    }
    public void paint(Graphics g){
        /*
        Creates a line of 5 circles and fills priority amount of cirkles rest are hollow.
        If priority is < 3 the circles are green, low priority
        If priority is 3 or 4 the circles are yellow, medium priority
        If the priority is 5 the cirkles are red, high priority
        */
        if(priority < 3){
            g.setColor(Color.green);
        } else if (priority >= 3 && priority < 5) {
            g.setColor(Color.yellow);
        } else if (priority == 5){
            g.setColor(Color.red);
        }
        int i = 0;
        // Creates priority amount of filled circles.
        // x + radius*i moves the cirkles to create an even distance.
        // y+4 adjusts the y placement to better suit the label location.
        for (i = 0; i < this.priority; i++) {
            g.fillOval(x + radius*i, y+4, radius, radius);
        }
        // Creates the rest of the cirkles
        // x + radius*i + radius*j contiues where x + radius*i left off.
        for (int j = 0; j < 5 - this.priority; j++) {
            g.drawOval(x + radius*i+radius*j, y+4, this.radius, this.radius);
        }
    }
}
