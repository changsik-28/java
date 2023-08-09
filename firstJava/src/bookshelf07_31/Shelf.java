package bookshelf07_31;

import java.util.ArrayList;

public class Shelf {
    //자료를 순서대로 저장할 ArrayList 선언
    protected ArrayList<String> shelf;

    //디폴트 생성자로 Shelf 클래스를 생성하면 ArrayList 도 생성됨
    public Shelf(){
        shelf = new ArrayList<String>();
    }
    //getShelf() 메서드는 저장되어 있는 배열 shelf를 반환한다.
    public ArrayList<String> getShelf(){
        return shelf;
    }
    //getCount() 메서드는 배열 self에 저장된 요소 개수를 반환한다.
    public int getCount(){
        return shelf.size();
    }
}
