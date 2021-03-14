import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
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

    }
}
