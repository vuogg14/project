package hw1_22001665_CaoSyNguyenVu.p1_27;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

public class ControlPanel extends JPanel {
    private JButton[] buttons;
    private HashMap<Integer, Character> keys;
    private String calculate = "";
    private String result = "";
    private boolean onClick = false;

    ControlPanel() {
        keys = new HashMap<>();

        this.setBounds(0, 200, 400, 400);
        this.setBackground(Color.black);
        this.setLayout(new GridLayout(4, 4, 3, 3));

        buttons = new JButton[17];
        for (int i = 0; i < 17; i++) {
            buttons[i] = new JButton();
            buttons[i].setFocusable(false);
            buttons[i].setBackground(Color.LIGHT_GRAY);
            buttons[i].setVisible(true);
            buttons[i].setFont(new Font("Mv Boli", Font.PLAIN, 20));
            this.add(buttons[i]);
        }

        setText();
        setKeyFunction();
    }

    public void setText() {
        buttons[0].setText("7");
        keys.put(0, '7');
        buttons[1].setText("8");
        keys.put(1, '8');
        buttons[2].setText("9");
        keys.put(2, '9');
        buttons[3].setText("clr");
        keys.put(3, 'c');
        buttons[4].setText(".");
        keys.put(4, '.');
        buttons[5].setText("4");
        keys.put(5, '4');
        buttons[6].setText("5");
        keys.put(6, '5');
        buttons[7].setText("6");
        keys.put(7, '6');
        buttons[8].setText("+");
        keys.put(8, '+');
        buttons[9].setText("-");
        keys.put(9, '-');
        buttons[10].setText("1");
        keys.put(10, '1');
        buttons[11].setText("2");
        keys.put(11, '2');
        buttons[12].setText("3");
        keys.put(12, '3');
        buttons[13].setText("x");
        keys.put(13, 'x');
        buttons[14].setText("/");
        keys.put(14, '/');
        buttons[15].setText("0");
        keys.put(15, '0');
        buttons[16].setText("=");
        keys.put(16, '=');
    }

    public void setKeyFunction() {
        buttons[0].addActionListener(e -> {
            calculate = calculate + keys.get(0);
            System.out.println(calculate);
        });
        buttons[1].addActionListener(e -> {
            calculate = calculate + keys.get(1);
            System.out.println(calculate);
        });
        buttons[2].addActionListener(e -> {
            calculate = calculate + keys.get(2);
            System.out.println(calculate);
        });
        buttons[3].addActionListener(e -> {
            calculate = "";
            onClick = false;
            System.out.println(calculate);
        });
        buttons[4].addActionListener(e -> {
            calculate = calculate + keys.get(4);
            System.out.println(calculate);
        });
        buttons[5].addActionListener(e -> {
            calculate = calculate + keys.get(5);
            System.out.println(calculate);
        });
        buttons[6].addActionListener(e -> {
            calculate = calculate + keys.get(6);
            System.out.println(calculate);
        });
        buttons[7].addActionListener(e -> {
            calculate = calculate + keys.get(7);
            System.out.println(calculate);
        });
        buttons[8].addActionListener(e -> {
            calculate = calculate + keys.get(8);
            System.out.println(calculate);
        });
        buttons[9].addActionListener(e -> {
            calculate = calculate + keys.get(9);
            System.out.println(calculate);
        });
        buttons[10].addActionListener(e -> {
            calculate = calculate + keys.get(10);
            System.out.println(calculate);
        });
        buttons[11].addActionListener(e -> {
            calculate = calculate + keys.get(11);
            System.out.println(calculate);
        });
        buttons[12].addActionListener(e -> {
            calculate = calculate + keys.get(12);
            System.out.println(calculate);
        });
        buttons[13].addActionListener(e -> {
            calculate = calculate + keys.get(13);
            System.out.println(calculate);
        });
        buttons[14].addActionListener(e -> {
            calculate = calculate + keys.get(14);
            System.out.println(calculate);
        });
        buttons[15].addActionListener(e -> {
            calculate = calculate + keys.get(15);
            System.out.println(calculate);
        });
        buttons[16].addActionListener(e -> {
            solve();
            calculate = "";
            onClick = true;
            System.out.println(calculate);
        });
    }

    public String getCalculate() {
        return calculate;
    }

    public String getResult() {
        return result;
    }

