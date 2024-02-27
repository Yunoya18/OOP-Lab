public class CheckingAccount extends Account{
    private double credit;
    public CheckingAccount() {
        this(0, "", 0);
    }
    public CheckingAccount(double balance, String name, double credit) {
        super(balance, name);
        this.credit = credit;
    }
    public void setCredit(double credit) {
        if (credit > 0) {
            this.credit = credit;
        } else {
            System.out.println("Input number must be a positive integer.");
        }
    }
    public double getCredit() {
        return this.credit;
    }
    @Override
    public void withdraw(double a) {
        if (this.getBalance() - a >= 0) {
            this.setBalance(this.getBalance() - a);
            System.out.println(a + " baht is withdrawn from " + this.getName() + " and your credit balance is " + this.getCredit() + ".");
        } else if (this.getBalance() - a + credit >= 0) {
            this.setCredit(credit + this.getBalance() - a);
            this.setBalance(0);
            System.out.println(a + " baht is withdrawn from " + this.getName() + " and your credit balance is " + this.getCredit() + ".");
        } else if (this.getBalance() - a + credit < 0) {
            System.out.println("Not enough money!");
        }
    }
    public void withdraw(String a) {
        this.withdraw(Double.parseDouble(a));
    }
    public String toString() {
        return "The " + this.getName() + " account has " + this.getBalance() + " baht and " + this.getCredit() + " credits.";
    }
}
