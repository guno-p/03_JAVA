package ch15.sec02.exam01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Board> list = new ArrayList<>();
        list.add(new Board("주제1", "내용1", "저자1"));
        list.add(new Board("주제2", "내용2", "저자2"));
        list.add(new Board("주제3", "내용3", "저자3"));
        list.add(new Board("주제4", "내용4", "저자4"));
        list.add(new Board("주제5", "내용5", "저자5"));

        System.out.println("list 사이즈 : " + list.size());

        System.out.println();

        Board board = list.get(2);
        System.out.println("3번째 요소 : " + board);

        System.out.println();
        Iterator<Board> it = list.iterator();
        System.out.println("iterator 반복 : ");
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println();

        list.remove(2);
        list.remove(2);
        System.out.println("향상 for문 반복 : ");
        for (Board b : list) {
            System.out.println(b);
        }
    }
}
