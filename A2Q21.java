class CustomArithmeticException extends Exception {
    public CustomArithmeticException(String message) {
        super(message);
    }
}
public class A2Q21 {

        public double calculate(double a, double b, char operator) throws CustomArithmeticException {
            switch (operator) {
                case '+':
                    return a + b;
                case '-':
                    return a - b;
                case '*':
                    return a * b;
                case '/':
                    if (b == 0) {
                        throw new CustomArithmeticException("Division by zero is not allowed.");
                    }
                    return a / b;
                case '%':
                    if (b == 0) {
                        throw new CustomArithmeticException("Modulus by zero is not allowed.");
                    }
                    return a % b;
                default:
                    throw new CustomArithmeticException("Invalid operator.");
            }
        }
    
        public static void main(String[] args) {
            Calculator calc = new Calculator();
    
            try {
                System.out.println("Result: " + calc.calculate(10, 0, '/'));
            } catch (CustomArithmeticException e) {
                System.out.println("Caught an exception: " + e.getMessage());
            }
    
            try {
                System.out.println("Result: " + calc.calculate(10, 0, '%'));
            } catch (CustomArithmeticException e) {
                System.out.println("Caught an exception: " + e.getMessage());
            }
    
            try {
                System.out.println("Result: " + calc.calculate(10, 5, '+'));
            } catch (CustomArithmeticException e) {
                System.out.println("Caught an exception: " + e.getMessage());
            }
        }
    }
    
