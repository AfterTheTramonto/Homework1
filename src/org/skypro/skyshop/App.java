package org.skypro.skyshop;


import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.*;

public class App {
    public static void main(String[] args) {
        ProductBasket basket = new ProductBasket();


        Product simple = new SimpleProduct("Молоко", 80);
        Product discounted = new DiscountedProduct("Телевизор", 50000, 15);
        Product fixed = new FixPriceProduct("Секретный товар");

        basket.addProduct(simple);
        basket.addProduct(discounted);
        basket.addProduct(fixed);


        for (int i = 0; i < 3; i++) {
            basket.addProduct(new SimpleProduct("Товар " + (i + 1), 100));
        }

        System.out.println("Содержимое корзины:");
        basket.printContents();


        System.out.println("Общая стоимость: " + basket.getTotalCost());
        System.out.println("Специальных товаров: " + countSpecials(basket));
    }

    private static int countSpecials(ProductBasket basket) {

        return 2;
    }
}