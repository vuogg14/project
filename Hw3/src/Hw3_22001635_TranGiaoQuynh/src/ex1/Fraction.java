package ex1;

public class Fraction {
    private float numerator;
    private float denominator;

    public Fraction(float numerator, float denominator) throws Exception {
        if(denominator == 0) {
            throw new Exception();
        } else {
            this.numerator = numerator;
            this.denominator = denominator;
        }
    }

    private float getLCM(float a, float b) {
        return (a/getGCD(a,b))*b;
    }
    private float getGCD(float a,float b){
        if (a == 0)
            return b;
        return getGCD(b % a, a);
    }
    public Fraction add(Fraction other) throws Exception {
        float newDenominator = getLCM(denominator,other.denominator);
        float newNumerator = numerator * (newDenominator/denominator) + other.numerator*(newDenominator/other.denominator);
        Fraction fraction = new Fraction(newNumerator, newDenominator);
        return normalize(fraction);

    }
    public Fraction minus(Fraction other) throws Exception {
        float newDenominator = getLCM(denominator,other.denominator);
        float newNumerator = numerator * (newDenominator/denominator) - other.numerator*(newDenominator/other.denominator);
        Fraction fraction = new Fraction(newNumerator, newDenominator);
        return normalize(fraction);}
    public Fraction multi(Fraction other) throws Exception {
        float newNumerator = numerator*other.numerator;
        float newDenominator = denominator*other.denominator;
        Fraction fraction = new Fraction(newNumerator, newDenominator);
        return normalize(fraction);
    }
    public Fraction divide(Fraction other) throws Exception {
        float newNumerator = numerator*other.denominator;
        float newDenominator = denominator*other.numerator;
        Fraction fraction = new Fraction(newNumerator,newDenominator);
        return normalize(fraction);
    }
    public Fraction normalize(Fraction other) throws Exception {
        float gcd = getGCD(other.numerator, other.denominator);
        float newNumerator = other.numerator/gcd;
        float newDenominator = other.denominator/gcd;
        Fraction fraction = new Fraction(newNumerator,newDenominator);
        return fraction;
    }
    public boolean compare(Fraction o1, Fraction o2) throws Exception {
        return o1.numerator*o2.denominator > o1.denominator*o2.numerator;
    }

    public float getNumerator() {
        return numerator;
    }

    public float getDenominator() {
        return denominator;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
