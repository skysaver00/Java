import java.sql.SQLOutput;
import java.util.Random;

public class Main {
    public static void main(String[] args) { //이거 사실 메소드다. main이라는 메소드 이름에서 해당 코드를 실행하는 것;
        calculateScore(); //이러면 자동으로 실행
        int value = calculateAnotherScore(true, 800, 5, 200);
        System.out.println("Your final score from calculateAnotherScore method was " + value);

        displayHighScorePosition("luke", "sword master");
        int d = calculateHighScorePosition(1500);
        System.out.println(d + " score.");

        d = calculateHighScorePosition(900);
        System.out.println(d + " score.");

        d = calculateHighScorePosition(400);
        System.out.println(d + " score.");

        d = calculateHighScorePosition(50);
        System.out.println(d + " score.");
    }

    //메소드 내에는 메소드가 들어갈 수 없다!
    //따라서 메소드는 각각 독립적으로 클래스 내에서 만들어야 한다. 클래스 안에 만들 수 있는 메소드는 무한하다.

    public static void calculateScore() { //이렇게 독립적으로 C언어의 함수같이 실행하면, 아주 코드유지 보수성이 좋아진다.
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 1;
        int bonus = 100;
        Random random = new Random();

        for(int i = 0; i < 50; i++) {
            int finalScore = score + (levelCompleted * bonus);

            if(gameOver) {
                System.out.println("Level " + levelCompleted + " complete. Your final score was " + finalScore);
                score += random.nextInt(1000);
                bonus += random.nextInt(200);
                levelCompleted++;
            }
        }
    }

    public static int calculateAnotherScore(boolean gameOver, int score, int levelCompleted, int bonus) { //void는 아무것도 리턴하지 않는다는 뜻. void를 int, boolean등으로 고칠 수 있다.

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore; //여기서 끝이 난다. gameOver로 들어오면 return을 보게 되면 무조건 그 return에서 끝나게 된다.
        }


        return -1; //-1은 전통적으로 오류를 뜻한다.
    }

    public static void displayHighScorePosition(String players, String position) {
        System.out.println(players + " managed to get into position " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int score) {
        if(score >= 1000) {
            return 1;
        }
        else if(score < 1000 && score >= 500) {
            return 2;
        }
        else if(score < 500 && score >= 100) {
            return 3;
        }
        else return 4;
    }
}
