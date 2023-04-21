import java.util.ArrayList;

public class Book {
    private final String title;
    private final String author;
    private final int yearOfPublication;
    private final int numberOfPage;
    private final Genre genre;
    public static ArrayList<Book> list = new ArrayList();

    public Book(String title, String author, int yearOfPublication, int numberOfPage, Genre genre) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.numberOfPage = numberOfPage;
        this.genre = genre;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public int getNumberOfPage() {
        return this.numberOfPage;
    }

    public Genre getGenre() {
        return this.genre;
    }

    public String toString() {
        String var10000 = this.title;
        return "Книга {Название " + var10000 + "', Автор " + this.author + "', год издания " + this.yearOfPublication + ", количество страниц " + this.numberOfPage + ", жанр " + String.valueOf(this.genre) + "}";
    }
}
