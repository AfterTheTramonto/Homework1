package org.skypro.skyshop.search;

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
public Searchable findBestMatch(String search) throws BestResultNotFound {
    Searchable bestMatch = null;
    int maxCount = 0;
    String lowerSearch = search.toLowerCase();

    for (Searchable s : searchables) {
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