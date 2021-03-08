import java.lang.reflect.Array;
import java.util.ArrayList;

public class Banking {
    private String name;
    private ArrayList<Branch> branches;

    public Banking(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String name) {
        Branch branch = findBranch(name);
        if(branch == null) {
            this.branches.add(new Branch(name));
            return true;
        } else return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            return branch.newCustomer(customerName, initialTransaction);
        } else return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            return branch.addCustomerTransaction(customerName, transaction);
        } else return false;
    }

    private Branch findBranch(String name) {
        for(int i = 0; i < branches.size(); i++) {
            Branch branch = branches.get(i);
            if(branch.getName().equals(name)) {
                return branch;
            }
        }
        return null;
    }

    public boolean listCustomers(String name, boolean printTransaction) {
        Branch branch = findBranch(name);
        if(branch != null) {
            System.out.println("Customer details for branch " + name);

            ArrayList<Customer> customer = branch.getCustomers();
            for(int i = 0; i < customer.size(); i++) {
                Customer customer1 = customer.get(i);
                System.out.println("Customer: " + customer1.getName() + "[" + (i + 1) + "]");
                if(printTransaction) {
                    System.out.println("Transactions");
                    ArrayList<Double> transaction = customer1.getTransactions();
                    for(int j = 0; j < transaction.size(); j++) {
                        System.out.println("[" + (j + 1) + "] Amount " + transaction.get(j));
                    }
                }
            }
            return true;
        } else return false;
    }
}
