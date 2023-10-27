package hw3_22001667_NgoHaiYen.ex1;

public class Fraction {
    private float numerator;
    private float denominator;

    public Fraction(float numerator, float denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public float getNumerator() {
        return numerator;
    }

    public float getDenominator() {
        return denominator;
    }


    public Fraction add(Fraction c) {
        if (denominator == c.denominator) {
            float numerator = this.numerator + c.numerator;
            float denominator = this.denominator;
            return new Fraction(numerator, denominator);
        }
        float numerator = this.numerator * c.denominator + c.numerator * this.denominator;
        float denominator = this.denominator * c.denominator;
        return normalize(new Fraction(numerator, denominator));
    }

    public Fraction minus(Fraction c) {
        if (denominator == c.denominator) {
            float numerator = this.numerator - c.numerator;
            float denominator = this.denominator;
            return normalize(new Fraction(numerator, denominator));
        }
        float numerator = this.numerator * c.denominator - c.numerator * this.denominator;
        float denominator = this.denominator * c.denominator;
        return normalize(new Fraction(numerator, denominator));
    }

    public Fraction multi(Fraction c){
        float numerator = this.numerator*c.numerator;
        float denominator = this.denominator*c.denominator;
        return normalize(new Fraction(numerator, denominator));
    }

    public Fraction divi(Fraction c){
        Fraction temp = new Fraction(c.denominator, c.numerator);
        return this.multi(temp) ;
    }
    public Fraction normalize(Fraction c){
        float a = c.numerator;
        float b = c.denominator;
        while (b != 0) {
            float temp = b;
            b = a % b;
            a = temp;
        }
        c.numerator = c.numerator / a;
        c.denominator = c.denominator / a;
        return c;
    }

    public String toString(){
        this.normalize(this);
        if ( numerator == 0){
            return "0";
        } else if ( numerator == denominator ){
            return "1";
        }
        if ( numerator < 0 || denominator < 0 ){
            return "-"+Math.abs(numerator)+"/"+Math.abs(denominator);
        }
        return numerator+"/"+denominator;
    }
}
