package org.skypro.skyshop;

import org.skypro.skyshop.content.Article;
import org.skypro.skyshop.product.*;
import org.skypro.skyshop.search.SearchEngine;
import org.skypro.skyshop.search.Searchable;

public class App {
    public static void main(String[] args) {

        SearchEngine engine = new SearchEngine(10);


        engine.add(new SimpleProduct("Ноутбук Lenovo", 45000));
        engine.add(new DiscountedProduct("Смартфон Samsung", 30000, 15));
        engine.add(new FixPriceProduct("Чехол для смартфона"));


        engine.add(new Article("Обзор ноутбуков", "Лучшие ноутбуки 2023 года "));
        engine.add(new Article("Как выбрать смартфон", "Руководство по выбору..."));


        System.out.println("Результаты поиска по 'ноут':");
        printResults(engine.search("ноутбук"));

        System.out.println("\nРезультаты поиска по 'телефон':");
        printResults(engine.search("смартфон"));
    }

    private static void printResults(Searchable[] results) {
        for (Searchable s : results) {
            if (s == null) continue;
            System.out.printf("[%s] %s: %s%n",
                    s.getContentType(),
                    s.getName(),
                    s.getSearchTerm().substring(0, Math.min(20, s.getSearchTerm().length())) + "...");
        }
    }
}