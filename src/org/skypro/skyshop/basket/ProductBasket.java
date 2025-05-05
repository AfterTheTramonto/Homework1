package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductBasket {
    private final List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> removeProductsByName(String name) {
        List<Product> removed = new ArrayList<>();
        products.removeIf(p -> {
            if (p.getName().equals(name)) {
                removed.add(p);
                return true;
            }
            return false;
        });
        return removed;
    }

    public int getTotalCost() {
        return products.stream()
                .mapToInt(Product::getPrice)
                .sum();
    }

    public void printContents() {
        if (products.isEmpty()) {
            System.out.println("в корзине пусто");
            return;
        }

        products.forEach(p -> System.out.println(p));
        System.out.printf("Итого: %d%n", getTotalCost());
    }

    public void clearBasket() {
        products.clear();
    }
}