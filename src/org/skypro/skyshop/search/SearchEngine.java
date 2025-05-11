package org.skypro.skyshop.search;

import java.util.*;
import java.util.stream.Collectors;

public class SearchEngine {
    private final List<Searchable> items = new ArrayList<>();

    public void add(Searchable item) {
        items.add(item);
    }

    public TreeMap<String, Searchable> search(String query) {
        return items.stream()
                .filter(item -> item.getSearchTerm().toLowerCase().contains(query.toLowerCase()))
                .collect(Collectors.toMap(
                        Searchable::getName,
                        item -> item,
                        (existing, replacement) -> existing,
                        TreeMap::new
                ));
    }
}