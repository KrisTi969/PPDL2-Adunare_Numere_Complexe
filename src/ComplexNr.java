/**
 * Created by crys_ on 19.10.2017.
 */
public class ComplexNr {
    private double real;
    private double imag;

    public ComplexNr(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    public ComplexNr() {
        real = 0;
        imag = 0;
    }

    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    @Override
    public String toString() {
        return  real + " " + imag + "i";
    }
    public void add (ComplexNr nr) {
        this.real = this.real + nr.real;
        this.imag = this.imag + nr.imag;
    }
    public void sub (ComplexNr nr) {
        this.real = this.real - nr.real;
        this.imag = this.imag - nr.imag;
    }

    public static void main (String[] args) {
        ComplexNr c1 = new ComplexNr(4.2,4.1);
        ComplexNr c2 = new ComplexNr(8.4, 4.2);
        ComplexNr res = new ComplexNr();

        c1.add(c2);
        System.out.println(c1.toString());
    }

}
