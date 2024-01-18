package cafe.ordertype;

import cafe.cafestruct.CafeStruct;

public class OrderTypePacking extends CafeStruct {
    public OrderTypePacking(String orderedMenuName) {
        super(String.valueOf(orderedMenuName));
    }
    public static void packingOrder(){
        System.out.println("포장 주문입니다.");
    }
}
