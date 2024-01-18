package cafe.menu.drink;

public class DrinkColdStruct extends DrinkStruct implements IDrinkColdable, IDrinkColdOrHotable {

    private String temperature = "C";
    public DrinkColdStruct(String orderedMenuName, int price, String temperature) {
        super(orderedMenuName, price, temperature);
    }

    public DrinkColdStruct(String orderedMenuName){
        super(orderedMenuName);
        this.temperature = "C";
    }

    @Override
    public String getTemperature() {
        return temperature;
    }

    @Override
    public void cold() {
        System.out.println("차가운 음료입니다.");
    }
    @Override
    public void coldOrHot() {
        cold();
    }
}
