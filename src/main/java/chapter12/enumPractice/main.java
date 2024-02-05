package chapter12.enumPractice;

public class main {

    public static void main(String[] args) {

        ColorEnum[] colorEnums = ColorEnum.values();

        for (ColorEnum c : colorEnums) {
            System.out.printf("%s\t 순서 = %d\t 이름 = %s\t 값 = %d%n", c.name(), c.ordinal(), c.getName(), c.getValue());
        }
        System.out.printf("내가 찾은 색 : %s", ColorEnum.valueOf("BLUE"));
    }
}
