package Ex.Product;

public class ProductOrderRef {
    public static void main(String[] args) {

        ProductOrder Tofu = new ProductOrder();

        Tofu.productName = "두부";
        Tofu.price = 2000;
        Tofu.quantity = 2;

        ProductOrder Kimchi = new ProductOrder();
        Kimchi.productName = "김치";
        Kimchi.price = 5000;
        Kimchi.quantity = 1;

        ProductOrder Cola = new ProductOrder();
        Cola.productName = "콜라";
        Cola.price = 1500;
        Cola.quantity = 2;
        ProductOrder[] ProductOrders = {Tofu, Kimchi, Cola};

        int each = 0;
        for (ProductOrder p : ProductOrders) {
            System.out.println("상품명 : " + p.productName + ", 가격 : " + p.price + ", 수량 : " + p.quantity );
        each += p.price * p.quantity;
        }
        System.out.println("총 결제 금액 : " + each);

    }
}
