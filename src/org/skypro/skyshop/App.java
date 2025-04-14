package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

public class App {
    public static void main(String[] args) {
        Product apple = new Product("Яблоко", 50);
        Product banana = new Product("Банан", 30);
        Product orange = new Product("Апельсин", 70);
        Product pear = new Product("Груша", 45);
        Product kiwi = new Product("Киви", 60);
        Product mango = new Product("Манго", 100);

        ProductBasket basket = new ProductBasket();

        basket.addProduct(apple);
        basket.addProduct(banana);
        basket.addProduct(orange);
        basket.addProduct(pear);
        basket.addProduct(kiwi);
        basket.addProduct(mango);

        System.out.println("Содержимое корзины:");
        basket.printContents();

        System.out.println("Общая стоимость: " + basket.getTotalCost());

        System.out.println("Есть ли Яблоко? " + basket.containsProduct("Яблоко"));
        System.out.println("Есть ли Виноград? " + basket.containsProduct("Виноград"));

        basket.clearBasket();

        System.out.println("После очистки:");
        basket.printContents();

        System.out.println("Стоимость пустой корзины: " + basket.getTotalCost());

        System.out.println("Есть ли Яблоко? " + basket.containsProduct("Яблоко"));
    }
}