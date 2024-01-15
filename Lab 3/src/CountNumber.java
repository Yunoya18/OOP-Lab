import java.util.*;
public class CountNumber {
    public static void main(String[] args) {
        int odd=0, even=0;
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        while (number != -1){
            if (number%2 == 0){
                even += 1;
            } else {
                odd += 1;
            }
            number = input.nextInt();
        }
        System.out.println("Odd number = " + odd + " and Even number = " + even);
    }
}
