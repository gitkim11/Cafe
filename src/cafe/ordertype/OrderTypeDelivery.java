package cafe.ordertype;

import cafe.cafestruct.CafeStruct;

public class OrderTypeDelivery extends CafeStruct {
    public OrderTypeDelivery(String orderedMenuName) {
        super(String.valueOf(orderedMenuName));
    }
    public static void deliveryOrder(){
        System.out.println("배달 주문입니다.");
    }
}
