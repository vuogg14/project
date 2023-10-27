package vux;

import javax.swing.*;

public class MyFrame extends JFrame {
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.add(new MyBar());
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
