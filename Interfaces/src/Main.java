public class Main {
    public static void main(String[] args) {
        ITelephone = timsPhone;
        timsPhone = new DeskPhone(1234567890);
        timsPhone.powerOn();
    }

    public class Gearbox {
        private boolean clutchIsIn;

        public void operateClutch(boolean inOrOut) {
            this.clutchIsIn = inOrOut;
        }
    }
}
