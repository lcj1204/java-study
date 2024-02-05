package chapter14;

@FunctionalInterface // 컴파일러가 함수형 인터페이스를 올바르게 정의하였는지 확인해준다.
public interface MyFunction {
    int max(int a, int b);
}
