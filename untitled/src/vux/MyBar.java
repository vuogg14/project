package vux;

import javax.swing.*;
import java.awt.*;

public class MyBar extends JPanel {
    JProgressBar bar;
    int[] xPoints = {50,40,60,50};
    int[] yPoints = {30,50,50,30};
    MyBar(){
        bar = new JProgressBar();
        bar.setMaximum(100);
        bar.setMinimum(0);
        bar.setValue(50);
        bar.setVisible(true);
        bar.setBackground(Color.BLACK);

        this.setPreferredSize(new Dimension(900, 600));
        this.add(bar);

    }
    public void paint(Graphics g){
        g.drawLine(50,50,50,550);
        g.drawLine(50,550,850,550);
        //g.drawPolyline(xPoints,yPoints, 4);
        g.fillPolygon(xPoints,yPoints, 4);
        for(int i=0; i<26; i++){
            g.drawString((char)(i+(int)'a')+"", 70+i*31,560);
        }
    }
}
