package array;
//인스턴스를 따로 관리하고 싶다면 직접 인스턴스를 만들고 그 값을 복사해야 한다.
//이를 '깊은복사(deep copy )'라고 한다.
public class ObjectCopy2 {

    public static void main(String[] args) {
        Book[] bookArray1 = new Book[3];
        Book[] bookArray2 = new Book[3];

        bookArray1[0] = new Book("문과 남자의 과학 공부 ","유시민");
        bookArray1[1] = new Book("세이노의 가르침","세이노");
        bookArray1[2] = new Book("끌벌의 예언 1","베르나르 베르베르");
        //디폴트 생성자 bookArray2배열 인스턴스 생성
        bookArray2[0] = new Book();
        bookArray2[1] = new Book();
        bookArray2[2] = new Book();
        //bookArray1 배열요소를 새로 생성한 bookArray2 배열 인스턴스에 복사
        for(int i=0; i<bookArray1.length;i++){
            bookArray2[i].setAuthor(bookArray1[i].getAuthor());
            bookArray2[i].setBookName(bookArray1[i].getBookName());
        }
        for(int i=0;i<bookArray2.length;i++){
            bookArray2[i].showBookInfo();
        }

        bookArray1[0].setBookName("차가운 자본주의");
        bookArray1[0].setAuthor("윤투카스");

        System.out.println("==============bookArray1==========");
        for(int i=0;i<bookArray1.length;i++) {
            bookArray1[i].showBookInfo();
        }

        System.out.println("==============bookArray2==========");
        for(int i=0;i<bookArray2.length;i++){
            bookArray2[i].showBookInfo();
        }
    }
}
