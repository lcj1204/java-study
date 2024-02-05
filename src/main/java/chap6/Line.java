package chap6;

abstract class Line {
    int x;
    int y;

    protected Line() {

    }

    protected Line(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void abc() {
        System.out.println("x = " + x);
    }
}
