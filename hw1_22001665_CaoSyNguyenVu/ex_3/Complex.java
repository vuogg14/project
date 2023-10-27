package hw1_22001665_CaoSyNguyenVu.ex_3;

public class Complex {
    private double real;
    private double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex plus(Complex other) {
        return new Complex(this.real + other.real, this.imaginary + other.imaginary);
    }

    public Complex times(Complex other) {
        return new Complex(this.real * other.real - this.imaginary * other.imaginary, this.real * other.imaginary + other.real * this.imaginary);
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        if (imaginary >= 0.0) {
            builder.append(String.format("%.2f+%.2fi", real, imaginary));
        }
        else {
            builder.append(String.format("%.2f%.2fi", real, imaginary));
        }
        return builder.toString();
    }
}
