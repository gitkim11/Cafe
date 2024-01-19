package cafe.cafestruct;

import cafe.menu.drinkmenu.DrinkColdStruct;
import cafe.menu.drinkmenu.DrinkHotStruct;
import cafe.menu.drinkmenu.DrinkStruct;
import cafe.menu.foodmenu.FoodStruct;
import cafe.ordertype.ChooseOrderType;
import cafe.ordertype.OrderTypeDelivery;
import cafe.ordertype.OrderTypeHall;
import cafe.ordertype.OrderTypePacking;

import java.util.Scanner;

public class CafeOrderStruct {

    public static String cafeOrderMenuStruct() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("주문하실 메뉴의 종류를 선택하세요");
        System.out.println("1. 음료 | 2. 음식");
        int chooseMenuType = scanner.nextInt();
        System.out.println("----------------------------");

        switch (chooseMenuType) {
            case 1:
                System.out.println("음료를 입력해주세요");
                String orderedDrinkName = scanner.next();
                System.out.println("온도를 선택해주세요 1. C | 2. H");
                int orderedDrinkTemp = scanner.nextInt();

                if (orderedDrinkTemp == 1) {
                    DrinkColdStruct coldMenu = new DrinkColdStruct(orderedDrinkName);
                    DrinkStruct.coldOrHotDrink(coldMenu);
                    DrinkStruct.order(coldMenu);
                    System.out.println(DrinkStruct.cafeColdDrinkMenu.get(orderedDrinkName));
//                    return (DrinkStruct.cafeColdDrinkMenu.get(orderedDrinkName)).toString();
                } else if (orderedDrinkTemp == 2) {
                    DrinkHotStruct hotMenu = new DrinkHotStruct(orderedDrinkName);
                    DrinkStruct.coldOrHotDrink(hotMenu);
                    DrinkStruct.order(hotMenu);
                    System.out.println(DrinkStruct.cafeHotDrinkMenu.get(orderedDrinkName));
//                    return (DrinkStruct.cafeHotDrinkMenu.get(orderedDrinkName)).toString();
                }
                break;
            case 2:
                System.out.println("음식을 입력해주세요");
                String orderedFoodName = scanner.next();
                FoodStruct foodMenu = new FoodStruct(orderedFoodName);
                FoodStruct.order(foodMenu);
                System.out.println(FoodStruct.cafeFoodMenu.get(orderedFoodName));
//                return (FoodStruct.cafeFoodMenu.get(orderedFoodName)).toString();
        }
        return "";
    }

    public static void cafeOrderTypeStruct(){
        
        // 주문된 메뉴의 배달 타입을 분류 후 배달 타입별 리스트에 저장 후
        // 배달 타입별 리스트를 출력하는 기능 해결하기
        ChooseOrderType<OrderTypeHall> orderHall = new ChooseOrderType<>();
        ChooseOrderType<OrderTypePacking> orderPacking = new ChooseOrderType<>();
        ChooseOrderType<OrderTypeDelivery> orderDelivery = new ChooseOrderType<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("카페입니다. 환영합니다 \n");

        System.out.println("원하시는 주문 방식을 선택하세요");
        System.out.println("1. 홀 주문 | 2. 포장 주문 | 3. 배달 주문");
        int chooseOrderTypeNum = scanner.nextInt();
        switch (chooseOrderTypeNum) {
            case 1:
                cafeOrderMenuStruct();
                OrderTypeHall.hallOrder();
                break;
            case 2:
                cafeOrderMenuStruct();
                OrderTypePacking.packingOrder();
                break;
            case 3:
                cafeOrderMenuStruct();
                OrderTypeDelivery.deliveryOrder();
                break;
        }
    }
}

