import java.util.*;
public class Slash {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please insert a number : ");
        int num = input.nextInt();
        for (int i = 1; i <= num; i += 1){
            if (i % 5 == 0) {
                System.out.print("/");
            } else {
                System.out.print("|");
            }
        }
    }
    
}
