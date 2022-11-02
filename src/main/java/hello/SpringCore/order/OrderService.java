package hello.SpringCore.order;

public interface OrderService {
    Order createOrder(long memberId, String itemName,int itemPrice);
}
