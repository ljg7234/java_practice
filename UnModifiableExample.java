package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.SequencedCollection;

public class UnModifiableExample {
    public static void method1(){
        SequencedCollection<String> collection = new ArrayList<>();
        collection.addFirst("데이터1");
        collection.addFirst("데이터2");
        collection.addFirst("데이터3");
        method2(Collections.unmodifiableSequencedCollection(collection));

    }

    public static void method2(SequencedCollection<String> collection){
        for(String data: collection){
            System.out.println(data);
        }

    }

    public static void main(String[] args) {
        method1();
    }
}

