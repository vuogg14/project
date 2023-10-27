package test;


import javax.swing.*;

public class MyFrame extends JFrame {
    public MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.add(new MyPanel());

        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
