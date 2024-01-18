package cafe.menu.drinkmenu;

public class DrinkHotStruct extends DrinkStruct implements IDrinkHotable, IDrinkColdOrHotable {

    private String temperature = "H";
    public DrinkHotStruct(String orderedMenuName, int price, String temperature) {
        super(orderedMenuName, price, temperature);
    }

    public DrinkHotStruct(String orderedMenuName){
        super(orderedMenuName);
        this.temperature = "H";
    }

    @Override
    public String getTemperature() {
        return temperature;
    }

    @Override
    public void hot() {
        System.out.println("뜨거운 음료입니다.");
    }
    @Override
    public void coldOrHot() {
        hot();
    }
}
