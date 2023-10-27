package frequency;

import javax.swing.*;

public class DetailFrame extends JFrame {
    private final Paragraph paragraph;
    private JTable table;
    private JScrollPane pane;
    private final String[] col;
    private Object[][] data;
    public DetailFrame(Paragraph paragraph){
        this.paragraph = paragraph;

        col = new String[]{"Character", "Frequency"};
        data = getData();
        table = new JTable(data, col);
        table.setEnabled(false);
        pane = new JScrollPane(table);

        this.setTitle("DetailFrame");
        this.setResizable(false);
        this.add(pane);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    private Object[][] getData(){
        int[] frequencies = paragraph.calculateFrequency();
        Object[][] data = new Object[26][2];
        for(int i=0; i<26; i++){
            data[i][0] = (char)(i+'a');
            data[i][1] = frequencies[i];
        }
        return data;
    }
}
