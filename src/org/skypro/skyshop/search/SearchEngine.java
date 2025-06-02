
package org.skypro.skyshop.search;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SearchEngine {
    private final List<Searchable> items = new ArrayList<>();

    public void add(Searchable item) {
        items.add(item);
    }

    public TreeSet<Searchable> search(String query) {
        return items.stream()
                .filter(item -> item.getSearchTerm().toLowerCase()
                        .contains(query.toLowerCase()))
                .collect(Collectors.toCollection(
                        () -> new TreeSet<>(Comparator.comparing(Searchable::getName))
                ));
    }
}