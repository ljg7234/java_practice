package practice;

import java.util.ArrayList;
import java.util.SequencedCollection;

public class SequencedCollectionExample {
    public static void main(String[] args) {
        SequencedCollection<String> nameList = new ArrayList<>();
        nameList.addFirst("김길동");
        nameList.addFirst("박길동");
        nameList.addFirst("이길동");
        nameList.addLast("조길동");
        nameList.addLast("탁길동");
        nameList.addLast("홍길동");

        nameList.removeFirst();

        nameList.removeLast();

        System.out.println(nameList.toString());
        nameList = nameList.reversed();

        System.out.println(nameList.toString());
    }
}
