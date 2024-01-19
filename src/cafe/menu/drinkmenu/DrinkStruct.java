package cafe.menu.drinkmenu;

import cafe.cafestruct.CafeStruct;

import java.util.HashMap;
import java.util.Map;

public class DrinkStruct extends CafeStruct {

    public static final Map<String, DrinkStruct> cafeColdDrinkMenu = new HashMap<>();
    static {
        cafeColdDrinkMenu.put("아메리카노", new DrinkStruct("아메리카노", 3000, "C"));
        cafeColdDrinkMenu.put("카라멜마끼야또", new DrinkStruct("카라멜 마끼야또", 4000, "C"));
        cafeColdDrinkMenu.put("레몬에이드", new DrinkStruct("레몬에이드", 3500, "C"));
        cafeColdDrinkMenu.put("딸기스무디", new DrinkStruct("딸기스무디", 4500, "C"));
    }
    public static final Map<String, DrinkStruct> cafeHotDrinkMenu = new HashMap<>();
    static {
        cafeHotDrinkMenu.put("아메리카노", new DrinkStruct("아메리카노", 3000, "H"));
        cafeHotDrinkMenu.put("카라멜마끼야또", new DrinkStruct("카라멜 마끼야또", 4000, "H"));
        cafeHotDrinkMenu.put("카페라떼", new DrinkStruct("카페라떼", 5000, "H"));
    }
    private String temperature;

    public DrinkStruct(String orderedMenuName, String temperature) {
        super(orderedMenuName, temperature);
    }

    public DrinkStruct(String orderedMenuName, int price, String temperature) {
        super(orderedMenuName, price);
        this.temperature = temperature;
    }

    public DrinkStruct(String orderedMenuName) {
        super(orderedMenuName);
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        String cafeMenuStruct = super.toString();
        return "DrinkStruct{" + cafeMenuStruct +
                "temperature='" + temperature + '\'' +
                '}';
    }

    public static void coldOrHotDrink (IDrinkColdOrHotable coldOrHot){
        coldOrHot.coldOrHot();
    }
}

