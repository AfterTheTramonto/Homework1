package org.skypro.skyshop;

import org.skypro.skyshop.content.Article;
import org.skypro.skyshop.product.*;
import org.skypro.skyshop.search.SearchEngine;
import org.skypro.skyshop.search.Searchable;

public class App {
    public static void main(String[] args) {
        SearchEngine engine = new SearchEngine();


        engine.add(new SimpleProduct("Ноутбук игровой", 150000));
        engine.add(new SimpleProduct("Ноутбук игровой", 160000)); // Дубликат - не добавится
        engine.add(new Article("Обзор игровых ноутбуков", "Лучшие модели 2023..."));
        engine.add(new Article("Руководство по выбору", "Как выбрать ноутбук..."));


        System.out.println("Результаты поиска 'игр':");
        engine.search("игр").forEach(item ->
                System.out.println("- " + item.getName() + " [" + item.getContentType() + "]")
        );

        System.out.println("\nРезультаты поиска 'ноут':");
        engine.search("ноут").forEach(item ->
                System.out.println("- " + item.getName() + " (" + item.getName().length() + " chars)")
        );
    }
}