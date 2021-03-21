import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {
        Gearbox mcLaren = new Gearbox(6);
        //Gearbox.Gear first = mcLaren.new Gear(1, 12.3);
        //이렇게 선언하는 이유는 mcLaren이라는 외부 클래스에서 자바의 일관성을 지키기 위함이다.
        //그래서 OuterClass.new InnerClass() 이렇게 선언해준다.
        //이거 안된다. Gearbox.Gear second = new Gearbox.Gear(2, 15.4);

        //이렇게 하면 내부클래스에 직접 접근하지 않고 문제를 해결할 수 있다.
        mcLaren.addGear(1, 5.3);
        mcLaren.addGear(2, 10.6);
        mcLaren.addGear(3, 15.9);

        mcLaren.operateClutch(true);
        mcLaren.changeGear(1);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(1000));
        mcLaren.changeGear(2);
        System.out.println(mcLaren.wheelSpeed(3000));
        mcLaren.operateClutch(true);
        mcLaren.changeGear(3);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(6000));

        //System.out.println(first.driveSpeed(1000));

        class ClickListener implements Button.OnClickListener {
            public ClickListener() {
                System.out.println("I've been attached");
            }

            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        }

        //아니면 이렇게 해도 된다.
        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        });
        listen();
    }

    private static void listen() {
        boolean quit = false;
        while(!quit) {
            int choice = scan.nextInt();
            scan.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;

                case 1:
                    btnPrint.onClick();
            }
        }
    }
}
