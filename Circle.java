
class Circle1{
    public double radius;
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }


}


public class Circle {
    public static void main(String[] args) {

        Circle1 obj=new Circle1();
        obj.radius=7;

        System.out.println(obj.getArea());
        System.out.println(obj.getCircumference());
        System.out.println(obj.getPerimeter());
        
    }
    
}
