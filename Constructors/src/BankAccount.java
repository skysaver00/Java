public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String Email;
    private String phoneNumber;

    //생성자는 클래스로부터 객체를 생성할때 호출되어 객체의 초기화를 담당한다.
    //인스턴스 변수의 초기화 작업에 주로 사용되고, 인스턴스가 생성될때 실행되어야
    //할 작업을 위해서도 사용된다.

    //객체의 기본 디폴트 값을 만드는데 생성자가 아주 요긴하게 쓰인다.
    //생성자의 이름은 항상 클래스의 이름과 같다. 그리고 리턴값이 존재하지 않는다.
    //생성자도 오버로딩이 가능하다. 따라서 하나의 클래스에 여러개의 생성자가 존재 가능
    //생성자도 메소드다. 그렇지만 모든 생성자는 리턴값이 없으므로 void를 생략 가능하다.

    //https://programmer-seva.tistory.com/79
    public BankAccount() {
        this("00000000", 0.00000, "Default", "aa@a.a.a", "00-000-0000-00");
        System.out.println("Empty Constructor Called!");
    }

    public BankAccount(String Number, double balance, String Name, String Email, String phoneNumber) {
        this.accountNumber = Number;
        this.balance = balance;
        this.customerName = Name;
        this.Email = Email;
        this.phoneNumber = phoneNumber;

        System.out.println("Account information added.");
    }

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
