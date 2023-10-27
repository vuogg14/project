package hw2_22001665_CaoSyNguyenVu.ex_3;

import javax.swing.*;
import java.awt.*;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MyPanel extends JPanel {
    ImageIcon[] images;
    JLabel[] labels;
    List<Card> cards;
    Button sort;
    Button shuffle;

    public MyPanel() {

        this.setPreferredSize(new Dimension(1739, 987));
        this.setLayout(null);
        this.setBackground(new Color(100, 200, 100));
        images = new ImageIcon[52];
        labels = new JLabel[52];
        cards = (new CreateCard()).getCards();

        int xPos = 0;
        int yPos = 0;
        int countColumn = 0;
        for (int i = 0; i < cards.size(); i++) {
            labels[i] = new JLabel();
            images[i] = new ImageIcon("src/hw2_22001665_CaoSyNguyenVu/ex_3/Card/" + cards.get(i).getFile());
            labels[i].setBounds(xPos, yPos, images[i].getIconWidth() + 2, images[i].getIconHeight() + 2);
            labels[i].setIcon(images[i]);
            labels[i].setVisible(true);
            labels[i].setBackground(new Color(74, 179, 50));
            labels[i].setOpaque(true);
            xPos += images[i].getIconWidth();
            countColumn++;
            if (countColumn == 13) {
                xPos = 0;
                yPos = yPos + images[i].getIconHeight() + 5;
                countColumn=0;
            }
            System.out.println(i);
            this.add(labels[i]);
        }

        sort = new Button("SORT");
        sort.setBounds(200, yPos+30, 150,70);
        sort.setFont(new Font("Arial", Font.BOLD,30));
        sort.setFocusable(true);
        sort.addActionListener(e -> {
            sortCard();
        });
        this.add(sort);

        shuffle = new Button("SHUFFLE");
        shuffle.setBounds((int)this.getPreferredSize().getWidth()-350, yPos+30, 150,70);
        shuffle.setFont(new Font("Arial", Font.BOLD,30));
        shuffle.setFocusable(true);
        shuffle.addActionListener(e -> {
            shuffleCard();
        });
        this.add(shuffle);


    }

    private void swap(List<Card> cards, int index1, int index2){
        Card old = cards.set(index1, cards.get(index2));
        cards.set(index2, old);
    }
    private void shuffleCard() {
        for(int i=0; i<cards.size(); i++){
            Random random = new Random();
            int index = random.nextInt(20);
            swap(cards, i, index);
        }
        int k = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 13; j++) {
                int pos = i + (j - 1) * 4;
                labels[k].setIcon(new ImageIcon("src/hw2_22001665_CaoSyNguyenVu/ex_3/Card/" + cards.get(pos).getFile()));
                k++;
            }
        }
    }



    public void sortCard() {
        Collections.sort(cards, new CompareCard());
        int k = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 13; j++) {
                int pos = i + (j - 1) * 4;
                labels[k].setIcon(new ImageIcon("src/hw2_22001665_CaoSyNguyenVu/ex_3/Card/" + cards.get(pos).getFile()));
                k++;
            }
        }
    }
}
