public class VipCustomer {
    private String vipName;
    private double creditLimit;
    private String email;

    public VipCustomer(String vipName, double creditLimit, String email) {
        this.vipName = vipName;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public VipCustomer(String vipName, double creditLimit) {
        this(vipName, creditLimit, "default@email.com");
    }

    public VipCustomer() {
        this("Default Name", 500000.00, "default@email.com");
    }

    public String getVipName() {
        return vipName;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public void setVipName(String vipName) {
        this.vipName = vipName;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
