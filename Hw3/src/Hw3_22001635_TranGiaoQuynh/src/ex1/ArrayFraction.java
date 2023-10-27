package ex1;

import java.util.Arrays;

public class ArrayFraction {
    private Fraction[] fractions;

    public ArrayFraction(Fraction[] fractions) {
        this.fractions = fractions;
    }
    public Fraction get(int index) throws Exception {
        if(index > fractions.length || index < 0) {
            throw new Exception();
        } else {
            return fractions[index];
        }
    }
    public Fraction addMultiple() throws Exception {
        Fraction total = fractions[0];
        for (int i = 1; i < fractions.length; i++) {
            total = total.add(fractions[i]);
        }
        return total;
    }
    public Fraction minusMultiple() throws Exception {
        Fraction total = fractions[0];
        for (int i = 1; i < fractions.length; i++) {
            total = total.minus(fractions[i]);
        }
        return total;
    }
    public Fraction multiple() throws Exception {
        Fraction total = fractions[0];
        for (int i = 1; i < fractions.length; i++) {
            total = total.multi(fractions[i]);
        }
        return total;
    }
    public Fraction divideMultiple() throws Exception {
        Fraction total = fractions[0];
        for (int i = 1; i < fractions.length; i++) {
            total = total.divide(fractions[i]);
        }
        return total;
    }
    public void sortArr() throws Exception {
        Fraction fraction = fractions[0];
        for (int i = 0; i < fractions.length-1; i++) {
            for (int j = i+1; j < fractions.length; j++) {
                if(fraction.compare(fractions[i],fractions[j])){
                    Fraction tmp = fractions[i];
                    fractions[i] = fractions[j];
                    fractions[j] = tmp;
                }
            }
        }
    }
    public void print() {
        System.out.println(Arrays.toString(fractions));
    }
}
