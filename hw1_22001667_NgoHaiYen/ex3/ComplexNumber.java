package hw1_19_NgoHaiYen.ex3;

public class ComplexNumber {
    private double real;
    private double imag;

    public ComplexNumber() {
        this.real = 0.0;
        this.imag = 0.0;
    }

    public ComplexNumber(double x, double y) {
        this.real = x;
        this.imag = y;
    }

    public void setReal(double x) {
        this.real = x;
    }

    double getReal() {
        return this.real;
    }

    public void setImaginary(double y) {
        this.imag = y;
    }

    double getImaginary() {
        return this.imag;
    }

    public ComplexNumber add(ComplexNumber other) {
        double thuc = real + other.real;
        double ao = imag + other.imag;
        return new ComplexNumber(thuc, ao);
    }

    public ComplexNumber subtract(ComplexNumber other) {
        double thuc = real - other.real;
        double ao = imag - other.imag;
        return new ComplexNumber(thuc, ao);
    }

    public ComplexNumber mutiplly(ComplexNumber other) {
        double thuc = real * other.real - imag * other.imag;
        double ao = real * other.real + imag * other.imag;
        return new ComplexNumber(thuc,ao);
    }
    public ComplexNumber divide(ComplexNumber other) {
        double thuc = (double) Math.round((real * other.real + imag * other.imag) / (real * real + other.imag * other.imag)*100.0)/100;
        double ao = (double) Math.round((real * other.real - imag * other.imag) / (real * real + other.imag * other.imag)*100.0)/100;
        return new ComplexNumber(thuc, ao);
    }

    public String toString() {
        if (this.imag > 0)
            return this.real + " + " + this.imag + "i";
        else
            return this.real + " - " + Math.abs(this.imag) + "i";
    }
}
