public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String Email;
    private String phoneNumber;

    public void setAccountNumber(String Account) {
        this.accountNumber = Account;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setBalance(double Balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setCustomerName(String Name) {
        this.customerName = Name;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getEmail() {
        return this.Email;
    }

    public void setPhoneNumber(String Phone) {
        this.phoneNumber = Phone;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public double deposit(double value) {
        this.balance += value;
        return this.balance;
    }

    public double withdraw(double value) {
        if(this.balance < value) return -1;
        this.balance -= value;
        return this.balance;
    }
}
