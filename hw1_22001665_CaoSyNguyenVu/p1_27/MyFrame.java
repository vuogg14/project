package hw1_22001665_CaoSyNguyenVu.p1_27;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBackground(Color.black);
        this.setResizable(false);
        this.add(new Calculator());
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

}
