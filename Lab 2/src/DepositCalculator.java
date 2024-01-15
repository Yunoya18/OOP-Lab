import java.util.*;
class DepositCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Input your money : ");
        double deposit = input.nextDouble();
        System.out.print("Input your account type(Please type A B C or X in uppercase) : ");
        char account_type = input.next().charAt(0);
        if ( account_type == 'A' | account_type == 'C' ) {
            deposit *= 1.015;
        } else if ( account_type == 'B' ) {
            deposit *= 1.02;
        } else if ( account_type == 'X' ) {
            deposit *= 1.05;
        }
        System.out.println("Your total money in one year = " + deposit);
    }
}
