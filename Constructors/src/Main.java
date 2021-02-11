public class Main {

    public static void main(String[] args) {
        BankAccount bobsAccount = new BankAccount();

        BankAccount samsAccount = new BankAccount("3857391", 50.00, "Sam", "sam77@gmail.com", "01-294-2938-29");
        System.out.println(samsAccount.getAccountNumber());
        System.out.println(samsAccount.getBalance());

        BankAccount timsAccount = new BankAccount("tim", "tim@gamil.com", "02-393-3948-15");

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getVipName());

        VipCustomer person2 = new VipCustomer("Bob", 2000000.00);

        VipCustomer person3 = new VipCustomer("Tim", 250000.00, "tim@gamil.com");
        
    }
}
