public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        if(barking == false) return false;

        if(hourOfDay < 8 || hourOfDay > 22) {
            if(hourOfDay > 23 || hourOfDay < 0) return false;
            else return true;
        }
        else return false;
    }
}
