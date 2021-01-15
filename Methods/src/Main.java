import java.sql.SQLOutput;
import java.util.Random;

public class Main {
    public static void main(String[] args) { //이거 사실 메소드다. main이라는 메소드 이름에서 해당 코드를 실행하는 것;
        calculateScore(); //이러면 자동으로 실행
        calculateAnotherScore(true, 800, 5, 200);
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

    public static void calculateAnotherScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
    }
}
