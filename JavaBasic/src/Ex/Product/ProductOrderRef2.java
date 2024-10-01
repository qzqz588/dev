package Ex.Product;

public class ProductOrderRef2 {
    public static void main(String[] args) {

        int amount = 0;
        ProductOrder[] orders = new ProductOrder[3];
        orders[0] = initProduct("두부", 2000, 2);
        orders[1] = initProduct("김치", 5000, 1);
        orders[2] = initProduct("콜라", 1500, 2);

        printProduct(orders[0]);
        printProduct(orders[1]);
        printProduct(orders[2]);
        System.out.println("총액 = " + getTotal(orders));

        int total = getTotal(orders);
    }

    static void printProduct(ProductOrder productOrder) {
        System.out.println("이름 = " + productOrder.price + " " + "가격 = " + productOrder.price + " " + "수량 = " + productOrder.quantity);
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
