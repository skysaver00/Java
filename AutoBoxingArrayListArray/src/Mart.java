import java.util.ArrayList;

public class Mart {
    private String name;
    private ArrayList<Branch> branchName;

    public Mart(String name) {
        this.name = name;
        this.branchName = new ArrayList<Branch>();
    }

    public boolean addBranch(String name) {
        Branch branch = findBranch(name);
        if(branch == null) {
            this.branchName.add(new Branch(name));
            return true;
        } else return false;
    }

    public Branch findBranch(String name) {
        for(int i = 0; i < branchName.size(); i++) {
            Branch branch = branchName.get(i);
            if(branch.getName().equals(name)) return branch;
        } return null;
    }
}
