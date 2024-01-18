package cafe.menu.foodmenu;

import cafe.cafestruct.CafeStruct;

import java.util.HashMap;
import java.util.Map;

public class FoodStruct extends CafeStruct {
    public static final Map<String, FoodStruct> cafeFoodMenu = new HashMap<>();

    static{
        cafeFoodMenu.put("케이크", new FoodStruct("케이크",20000));
        cafeFoodMenu.put("베이글", new FoodStruct("베이글",8000));
        cafeFoodMenu.put("에그타르트", new FoodStruct("에그타르트",2500));
        cafeFoodMenu.put("마카롱", new FoodStruct("마카롱",3000));
        cafeFoodMenu.put("샌드위치", new FoodStruct("샌드위치",4000));
    }
    public FoodStruct(String orderedMenuName, int price) {
        super(orderedMenuName, price);
    }

    public FoodStruct(String orderedMenuName) {
        super(orderedMenuName);
    }
}
