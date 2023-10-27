package Hw3_22001604_DoChiKien.exc1;

public class Fraction {
    private float numerator;
    private float denominator;

    public Fraction(float numerator, float denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        normalize(this);
    }

    public float getNumerator() {
        return numerator;
    }

    public float getDenominator() {
        return denominator;
    }


    public void normalize(Fraction c) {
        if (this.numerator % 1 != 0 || this.denominator % 1 != 0) {
            String numerator = String.valueOf(c.numerator);
            String denominator = String.valueOf(c.denominator);
            int commaIdx = Math.max(numerator.length() - numerator.indexOf("."), denominator.length() - denominator.indexOf("."));
            double multiplyNum = Math.pow(10, commaIdx);
            c.numerator = Math.round(c.numerator * multiplyNum);
            c.denominator = Math.round(c.denominator * multiplyNum);
        }
        float gcd = GCD(c.numerator, c.denominator);
        c.numerator /= gcd;
        c.denominator /= gcd;
    }

    public float GCD(float a, float b) {
        float temp;
        while (b != 0) {
            temp = a;
            a = b;
            b = temp % b;
        }
        return a;
    }

    public float LCM(float a, float b) {
        return (a * b) / GCD(a, b);
    }

    public Fraction add(Fraction c) {
        if (Float.compare(this.denominator, c.denominator) == 0)
            return new Fraction(this.numerator + c.numerator, this.denominator);
        float lcm = LCM(this.denominator, c.denominator);
        float lcm1 = lcm / this.denominator;
        float lcm2 = lcm / c.denominator;
        return new Fraction(this.numerator * lcm1 + c.numerator * lcm2, this.denominator * lcm1);
    }

    public Fraction minus(Fraction c) {
        if (Float.compare(this.denominator, c.denominator) == 0)
            return new Fraction(this.numerator - c.numerator, this.denominator);
        float lcm = LCM(this.denominator, c.denominator);
        float lcm1 = lcm / this.denominator;
        float lcm2 = lcm / c.denominator;
        return new Fraction(this.numerator * lcm1 - c.numerator * lcm2, this.denominator * lcm1);
    }

    public Fraction multi(Fraction c) {
        return new Fraction(this.numerator * c.numerator, this.denominator * c.denominator);
    }

    public Fraction divi(Fraction c) {
        return new Fraction(this.numerator * c.denominator, this.denominator * c.numerator);
    }

    @Override
    public String toString() {
        if (this.numerator == 0) {
            return String.valueOf(0);
        } else if (this.denominator == 1) {
            return String.valueOf((int) this.numerator);
        }
        return (int) this.numerator + "/" + (int) this.denominator;
    }
}
