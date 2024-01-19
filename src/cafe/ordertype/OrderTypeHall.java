package cafe.ordertype;

import cafe.cafestruct.CafeStruct;

public class OrderTypeHall extends CafeStruct {
    public OrderTypeHall(String orderedMenuName) {
        super(String.valueOf(orderedMenuName));
    }
    public static void hallOrder(){
        System.out.println("홀 주문입니다.");
    }
}