package chapter08;

import java.io.IOException;
import java.util.Scanner;

public class exceptionHandling {

    public static void main(String[] args) throws ExceptionC {

        try { // 가장 큰 try 문
            try { // try 문 안에 또 다른 try 문이 올 수 있다.

            } catch (Exception e) { // 여기에 선언된 변수 e는 여기 catch 문 안에서만 유요하다.

            }

        }catch(Exception e){    // 위 catch 문과는 별개기 때문에 같은 이름의 변수가 선언될 수 있다.
            try {   // catch 문 안에 새로운 try 문이 올 수 있다.

            }catch (Exception e1){  // 위 catch 문 안에 속해있기 때문에 다른 이름의 변수를 선언해야한다.

            }
        } // 가장 큰 try 문 끝

        float a = 3.23423F;
        double b = 3.234;
        int c = 3;
        long d = 3234;

        System.out.println(a / 0);
        System.out.println(b / 0);
//        System.out.println(c / 0); // 에러 발생
//        System.out.println(d / 0); // 에러 발생


        /**
         * 1.5 예외의 발생과 catch 블랙
         */
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0/0);
            System.out.println(4);
        }catch (ArithmeticException ae){
            System.out.println("ArithmeticException 발생!!");
            System.out.println(5);

            // printStackTrace() 와 getMessage()
            // 발생한 예외에 대한 정보를 담고 있는 녀석들
            ae.printStackTrace();
            System.out.println("getMessage() : " + ae.getMessage());

        }
        System.out.println(6);

        /**
         * 멀티 catch 블럭
         */
//        try {
//
//        } catch (ArithmeticException ae) {
//
//        } catch (NullPointerException ne) {
//
//        } catch (ArrayIndexOutOfBoundsException aie) {
//
//        }

        try {

            // 개수에 제한이 없음
        } catch (ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e) {

        }


        /**
         * throw 로 예외 고의로 발생시키기
         */
        try {
            System.out.println(1);
            ArithmeticException te = new ArithmeticException("내가 만든 메세지"); // ArithmeticException 인스턴스 생성
            throw te;   // 여기서 비로소 예외 발생
//            throw new ArithmeticException(); // 한줄로 하면 이렇게 됨
//            throw new IOException();

        } catch (ClassCastException ce) {
            System.out.println("ClassCastException 예외 발생");
        } catch (ArithmeticException ae) {
            System.out.println("ArithmeticException 예외 발생");
            System.out.println(ae.getMessage());
        } catch (Exception e) {
            System.out.println("위에서 잡지 못한 예외가 있음.");
        }


        /**
         * 메소드내에 예외 처리
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("10을 나눌 정수를 입력하세요");

        int denominator = sc.nextInt();
//        method1(denominator);

        try {
            method2(denominator);
        } catch (ArithmeticException ae) {
            System.out.println(ae.getMessage() + " 때문에 다시 입력해야댐");
        }

        /**
         * finally 블럭
         */
        method_finally();
        System.out.println("method_finally 호출 끝");

        /**
         * 예외 되던지기
         */
        try {
            method_reThrowing();
        } catch (RuntimeException e) {
            System.out.println("호출한 메소드에서 다시 예외 처리");
        }

        /**
         * 연결 예외
         */
        try {
            throw new ExceptionA(); // ExceptionA 혹은
//            throw new ExceptionB(); // ExceptionB 가 발생할 수 있을 때..
        } catch (ExceptionA ea) {
            ExceptionC ec = new ExceptionC();
            ec.initCause(ea);
            throw ec;
        }

    }
    /**
     * 메소드내에 예외 처리
     */
    // 이렇게 하면 main 에서 예외가 발생했을 때, 다시 값을 받는 등을 처리할 수 없음.
    // 왜나햐면 예외가 발생했지만 처리까지 method1() 에서 해버렸기 때문에 main 은 예외가 발생했는지 모르기 때문.
    static void method1(int denominator){
        try{
            if (denominator == 0) {
                throw new ArithmeticException("0은 안됩니다!");
            }
            else {
                System.out.println(10 / denominator);  // ArithmeticException 이 발생 할 수 있음.}
            }
        }catch (ArithmeticException ae){
            System.out.println(ae.getMessage());
        }
    }

    static void method2(int denominator) throws ArithmeticException{
        if (denominator == 0) {
            throw new ArithmeticException("0은 안됩니다!");
        }

        System.out.println(10 / denominator);  // ArithmeticException 이 발생 할 수 있음.}
    }

    /**
     * finally 블록
     */
    static void method_finally() {
        try {
            System.out.println("method_finally 가 호출 되었습니다.");
            return;
        } catch (IllegalStateException e) {
            System.out.println("IllegalStateException 가 발생하였습니다.");
            return;
        } finally{
            System.out.println("finally 블록이 실행 되었습니다.");
        }

//        System.out.println("method_finally 함수의 맨 마지막 입니다.");
    }

    static void method_reThrowing() throws RuntimeException{
        try {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            System.out.println("예외가 발생한 메소드에서 예외 처리");
            throw e;
        }
    }

    private static class ExceptionA extends Exception {
    }
    private static class ExceptionB extends Exception {
    }

    private static class ExceptionC extends Exception {
    }
}
