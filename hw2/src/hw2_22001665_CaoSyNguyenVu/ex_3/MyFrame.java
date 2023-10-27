package hw2_22001665_CaoSyNguyenVu.ex_3;

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
