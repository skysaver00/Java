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

        if(gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        if(gameOver) {
            System.out.println("This also prints out.");
        }

        //int savedScore = finalScore; 이거는 안된다. 당연히 finalScore는 if문 내에서만 유효하다.

        levelCompleted = 8;
        bonus = 200;
        score = 10000;

        if(gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
