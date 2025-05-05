package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.content.Article;
import org.skypro.skyshop.product.*;
import org.skypro.skyshop.search.BestResultNotFound;
import org.skypro.skyshop.search.SearchEngine;
import org.skypro.skyshop.search.Searchable;

import java.util.List;

public class App {
    public static void main(String[] args) {
        ProductBasket basket = new ProductBasket();


        Product apple = new SimpleProduct("Яблоко", 50);
        Product apple2 = new SimpleProduct("Яблоко", 50);
        basket.addProduct(apple);
        basket.addProduct(apple2);
        basket.addProduct(new SimpleProduct("Банан", 30));


        System.out.println("Удаляем яблоки:");
        List<Product> removed = basket.removeProductsByName("Яблоко");
        removed.forEach(p -> System.out.println(p.getName()));

        System.out.println("\nКорзина после удаления:");
        basket.printContents();

        List<Product> empty = basket.removeProductsByName("Апельсин");
        System.out.println("\nУдалено апельсинов: " + empty.size());

        SearchEngine engine = new SearchEngine();
        engine.add(apple);
        engine.add(new Article("Фрукты", "Яблоки и бананы..."));

        System.out.println("\nРезультаты поиска 'яблоко':");
        List<Searchable> results = engine.search("яблоко");
        results.forEach(s -> System.out.println(s.getName()));
    }
}