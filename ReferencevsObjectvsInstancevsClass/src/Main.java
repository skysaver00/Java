public class Main {

    //Class -> 청사진. Class house라면, 이를 통해 무한의 집을 만들 수 있다.
    //Class가 있다는 조건 하에!

    //Instance -> 각각의 집에 해당한다.

    //모든 집은 주소가 있다. 주소를 통해 내 위치를 알려줄 수 있는데,
    //이는 reference에 해당한다.

    //reference를 여러번 복사할 수 있으나, 집은 단 하나다. instance는 단 하나라는 것이다.
    //reference는 파라미터로 해서 constructor, method를 통해 전달이 가능하다.

    //class house
    /*
    class House {
        private String color;
        public House(String color) {
            this.color = color -> 이가 constructor에 해당한다.
        }

        public String getColor() { ...
        public void setColor(String color) { ...

     } -> 이게 class이다. 이게 객체에 해당하는 애들의 청사진이 되는 것.
     */

    /*
    public class Main {
        House blueHouse = new House("Blue");
        -> class House에 해당하는 새로운 instance를 만들었다.
        claa는 그저 청사진일 뿐, 우리는 blueHouse라는 변수에 청사진을 객체화(object)한
        것이다. 따라서 blueHouse는 객체를 reference한 것 뿐이다. blueHouse 자체는
        아무 의미 없는 변수이다. 여기에 객체가 연결된 것 뿐.

        House anotherHouse = blueHouse;
        -> 이렇게 anotherHouse에 blueHouse에 연결된 객체를 다시 reference한 것이다.
        이렇게 해도 객체는 1개다. 변수는 2개, 변수 2개에 객체 1개가 reference된것.

        anotherHouse.setColor("yellow");
        -> 이렇게 해서 색깔이 바뀌었다. blueHouse에 해당하는 color도 바뀌었다.
        객체는 1개에 두개가 연결된 것이니까!
        
        House greenHouse = new House("Green");
        이러면 메모리에 2개의 객체가 있다. 3개의 variable이 있고,
        blueHouse, anotherHouse -> "yellow"객체
        greenHouse -> "Green 객체"
        
        anotherHouse = greenHouse;
        -- blueHouse -> "yellow"객체
        greenHouse, anotherHouse -> "Green"객체
    }
     */
}
