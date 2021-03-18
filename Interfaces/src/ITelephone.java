public interface ITelephone {
    public void powerOn();
    public void dial(int phoneNumber);
    public void answer();
    public boolean callPhone(int phoneNumber);
    public boolean isRinging();

    //위의 것은 signature이다. 실제 구동하는 코드는 구현하지 안흔ㄴ다.

}
