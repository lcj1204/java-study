package chapter12.enumPractice;

public class Color {
    /**
     * enum 을 class로 변환하면 이런 모양이다.
     */
    static final Color BLUE = new Color("blue", 1);
    static final Color RED = new Color("red", 2);

    private final String name;
    private final int value;

    public Color(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
}
