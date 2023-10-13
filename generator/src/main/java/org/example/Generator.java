package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class Generator {
    public static List<OrderProducts> generating(int count) {

        Random rd = new Random();
        List<OrderProducts> ordersProducts = new ArrayList<OrderProducts>();

        for (int i = 0; i < count; i++) {

            UUID orderId = UUID.randomUUID();
            UUID productId = UUID.randomUUID();
            UUID supplierId = UUID.randomUUID();
            UUID warehouseId = UUID.randomUUID();
            UUID customerId = UUID.randomUUID();
            UUID addressId = UUID.randomUUID();

            int total = 0;

            List<Product> products = new ArrayList<Product>();

            for (int j = 0; j <= rd.nextInt(4); j++) {
                Product product = new Product(orderId, productId, "name"+ rd.nextInt(), rd.nextInt(14999) + 149,
                        new Supplier(productId, orderId, supplierId, Suppliers.values()[rd.nextInt(Suppliers.values().length)].name()),
                        new Warehouse(productId, orderId, warehouseId, "address"+ rd.nextInt()));
                total += product.getPrice();
                products.add(product);
            }

            OrderProducts orderProducts = new OrderProducts(orderId, total, Status.values()[rd.nextInt(Status.values().length)].name(),
                    new Customer(orderId, productId, customerId, "name"+ rd.nextInt(), rd.nextInt() +"@mail.ru"),
                    products,
                    new DeliveryAddress(orderId, addressId,"address"+ rd.nextInt()));


            ordersProducts.add(orderProducts);
        }

        return ordersProducts;
    }
}
