package exemple.section01.list;

public class BookDTO implements Comparable<BookDTO>{

    private int number;
    private String title;
    private String author;
    private int price;

    public BookDTO(int number, String title, String author, int price) {
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
        return "BookDTO{" +
                "number=" + number +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(BookDTO o) { // Collection으로 sort 메서드 호출시 필요
        // 사용자 정의
        // this vs o (인자) 객체 배교
        // 양수 반환 : 앞의 제목이 뒤로 가야한다. > 변경
        // 0 반환 : 같은 값
        // 음수 반환 : 앞의 제목이 앞에 있어야 한다. > 변경 X

        // 도서 제목 기준으로 오름차순 정렬

        return this.title.compareTo(o.title);
    }
}
