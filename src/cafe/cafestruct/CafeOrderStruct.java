package cafe.cafestruct;

import cafe.menu.drink.DrinkColdStruct;
import cafe.menu.drink.DrinkHotStruct;
import cafe.menu.drink.DrinkStruct;
import cafe.menu.food.FoodStruct;

import java.util.Scanner;

public class CafeOrderStruct {

    public static String cafeOrderManual() {
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
                    return (DrinkStruct.cafeColdDrinkMenu.get(orderedDrinkName)).toString();
                } else if (orderedDrinkTemp == 2) {
                    DrinkHotStruct hotMenu = new DrinkHotStruct(orderedDrinkName);
                    DrinkStruct.coldOrHotDrink(hotMenu);
                    DrinkStruct.order(hotMenu);
                    System.out.println(DrinkStruct.cafeHotDrinkMenu.get(orderedDrinkName));
                    return (DrinkStruct.cafeHotDrinkMenu.get(orderedDrinkName)).toString();
                }
                break;
            case 2:
                System.out.println("음식을 입력해주세요");
                String orderedFoodName = scanner.next();
                FoodStruct foodMenu = new FoodStruct(orderedFoodName);
                FoodStruct.order(foodMenu);
                System.out.println(FoodStruct.cafeFoodMenu.get(orderedFoodName));
                return (FoodStruct.cafeFoodMenu.get(orderedFoodName)).toString();
        }
        scanner.close();
        return ""; // Default return value if no valid input is given
    }
}
