import java.io.PrintStream;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

            List<Book> books = getListBook();
            System.out.println();
            List<Book> historical = books.stream()
                    .filter((b) -> b.getGenre().equals(Genre.HISTORICAL))
                    .toList();
            PrintStream var10001 = System.out;
            Objects.requireNonNull(var10001);
            historical.forEach(var10001::println);
            List<Book> yearSort = books.stream().sorted(Comparator.comparing(Book::getYearOfPublication)).toList();
            System.out.println();
            List<Book> author = books.stream().
                    filter(b-> b.getAuthor().equals("Сергей Лукьяненко"))
                        .toList();
            var10001 = System.out;
            Objects.requireNonNull(var10001);
            author.forEach(var10001::println);
            boolean isAuthor = books.stream().anyMatch((b) ->
                b.getTitle().equals("ghu"));
            System.out.println(isAuthor);
            Optional var10000 = books.stream().max(Comparator.comparing(Book::getNumberOfPage));
            var10001 = System.out;
            Objects.requireNonNull(var10001);
            var10000.ifPresent(var10001::println);
        }

        private static List<Book> getListBook() {
            return List.of(new Book("Хождение за три моря", "Афанасий Никитин", 1900, 456, Genre.HISTORICAL),
                    new Book("Лабиринт отражений", "Сергей Лукьяненко", 1990, 357, Genre.FANTASTIC),
                    new Book("Жизнь замечательных людей", "Жорж Великолепный", 1986, 479, Genre.HISTORICAL),
                    new Book("Ночной дозор", "Сергей Лукьяненко", 2002, 415, Genre.FANTASTIC),
                    new Book("Властелин колец", "Джон Рональд Руэл Толкиен", 2006, 1235, Genre.FANTASY),
                    new Book("Ищите ведьму", "Ольга Паншина", 2022, 327, Genre.LOVE),
                    new Book("На дне", "Максим Горький", 1970, 275, Genre.PROSE),
                    new Book("Война и мир", "Лев Толстой", 1961, 1500, Genre.PROSE),
                    new Book("Джон Леннон", "Макс Любимов", 2015, 357, Genre.BIOGRAPHY),
                    new Book("Оптика", "Евгений Физиков", 1991, 523, Genre.SCIENTIFIC),
                    new Book("Ведьма и лорд", "Ольга Паншина", 2021, 357, Genre.LOVE),
                    new Book("Теоретическая механика", "Сергей Лучезарный", 1996, 359, Genre.SCIENTIFIC),
                    new Book("Черчиль", "Сергей Драгунский", 1976, 369, Genre.BIOGRAPHY));
        }
    }

