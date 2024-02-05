package chapter12.enumPractice;

public enum ColorEnum {
    /**
     * 아래의 열거형 하나하나가 사실은 ColorEnum의 객체이다.
     * <p> enum을 클래스로 변환한 Color class를 참고하자.
     */
    BLUE("blue", 1), GOLD("gold", 2), PINK("pink", 3),
    PURPLE("purple", 4), GREEN("green", 5), NAVY("navy", 6),
    YELLOW("yellow", 7), RED("red", 8);

    /**
     * enum 상수들에 여러개의 값을 지정해줄 수도 있다.
     */
    private final String name;
    private final int value;

    /**
     * enum 생성자는 암묵적으로 private 이다. (private 생략 자능)
     */
    ColorEnum(String name, int value) {
        this.name = name;
        this.value = value;
    }



    /**
     * Getter
     */
    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
}