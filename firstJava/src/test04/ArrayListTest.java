package test04;

import java.util.ArrayList;
import java.util.Vector;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Book> library = new ArrayList<Book>();
        //에 어떤걸 담을 것이냐 <> 에는 자료형이 들어간다.
        library.add(new Book("태백산맥","조정래"));
        library.add(new Book("반지의제왕","호킨스"));
        library.add(new Book("태백산맥","조정래"));
        library.add(new Book("반지의제왕","호킨스"));
        library.add(new Book("태백산맥","조정래"));
        library.add(new Book("반지의제왕","호킨스"));
        for(int i=0;i<library.size();i++){
            library.get(i).showBookInfo();
        }

        //옛날버전
        Vector<Book> library2 = new Vector<Book>();
        //에 어떤걸 담을 것이냐 <> 에는 자료형이 들어간다.
        library2.add(new Book("태백산맥2","조정래"));
        library2.add(new Book("반지의제왕2","호킨스"));
        library2.add(new Book("태백산맥2","조정래"));
        library2.add(new Book("반지의제왕2","호킨스"));
        library2.add(new Book("태백산맥2","조정래"));
        library2.add(new Book("반지의제왕2","호킨스"));
        for(int i=0;i<library2.size();i++){
            library2.get(i).showBookInfo();
        }
    }
}
