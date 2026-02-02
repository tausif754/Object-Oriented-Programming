
class Rectangle1{
     public double length;
    public double width;

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }
    public boolean isSquare() {
        return length == width;
    }

}

public class Rectangle {
    public static void main(String[] args) {
        Rectangle1 r=new Rectangle1();
        r.length=5;
        r.width=7;
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());
        System.out.println(r.isSquare());
        
    }
    
}
