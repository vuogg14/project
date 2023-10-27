package frequency;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class MyChart extends JPanel implements ActionListener {
    private int[] xPoints = {80, 70, 90, 80};
    private int[] yPoints = {30, 50, 50, 30};
    private DetailFrame detailFrame;
    private Paragraph paragraph;
    private JButton newPara;
    private JButton detail;

    public MyChart() {
        paragraph = new Paragraph();
        paragraph.setPara("abcdefghijklmnopqrstuvwxyz");

        newPara = new JButton("+ NEW PARAGRAPH");
        newPara.setVisible(true);
        newPara.setBounds(400, 0, 150, 40);
        newPara.setFocusable(false);
        newPara.setBackground(Color.LIGHT_GRAY);
        newPara.addActionListener(this);

        detail = new JButton("detail");
        detail.setVisible(true);
        detail.setBounds(830, 0, 70, 40);
        detail.setFocusable(false);
        detail.setBackground(Color.LIGHT_GRAY);
        detail.addActionListener(this);

        this.setPreferredSize(new Dimension(900, 600));
        this.setLayout(null);
        this.add(newPara);
        this.add(detail);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g2D) {
        g2D.setFont(new Font("Arial", Font.PLAIN, 12));
        g2D.drawLine(80, 50, 80, 550);
        g2D.drawLine(850, 550, 80, 550);
        g2D.fillPolygon(xPoints, yPoints, 4);

        for (int i = 0; i < 26; i++) {
            g2D.drawString("" + (char) (i + 'a'), 100 + 29 * i, 565);
        }

        int[] pivot = {paragraph.getTotalWords() / 2
                , paragraph.getTotalWords() / 4
                , paragraph.getTotalWords() * 3 / 8
                , paragraph.getTotalWords() / 8
                , 0};

        for (int i = 0; i < 5; i++) {
            if (i == 0) {
                g2D.fillOval(77, 547, 6, 6);
            } else {
                g2D.drawLine(77, 430 - (i - 1) * 120, 83, 430 - (i - 1) * 120);
            }

            g2D.drawString("" + pivot[i], 70 - ("" +  pivot[i]).length() * 5, 75 + i * 120);
        }

        for (int i = 0; i < paragraph.calculateFrequency().length; i++) {
            g2D.setColor(new Color(20, 100, 50));
            g2D.fillPolygon(new int[]{95 + i * 29, 95 + i * 29, 110 + i * 29, 110 + i * 29}, new int[]{550, 550 - paragraph.calculateFrequency()[i] * 480 * 2 / paragraph.getTotalWords(), 550 - paragraph.calculateFrequency()[i] * 480 * 2 / paragraph.getTotalWords(), 550}, 4);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == newPara) {
            JFileChooser chooser = new JFileChooser();
            int response = chooser.showOpenDialog(null);
            if (response == JFileChooser.APPROVE_OPTION) {
                File file = new File(chooser.getSelectedFile().getAbsolutePath());
                try {
                    BufferedReader reader = new BufferedReader(new FileReader(file));
                    String s = "";
                    String line;
                    while ((line = reader.readLine()) != null) {
                        s = s + line;
                    }
                    paragraph.setPara(s);
                } catch (Exception ex) {
                    System.out.println("Error");
                }
            }
        }
        if (e.getSource() == detail) {
            detailFrame = new DetailFrame(paragraph);
        }
        repaint();
    }
}
