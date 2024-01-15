import java.util.*;
public class CircleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println(area);
    }
}
