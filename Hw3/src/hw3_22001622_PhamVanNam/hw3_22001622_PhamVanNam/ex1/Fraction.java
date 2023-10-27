package hw3_22001622_PhamVanNam.ex1;

public class Fraction {
    private float numerator;
    private float denominator;

    public Fraction() {
    }


    public Fraction(float numerator, float denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction add(Fraction c) {
        return new Fraction(numerator * c.getDenominator() + denominator * c.getNumerator(),
                denominator * c.getDenominator());
    }

    public Fraction minus(Fraction c) {
        return new Fraction(numerator * c.getDenominator() - denominator * c.getNumerator(),
                denominator * c.getDenominator());
    }

    public Fraction multi(Fraction c) {
        return new Fraction(numerator * c.getNumerator(),
                denominator * c.getDenominator());

    }

    public Fraction divi(Fraction c) {
        return new Fraction(numerator * c.getDenominator(),
                denominator * c.getNumerator());
    }

    public Fraction normalize(Fraction c) {
        float gcd = gcd(c.getNumerator(), c.getDenominator());
        return new Fraction(c.getNumerator() / gcd, c.getDenominator() / gcd);
    }

    private float gcd(float x, float y) {
        if (y == 0) return x;
        return gcd(y, x % y);
    }

    public String compare(Fraction c) {
        if (numerator * c.getDenominator() > c.getNumerator() * denominator) {
            return this + " is the larger number";
        } else if (numerator * c.getDenominator() < c.getNumerator() * denominator) {
            return c + " is the larger number";
        }
        return this + "=" + c;
    }


    public float getNumerator() {
        return numerator;
    }

    public float getDenominator() {
        return denominator;
    }


    @Override
    public String toString() {
        if (denominator == 0) return "error";
        return numerator + "/" + denominator;
    }
}
