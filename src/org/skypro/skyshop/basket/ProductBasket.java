package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

public class ProductBasket {
    private Product[] products = new Product[5];
    private int count = 0;

    public void addProduct(Product product) {
        if (count < products.length) {
            products[count++] = product;
        } else {
            System.out.println("Невозможно добавить продукт");
        }
    }

    public int getTotalCost() {
        int total = 0;
        for (int i = 0; i < count; i++) {
            total += products[i].getPrice();
        }
        return total;
    }

    public void printContents() {
        if (count == 0) {
            System.out.println("в корзине пусто");
            return;
        }

        int specialCount = 0;
        for (int i = 0; i < count; i++) {
            Product product = products[i];
            System.out.println(product);
            if (product.isSpecial()) {
                specialCount++;
            }
        }
        System.out.printf("Итого: %d%n", getTotalCost());
        System.out.printf("Специальных товаров: %d%n", specialCount);
    }

    public boolean containsProduct(String name) {
        for (Product product : products) {
            if (product != null && product.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void clearBasket() {
        for (int i = 0; i < products.length; i++) {
            products[i] = null;
        }
    }
}