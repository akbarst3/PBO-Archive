/**
 * index
 */

import com.polban.jtk.sales.*;

public class Soal1 {
    public static void main(String[] args) {
        Product produk1 = new Product("Laptop", 1000000000, 10);
        Sales sales1 =  new Sales(produk1);
        sales1.sellProduct(3);
        sales1.restockProduct(5);
        sales1.updateProductPrice(15000000);
    }
}