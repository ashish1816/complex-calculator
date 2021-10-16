public class ComplexNumber {
    private double real;
    private double imaginary;

    // ======== Encapsulation =========
    // Getters
    public double getReal() {
        return real;
    }
    public double getImaginary() {
        return imaginary;
    }

    // Setters
    public void setReal(double real) {
        this.real = real;
    }
    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
        // Object o = new Object();
    }

    @Override
    public String toString() {

        return  Math.round(real*100.0)/100.0 + " +" + Math.round(imaginary*100.0)/100.0 + "i";
    }

    // ========= Polymorphism =========
    // Constructors
    public ComplexNumber() {
        this.real = 0;
        this.imaginary = 0;
    }

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // ==================   Methods   ==================
    // 1. Addition
    public ComplexNumber add(ComplexNumber c1) {
        ComplexNumber res = new ComplexNumber();
        res.setReal(this.getReal() + c1.getReal());
        res.setImaginary(this.getImaginary() + c1.getImaginary());

        return res;
    }

    public static ComplexNumber add(ComplexNumber c1, ComplexNumber c2) {
        return c1.add(c2);
    }

    // 2. Subtraction
    public ComplexNumber subtract(ComplexNumber c1) {
        ComplexNumber res = new ComplexNumber();
        res.setReal(this.getReal() - c1.getReal());
        res.setImaginary(this.getImaginary() - c1.getImaginary());

        return res;
    }

    public static ComplexNumber subtract(ComplexNumber c1, ComplexNumber c2) {
        return c1.subtract(c2);
    }

    // 3. Multiplication
    public ComplexNumber multiply(ComplexNumber c1) {
        ComplexNumber res = new ComplexNumber();
        res.setReal(this.getReal()*c1.getReal() - this.getImaginary()*c1.getImaginary());
        res.setImaginary(this.getReal()*c1.getImaginary() + this.getImaginary()*c1.getReal());

        return res;
    }

    public static ComplexNumber multiply(ComplexNumber c1, ComplexNumber c2) {
        return c1.multiply(c2);
    }

    // 4. Modulus
    public double modulus() {
        double result = Math.pow(this.getReal(), 2) + Math.pow(this.getImaginary(), 2);
        return Math.round(Math.sqrt(result)*100.0)/100.0;
    }

    public static double modulus(ComplexNumber c1) {
        return c1.modulus();
    }

    // 5. Division
    public ComplexNumber divide(ComplexNumber c1) {

        double mod = Math.pow(c1.modulus(), 2);
        if(mod==0.0) {
            throw new ArithmeticException("Division by zero not allowed");
        }

        ComplexNumber conjugate = new ComplexNumber(c1.getReal(), -1 * c1.getImaginary());
        ComplexNumber result = this.multiply(conjugate);
        result.setReal(result.getReal() / mod);
        result.setImaginary(result.getImaginary() / mod);
        return result;
    }

    public static ComplexNumber divide(ComplexNumber c1, ComplexNumber c2) {
        return c1.divide(c2);
    }
}
