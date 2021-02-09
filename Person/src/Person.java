public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public void setLastName(String name) {
        this.lastName = name;
    }

    public void setAge(int age) {
        if(age < 0 || age > 100) this.age = 0;
        else this.age = age;
    }

    public boolean isTeen() {
        if(this.age < 20 && this.age > 12) return true;
        else return false;
    }

    public String getFullName() {
        if(this.firstName.isEmpty() == true) {
            if(this.lastName.isEmpty() == true) return "";
            else return this.lastName;
        } else {
            if(this.lastName.isEmpty() == true) return this.firstName;
            else return this.firstName + " " + this.lastName;
        }
    }
}
