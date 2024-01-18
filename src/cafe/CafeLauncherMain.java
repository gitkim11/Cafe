package cafe;

import cafe.cafestruct.CafeOrderStruct;
import cafe.cafestruct.CafeStruct;
import cafe.menu.drink.DrinkStruct;
import cafe.ordertype.ChooseOrderType;
import cafe.ordertype.OrderTypeDelivery;
import cafe.ordertype.OrderTypeHall;
import cafe.ordertype.OrderTypePacking;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class CafeLauncherMain {

    public static void main(String[] args) {

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
                CafeOrderStruct.cafeOrderManual();
                OrderTypeHall.hallOrder();
                break;
            case 2:
                CafeOrderStruct.cafeOrderManual();
                OrderTypePacking.packingOrder();
                break;
            case 3:
                CafeOrderStruct.cafeOrderManual();
                OrderTypeDelivery.deliveryOrder();
                break;
        }
        scanner.close();
    }
}
