package practice;

import java.util.LinkedHashSet;
import java.util.SequencedSet;
import java.util.TreeSet;

public class SequencedSetExample {
    public static void main(String[] args) {
        SequencedSet<String> nameSet = new TreeSet<>();
        nameSet.add("김길동");
        nameSet.add("이길동");
        nameSet.add("김길동");
        nameSet.add("홍길동");
        nameSet.add("탁길동");
        nameSet.add("홍길동");

        nameSet.removeFirst();
        nameSet.removeLast();
        System.out.println(nameSet.toString());
        nameSet = nameSet.reversed();
        System.out.println(nameSet.toString());

    }
}
