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
    public void setpriority(int priority){
        this.priority = priority;
    }
    public void paint(Graphics g){
        if(priority < 3){
            g.setColor(Color.green);
        } else if (priority >= 3 && priority < 5) {
            g.setColor(Color.yellow);
        } else if (priority == 5){
            g.setColor(Color.red);
        }
        int i = 0;
        for (i = 0; i < this.priority; i++) {
            g.fillOval(x + radius*i, y+4, radius, radius);
        }
        for (int j = 0; j < 5 - this.priority; j++) {
            g.drawOval(x + radius*i+radius*j, y+4, this.radius, this.radius);
        }
    }
}
