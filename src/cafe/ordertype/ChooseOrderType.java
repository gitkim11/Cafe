package cafe.ordertype;

import cafe.cafestruct.CafeStruct;

import java.util.ArrayList;
import java.util.List;

public class ChooseOrderType<ORDER_TYPE extends CafeStruct> {

    private String orderedMenuName;
    private List<ORDER_TYPE> orderTypes;

    public ChooseOrderType(String orderedMenuName) {
        this.orderedMenuName = orderedMenuName;
        this.orderTypes = new ArrayList<>();
    }

    public void orderList(ORDER_TYPE orderedMenuName) {
        orderTypes.add(orderedMenuName);
        System.out.println(orderedMenuName.getOrderedMenuName() + "(이)가 담겼습니다.");
    }

    public List<ORDER_TYPE> getOrderTypes() {
        return orderTypes;
    }

    public void setOrderedMenuName(String orderedMenuName) {
        this.orderedMenuName = orderedMenuName;
    }
}

