public class Main {
    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(750);
        calculateScore();
    }

    public static int calculateScore(String playername, int score) {
        System.out.println("player " + playername + " scored " + score + " points!");

        return score * 1000;
    }

    //Overloading Overriding은 서로 다른 개념이다.
    //Overloading은 같은 메소드에 다른 파라미터를 집어넣는 것이다.

    public static int calculateScores(String playername, int score) {
        return 0;
    }//이렇게 새이름을 만드는 것도 있지만,

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points!");
        return score * 1000;
    } //이렇게 맨 위의 메소드를 갖고와서 이용할 수 있는 방법이 있다.

    public static int calculateScore() {
        System.out.println("No score is typed in... Cannot calculate anything!");
        return 0;
    }//아무것도 타입하지 않는 오버로딩도 가능하다!

    /*public static void calculateScore() {

    }calcuateScore가 이미 define되지 않았다고 나온다.*/
    //따라서 그저 return 의 data type을 바꾸는 것만으로는 전체적인 시그니처를 바꾸지 않는다.
    //따라서 이런 data type overload는 바뀌지 않는다.

}
