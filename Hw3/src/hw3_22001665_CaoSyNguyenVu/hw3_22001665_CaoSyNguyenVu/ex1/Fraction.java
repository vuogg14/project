package hw3_22001665_CaoSyNguyenVu.ex1;

public class Fraction {
    private float numerator;
    private float denominator;

    public Fraction(float numerator, float denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction add(Fraction c) {
        isFraction(this);
        isFraction(c);
        normalize(this);
        normalize(c);
        if (this.numerator == 0) return new Fraction(c.numerator, c.denominator);
        if (c.numerator == 0) return new Fraction(this.numerator, this.denominator);
        if (this.denominator == c.denominator) {
            float crrNumerator = this.numerator + c.numerator;
            return normalize(new Fraction(crrNumerator, denominator));
        }
        float gcd = gCD((int) this.denominator, (int) c.denominator);
        return new Fraction(this.numerator * c.denominator / gcd + c.numerator * this.denominator / gcd, this.denominator / gcd * c.denominator);
    }

    public Fraction minus(Fraction c) {
        return add(new Fraction(-c.numerator, c.denominator));
    }

    public Fraction multi(Fraction c) {
        isFraction(this);
        isFraction(c);
        if (this.numerator == 0 || c.numerator == 0) return new Fraction(0, 1.0f);

        normalize(this);
        normalize(c);

        float gcd1 = gCD((int) this.numerator, (int) c.denominator);
        this.numerator /= gcd1;
        c.denominator /= gcd1;

        float gcd2 = gCD((int) c.numerator, (int) this.denominator);
        c.numerator /= gcd2;
        this.denominator /= gcd2;
        return new Fraction(this.numerator * c.numerator, this.denominator * c.denominator);
    }

    public Fraction divide(Fraction c) {
        isFraction(this);
        isFraction(c);
        if (c.numerator == 0.0f) {
            throw new ArithmeticException("Can't divide by 0");
        }
        return multi(new Fraction(c.denominator, c.numerator));
    }

    public Fraction normalize(Fraction c) {
        String sNumerator = "" + c.numerator;
        int pos1 = sNumerator.indexOf(".");
        int numeratorDecimal = (int) Math.pow(10, sNumerator.length() - pos1 - 1);


        String sDenominator = "" + c.denominator;
        int pos2 = sDenominator.indexOf(".");
        int denominatorDecimal = (int) Math.pow(10, sDenominator.length() - pos2 - 1);

        if (numeratorDecimal > denominatorDecimal) {
            c.denominator = Math.round(c.denominator * numeratorDecimal);
            c.numerator = Math.round(c.numerator * numeratorDecimal);
        } else if (numeratorDecimal < denominatorDecimal) {
            c.numerator = Math.round(c.numerator * denominatorDecimal);
            c.denominator = Math.round(c.denominator * denominatorDecimal);
        } else {
            c.denominator = Math.round(c.denominator * denominatorDecimal);
            c.numerator = Math.round(c.numerator * numeratorDecimal);
        }

        int gcd = gCD((int) c.numerator, (int) c.denominator);
        c.numerator /= gcd;
        c.denominator /= gcd;
        return c;
    }

    public float getNumerator() {
        return numerator;
    }

    public float getDenominator() {
        return denominator;
    }

    private int gCD(int a, int b) {
        if (b == 0) return a;
        if (a == 0) return b;
        if (a == b) return a;
        return gCD(b, a % b);
    }

    private void isFraction(Fraction c) {
        if (c.denominator == 0.0f) {
            throw new ArithmeticException("Can't divide by 0");
        }
    }

    public String toString() {
        normalize(this);
        return numerator + "/" + denominator;
    }
}
