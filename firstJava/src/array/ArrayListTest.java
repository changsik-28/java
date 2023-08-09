package array;

import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {
        //ArrayList<E> 배열이름 = new ArrayList<E>();
        ArrayList<String> list = new ArrayList<String>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        for(String s : list){
            System.out.println(s);
        }


    }
}
