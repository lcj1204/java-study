package chapter12.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Optional;

public class main {

    public static void main(String[] args) {

        /**
         * 와일드 카드 하한 제한 -> .sort() : super 예시
         *
         */
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Long> arrayList2 = new ArrayList<>();

        arrayList1.add(3);
        arrayList1.add(2);
        arrayList1.add(1);

        Collections.sort( arrayList1 );
        System.out.println( arrayList1 );

        /**
         * 제네릭 메소드를 사용할 땐, 다음과 같이 타입을 지정해 줘야댐
         */
        ArrayList<String> s = new ArrayList<>();
        String[] strings = s.<String>toArray(new String[0]);

        ex1<Integer, Integer, Integer, Integer> e = new ex1();


    }
}
