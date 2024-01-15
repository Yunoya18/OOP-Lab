import java.util.*;
public class ChangeTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hour = input.nextInt();
        int minute = input.nextInt();
        System.out.println(hour*60*60 + minute * 60);
    }
}
