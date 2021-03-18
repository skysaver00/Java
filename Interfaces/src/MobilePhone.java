public class MobilePhone implements ITelephone{
    //이제 implement 해야한다.
    private int myNumber;
    private boolean isRinging;
    private boolean isOn;

    public MobilePhone(int myNumber) {
        isOn = false;
        this.myNumber = myNumber;
    }

    @Override //이렇게 오버라이드 된다.
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile Phone powered up!");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now Ringing " + phoneNumber + " on mobile phone.");
    }

    @Override
    public void answer() {
        if(isRinging) {
            System.out.println("Answering the mobile phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber && isOn) {
            isRinging = true;
            System.out.println("Ring ring");
        } else {
            isRinging = false;
            System.out.println("Phone not working");
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
