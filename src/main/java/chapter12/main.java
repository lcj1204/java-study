package chapter12;

import chapter12.enumPractice.ColorEnum;

public class main {
    public static void main(String[] args) {

        ColorEnum[] arr = ColorEnum.values();
        for (ColorEnum c : arr) {
            System.out.printf("%d : %s%n", c.ordinal(), c.name());
        }

        System.out.printf("반환된 상수는 : %s", ColorEnum.valueOf("BLUE"));
//        System.out.println(Color.valueOf("Blue")); //  존재하지 않는 상수의 경우 IllegalArgumentException 발생

        String s = "";
        String b = "     ";
        String a = null;
        System.out.println("문자열의 길이 : " + s.length());


    }
}
