package chap6;

public class Triangle extends Line{
    int z;

//    public Triangle(int x, int y, int z) {
//        this.x = x;
//        this.y = y;
//        this.z = z;
//    }

    public Triangle(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
}
