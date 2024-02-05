package chap6;

public class Study {
    static int staticInt = 1;
    private static int privateStaticInt = 2;
    private static final int privateStaticFinalInt = 3;
    public static int publicStaticInt = 4;
    public static final int publicStaticFinalInt = 5;

    public static int getStaticInt() {
        return staticInt;
    }

    public static int getPrivateStaticInt() {
        return privateStaticInt;
    }

    public static int getPublicStaticInt() {
        return publicStaticInt;
    }

    public static void change(Data data, int number){
        data.setNumber(number);
    }

    public static int setNumber(int number){
        number = 100;
        System.out.println("-----set number 1 =>  number: " + number);
        return number;
    }

    public static void setNumber2(Integer number){
        number = 100;
        System.out.println("-----set number 2 =>  number: " + number);
    }

    public static void setMyInteger(MyInteger myInteger){
        myInteger.a = 200;
        System.out.println("------ set MyInteger => myInteger.a = " + myInteger.a);
    }
}
