package org.skypro.skyshop.search;

import java.util.ArrayList;
import java.util.List;

public class SearchEngine {
    private final List<Searchable> items = new ArrayList<>();
    private Searchable[] Searchable;

    public void add(Searchable item) {
        items.add(item);
    }

    public List<Searchable> search(String query) {
        List<Searchable> results = new ArrayList<>();
        String lowerQuery = query.toLowerCase();

        for (Searchable s : items) {
            if (s.getSearchTerm().toLowerCase().contains(lowerQuery)) {
                results.add(s);
            }
        }
        return results;
    }

public Searchable findBestMatch(String search) throws BestResultNotFound {
    Searchable bestMatch = null;
    int maxCount = 0;
    String lowerSearch = search.toLowerCase();

    for (Searchable s : Searchable) {
        if (s == null) continue;

        String term = s.getSearchTerm().toLowerCase();
        int count = countOccurrences(term, lowerSearch);

        if (count > maxCount) {
            maxCount = count;
            bestMatch = s;
        }
    }

    if (bestMatch == null) {
        throw new BestResultNotFound(search);
    }
    return bestMatch;
}

private int countOccurrences(String source, String substring) {
    int count = 0;
    int index = 0;
    while ((index = source.indexOf(substring, index)) != -1) {
        count++;
        index += substring.length();
    }
    return count;
}
}