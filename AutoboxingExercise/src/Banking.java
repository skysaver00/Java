import java.util.ArrayList;

public class Banking {
    private String name;
    private ArrayList<Branch> branches;

    public Banking(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String name) {

    }

    public boolean addCustomer(String name) {

    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {

    }

    public Branch findBranch(String name) {
        for(int i = 0; i < branches.size(); i++) {
            Branch branch = branches.get(i);
            if(branch.)
        }
    }

    private boolean liftCustomers(String name) {

    }
}