    public boolean getOnClick() {
        return onClick;
    }

    public void setResult() {
        result = "";
        onClick = false;
    }

    public void solve() {
        if (calculate.charAt(calculate.length() - 1) > '9' && calculate.charAt(calculate.length() - 1) < '0') {
            result = "error";
        } else if (calculate.charAt(0) == '/' || calculate.charAt(0) == 'x') {
            result = "error";
        } else if (calculate.indexOf(".") == 0 || calculate.lastIndexOf(".") == calculate.length() - 1) {
            result = "error";
        } else {
            for (int i = 1; i < calculate.length() - 1; i++) {
                if ((calculate.charAt(i) == '+' || calculate.charAt(i) == '-') && (calculate.charAt(i + 1) == '/' || calculate.charAt(i + 1) == 'x')) {
                    result = "error";
                    return;
                }
                if ((calculate.charAt(i) == '/' || calculate.charAt(i) == 'x') && (calculate.charAt(i + 1) == '/' || calculate.charAt(i + 1) == 'x')) {
                    result = "error";
                    return;
                }
                if ((calculate.charAt(i) > '9' || calculate.charAt(i) < '0') && (calculate.charAt(i + 1) == '.' || calculate.charAt(i - 1) == '.')) {
                    result = "error";
                    return;
                }
            }

            String analysis = "";
            String crr = "";
            for (int i = 0; i < calculate.length(); i++) {
                if (i == calculate.length() - 1) {
                    analysis = analysis + "|" + crr + calculate.charAt(i);
                    break;
                }
                if (!(crr.contains("0")
                        || crr.contains("1")
                        || crr.contains("2")
                        || crr.contains("3")
                        || crr.contains("4")
                        || crr.contains("5")
                        || crr.contains("6")
                        || crr.contains("7")
                        || crr.contains("8")
                        || crr.contains("9"))
                ) {
                    crr = crr + calculate.charAt(i);
                } else {
                    if (calculate.charAt(i) != '+' && calculate.charAt(i) != '-') {
                        crr = crr + calculate.charAt(i);
                    } else {
                        if (crr.charAt(crr.length() - 1) > '9' || crr.charAt(crr.length() - 1) < '0') {
                            crr = crr + calculate.charAt(i);
                        } else {
                            analysis = analysis + "|" + crr;
                            crr = "" + calculate.charAt(i);
                        }
                    }
                }
            }

            String[] groupsTmp = analysis.split("\\|");
            String[] groups = new String[groupsTmp.length - 1];
            System.arraycopy(groupsTmp, 1, groups, 0, groups.length);
            double res = 0;
            for (int i = 0; i < groups.length; i++) {
                res = res + parse(groups[i]);
            }

            if (result.equals("")) {
                result = result + (double) Math.round(res * 100) / 100;
            }
        }
    }

    private double parse(String number) {
        String[] numbers = number.split("[x/]");
        double[] convert = new double[numbers.length];
        for (int i = 0; i < convert.length; i++) {
            convert[i] = toNumber(numbers[i]);
        }
        String[] tmp = number.split("[0-9+\\-.]");
        int countNull = 0;
        for (int i = 0; i < tmp.length; i++) {
            if (tmp[i] == "") countNull++;
        }
        int run = 0;
        String[] calculation = new String[tmp.length - countNull];
        for (int i = 0; i < tmp.length; i++) {
            if (!tmp[i].equals("")) {
                calculation[run] = tmp[i];
                run++;
            }
        }

        double res = convert[0];
        for (int i = 0; i < calculation.length; i++) {
            if (calculation[i].equals("x")) {
                res = res * convert[i + 1];
            } else {
                if (convert[i + 1] != 0.0) {
                    res = res / convert[i + 1];
                } else {
                    result = "error";
                    throw new ArithmeticException();
                }
            }
        }
        return res;
    }

    private double toNumber(String number) {
        StringBuilder digit = new StringBuilder();
        int countSubtract = 0;
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == '-') countSubtract++;
            if ((number.charAt(i) <= '9' && number.charAt(i) >= '0') || number.charAt(i) == '.') {
                digit.append(number.charAt(i));
            }
        }
        return (countSubtract % 2 == 0) ? Double.parseDouble(digit.toString()) : -1 * Double.parseDouble(digit.toString());
    }
}
