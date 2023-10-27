package frequency;

import javax.swing.*;

public class MyFrame extends JFrame {
    public MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.add(new MyChart());

        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
