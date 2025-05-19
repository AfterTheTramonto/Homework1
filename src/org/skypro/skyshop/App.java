package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.content.Article;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SimpleProduct;
import org.skypro.skyshop.search.Searchable;
import org.skypro.skyshop.search.SearchEngine;

import java.util.List;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) {
        ProductBasket basket = new ProductBasket();


        Product apple1 = new SimpleProduct("Яблоко", 50);
        Product apple2 = new SimpleProduct("Яблоко", 50);
        Product banana = new SimpleProduct("Банан", 30);

        basket.addProduct(apple1);
        basket.addProduct(apple2);
        basket.addProduct(banana);


        List<Product> removed = basket.removeProductsByName("Яблоко");
        System.out.println("Удалено яблок: " + removed.size());


        SearchEngine engine = new SearchEngine();
        engine.add(new SimpleProduct("Ноутбук", 100000));
        engine.add(new Article("Обзор", "Лучшие ноутбуки 2023"));
        engine.add(new SimpleProduct("Ананас", 150));


        TreeMap<String, Searchable> results = engine.search("нут");
        System.out.println("\nРезультаты поиска:");
        results.forEach((name, item) ->
                System.out.printf("%s (%s)%n", name, item.getContentType())
        );
    }
}