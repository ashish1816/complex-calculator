public class ComplexCalculator {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(5, 5);
        ComplexNumber b = new ComplexNumber(12, 6);
        ComplexNumber c = new ComplexNumber(10, -3);

        System.out.println(a.multiply(b).add(c));

        // Add
        System.out.println("Addition");
        System.out.println(a.add(b));
        System.out.println(ComplexNumber.add(a, b));

        // Subtract
        System.out.println("Subtraction");
        System.out.println(a.subtract(b));
        System.out.println(ComplexNumber.subtract(a, b));

        // Multiply
        System.out.println("Multiplication");
        System.out.println(a.multiply(b));
        System.out.println(ComplexNumber.multiply(a, b));

        // Modulus
        System.out.println("Modulus of A");
        System.out.println(a.modulus());
        System.out.println(ComplexNumber.modulus(a));
        System.out.println("Modulus of B");
        System.out.println(b.modulus());
        System.out.println(ComplexNumber.modulus(b));

        // Division
        System.out.println("Division");
        System.out.println(a.divide(b));
        System.out.println(ComplexNumber.divide(a, b));
    }
}
