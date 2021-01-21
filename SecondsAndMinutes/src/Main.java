public class Main {
    public static void main(String[] args) {
        System.out.println(getDurationString(40000));
        System.out.println(getDurationString(82, 30));
    }

    public static String getDurationString(int minutes, int seconds) {
        if((minutes < 0) || (seconds < 0 || seconds > 60)) return "Invalid Value";

        int realhour = minutes / 60;
        int realminute = minutes % 60;

        return String.format("%02d", realhour) + "h " + String.format("%02d", realminute) + "m " + String.format("%02d", seconds) + "s";
    }

    public static String getDurationString(int seconds) {
        if(seconds < 0) return "Invalid Values";

        int min = seconds / 60;
        int sec = seconds % 60;

        return getDurationString(min, sec);
    }
}
