package net.hotdoguy90;

public class Complex {
    float real;
    float imag;

    public Complex(Float real, Float imaginary) {
        this.real = real;
        this.imag = imaginary;
    }

    public String show() {
        if (Math.abs(this.imag) != this.imag) {
            return "(" + this.real + this.imag + "j)";
        }
        return "(" + this.real + "+" + this.imag + "j)";
    }

    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imag + other.imag);
    }

    public Complex subtract(Complex other) {
        return new Complex(this.real - other.real, this.imag - other.imag);
    }

    public Complex multiply(Complex other) {
        return new Complex(this.real * other.real, this.imag * other.imag);
    }

    public Complex divide(Complex other) {
        return new Complex(this.real / other.real, this.imag / other.imag);
    }

    public double abs() {
        return Math.sqrt(Math.pow(this.real, 2) + Math.pow(this.imag, 2));
    }
}