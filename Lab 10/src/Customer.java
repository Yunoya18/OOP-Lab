public class Customer {
    private String firstName;
    private String lastName;
    private Account acct[];
    private int numOfAccount;
    public Customer() {
        this("", "");
    }
    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.numOfAccount = 0;
        acct = new Account[5];
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return this.lastName;
    }
    @Override
    public String toString() {
        if (acct[0] == null) {
            return this.getFirstName() + " " + this.getLastName() + " doesn’t have account.";
        } else {
            return "The " + this.getFirstName() + " account  has " + this.getNumOfAccount();
        }
    }
    public boolean equals(Customer c) {
        return this.getFirstName().equals(c.getFirstName()) && this.getLastName().equals(c.getLastName());
    }
    public void addAccount(Account ac) {
        for (int i = 0; i < 5; i++) {
            if (acct[i] == null) {
                acct[i] = ac;
                numOfAccount += 1;
                break;
            }
        }
    }
    public Account getAccount(int index) {
        return acct[index];
    }
    public int getNumOfAccount() {
        return this.numOfAccount;
    }
}
