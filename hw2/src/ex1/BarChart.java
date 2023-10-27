package ex1;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class BarChart extends JFrame {
    private Map<String, Integer> data;

    public BarChart() {


        data = new HashMap<>();
        data.put("bubble sort", 16);
        data.put("insertion sort", 20);
        data.put("selection sort", 15);
        data.put("merge sort", 30);
        data.put("quick sort", 18);

        setTitle("Bar Chart Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;

        int x = 50; // X-coordinate of the first bar
        int barWidth = 50; // Width of each bar
        int maxBarHeight = 200; // Maximum height of the bars

        for (Map.Entry<String, Integer> entry : data.entrySet()) {
            String category = entry.getKey();
            int value = entry.getValue();

            int barHeight = (int) ((double) value / getMaxValue() * maxBarHeight);
            int y = getHeight() - barHeight - 50; // Y-coordinate of the top of the bar

            g2d.setColor(Color.GREEN);
            g2d.fillRect(x, y, barWidth, barHeight);

            g2d.setColor(Color.BLACK);
            g2d.drawString(category, x, getHeight() - 20);

            x += 2 * barWidth; // Increase x-coordinate for the next bar
        }
    }

    private int getMaxValue() {
        int maxValue = Integer.MIN_VALUE;
        for (int value : data.values()) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            BarChart example = new BarChart();
            example.setVisible(true);
        });
    }
}

