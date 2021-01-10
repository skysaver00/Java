public class Main {

    public static void main(String[] args) {
        double val = 20.00;
        double val2 = 80.00;
        double val3 = (val + val2) * 100;

        System.out.println(val3);
        double rem = (double) (val3 % 40);

        boolean TF = (rem == 0) ? true : false;

        System.out.println(TF);

        if(!TF) {
            System.out.println("Got some remainder!");
        }
    }
}
