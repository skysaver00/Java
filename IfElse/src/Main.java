public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 4000;
        int levelCompleted = 5;
        int bonus = 1000;

        if(score > 4000) {
            System.out.println("Your score was 4000.");
        }
        else if (score >= 1000 && score <= 4000) {
            System.out.println("Your score is bigger than 1000 and smaller than 4000.");
        }
        else {
            System.out.println("This was executed!");
        }


    }
}
