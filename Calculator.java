// Is file mein ek chhota Calculator class hai jo do numbers ko add aur multiply karta hai.
// main() mein dono functions ko test karke result print kiya gaya hai.
public class Calculator {

    // Do numbers ka jama (sum) wapas karta hai
    public int add(int a, int b) {
        return a + b;
    }

    // Do numbers ka product wapas karta hai
    public int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Add: " + calc.add(5, 3));
        System.out.println("Multiply: " + calc.multiply(5, 3));
    }
}
