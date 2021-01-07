import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("가위 바위 보!");
        System.out.print("당신의 선택: ");

        Scanner scan = new Scanner(System.in);

        String choice;

        choice = scan.nextLine();

        int t;

        if(choice.equals("가위") || choice.equals("scissor") || choice.equals("Scissor")) {
            t = 0;
        }
        else if(choice.equals("바위") || choice.equals("rock") || choice.equals("Rock")) {
            t = 1;
        }
        else if(choice.equals("보") || choice.equals("paper") || choice.equals("Paper")) {
            t = 2;
        }
        else t = 3;

        double ran = Math.random();
        int realran = (int)(ran * 3);

        if(t == 3) {
            System.out.println("이상한 거 집어넣지 마세요");
        }
        else {
            if(realran == 0) {
                if(t == 0) System.out.println("비겼습니다.");
                else if(t == 1) System.out.println("이겼습니다!");
                else System.out.println("졌습니다.");
            }
            else if(realran == 1) {
                if(t == 0) System.out.println("졌습니다.");
                else if(t == 1) System.out.println("비겼습니다.");
                else System.out.println("이겼습니다!");
            }
            else {
                if(t == 0) System.out.println("이겼습니다!");
                else if(t == 1) System.out.println("졌습니다.");
                else System.out.println("비겼습니다.");
            }
        }

        System.out.println(t + " " + realran);
    }
}
