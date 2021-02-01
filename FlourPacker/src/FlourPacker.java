public class FlourPacker {
    public static boolean canPack(int five, int one, int sum) {
        if (five < 0 || one < 0 || sum < 0) return false;

        if (five != 0) {
            for (int i = 0; i < five; i++) {
                if (sum < 5) break;
                sum -= 5;
            }
        }
        if (sum == 0) return true;
        if (one != 0) {
            for (int i = 0; i < one; i++) {
                if (sum < 1) break;
                sum -= 1;
            }
        }
        if (sum == 0) return true;
        else return false;
    }
}
