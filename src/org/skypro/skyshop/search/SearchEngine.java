package org.skypro.skyshop.search;

import org.skypro.skyshop.search.Searchable;

public class SearchEngine {
    private final Searchable[] searchables;
    private int size = 0;

    public SearchEngine(int capacity) {
        this.searchables = new Searchable[capacity];
    }

    public void add(Searchable item) {
        if (size < searchables.length) {
            searchables[size++] = item;
        }
    }

    public Searchable[] search(String query) {
        Searchable[] result = new Searchable[5];
        int found = 0;

        for (Searchable s : searchables) {
            if (s != null && s.getSearchTerm().toLowerCase().contains(query.toLowerCase())) {
                result[found++] = s;
                if (found == 5) break;
            }
        }
        return result;
    }
}
