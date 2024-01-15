import java.util.*;
public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please insert your name : ");
        String name = input.nextLine();
        System.out.print("Please insert your age : ");
        int age = input.nextInt();
        System.out.print("Please insert number of working days : ");
        int numDay1 = input.nextInt();
        System.out.print("Please insert number of absent days : ");
        int numDay2 = input.nextInt();
        System.out.print("Please insert your body weight : ");
        double weight = input.nextDouble();
        int salary = 0;
        double bonus = 0;
        if ( ( 21 <= age ) && ( age <= 30 ) ) {
            salary = (numDay1 * 300) - (numDay2 * 50);
        } else if ( ( 31 <= age ) && ( age <= 40 ) ) {
            salary = (numDay1 * 500) - (numDay2 * 50);
        } else if ( ( 41 <= age ) && ( age <= 50 ) ) {
            salary = (numDay1 * 1000) - (numDay2 * 25);
        } else if ( ( 51 <= age ) && ( age <= 60 ) ) {
            salary = (numDay1 * 3000);
        }
        if ( ( 10 <= weight ) && ( weight <= 60 ) ) {
            bonus = salary + 5000;
        } else if ( ( 61 <= weight ) && ( weight <= 90 ) ) {
            bonus = salary + (5000 - ((weight - 60) * 10));
        }
        System.out.println("Hi, " + name);
        System.out.println("Your salary is "+ salary +" Baht");
        System.out.println("Your salary and bonus is " + bonus + " Baht");
    }
}
