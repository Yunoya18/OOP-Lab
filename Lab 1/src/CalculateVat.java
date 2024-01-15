import java.util.*;
public class CalculateVat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double price = input.nextDouble();
        System.out.println(price * 107/100);
    }
}
