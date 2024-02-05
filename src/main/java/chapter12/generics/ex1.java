package chapter12.generics;

import java.lang.reflect.Method;
import java.util.*;
import java.util.stream.Collector;

public class ex1<T, A, B, C> {
    /**
     * 여러개 사용할 수 있다.
     */
    A a;
    B b;
    C c;

    /**
     * static 멤버에는 사용할 수 없다.
     * <p>배열도 생성할 수 없다. 이유는 배열은 컴파일시 타입과 크기를 지절해줘야하기 때문.
     */

//    static void total(int price1, T price2) {}
//    T[] arr = new T[10];
    ArrayList<T> arrList = new ArrayList<>();
    ArrayList<? extends T> arrList2 = new ArrayList<>();
    ArrayList<?> arrList3 = new ArrayList<>();

    /**
     * 제네릭 타입의 배열
     * <p>1. 제네릭 타입의 배열 참조변수를 선언하는건 됨.
     * <p>2. 제네릭 타입의 배열을 생성하는 것은 불가능
     */
    A[] list;
    //    list = new A[];

    public static void method1(wildTest<? extends Objects> t) {

    }

    /**
     * 지네릭 메소드
     * <p> 위에 선언한 타입 매개변수 T 와는 다른 T!
     * <p> static 에도 사용가능! -> 지역 변수 처럼, 어차피 함수 내에서만 사용할 것이기 때문에
     */
    <S> void method2(List<S> list) {

    }
//    S s; 타입 매개변수 S 는 선언한 함수 내에서만 사용 가능.

}
