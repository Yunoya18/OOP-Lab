public class Bank {
    private Account acct[];
    private int numAcct;
    public Bank() {
        acct = new Account[10];
        numAcct = 0;
    }
    public void addAccount(Account ac) {
        for (int i = 0; i < 10; i++) {
            if (acct[i] == null) {
                acct[i] = ac;
                numAcct += 1;
                break;
            }
        }
    }
    public Account getAccount(int index) {
        return acct[index];
    }
    public int getNumAccount(){
        return numAcct;
    }
}
