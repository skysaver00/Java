public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour) {
        if(kilometersPerHour < 0) return - 1;

        kilometersPerHour /= 1.609;

        long rounded = Math.round(kilometersPerHour);
        return rounded;
    }

    public static void printConversion(double kilometersPerHour) {
        if(kilometersPerHour < 0) {
            System.out.println("Invalid Value");
            return;
        }

        long milesPerHour = toMilesPerHour(kilometersPerHour);

        System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
    }
}
