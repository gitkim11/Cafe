package cafe.ordertype;

import cafe.cafestruct.CafeStruct;

import java.util.ArrayList;
import java.util.List;

public class ChooseOrderType<ORDER_TYPE extends CafeStruct> {

    private String orderedMenuName;
    private final List<String> orderTypes;

    public ChooseOrderType(String orderedMenuName) {
        this.orderedMenuName = orderedMenuName;
        this.orderTypes = new ArrayList<String>();
    }

    public ChooseOrderType() {
        this.orderTypes = new ArrayList<String>();
    }

    public void orderList(String orderedMenuName) {
        orderTypes.add(orderedMenuName);
        System.out.println(orderedMenuName + "(이)가 담겼습니다.");
    }

    public List<String> getOrderTypes() {
        return orderTypes;
    }

    public void setOrderedMenuName(String orderedMenuName) {
        this.orderedMenuName = orderedMenuName;
    }
}
