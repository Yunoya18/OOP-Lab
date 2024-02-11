public class Employee {
    private static String nationality = "Thai";
    private String name;
    private Wallet wallet;
    private int energy;
    public static void setNationality(String nationality) {
        Employee.nationality = nationality;
    }
    public static String getNationality() {
        return Employee.nationality;
    }
    public void setName (String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setWallet (Wallet wallet) {
        this.wallet = wallet;
    }
    public Wallet getWallet() {
        return this.wallet;
    }
    public void setEnergy (int energy) {
        this.energy = energy;
    }
    public int getEnergy() {
        return this.energy;
    }
    public void eat(Food f) {
        this.setEnergy(this.getEnergy() + Food.getEnergy());
    }
    public boolean buyFood(Seller s) {
        Food f1 = s.sell(this);
        if (f1 != null) {
            eat(f1);
            return true;
        } else {
            return false;
        }
    }
    public boolean equals(Employee e) {
        if (e.getName().equals(this.getName())) {
            return true;
        } else {
            return false;
        }
    }
    public String toString() {
        return "My name is " + this.getName() + ". \nI have " + this.getEnergy() + " energy left.\nI have a balance of " + this.getWallet().getBalance() + " baht.";
    }
}
