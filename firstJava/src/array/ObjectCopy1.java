package array;

public class ObjectCopy1 {
    //주소 값만 복사하기 때문에 '얕은복사(shallow copy)'라고 한다.
    public static void main(String[] args) {
        Book[] bookArray1 = new Book[3];
        Book[] bookArray2 = new Book[3];

        bookArray1[0] = new Book("문과 남자의 과학 공부 ","유시민");
        bookArray1[1] = new Book("세이노의 가르침","세이노");
        bookArray1[2] = new Book("끌벌의 예언 1","베르나르 베르베르");

        System.arraycopy(bookArray1,0,bookArray2,0,3);

        System.out.println("==============bookArray2==========");
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
