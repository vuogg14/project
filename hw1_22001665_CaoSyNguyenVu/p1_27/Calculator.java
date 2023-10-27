package hw1_22001665_CaoSyNguyenVu.p1_27;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JPanel implements ActionListener {
    private ControlPanel controlPanel;
    Timer timer;

    public Calculator() {
        timer = new Timer(10,this);
        timer.start();

        controlPanel = new ControlPanel();

        this.setPreferredSize(new Dimension(400, 600));
        this.setBackground(Color.BLACK);
        this.setLayout(null);
        this.add(controlPanel);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g) {

        g.setColor(Color.WHITE);
        g.setFont(new Font("Mv Boli", Font.PLAIN, 50));
        g.drawLine(0, 100, 400, 100);
        g.drawString(controlPanel.getCalculate(), 10, 60);
        if(controlPanel.getOnClick()==true){
            g.drawString(controlPanel.getResult(), 400-controlPanel.getResult().length()*30, 160);
            if(controlPanel.getCalculate()!=""){
                controlPanel.setResult();
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}
