package org.skypro.skyshop;

import org.skypro.skyshop.content.Article;
import org.skypro.skyshop.product.*;
import org.skypro.skyshop.search.BestResultNotFound;
import org.skypro.skyshop.search.SearchEngine;
import org.skypro.skyshop.search.Searchable;

public class App {
    public static void main(String[] args) {
        // Создание с ошибками
        try {
            new SimpleProduct("  ", 100);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            new DiscountedProduct("Телефон", -100, 10);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        // Поиск лучшего результата
        SearchEngine engine = new SearchEngine(10);
        engine.add(new Article("Ноутбуки 2023", "Лучшие модели ноутбуков..."));
        engine.add(new SimpleProduct("Игровой ноутбук", 100000));

        try {
            Searchable best = engine.findBestMatch("ноут");
            System.out.println("Лучший результат: " + best.getName());
        } catch (BestResultNotFound e) {
            System.out.println(e.getMessage());
        }

        try {
            engine.findBestMatch("смартфон");
        } catch (BestResultNotFound e) {
            System.out.println("Ошибка поиска: " + e.getMessage());
        }
    }
}