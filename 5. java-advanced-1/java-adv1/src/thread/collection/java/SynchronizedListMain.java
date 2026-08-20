package thread.collection.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedListMain {

    static void main() {
        // Collections.synchronizedList()를 사용함으로써 동기화가 완료된(synchronized가 적용된) 리스트로 변환함
        List<String> list = Collections.synchronizedList(new ArrayList<>());
        list.add("data1");
        list.add("data2");
        list.add("data3");
        System.out.println(list.getClass());
        System.out.println("list = " + list);;
    }
}
