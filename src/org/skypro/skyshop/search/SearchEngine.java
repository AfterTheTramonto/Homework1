package org.skypro.skyshop.search;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;

public class SearchEngine {
    private final Set<Searchable> items = new HashSet<>();
    private final Comparator<Searchable> comparator = Comparator
            .comparingInt((Searchable s) -> s.getName().length()).reversed()
            .thenComparing(Searchable::getName);

    public void add(Searchable item) {
        items.add(item);
    }

    public TreeSet<Searchable> search(String query) {
        TreeSet<Searchable> result = new TreeSet<>(comparator);
        String lowerQuery = query.toLowerCase();

        for (Searchable item : items) {
            if (item.getSearchTerm().toLowerCase().contains(lowerQuery)) {
                result.add(item);
            }
        }
        return result;
    }
}