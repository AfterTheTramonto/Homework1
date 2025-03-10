public class Book {
    private String title;
    private int publicationYear;
    private Author author;

    public Book(String title, Author author, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
        this.author = author;
    }


    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }


    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}






