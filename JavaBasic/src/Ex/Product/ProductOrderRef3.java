package Ex.Product;

import java.util.Scanner;

public class ProductOrderRef3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("주문할 상품의 갯수를 입력하세요 : ");
        int n = sc.nextInt();
        sc.nextLine();
        ProductOrder[] orders = new ProductOrder[n];
        for (int i = 0; i < orders.length; i++) {
            System.out.println(i+1 + "번째 주문 정보를 입력하세요");
            System.out.print("상품명 : ");
            String productName = sc.nextLine();

            System.out.print("가격 : ");
            int price = sc.nextInt();

            System.out.print("수량 : ");
            int quantity = sc.nextInt();
            sc.nextLine();
            orders[i] = initProduct(productName, price, quantity);
        }
        printProduct(orders);
        System.out.println("총액 = " + getTotal(orders));
    }

    static void printProduct(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명 : " + order.productName + " " + "가격 : " + order.price + " " + "수량 : " + order.quantity);
        }
    }

    static ProductOrder initProduct(String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }
    static int getTotal(ProductOrder[] orders) {
        // 총액을 저장할 변수를 0으로 초기화
        int total = 0;

        // 향상된 for문: orders 배열의 각 ProductOrder 객체를 순차적으로 반복
        for (ProductOrder order : orders) {
            // order 객체의 price(가격)와 quantity(수량)를 곱하여 해당 상품의 총 금액을 total에 더함
            total += order.price * order.quantity;
        }

        // 모든 상품의 총 금액을 반환
        return total;
    }



}
