//package chap6;
//
//public class StudyApplication {
//    public static void main(String[] args) {
//
//        Data data = new Data(1);
//
//        System.out.println("data.getNumber() = " + data.getNumber());
//
//        Study.change(data, 2);
//
//        System.out.println("data.getNumber() = " + data.getNumber());
//
//        data.setNumber(data.getNumber()+1);
//
//        System.out.println("data.getNumber() = " + data.getNumber());
//
//        int a = 2;
//        Integer b = 3;
//
//        a = Study.setNumber(a);
//        System.out.println("a = " + a);
//        Study.setNumber2(a);
//        System.out.println("a = " + a);
//
//        Study.setNumber(b);
//        System.out.println("b = " + b);
//        Study.setNumber2(b);
//        System.out.println("b = " + b);
//
//        System.out.println("----------------");
//        MyInteger myInteger = new MyInteger(1);
//
//        Study.setNumber(myInteger.a);
//        System.out.println("myInteger.a = " + myInteger.a);
//
//        Study.setMyInteger(myInteger);
//        System.out.println("myInteger.a = " + myInteger.a);
//
//        data.printNumbers(1);
//        data.printNumbers(1, 2);
//        data.printNumbers(1,2,3,4,5);
//        int[] list = {1,2,3,4,5,6};
//        data.printNumbers(list);
//        Line line = new Triangle(1,2,3);
//
//        Singleton singleton = Singleton.getInstance();
//        Singleton singleton1 = new Singleton();
//
//    }
//}
