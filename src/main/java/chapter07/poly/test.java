package chapter07.poly;

public class test {
    public static void main(String[] args) {
        int a = 10;
        int a2;
        double b;
        double b2 = 100.01;

//        b = (double)a; 생략 가능
        b = a;
        a2 = (int)b2; // 얘는 불가능.

        System.out.println(b);
        System.out.println(a2);

        // 상속 관계에 있는 두 클래스의 참조형 변수 형변환은 어떨까?
        Car car;
        Car car2 = new Car();
        Car car3 = new SportsCar();

        SportsCar sportsCar = new SportsCar();
        SportsCar sportsCar2;

        car = (Car)sportsCar;
        sportsCar2 = (SportsCar) car2; // 얘는 컴파일은 되지만 실행시 ClassCastException 발생 -> car2가 가리키는 인스턴스는 Car 타입이기 때문에
        sportsCar2 = (SportsCar) car3; // 애는 됨.-> car2가 가리키는 인스턴스는 SportsCar 타입이기 때문에


    }

    static class Car {
        int x = 100;

        void method() {

        }
    }

    static class SportsCar extends Car {
        int x = 200;

        void method() {
            System.out.println("x = " + x);
            System.out.println("super.x = "+ super.x);
            System.out.println("this.x = " + this.x);
        }
    }

    static class Ambulance extends Car {
    }
}
