package practice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SequencedMap;
import java.util.TreeMap;

public class SequencedMapExample {
    public static void main(String[] args) {
        SequencedMap<Integer,String> map = new TreeMap<>();
        map.put(3,"이길동");
        map.put(2,"박길동");
        map.put(1,"김길동");
        map.put(5,"홍길동");
        map.put(2,"마길동");
        map.put(4,"탁길동");

        Map.Entry<Integer,String> firstEntry = map.firstEntry();
        System.out.println("첫 번쨰 엔트리: " + firstEntry.getKey() + ", " + firstEntry.getValue());

        firstEntry = map.pollFirstEntry();
        System.out.println("첫 번쨰 엔트리: " + firstEntry.getKey() + ", " + firstEntry.getValue());

        Map.Entry<Integer,String> lastEntry = map.lastEntry();
        System.out.println("마지막 엔트리: " + lastEntry.getKey() + ", " + lastEntry.getValue());

        System.out.println();

        for(Map.Entry<Integer,String> entry : map.sequencedEntrySet()){
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }

        System.out.println();

        SequencedMap<Integer,String> reversedMap = map.reversed();

        for(int key: reversedMap.sequencedKeySet()){
            System.out.println(key + ", " + reversedMap.get(key));
        }

    }
}
