package chapter12.generics;

public class nonGenericClass {

    /**
     * 제네릭 클래스가 아닌데, 함수의 매개변수로 제네릭을 쓰고 싶을때
     */
    public void method(wildTest<?> w) {
    }

    public void method2(wildTest<?> w) {
    }
}
