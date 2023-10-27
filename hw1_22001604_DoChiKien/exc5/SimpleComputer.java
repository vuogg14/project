package hw1_22001604_DoChiKien.exc5;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class SimpleComputer {
    public SimpleComputer() {
    }

    public String inputData(Scanner scanner) throws Exception {
        System.out.println("Calculator (only enter a number or an operator(+,-,*,/) on each line, enter = to end the program)");
        StringBuilder myString = new StringBuilder();
        String input = scanner.next();
        String previosString = "";
        while (!input.equals("=")) {
            validString(input);
            validInputOrder(input, previosString);
            myString.append(input);
            previosString = input;
            input = scanner.next();
        }
        String checkString = "0123456789.";
        char myChar = previosString.charAt(0);
        if (myChar != '-') {
            for (int i = 0; i < previosString.length(); i++) {
                if (checkString.indexOf(previosString.charAt(i)) == -1) {
                    throw new Exception("Invalid input");
                }
            }
        } else {
            for (int i = 1; i < previosString.length(); i++) {
                if (checkString.indexOf(previosString.charAt(i)) == -1) {
                    throw new Exception("Invalid input");
                }
            }
        }
        myString.append("=");
        return myString.toString();
    }

    public void validString(String inputString) throws Exception {
        String checkString = "0123456789.";
        for (int idx = 0; idx < inputString.length(); idx++) {
            if (checkString.indexOf(inputString.charAt(idx)) != -1) {
                int pointIdx = inputString.indexOf('.');
                if (pointIdx != -1) {
                    if (pointIdx != inputString.lastIndexOf('.') || pointIdx == 0 || pointIdx == inputString.length() - 1 || (pointIdx == 1 && inputString.charAt(0) == '-')) {
                        throw new Exception("Invalid input");
                    }
                }
                char myChar = inputString.charAt(0);
                if (myChar == '-') {
                    for (int i = 1; i < inputString.length(); i++) {
                        if (checkString.indexOf(inputString.charAt(i)) == -1) {
                            throw new Exception("Invalid input");
                        }
                    }
                } else {
                    for (int i = 0; i < inputString.length(); i++) {
                        if (checkString.indexOf(inputString.charAt(i)) == -1) {
                            throw new Exception("Invalid input");
                        }
                    }
                }
                return;
            }
        }
        String checkString2 = "+-*/=";
        if (inputString.length() >= 2 || checkString2.indexOf(inputString.charAt(0)) == -1) {
            throw new Exception("Invalid input");
        }
    }

    public void validInputOrder(String inputString, String previousString) throws Exception {
        String checkString = "*/+-=";
        if (Objects.equals(previousString, "")) {
            if (checkString.indexOf(inputString.charAt(0)) != -1 && inputString.length() == 1) {
                throw new Exception("Invalid input");
            }
        }
        String checkString2 = "*/";
        String checkString3 = "+-";
        if ((checkString3.contains(previousString) && checkString2.contains(inputString) || (checkString2.contains(previousString) && checkString2.contains(inputString)))) {
            throw new Exception("Invalid input");
        }
    }

    public void printResult(Scanner scanner) throws Exception {
        List<String> list = getElements(inputData(scanner));
        double result = 0;
        String startString = list.get(0);
        if (startString.indexOf('*') != -1 || startString.indexOf('/') != -1) {
            int pointer = 0;
            while (startString.charAt(pointer) != '*' && startString.charAt(pointer) != '/') {
                pointer++;
            }
            result += convert(startString.substring(0, pointer));
            result = calculate(startString.substring(pointer), result);
        } else {
            result = convert(startString);
        }
        for (int idx = 1; idx < list.size(); idx++) {
            result += calculate(list.get(idx), 0);
        }
        System.out.println(result);
    }

    public List<String> getElements(String calculationExpresionString) {
        List<String> ans = new LinkedList<>();
        int pointer = 0;
        StringBuilder part = new StringBuilder();
        while (pointer < calculationExpresionString.length()) {
            char check = calculationExpresionString.charAt(pointer);
            if ((check >= '0' && check <= '9') || check == '*' || check == '/' || check == '.') {
                part.append(check);
                if (check == '*' || check == '/') {
                    pointer++;
                    while (calculationExpresionString.charAt(pointer) == '-' || calculationExpresionString.charAt(pointer) == '+') {
                        part.append(calculationExpresionString.charAt(pointer));
                        pointer++;
                    }
                    continue;
                }
            } else if (check == '+' || check == '-' || check == '=') {
                ans.add(part.toString());
                part.setLength(0);
                part.append(check);
                if (check == '+' || check == '-') {
                    pointer++;
                    while (calculationExpresionString.charAt(pointer) == '-' || calculationExpresionString.charAt(pointer) == '+') {
                        part.append(calculationExpresionString.charAt(pointer));
                        pointer++;
                    }
                    continue;
                }
            }
            pointer++;
        }
        return ans;
    }

    public double calculate(String expresionString, double ans) throws Exception {
        int pointer = 0;
        int check;
        StringBuilder num = new StringBuilder();
        int len = expresionString.length();
        while (pointer < len) {
            char operator = expresionString.charAt(pointer);
            check = 1;
            pointer++;
            while (expresionString.charAt(pointer) == '+' || expresionString.charAt(pointer) == '-') {
                if (expresionString.charAt(pointer) == '-') {
                    check *= -1;
                }
                pointer++;
            }
            while (pointer < len && ((expresionString.charAt(pointer) <= '9' && expresionString.charAt(pointer) >= '0') || expresionString.charAt(pointer) == '.')) {
                num.append(expresionString.charAt(pointer));
                pointer++;
            }
            switch (operator) {
                case '+' -> {
                    ans += (check * convert(num.toString()));
                    num.setLength(0);
                }
                case '-' -> {
                    check *= -1;
                    ans += (check * convert(num.toString()));
                    num.setLength(0);
                }
                case '*' -> {
                    ans *= (check * convert(num.toString()));
                    num.setLength(0);
                }
                case '/' -> {
                    double dividend = convert(num.toString());
                    if (Double.compare(dividend, 0) == 0) {
                        throw new Exception("Divide by zero error!!");
                    }
                    ans /= (dividend * check);
                    num.setLength(0);
                }
            }
        }
        return ans;
    }

    public double convert(String num) {
        double value = 0;
        int checkNegativeNum = num.indexOf('-');
        if (checkNegativeNum == 0) {
            int checkDecimalNum = num.indexOf(".");
            if (checkDecimalNum != -1) {
                for (int idx = 1; idx < checkDecimalNum; idx++) {
                    value = value * 10 + (num.charAt(idx) - 48);
                }
                double decimalPart = 0;
                for (int idx = checkDecimalNum + 1; idx < num.length(); idx++) {
                    decimalPart = decimalPart * 10 + (num.charAt(idx) - 48);
                }
                value += (decimalPart / Math.pow(10, (num.length() - checkDecimalNum - 1)));
            } else {
                for (int idx = 1; idx < num.length(); idx++) {
                    value = value * 10 + (num.charAt(idx) - 48);
                }
            }
            value *= -1;
        } else {
            int checkDecimalNum = num.indexOf(".");
            if (checkDecimalNum != -1) {
                for (int idx = 0; idx < checkDecimalNum; idx++) {
                    value = value * 10 + (num.charAt(idx) - 48);
                }
                double decimalPart = 0;
                for (int idx = checkDecimalNum + 1; idx < num.length(); idx++) {
                    decimalPart = decimalPart * 10 + (num.charAt(idx) - 48);
                }
                value += (decimalPart / Math.pow(10, (num.length() - checkDecimalNum - 1)));
            } else {
                for (int idx = 0; idx < num.length(); idx++) {
                    value = value * 10 + (num.charAt(idx) - 48);
                }
            }
        }
        return value;
    }
}
