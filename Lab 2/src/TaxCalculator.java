import java.util.*;
public class TaxCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salary = input.nextDouble();
        double tax;
        if ( salary > 50000.00 ) {
            tax = salary * 10 / 100;
        } else {
            tax = salary * 5 /100;
        }
        System.out.println(tax);
    }
}
