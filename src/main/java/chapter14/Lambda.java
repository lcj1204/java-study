package chapter14;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Lambda {
    public static void main(String[] args) {

        // 람다는 사실 익명 클래스 객체와 동등하다
        Object o = new Object() {
            public int Test(int a, int b) {
                return a > b ? a : b;
            }
        };

        // 람다의 함수형 인터페이스, 위는 아래와 같다.
        MyFunction f = (a, b) -> a > b ? a : b;

        int big = f.max(1, 2);

        // Function
        // Predicate
        Predicate<Integer> p = i -> i < 100;
        Predicate<Integer> q = i -> i < 200;
        p.or(q);
        Predicate<Integer> np = p.negate();

        // 스트림
        List<Integer> l = new ArrayList<>();
        l.add(4);
        l.add(2);
        l.add(3);
        l.add(1);
        l.add(1);
        l.add(5);

        Stream<Integer> stream = l.stream();
        List<Integer> collect = stream.sorted().collect(Collectors.toList());

        System.out.println("List l : " + l);
        System.out.println("정렬된 collect : " + collect);

        /**
         * 아무거나 인데, 계속해서 4만 나옴 -> 왜? -> finAny() 는 병렬 스트림일때 쓰는것,
         */
        System.out.println();
        System.out.println("List l : " + l);
        System.out.println("findFirst() : " + l.stream().findFirst().get()); // 아무거나 반환
        System.out.println("findAny() : " + l.stream().findAny().get()); // 아무거나 반환
        System.out.println("max : " + l.stream().max(Integer::compare).get()); // max 반환
        System.out.println("min : " + l.stream().min(Integer::compare).get()); // min 반환

        final long LENGTH = (long) Math.pow(10, 7);

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i <= LENGTH; i++) {
            list.add(i);
        }

        /**
         * parallel 안쓸때가 훨씬 빠름.. 왜?
         * 쓸 때 : 3376 ms
         * 안 쓸때 : 373 ms
         */
        System.out.println();
        long startTime = System.currentTimeMillis();
        List<Double> collect1 = list.stream()//.parallel()
                .map(i -> i * Math.random())
                .collect(Collectors.toList());
        long finishTime = System.currentTimeMillis();
        System.out.println();
        System.out.println("elapsedTime(ms) : " + (finishTime - startTime));


        List<Integer> list1 = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            list1.add(i);
        }

        IntStream intStream = IntStream.rangeClosed(1, 10); // 1 ~ 10
        intStream.skip(3)
                .limit(5)
                .forEach(System.out::println);

        IntStream intStream1 = IntStream.rangeClosed(1, 10); // 1 ~ 10
        intStream1.filter(i -> i % 2 != 0)
                .filter(i -> i % 3 != 0)
                .forEach(System.out::println);


        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {list2.add(i);}

        System.out.println("==== replaceAll() ====");
        list2.replaceAll(i -> i * 10);
        list2.forEach(System.out::println);

        System.out.println("==== stream().map() ====");
        List<Integer> collect2 = list2.stream().map(i -> i * 10).collect(Collectors.toList());
        collect2.forEach(System.out::println);

        // 요소 타입 변환
        List<Long> collect3 = list2.stream().map(i -> (long) i * 10).collect(Collectors.toList());


        // 기본형 스트림으로 변환
        List<Integer> list3 = new ArrayList<>();
        LongStream longStream = list3.stream().mapToLong(i -> i * 10);
        OptionalDouble average = longStream.average();
        System.out.println("average : " + average);

        LongStream longStream1 = list3.stream().mapToLong(i -> i * 10);
        double average1 = longStream1.average().orElse(999);

        System.out.println("average : " + average1);

        // Optional 에 map 적용해보기
        String s = "123";
        Integer result = Optional.ofNullable(s)
                .filter(x -> x.length() > 0)
                .map(Integer::parseInt)
                .orElse(-1);

        // 스트림을 컬렉션과 배열로 변환
        List<Integer> listCollect = list3.stream().map(i -> i * 10).collect(Collectors.toList());
        ArrayList<Integer> arratListCollect = list3.stream().map(i -> i * 10).collect(Collectors.toCollection(ArrayList::new));

        // 스트림 변환

    }
}
