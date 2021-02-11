public class Main {

    public static void main(String[] args) {
        BankAccount bobsAccount = new BankAccount();

        BankAccount samsAccount = new BankAccount("3857391", 50.00, "Sam", "sam77@gmail.com", "01-294-2938-29");
        System.out.println(samsAccount.getAccountNumber());
        System.out.println(samsAccount.getBalance());
    }
}
