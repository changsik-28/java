package array;

public class Book {
    private String bookName;
    private String author;

    //기본 생성자
    public Book(){}

    //책이름과 저자 이름을 매개변수로 받는 생성자
    public Book(String BookName,String author){
        this.bookName = BookName;
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    //책정보를 출력해주는 메서드
    public void showBookInfo(){
        System.out.println(bookName+ " , "+author);
    }
}
