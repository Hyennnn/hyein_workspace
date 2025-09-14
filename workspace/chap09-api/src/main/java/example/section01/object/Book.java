package example.section01.object;

import java.util.Objects;

// 묵시적으로 extends Object 되어있음
public class Book {
    private int number;
    private String title;
    private String author;
    private int price;


    public Book(int number, String title, String author, int price) {
        this.number = number;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "number=" + number +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) { // 동등 객체 확인
        // 비교 대상 객체가 null 이거나, 다른 타입일 경우 >> false
        if (o == null || getClass() != o.getClass()) return false;

        // 기본 자료형은 == 으로 값 비교
        // 참조 자료형은 equals으로 값 비교
        Book book = (Book) o;
        return number == book.number && price == book.price && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, title, author, price);
    }
}
