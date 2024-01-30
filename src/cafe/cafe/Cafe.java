package cafe.cafe;

public abstract class Cafe {
    private String orderedMenuName;
    private int price;
    private String temperature;

    public Cafe(String orderedMenuName, int price) {
        setOrderedMenuName(orderedMenuName);
        setPrice(price);
    }
    public Cafe(String orderedMenuName, String temperature) {
        setOrderedMenuName(orderedMenuName);
        setTemperature(temperature);
    }
    public Cafe(String orderedMenuName, int price, String temperature) {
        setOrderedMenuName(orderedMenuName);
        setPrice(price);
        setTemperature(temperature);
    }
    public Cafe(String orderedMenuName) {
        setOrderedMenuName(orderedMenuName);
    }

    public String getOrderedMenuName() {
        return orderedMenuName;
    }

    public void setOrderedMenuName(String orderedMenuName) {
        this.orderedMenuName = orderedMenuName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "CafeStruct{" +
                "orderedMenuName='" + orderedMenuName + '\'' +
                ", price=" + price +
                '}';
    }
    public static void order(Cafe orderedCafe) {
        System.out.println(orderedCafe.getOrderedMenuName() + "주문이 완료되었습니다.");
    }
}
