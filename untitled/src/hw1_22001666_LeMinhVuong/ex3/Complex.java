package hw1_22001666_LeMinhVuong.ex3;

public class Complex {
    private double real;
    private double img;

    public Complex(double real, double img) {
        this.real = real;
        this.img = img;
    }

    public Complex addComplex(Complex other) {
        return new Complex(other.real + real, other.img + img);
    }

    public Complex mulComplex(Complex other) {
        return new Complex(real * other.real - other.img * img
                , real * other.img + img * other.real);
    }

    @Override
    public String toString() {
        if(img > 0) {
            return real + " + " + img + 'i';
        } else if ( img == 0) {
            return real +"";
        } else {
            return real + " " + img + 'i';
        }
    }
}
