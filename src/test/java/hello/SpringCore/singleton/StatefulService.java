package hello.SpringCore.singleton;

public class StatefulService {

    // 상태를 유지하는 필드
    private int price;

    public void order(String naem, int price){
        System.out.println("name = " + naem + "price = " + price);
        this.price = price; // 여기서 문제 발생
    }

    public int getPrice(){
        return price;
    }
}
