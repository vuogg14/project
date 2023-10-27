package test;


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MyPanel extends JPanel {
    ImageIcon[] images;
    JLabel[] labels;
    List<Card> cards;
    Button sort;
    Button shuffle;
    BufferedImage[] bufferedImages;
    Dimension dimension;
    int newWidth;
    int newHeight;
    int widthSource = 1739;
    int heightSource = 987;

    public MyPanel() {
        dimension = Toolkit.getDefaultToolkit().getScreenSize();
        this.setPreferredSize(dimension);
        System.out.println(this.getPreferredSize().getWidth() + " " + this.getPreferredSize().getHeight());
        this.setLayout(null);
        this.setBackground(new Color(74, 179, 50));
        images = new ImageIcon[52];
        labels = new JLabel[52];
        cards = (new CreateCard()).getCards();
        bufferedImages = new BufferedImage[52];

        int xPos = 0;
        int yPos = 0;
        int countColumn = 0;
        for (int i = 0; i < cards.size(); i++) {
            labels[i] = new JLabel();
            images[i] = new ImageIcon("src/test/Card/" + cards.get(i).getFile());
        }
        newWidth = images[0].getIconWidth() * dimension.width / widthSource;
        newHeight = images[0].getIconHeight() * dimension.height / heightSource;

        sort = new Button("SORT");
        sort.setBounds(200, newHeight * 4 + 40, 150, 70);
        sort.setFont(new Font("Arial", Font.BOLD, 30));
        sort.setFocusable(true);
        sort.addActionListener(e -> {
            sortCard();
            repaint();
        });
        this.add(sort);

        shuffle = new Button("SHUFFLE");
        shuffle.setBounds((int) this.getPreferredSize().getWidth() - 350, newHeight * 4 + 40, 150, 70);
        shuffle.setFont(new Font("Arial", Font.BOLD, 30));
        shuffle.setFocusable(true);
        shuffle.addActionListener(e -> {
            shuffleCard();
            repaint();
        });
        this.add(shuffle);
    }


    private void swap(List<Card> cards, int index1, int index2) {
        Card old = cards.set(index1, cards.get(index2));
        cards.set(index2, old);
    }

    private void shuffleCard() {
        for (int i = 0; i < cards.size(); i++) {
            Random random = new Random();
            int index = random.nextInt(20);
            swap(cards, i, index);
        }
    }


    public void sortCard() {
        Collections.sort(cards, new CompareCard());
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g) {
        int xPos = 0;
        int yPos = 0;
        int countRows = 0;
        Graphics2D g2 = (Graphics2D) g;
        for(int i=0; i<cards.size(); i++){
            try {
                bufferedImages[i] = ImageIO.read(new File("src/test/Card/" + cards.get(i).getFile()));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        for (int i = 0; i < cards.size(); i++) {
            g2.drawImage(bufferedImages[i], xPos, yPos, newWidth, newHeight, null);
            yPos += (newHeight+5);
            countRows++;
            if (countRows == 4) {
                yPos = 0;
                xPos = xPos + newWidth;
                countRows = 0;
            }
        }
    }
}
