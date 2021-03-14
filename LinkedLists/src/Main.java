import java.util.*;

public class Main {
    /*public static void main(String[] args) {
        Customer customer = new Customer("Tim", 54.96);
        Customer anotherCustomer;
        anotherCustomer = customer; //메모리 주소는 같은 곳을 가르키기 때문에 바뀌지 않는다.
        anotherCustomer.setBalance(12.18); //하지만 포인터를 자바는 이용하지 못하게 한다. 그래서 C언어랑 다르게 돌아간다.
        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());
        //다시 한번 클래스는 단 하나다.

        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(1);
        intList.add(200);
        intList.add(2841);

        for(int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }

        intList.add(1, 4048); //index 1번에 4048추가 따라서 기존의 1, 2는 2, 3으로 밀리게 된다.
        //앞에는 인덱스인거 잊지 말자!

        for(int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }

        //연결리스트 -> 실제 연결 데이터를 가지고 있어 데이터를 보고 다음 연결된 주소를 찾아간다. 거기에도 또 연결된 주소가 저장되있으니까...
        //계속 찾아간다.
        //이후 마지막까지 오면 NULL로 더이상 갈 곳이 없다는걸 알 수 있다.
        //도중에 데이터를 고쳐서 다른 주소를 가르킬 수 있다. 그럼 더이상 연걸이 끊긴곳은 어떻게 하느냐?
        //Garbage Collection이 알아서 해준다. 쓰레기값이 돼버린 데이터는 바로 Garbage Collection이 알아서 해준다.

    }*/

    //psvm을 치고 탭하면 새로 만들어진다.
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();

        /*placesToVisit.add("Sydney");
        placesToVisit.add("Melbourne");
        placesToVisit.add("Brisbane");
        placesToVisit.add("Perth");
        placesToVisit.add("Canberra");
        placesToVisit.add("Adelaide");
        placesToVisit.add("Darwin");

        printList(placesToVisit);

        placesToVisit.add(1, "Alice Springs");
        printList(placesToVisit);

        placesToVisit.remove(5);
        printList(placesToVisit);*/

        addInOrder(placesToVisit, "Sydney");
        addInOrder(placesToVisit, "Melbourne");
        addInOrder(placesToVisit, "Brisbane");
        addInOrder(placesToVisit, "Perth");
        addInOrder(placesToVisit, "Canberra");
        addInOrder(placesToVisit, "Adelaide");
        addInOrder(placesToVisit, "Darwin");
        printList(placesToVisit);

        addInOrder(placesToVisit, "Alice Springs");
        addInOrder(placesToVisit, "Darwin");
        printList(placesToVisit);
        visit(placesToVisit); //사실 현재 위치를 나타내는 link list function은 없다.
        //문제점이 있는데 연결리스트는 루프가 가능하다. 예전에도 이런 문제가 있었다.
    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();

        while(i.hasNext()) {
            System.out.println("Now Visiting " + i.next());
        }
        System.out.println("================================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while(stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);

            if(comparison == 0) {
                //equal, do not add
                System.out.println(newCity + " is already included as a destination");
                return false;
            } else if(comparison > 0) {
                //new City should appear before this one
                //Brisbane -> Adelaide
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if(comparison < 0) {
                //move on next city

            }
        }

        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;

        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty()) {
            System.out.println("No cities in the itenerary");
            return;
        } else {
            System.out.println("Now visiting " + listIterator.next());
        }

        while(!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action) {
                case 0:
                    System.out.println("Holiday (Vacation) over");
                    quit = true;
                    break;

                case 1:
                    if(!goingForward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list.");
                    }
                    break;

                case 2:
                    if(!goingForward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the list.");
                    }
                    break;

                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n" +
                "1 - go to next city\n" +
                "2 - go to previous city\n" +
                "3 - print menu options");
    }
}
