package chap6;

public class Data {
    private int number;

    public Data(int number) {
        this.number = number;
    }

    public Data() {
        this(1);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void printNumbers(int num) {
        System.out.println("num = " + num);
    }

    public void printNumbers(int num, int num2) {
        System.out.println("num = " + num);
        System.out.println("num2 = " + num2);
    }

    public void printNumbers(int... numbers) {
        for(int num : numbers){
            System.out.println("num = " + num);
        }
    }
}
