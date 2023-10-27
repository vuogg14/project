package hw1_22001604_DoChiKien.exc3;

public class ComplexNumber {
    private final double real;
    private final double img;

    public ComplexNumber(double real, double img) {
        this.real = real;
        this.img = img;
    }

    public double getReal() {
        return real;
    }

    public double getImg() {
        return img;
    }

    @Override
    public String toString() {
        if (this.img == (int) this.img && this.real == (int) this.real) {
            if (real == 0 && img == 0) {
                return "0";
            } else if (real == 0) {
                return (int) this.img + "i";
            } else if (img == 0) {
                return String.valueOf((int) this.real);
            }
            return (this.img < 0) ? (int) this.real + " - " + -1 * (int) this.img + "i" : (int) this.real + " + " + (int) this.img + "i";
        } else if (this.real == (int) this.real) {
            if (real == 0 && img == 0) {
                return "0";
            } else if (real == 0) {
                return this.img + "i";
            } else if (img == 0) {
                return String.valueOf((int) this.real);
            }
            return (this.img < 0) ? (int) this.real + " - " + -1 * this.img + "i" : (int) this.real + " + " + this.img + "i";
        } else if (this.img == (int) this.img) {
            if (real == 0 && img == 0) {
                return "0";
            } else if (real == 0) {
                return (int) this.img + "i";
            } else if (img == 0) {
                return String.valueOf(this.real);
            }
            return (this.img < 0) ? this.real + " - " + -1 * (int) this.img + "i" : this.real + " + " + (int) this.img + "i";
        } else {
            if (real == 0 && img == 0) {
                return "0";
            } else if (real == 0) {
                return this.img + "i";
            } else if (img == 0) {
                return String.valueOf(this.real);
            }
            return (this.img < 0) ? this.real + " - " + -1 * this.img + "i" : this.real + " + " + this.img + "i";
        }
    }
}
