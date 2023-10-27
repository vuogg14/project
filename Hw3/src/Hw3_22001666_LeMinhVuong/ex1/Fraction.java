package Hw3_22001666_LeMinhVuong.ex1;

public class Fraction {
    private float numerator;
    private float denominator;

    public Fraction(float numerator, float denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    private int gcd(int a, int b) {
        int tmp = 0;
        while (b != 0) {
            tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    private void converse(Fraction fraction) {
        String stringNum = fraction.numerator + "";
        int countNum = 1;
        String stringDeno = fraction.denominator + "";
        int countDe = 1;
        for (int i = 0; i < stringNum.length(); i++) {
            if (i > stringNum.indexOf(".")) {
                countNum *= 10;
            }
        }

        for (int i = 0; i < stringDeno.length(); i++) {
            if (i > stringDeno.indexOf(".")) {
                countDe *= 10;
            }
        }
        if (countNum > countDe) {
            fraction.numerator *= countNum;
            fraction.denominator *= countNum;
        } else {
            fraction.numerator *= countDe;
            fraction.denominator *= countDe;
        }
    }

    public Fraction normalize(Fraction fraction) {
        converse(fraction);
        int gcd = gcd((int) fraction.denominator, (int) fraction.numerator);
        return new Fraction(fraction.numerator /= gcd, fraction.denominator /= gcd);
    }

    public Fraction add(Fraction c) {
        if (this.denominator == c.denominator) {
            return new Fraction(this.numerator + c.numerator, denominator);
        }
        return new Fraction(this.numerator * c.denominator + this.denominator * c.numerator, this.denominator * c.denominator);
    }

    public Fraction minus(Fraction c) {
        if (this.denominator == c.denominator) {
            return new Fraction(this.numerator - c.numerator, denominator);
        }
        return new Fraction(this.numerator * c.denominator - this.denominator * c.numerator, this.denominator * c.denominator);
    }

    public Fraction multi(Fraction c){
        return new Fraction(numerator * c.numerator, denominator * c.denominator);
    }

    public Fraction divi(Fraction c){
        return new Fraction(numerator * c.denominator, denominator * c.numerator);
    }

    // Kiểm tra 2 phân số có bằng nhau hay không
    public void equals(Fraction another){
        if(normalize(this).numerator == normalize(another).numerator
                && normalize(this).denominator == normalize(another).denominator){
            System.out.println("Two fractions are equal");
        } else {
            System.out.println("Two fractions are not equal");
        }
    }

    @Override
    public String toString() {
        return  numerator + "/" + denominator ;
    }
}
