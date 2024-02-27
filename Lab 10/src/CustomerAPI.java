import java.util.*;
public class CustomerAPI {
    private String firstName;
    private String lastName;
    private ArrayList acct;
    public CustomerAPI() {
        this("", "");
    }
    public CustomerAPI(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        acct = new ArrayList();
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
        if (acct == null) {
            return this.getFirstName() + " " + this.getLastName() + " doesn’t have account.";
        } else {
            return "The " + this.getFirstName() + " account  has " + this.getNumOfAccount();
        }
    }
    public boolean equals(Customer c) {
        return this.getFirstName().equals(c.getFirstName()) && this.getLastName().equals(c.getLastName());
    }
    public void addAccount(Account ac) {
        acct.add(ac);
    }
    public Account getAccount(int index) {
        return (Account) acct.get(index);
    }
    public int getNumOfAccount() {
        return acct.size();
    }
}