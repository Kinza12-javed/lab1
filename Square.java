// Is file mein ek number ka square (number x number) nikalne wala method hai.
// main() mein 5 ka square print hota hai (result 25).
public class Square {

    // Diye gaye number ka square wapas karta hai
    public int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {
        Square obj = new Square();
        System.out.println("Square of 5 = " + obj.square(5));
    }
}
