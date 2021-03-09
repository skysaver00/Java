import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    private static Mart mart = new Mart("Hypernova!!!");

    public static void main(String[] args) {
        boolean quit = false;

        System.out.println("Welcome to " + mart.getName());

        while(!quit) {
            System.out.println("6 actions are available");
            System.out.println("Enter 0: Shut down");
            System.out.println("Enter 1: Show Branch");
            System.out.println("Enter 2: Add Branch");
            System.out.println("Enter 3: Show Item");
            System.out.println("Enter 4: Add Item");
            System.out.println("Enter 5: Modify Item");
            System.out.println("Enter Action: ");

            int action = scan.nextInt();
            scan.nextLine();

            switch(action) {
                case 0:
                    System.out.println("Shutting down\n");
                    quit = true;
                    break;

                case 1:
                    showBranch();
                    break;

                case 2:
                    addBranch();
                    break;

                case 3:
                    showItem();
                    break;

                case 4:
                    addItem();
                    break;

                case 5:
                    modifyItem();
                    break;
            }
        }
    }

    private static void showBranch() {
        System.out.println(mart.getName() + " has " + mart.getBranchName().size() + " branches.");
        for(int i = 0; i < mart.getBranchName().size(); i++) {
            System.out.println(mart.getBranchName().get(i).getName());
        }
    }

    private static void addBranch() {
        System.out.print("Enter Branch name: ");
        String name = scan.nextLine();
        Branch existingBranch = mart.findBranch(name);

        if(existingBranch == null) {
            mart.addBranch(name);
            System.out.println(name + " branch added.");
        } else {
            System.out.println("There is already same name branch.");
        }
    }

    private static void showItem() {

    }

    private static void addItem() {

    }

    private static void modifyItem() {

    }
}
